package SmartBuilding.DistributedSystemCA.service2;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;

public class LightingControlServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create an instance of your service implementation
        LightingControlServiceImpl serviceImpl = new LightingControlServiceImpl();

        // Create a gRPC server
        Server server = ServerBuilder.forPort(50052) // Use the desired port
                .addService(serviceImpl)
                .build();

        // Start the server
        server.start();

        // Register with jmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo serviceInfo = ServiceInfo.create("_your_service_name._tcp.local.", "LightingControlService", 50052, "path=/");
        jmdns.registerService(serviceInfo);

        System.out.println("Lighting Control Server started and registered with jmDNS");

        // Shut down the server gracefully on JVM shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down server...");
            jmdns.unregisterAllServices();
            server.shutdown();
            System.out.println("Server shut down");
        }));

        // Block the main thread to keep the server alive
        server.awaitTermination();
    }
}
