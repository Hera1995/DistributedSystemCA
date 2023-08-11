package SmartBuilding.DistributedSystemCA.service2;

import io.grpc.stub.StreamObserver;

public class LightingControlServiceImpl extends LightingControlServiceGrpc.LightingControlServiceImplBase {

    @Override
    public StreamObserver<LightingControlServiceProto.LightControlRequest> monitorAndControlLights(StreamObserver<LightingControlServiceProto.LightControlResponse> responseObserver) {
        return new StreamObserver<LightingControlServiceProto.LightControlRequest>() {
            @Override
            public void onNext(LightingControlServiceProto.LightControlRequest request) {
                // Implement your logic to control and monitor lights
                // You can use request.getRoomID() and request.getSetStatus() to access the data
                // Perform your lighting control logic here
                System.out.println("service2 function1 has been invoked");
                boolean newStatus = !request.getSetStatus(); // Toggle the status for demonstration purposes

                LightingControlServiceProto.LightControlResponse response = LightingControlServiceProto.LightControlResponse.newBuilder()
                        .setStatus(newStatus)
                        .setMessage("Light status changed successfully")
                        .build();

                // Send the response back to the client
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                // Handle any errors that might occur
            }

            @Override
            public void onCompleted() {
                // Complete the response stream
                responseObserver.onCompleted();
            }
        };
    }
}