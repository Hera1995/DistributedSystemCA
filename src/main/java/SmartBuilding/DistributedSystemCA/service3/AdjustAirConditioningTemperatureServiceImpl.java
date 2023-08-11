package SmartBuilding.DistributedSystemCA.service3;

import io.grpc.stub.StreamObserver;

public class AdjustAirConditioningTemperatureServiceImpl extends AdjustAirConditioningTemperatureServiceGrpc.AdjustAirConditioningTemperatureServiceImplBase {

    @Override
    public StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest> setTemperature(StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> responseObserver) {
        return new StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest>() {
            @Override
            public void onNext(AdjustAirConditioningTemperatureServiceProto.TemperatureRequest request) {
                // Implement your logic to adjust the temperature for the specified room
                // You can use request.getRoomID() and request.getTemperature() to access the data
                // Perform your temperature adjustment logic here
                System.out.println("service3 function1 has been invoked");

                AdjustAirConditioningTemperatureServiceProto.TemperatureResponse response = AdjustAirConditioningTemperatureServiceProto.TemperatureResponse.newBuilder()
                        .setMessage("Temperature adjusted successfully")
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
