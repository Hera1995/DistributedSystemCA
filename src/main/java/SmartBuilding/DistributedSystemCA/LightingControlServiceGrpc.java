package SmartBuilding.DistributedSystemCA;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: LightingControlService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LightingControlServiceGrpc {

  private LightingControlServiceGrpc() {}

  public static final String SERVICE_NAME = "DistributedSystemCA.LightingControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LightControlRequest,
      LightControlResponse> getMonitorAndControlLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorAndControlLights",
      requestType = LightControlRequest.class,
      responseType = LightControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<LightControlRequest,
      LightControlResponse> getMonitorAndControlLightsMethod() {
    io.grpc.MethodDescriptor<LightControlRequest, LightControlResponse> getMonitorAndControlLightsMethod;
    if ((getMonitorAndControlLightsMethod = LightingControlServiceGrpc.getMonitorAndControlLightsMethod) == null) {
      synchronized (LightingControlServiceGrpc.class) {
        if ((getMonitorAndControlLightsMethod = LightingControlServiceGrpc.getMonitorAndControlLightsMethod) == null) {
          LightingControlServiceGrpc.getMonitorAndControlLightsMethod = getMonitorAndControlLightsMethod =
              io.grpc.MethodDescriptor.<LightControlRequest, LightControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorAndControlLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LightControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LightControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightingControlServiceMethodDescriptorSupplier("MonitorAndControlLights"))
              .build();
        }
      }
    }
    return getMonitorAndControlLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightingControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingControlServiceStub>() {
        @Override
        public LightingControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingControlServiceStub(channel, callOptions);
        }
      };
    return LightingControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightingControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingControlServiceBlockingStub>() {
        @Override
        public LightingControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingControlServiceBlockingStub(channel, callOptions);
        }
      };
    return LightingControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightingControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingControlServiceFutureStub>() {
        @Override
        public LightingControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingControlServiceFutureStub(channel, callOptions);
        }
      };
    return LightingControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<LightControlRequest> monitorAndControlLights(
        io.grpc.stub.StreamObserver<LightControlResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorAndControlLightsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LightingControlService.
   */
  public static abstract class LightingControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return LightingControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LightingControlService.
   */
  public static final class LightingControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LightingControlServiceStub> {
    private LightingControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LightingControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingControlServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<LightControlRequest> monitorAndControlLights(
        io.grpc.stub.StreamObserver<LightControlResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorAndControlLightsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LightingControlService.
   */
  public static final class LightingControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LightingControlServiceBlockingStub> {
    private LightingControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LightingControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingControlServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LightingControlService.
   */
  public static final class LightingControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LightingControlServiceFutureStub> {
    private LightingControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LightingControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingControlServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MONITOR_AND_CONTROL_LIGHTS = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_AND_CONTROL_LIGHTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorAndControlLights(
              (io.grpc.stub.StreamObserver<LightControlResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMonitorAndControlLightsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              LightControlRequest,
              LightControlResponse>(
                service, METHODID_MONITOR_AND_CONTROL_LIGHTS)))
        .build();
  }

  private static abstract class LightingControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightingControlServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LightingControlServiceProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightingControlService");
    }
  }

  private static final class LightingControlServiceFileDescriptorSupplier
      extends LightingControlServiceBaseDescriptorSupplier {
    LightingControlServiceFileDescriptorSupplier() {}
  }

  private static final class LightingControlServiceMethodDescriptorSupplier
      extends LightingControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightingControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightingControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightingControlServiceFileDescriptorSupplier())
              .addMethod(getMonitorAndControlLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
