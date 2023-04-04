package common.agriaku.grpc_kotlin_test_app;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: HelloWorld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequest,
      common.agriaku.grpc_kotlin_test_app.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = common.agriaku.grpc_kotlin_test_app.HelloRequest.class,
      responseType = common.agriaku.grpc_kotlin_test_app.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequest,
      common.agriaku.grpc_kotlin_test_app.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequest, common.agriaku.grpc_kotlin_test_app.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<common.agriaku.grpc_kotlin_test_app.HelloRequest, common.agriaku.grpc_kotlin_test_app.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  common.agriaku.grpc_kotlin_test_app.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  common.agriaku.grpc_kotlin_test_app.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequestList,
      common.agriaku.grpc_kotlin_test_app.HelloReplyList> getSayHelloListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloList",
      requestType = common.agriaku.grpc_kotlin_test_app.HelloRequestList.class,
      responseType = common.agriaku.grpc_kotlin_test_app.HelloReplyList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequestList,
      common.agriaku.grpc_kotlin_test_app.HelloReplyList> getSayHelloListMethod() {
    io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequestList, common.agriaku.grpc_kotlin_test_app.HelloReplyList> getSayHelloListMethod;
    if ((getSayHelloListMethod = GreeterGrpc.getSayHelloListMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloListMethod = GreeterGrpc.getSayHelloListMethod) == null) {
          GreeterGrpc.getSayHelloListMethod = getSayHelloListMethod =
              io.grpc.MethodDescriptor.<common.agriaku.grpc_kotlin_test_app.HelloRequestList, common.agriaku.grpc_kotlin_test_app.HelloReplyList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  common.agriaku.grpc_kotlin_test_app.HelloRequestList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  common.agriaku.grpc_kotlin_test_app.HelloReplyList.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloList"))
              .build();
        }
      }
    }
    return getSayHelloListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList,
      common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList> getSayHelloNonPrimitiveListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloNonPrimitiveList",
      requestType = common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.class,
      responseType = common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList,
      common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList> getSayHelloNonPrimitiveListMethod() {
    io.grpc.MethodDescriptor<common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList, common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList> getSayHelloNonPrimitiveListMethod;
    if ((getSayHelloNonPrimitiveListMethod = GreeterGrpc.getSayHelloNonPrimitiveListMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloNonPrimitiveListMethod = GreeterGrpc.getSayHelloNonPrimitiveListMethod) == null) {
          GreeterGrpc.getSayHelloNonPrimitiveListMethod = getSayHelloNonPrimitiveListMethod =
              io.grpc.MethodDescriptor.<common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList, common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloNonPrimitiveList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloNonPrimitiveList"))
              .build();
        }
      }
    }
    return getSayHelloNonPrimitiveListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(common.agriaku.grpc_kotlin_test_app.HelloRequest request,
        io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloList(common.agriaku.grpc_kotlin_test_app.HelloRequestList request,
        io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReplyList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloListMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloNonPrimitiveList(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList request,
        io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloNonPrimitiveListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                common.agriaku.grpc_kotlin_test_app.HelloRequest,
                common.agriaku.grpc_kotlin_test_app.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                common.agriaku.grpc_kotlin_test_app.HelloRequestList,
                common.agriaku.grpc_kotlin_test_app.HelloReplyList>(
                  this, METHODID_SAY_HELLO_LIST)))
          .addMethod(
            getSayHelloNonPrimitiveListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList,
                common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList>(
                  this, METHODID_SAY_HELLO_NON_PRIMITIVE_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(common.agriaku.grpc_kotlin_test_app.HelloRequest request,
        io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloList(common.agriaku.grpc_kotlin_test_app.HelloRequestList request,
        io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReplyList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloNonPrimitiveList(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList request,
        io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloNonPrimitiveListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     */
    public common.agriaku.grpc_kotlin_test_app.HelloReply sayHello(common.agriaku.grpc_kotlin_test_app.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public common.agriaku.grpc_kotlin_test_app.HelloReplyList sayHelloList(common.agriaku.grpc_kotlin_test_app.HelloRequestList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloListMethod(), getCallOptions(), request);
    }

    /**
     */
    public common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList sayHelloNonPrimitiveList(common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloNonPrimitiveListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<common.agriaku.grpc_kotlin_test_app.HelloReply> sayHello(
        common.agriaku.grpc_kotlin_test_app.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<common.agriaku.grpc_kotlin_test_app.HelloReplyList> sayHelloList(
        common.agriaku.grpc_kotlin_test_app.HelloRequestList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList> sayHelloNonPrimitiveList(
        common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloNonPrimitiveListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_LIST = 1;
  private static final int METHODID_SAY_HELLO_NON_PRIMITIVE_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((common.agriaku.grpc_kotlin_test_app.HelloRequest) request,
              (io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_LIST:
          serviceImpl.sayHelloList((common.agriaku.grpc_kotlin_test_app.HelloRequestList) request,
              (io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReplyList>) responseObserver);
          break;
        case METHODID_SAY_HELLO_NON_PRIMITIVE_LIST:
          serviceImpl.sayHelloNonPrimitiveList((common.agriaku.grpc_kotlin_test_app.HelloRequestNonPrimitiveList) request,
              (io.grpc.stub.StreamObserver<common.agriaku.grpc_kotlin_test_app.HelloReplyNonPrimitiveList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return common.agriaku.grpc_kotlin_test_app.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloListMethod())
              .addMethod(getSayHelloNonPrimitiveListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
