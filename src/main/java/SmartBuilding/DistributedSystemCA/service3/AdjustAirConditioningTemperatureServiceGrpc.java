package SmartBuilding.DistributedSystemCA.service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: AdjustAirConditioningTemperatureService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdjustAirConditioningTemperatureServiceGrpc {

  private AdjustAirConditioningTemperatureServiceGrpc() {}

  public static final String SERVICE_NAME = "DistributedSystemCA.AdjustAirConditioningTemperatureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest,
      AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> getSetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemperature",
      requestType = AdjustAirConditioningTemperatureServiceProto.TemperatureRequest.class,
      responseType = AdjustAirConditioningTemperatureServiceProto.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest,
      AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> getSetTemperatureMethod() {
    io.grpc.MethodDescriptor<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest, AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> getSetTemperatureMethod;
    if ((getSetTemperatureMethod = AdjustAirConditioningTemperatureServiceGrpc.getSetTemperatureMethod) == null) {
      synchronized (AdjustAirConditioningTemperatureServiceGrpc.class) {
        if ((getSetTemperatureMethod = AdjustAirConditioningTemperatureServiceGrpc.getSetTemperatureMethod) == null) {
          AdjustAirConditioningTemperatureServiceGrpc.getSetTemperatureMethod = getSetTemperatureMethod =
              io.grpc.MethodDescriptor.<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest, AdjustAirConditioningTemperatureServiceProto.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AdjustAirConditioningTemperatureServiceProto.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AdjustAirConditioningTemperatureServiceProto.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdjustAirConditioningTemperatureServiceMethodDescriptorSupplier("SetTemperature"))
              .build();
        }
      }
    }
    return getSetTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdjustAirConditioningTemperatureServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdjustAirConditioningTemperatureServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdjustAirConditioningTemperatureServiceStub>() {
        @java.lang.Override
        public AdjustAirConditioningTemperatureServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdjustAirConditioningTemperatureServiceStub(channel, callOptions);
        }
      };
    return AdjustAirConditioningTemperatureServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdjustAirConditioningTemperatureServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdjustAirConditioningTemperatureServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdjustAirConditioningTemperatureServiceBlockingStub>() {
        @java.lang.Override
        public AdjustAirConditioningTemperatureServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdjustAirConditioningTemperatureServiceBlockingStub(channel, callOptions);
        }
      };
    return AdjustAirConditioningTemperatureServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdjustAirConditioningTemperatureServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdjustAirConditioningTemperatureServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdjustAirConditioningTemperatureServiceFutureStub>() {
        @java.lang.Override
        public AdjustAirConditioningTemperatureServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdjustAirConditioningTemperatureServiceFutureStub(channel, callOptions);
        }
      };
    return AdjustAirConditioningTemperatureServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest> setTemperature(
        io.grpc.stub.StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdjustAirConditioningTemperatureService.
   */
  public static abstract class AdjustAirConditioningTemperatureServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdjustAirConditioningTemperatureServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdjustAirConditioningTemperatureService.
   */
  public static final class AdjustAirConditioningTemperatureServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdjustAirConditioningTemperatureServiceStub> {
    private AdjustAirConditioningTemperatureServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdjustAirConditioningTemperatureServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdjustAirConditioningTemperatureServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureRequest> setTemperature(
        io.grpc.stub.StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdjustAirConditioningTemperatureService.
   */
  public static final class AdjustAirConditioningTemperatureServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdjustAirConditioningTemperatureServiceBlockingStub> {
    private AdjustAirConditioningTemperatureServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdjustAirConditioningTemperatureServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdjustAirConditioningTemperatureServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdjustAirConditioningTemperatureService.
   */
  public static final class AdjustAirConditioningTemperatureServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdjustAirConditioningTemperatureServiceFutureStub> {
    private AdjustAirConditioningTemperatureServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdjustAirConditioningTemperatureServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdjustAirConditioningTemperatureServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SET_TEMPERATURE = 0;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setTemperature(
              (io.grpc.stub.StreamObserver<AdjustAirConditioningTemperatureServiceProto.TemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSetTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              AdjustAirConditioningTemperatureServiceProto.TemperatureRequest,
              AdjustAirConditioningTemperatureServiceProto.TemperatureResponse>(
                service, METHODID_SET_TEMPERATURE)))
        .build();
  }

  private static abstract class AdjustAirConditioningTemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdjustAirConditioningTemperatureServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AdjustAirConditioningTemperatureServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdjustAirConditioningTemperatureService");
    }
  }

  private static final class AdjustAirConditioningTemperatureServiceFileDescriptorSupplier
      extends AdjustAirConditioningTemperatureServiceBaseDescriptorSupplier {
    AdjustAirConditioningTemperatureServiceFileDescriptorSupplier() {}
  }

  private static final class AdjustAirConditioningTemperatureServiceMethodDescriptorSupplier
      extends AdjustAirConditioningTemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdjustAirConditioningTemperatureServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdjustAirConditioningTemperatureServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdjustAirConditioningTemperatureServiceFileDescriptorSupplier())
              .addMethod(getSetTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
