package SmartBuilding.DistributedSystemCA.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import SmartBuilding.DistributedSystemCA.service2.LightingControlServiceGrpc;
import SmartBuilding.DistributedSystemCA.service2.LightingControlServiceProto;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class LightingControlWithDiscoveryNew {
    private JFrame frame;
    private JTextArea logTextArea;
    private JButton controlButton;
    private LightingControlServiceClientNew serviceClient;

    public LightingControlWithDiscoveryNew() {
        frame = new JFrame("Lighting Control Client with Discovery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        logTextArea = new JTextArea();
        logTextArea.setEditable(false);
        frame.add(new JScrollPane(logTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        controlButton = new JButton("Control Lights");
        buttonPanel.add(controlButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        serviceClient = new LightingControlServiceClientNew(logTextArea);

        controlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serviceClient.startLightControl();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LightingControlWithDiscoveryNew();
            }
        });
    }
}

class LightingControlServiceClientNew {
    private JTextArea logTextArea;
    private ManagedChannel channel;
    private LightingControlServiceGrpc.LightingControlServiceStub asyncStub;

    public LightingControlServiceClientNew(JTextArea logTextArea) {
        this.logTextArea = logTextArea;

        // Discover the service using jmDNS
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo[] services = jmdns.list("_lighting_control._tcp.local.");
            if (services.length > 0) {
                ServiceInfo serviceInfo = services[0];
                String host = serviceInfo.getHostAddresses()[0];
                int port = serviceInfo.getPort();

                // Create a channel using the discovered service information
                channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
                asyncStub = LightingControlServiceGrpc.newStub(channel);
            } else {
                logTextArea.append("No service found.\n");
            }
            jmdns.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void startLightControl() {
        StreamObserver<LightingControlServiceProto.LightControlRequest> requestObserver = asyncStub.monitorAndControlLights(new StreamObserver<LightingControlServiceProto.LightControlResponse>() {
            @Override
            public void onNext(LightingControlServiceProto.LightControlResponse response) {
                logTextArea.append("Light Status: " + response.getStatus() + " | Message: " + response.getMessage() + "\n");
            }

            @Override
            public void onError(Throwable t) {
                logTextArea.append("Error: " + t.getMessage() + "\n");
            }

            @Override
            public void onCompleted() {
                logTextArea.append("Light control completed.\n");
            }
        });

        // Simulate sending light control requests
        for (int i = 0; i < 5; i++) {
            LightingControlServiceProto.LightControlRequest request = LightingControlServiceProto.LightControlRequest.newBuilder()
                    .setRoomID("room123")
                    .setSetStatus(i % 2 == 0)
                    .build();

            requestObserver.onNext(request);
        }

        requestObserver.onCompleted();
    }

    public void shutdown() {
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logTextArea.append("Error: " + e.getMessage() + "\n");
        }
    }
}
