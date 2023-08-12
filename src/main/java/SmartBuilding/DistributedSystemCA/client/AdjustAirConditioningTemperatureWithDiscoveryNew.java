package SmartBuilding.DistributedSystemCA.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import SmartBuilding.DistributedSystemCA.service3.*;
import io.grpc.stub.StreamObserver;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class AdjustAirConditioningTemperatureWithDiscoveryNew extends JFrame {
    private JTextArea responseTextArea;

    public AdjustAirConditioningTemperatureWithDiscoveryNew() {
        setTitle("Adjust Air Conditioning Temperature Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Room ID:"));
        JTextField roomIDField = new JTextField();
        inputPanel.add(roomIDField);
        inputPanel.add(new JLabel("Temperature:"));
        JTextField temperatureField = new JTextField();
        inputPanel.add(temperatureField);

        JButton setTemperatureButton = new JButton("Set Temperature");
        setTemperatureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomID = roomIDField.getText();
                float temperature = Float.parseFloat(temperatureField.getText());

                // Discover the service using jmDNS
                try {
                    JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
                    ServiceInfo[] services = jmdns.list("_adjust_air_conditioning_temperature._tcp.local.");
                    if (services.length > 0) {
                        ServiceInfo serviceInfo = services[0];
                        String host = serviceInfo.getHostAddresses()[0];
                        int port = serviceInfo.getPort();

                        // Create a channel using the discovered service information
                        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                                .usePlaintext()
                                .build();
                        AdjustAirConditioningTemperatureServiceGrpc.AdjustAirConditioningTemperatureServiceStub client =
                                AdjustAirConditioningTemperatureServiceGrpc.newStub(channel);

                        // Create a stream to send requests and receive responses
                        StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> responseObserver = new StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse>() {
                            @Override
                            public void onNext(AdjustAirConditioningTemperatureServiceProto.TemperatureResponse response) {
                                responseTextArea.append(response.getMessage() + "\n");
                            }

                            @Override
                            public void onError(Throwable throwable) {
                                throwable.printStackTrace();
                            }

                            @Override
                            public void onCompleted() {
                                // Handle stream completion if needed
                            }
                        };

                        StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest> requestStream = client.setTemperature(responseObserver);

                        // Send requests
                        AdjustAirConditioningTemperatureServiceProto.TemperatureRequest request = AdjustAirConditioningTemperatureServiceProto.TemperatureRequest.newBuilder()
                                .setRoomID(roomID)
                                .setTemperature(temperature)
                                .build();

                        requestStream.onNext(request);
                        // You can send more requests here if needed

                        // Mark the end of requests
                        requestStream.onCompleted();

                        jmdns.close();
                    } else {
                        responseTextArea.append("No service found.\n");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        responseTextArea = new JTextArea();
        responseTextArea.setEditable(false);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(setTemperatureButton, BorderLayout.CENTER);
        mainPanel.add(new JScrollPane(responseTextArea), BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdjustAirConditioningTemperatureWithDiscoveryNew().setVisible(true);
            }
        });
    }
}
