package SmartBuilding.DistributedSystemCA.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import SmartBuilding.DistributedSystemCA.service1.SecurityServiceProto;
import SmartBuilding.DistributedSystemCA.service1.SecurityServiceGrpc;

public class SecurityClient {
    private JFrame frame;
    private JTextArea logTextArea;
    private JButton accessButton;
    private JButton lockStatusButton;
    private SecurityServiceClient serviceClient;

    public SecurityClient() {
        frame = new JFrame("Security Client");
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

        serviceClient = new SecurityServiceClient(logTextArea);

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
                new SecurityClient();
            }
        });
    }
}

class SecurityServiceClient {
    private JTextArea logTextArea;
    private ManagedChannel channel;
    private SecurityServiceGrpc.SecurityServiceBlockingStub blockingStub;
    private SecurityServiceGrpc.SecurityServiceStub asyncStub;

    public SecurityServiceClient(JTextArea logTextArea) {
        this.logTextArea = logTextArea;
        channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        blockingStub = SecurityServiceGrpc.newBlockingStub(channel);
        asyncStub = SecurityServiceGrpc.newStub(channel);
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
    }

    public void shutdown() {
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logTextArea.append("Error: " + e.getMessage() + "\n");
        }
    }
}
