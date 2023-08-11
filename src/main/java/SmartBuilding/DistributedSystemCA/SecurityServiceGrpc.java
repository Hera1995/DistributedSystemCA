package SmartBuilding.DistributedSystemCA;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: SmartBuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecurityServiceGrpc {

  private SecurityServiceGrpc() {}

  public static final String SERVICE_NAME = "DistributedSystemCA.SecurityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SmartBuilding.DistributedSystemCA.AccessRequest,
      SmartBuilding.DistributedSystemCA.AccessResponse> getGrantAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantAccess",
      requestType = SmartBuilding.DistributedSystemCA.AccessRequest.class,
      responseType = SmartBuilding.DistributedSystemCA.AccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SmartBuilding.DistributedSystemCA.AccessRequest,
      SmartBuilding.DistributedSystemCA.AccessResponse> getGrantAccessMethod() {
    io.grpc.MethodDescriptor<SmartBuilding.DistributedSystemCA.AccessRequest, SmartBuilding.DistributedSystemCA.AccessResponse> getGrantAccessMethod;
    if ((getGrantAccessMethod = SecurityServiceGrpc.getGrantAccessMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getGrantAccessMethod = SecurityServiceGrpc.getGrantAccessMethod) == null) {
          SecurityServiceGrpc.getGrantAccessMethod = getGrantAccessMethod =
              io.grpc.MethodDescriptor.<SmartBuilding.DistributedSystemCA.AccessRequest, SmartBuilding.DistributedSystemCA.AccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuilding.DistributedSystemCA.AccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuilding.DistributedSystemCA.AccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("GrantAccess"))
              .build();
        }
      }
    }
    return getGrantAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SmartBuilding.DistributedSystemCA.LockStatusRequest,
      SmartBuilding.DistributedSystemCA.LockStatusResponse> getStreamLockStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLockStatus",
      requestType = SmartBuilding.DistributedSystemCA.LockStatusRequest.class,
      responseType = SmartBuilding.DistributedSystemCA.LockStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SmartBuilding.DistributedSystemCA.LockStatusRequest,
      SmartBuilding.DistributedSystemCA.LockStatusResponse> getStreamLockStatusMethod() {
    io.grpc.MethodDescriptor<SmartBuilding.DistributedSystemCA.LockStatusRequest, SmartBuilding.DistributedSystemCA.LockStatusResponse> getStreamLockStatusMethod;
    if ((getStreamLockStatusMethod = SecurityServiceGrpc.getStreamLockStatusMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getStreamLockStatusMethod = SecurityServiceGrpc.getStreamLockStatusMethod) == null) {
          SecurityServiceGrpc.getStreamLockStatusMethod = getStreamLockStatusMethod =
              io.grpc.MethodDescriptor.<SmartBuilding.DistributedSystemCA.LockStatusRequest, SmartBuilding.DistributedSystemCA.LockStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLockStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuilding.DistributedSystemCA.LockStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuilding.DistributedSystemCA.LockStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("StreamLockStatus"))
              .build();
        }
      }
    }
    return getStreamLockStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceStub>() {
        @Override
        public SecurityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceStub(channel, callOptions);
        }
      };
    return SecurityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceBlockingStub>() {
        @Override
        public SecurityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceBlockingStub(channel, callOptions);
        }
      };
    return SecurityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceFutureStub>() {
        @Override
        public SecurityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceFutureStub(channel, callOptions);
        }
      };
    return SecurityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void grantAccess(SmartBuilding.DistributedSystemCA.AccessRequest request,
        io.grpc.stub.StreamObserver<SmartBuilding.DistributedSystemCA.AccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantAccessMethod(), responseObserver);
    }

    /**
     */
    default void streamLockStatus(SmartBuilding.DistributedSystemCA.LockStatusRequest request,
        io.grpc.stub.StreamObserver<SmartBuilding.DistributedSystemCA.LockStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLockStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecurityService.
   */
  public static abstract class SecurityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecurityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecurityService.
   */
  public static final class SecurityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SecurityServiceStub> {
    private SecurityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SecurityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceStub(channel, callOptions);
    }

    /**
     */
    public void grantAccess(SmartBuilding.DistributedSystemCA.AccessRequest request,
        io.grpc.stub.StreamObserver<SmartBuilding.DistributedSystemCA.AccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamLockStatus(SmartBuilding.DistributedSystemCA.LockStatusRequest request,
        io.grpc.stub.StreamObserver<SmartBuilding.DistributedSystemCA.LockStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLockStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecurityService.
   */
  public static final class SecurityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecurityServiceBlockingStub> {
    private SecurityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SecurityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public SmartBuilding.DistributedSystemCA.AccessResponse grantAccess(SmartBuilding.DistributedSystemCA.AccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantAccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SmartBuilding.DistributedSystemCA.LockStatusResponse> streamLockStatus(
        SmartBuilding.DistributedSystemCA.LockStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLockStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecurityService.
   */
  public static final class SecurityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecurityServiceFutureStub> {
    private SecurityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SecurityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SmartBuilding.DistributedSystemCA.AccessResponse> grantAccess(
        SmartBuilding.DistributedSystemCA.AccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRANT_ACCESS = 0;
  private static final int METHODID_STREAM_LOCK_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRANT_ACCESS:
          serviceImpl.grantAccess((SmartBuilding.DistributedSystemCA.AccessRequest) request,
              (io.grpc.stub.StreamObserver<SmartBuilding.DistributedSystemCA.AccessResponse>) responseObserver);
          break;
        case METHODID_STREAM_LOCK_STATUS:
          serviceImpl.streamLockStatus((SmartBuilding.DistributedSystemCA.LockStatusRequest) request,
              (io.grpc.stub.StreamObserver<SmartBuilding.DistributedSystemCA.LockStatusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGrantAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SmartBuilding.DistributedSystemCA.AccessRequest,
              SmartBuilding.DistributedSystemCA.AccessResponse>(
                service, METHODID_GRANT_ACCESS)))
        .addMethod(
          getStreamLockStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              SmartBuilding.DistributedSystemCA.LockStatusRequest,
              SmartBuilding.DistributedSystemCA.LockStatusResponse>(
                service, METHODID_STREAM_LOCK_STATUS)))
        .build();
  }

  private static abstract class SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SmartBuilding.DistributedSystemCA.SmartBuildingProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityService");
    }
  }

  private static final class SecurityServiceFileDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier {
    SecurityServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityServiceMethodDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityServiceFileDescriptorSupplier())
              .addMethod(getGrantAccessMethod())
              .addMethod(getStreamLockStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
