package SmartBuilding.DistributedSystemCA.service1;

import io.grpc.stub.StreamObserver;

public class SecurityServiceImpl extends SecurityServiceGrpc.SecurityServiceImplBase {

    @Override
    public void grantAccess(SecurityServiceProto.AccessRequest request, StreamObserver<SecurityServiceProto.AccessResponse> responseObserver) {
        //data members
        String userID = request.getUserID();
        String roomID = request.getRoomID();
        boolean permissionsGranted = false;
        // For demonstration purposes
        if (userID.equals("Hera")  && roomID.equals(1)) {
            permissionsGranted = true;
        }
        SecurityServiceProto.AccessResponse response = SecurityServiceProto.AccessResponse.newBuilder()
                .setPermissionsGranted(permissionsGranted)
                .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        System.out.println("service1 function1 has been invoked");
        responseObserver.onCompleted();
    }

    @Override
    public void streamLockStatus(SecurityServiceProto.LockStatusRequest request, StreamObserver<SecurityServiceProto.LockStatusResponse> responseObserver) {


        System.out.println("service1 function2 has been invoked");

        String roomID = request.getRoomID();

        // For demonstration, just send a series of lock status updates
        for (int i = 0; i < 5; i++) {
            SecurityServiceProto.LockStatusResponse response = SecurityServiceProto.LockStatusResponse.newBuilder()
                    .setLockID("Lock_" + i)
                    .setIsLocked(i % 2 == 0)
                    .build();

            // Send the response back to the client
            responseObserver.onNext(response);

            // Add a small delay between updates
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Complete the response stream
        responseObserver.onCompleted();
    }
}
