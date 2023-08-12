package SmartBuilding.DistributedSystemCA.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SmartBuilding.DistributedSystemCA.service1.SecurityServiceProto;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import SmartBuilding.DistributedSystemCA.service1.SecurityServiceGrpc;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class SecurityClientWithDiscoveryNew {
    private JFrame frame;
    private JTextArea logTextArea;
    private JButton accessButton;
    private JButton lockStatusButton;
    private SecurityServiceClientNew serviceClient;

    public SecurityClientWithDiscoveryNew() {
        frame = new JFrame("Security Client with Discovery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        logTextArea = new JTextArea();
        logTextArea.setEditable(false);
        frame.add(new JScrollPane(logTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        accessButton = new JButton("Grant Access");
        lockStatusButton = new JButton("Check Lock Status");
        buttonPanel.add(accessButton);
        buttonPanel.add(lockStatusButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        serviceClient = new SecurityServiceClientNew(logTextArea);

        accessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serviceClient.invokeGrantAccess();
            }
        });

        lockStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serviceClient.invokeStreamLockStatus();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SecurityClientWithDiscoveryNew();
            }
        });
    }
}

class SecurityServiceClientNew {
    private JTextArea logTextArea;
    private ManagedChannel channel;
    private SecurityServiceGrpc.SecurityServiceBlockingStub blockingStub;
    private SecurityServiceGrpc.SecurityServiceStub asyncStub;

    public SecurityServiceClientNew(JTextArea logTextArea) {
        this.logTextArea = logTextArea;
        // Discover the service using jmDNS
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo[] services = jmdns.list("_security_service._tcp.local.");
            if (services.length > 0) {
                ServiceInfo serviceInfo = services[0];
                String host = serviceInfo.getHostAddresses()[0];
                int port = serviceInfo.getPort();

                // Create a channel using the discovered service information
                channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
                blockingStub = SecurityServiceGrpc.newBlockingStub(channel);
                asyncStub = SecurityServiceGrpc.newStub(channel);
            } else {
                logTextArea.append("No service found.\n");
            }
            jmdns.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void invokeGrantAccess() {
        try {
            SecurityServiceProto.AccessRequest request = SecurityServiceProto.AccessRequest.newBuilder()
                    .setUserID("user1")
                    .setRoomID("room1")
                    .build();

            SecurityServiceProto.AccessResponse response = blockingStub.grantAccess(request);
            logTextArea.append("Access Granted: " + response.getPermissionsGranted() + "\n");
        } catch (Exception e) {
            logTextArea.append("Error: " + e.getMessage() + "\n");
        }
    }

    public void invokeStreamLockStatus() {
        SecurityServiceProto.LockStatusRequest request = SecurityServiceProto.LockStatusRequest.newBuilder()
                .setRoomID("room456")
                .build();

        asyncStub.streamLockStatus(request, new StreamObserver<SecurityServiceProto.LockStatusResponse>() {
            @Override
            public void onNext(SecurityServiceProto.LockStatusResponse response) {
                logTextArea.append("Lock ID: " + response.getLockID() + " | Is Locked: " + response.getIsLocked() + "\n");
            }

            @Override
            public void onError(Throwable t) {
                logTextArea.append("Error: " + t.getMessage() + "\n");
            }

            @Override
            public void onCompleted() {
                logTextArea.append("Lock status streaming completed.\n");
            }
        });
    }}
