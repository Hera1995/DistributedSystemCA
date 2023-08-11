package SmartBuilding.DistributedSystemCA.service3;

import io.grpc.stub.StreamObserver;

public class AdjustAirConditioningTemperatureServiceImpl extends AdjustAirConditioningTemperatureServiceGrpc.AdjustAirConditioningTemperatureServiceImplBase {

    @Override
    public StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest> setTemperature(StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> responseObserver) {
        return new StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest>() {
            @Override
            public void onNext(AdjustAirConditioningTemperatureServiceProto.TemperatureRequest request) {

                System.out.println("service3 function1 has been invoked");

                String roomID = request.getRoomID();
                float temp = request.getTemperature();
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
