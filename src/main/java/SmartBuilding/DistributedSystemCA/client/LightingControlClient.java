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

public class LightingControlClient {
    private JFrame frame;
    private JTextArea logTextArea;
    private JButton controlButton;
    private LightingControlServiceClient serviceClient;

    public LightingControlClient() {
        frame = new JFrame("Lighting Control Client");
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

        serviceClient = new LightingControlServiceClient(logTextArea);

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
                new LightingControlClient();
            }
        });
    }
}

class LightingControlServiceClient {
    private JTextArea logTextArea;
    private ManagedChannel channel;
    private LightingControlServiceGrpc.LightingControlServiceStub asyncStub;

    public LightingControlServiceClient(JTextArea logTextArea) {
        this.logTextArea = logTextArea;
        channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        asyncStub = LightingControlServiceGrpc.newStub(channel);
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
