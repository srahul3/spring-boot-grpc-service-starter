package org.foo.bar.svc1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: serviceA.proto")
public final class ServiceAGrpc {

  private ServiceAGrpc() {}

  public static final String SERVICE_NAME = "org.foo.bar.svc1.ServiceA";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.foo.bar.svc1.Person,
      org.foo.bar.svc1.Greeting> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = org.foo.bar.svc1.Person.class,
      responseType = org.foo.bar.svc1.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.foo.bar.svc1.Person,
      org.foo.bar.svc1.Greeting> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.foo.bar.svc1.Person, org.foo.bar.svc1.Greeting> getSayHelloMethod;
    if ((getSayHelloMethod = ServiceAGrpc.getSayHelloMethod) == null) {
      synchronized (ServiceAGrpc.class) {
        if ((getSayHelloMethod = ServiceAGrpc.getSayHelloMethod) == null) {
          ServiceAGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<org.foo.bar.svc1.Person, org.foo.bar.svc1.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.foo.bar.svc1.ServiceA", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.foo.bar.svc1.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.foo.bar.svc1.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceAMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceAStub newStub(io.grpc.Channel channel) {
    return new ServiceAStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceABlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceABlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceAFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceAFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceAImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(org.foo.bar.svc1.Person request,
        io.grpc.stub.StreamObserver<org.foo.bar.svc1.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.foo.bar.svc1.Person,
                org.foo.bar.svc1.Greeting>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceAStub extends io.grpc.stub.AbstractStub<ServiceAStub> {
    private ServiceAStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceAStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceAStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(org.foo.bar.svc1.Person request,
        io.grpc.stub.StreamObserver<org.foo.bar.svc1.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceABlockingStub extends io.grpc.stub.AbstractStub<ServiceABlockingStub> {
    private ServiceABlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceABlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceABlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceABlockingStub(channel, callOptions);
    }

    /**
     */
    public org.foo.bar.svc1.Greeting sayHello(org.foo.bar.svc1.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceAFutureStub extends io.grpc.stub.AbstractStub<ServiceAFutureStub> {
    private ServiceAFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceAFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceAFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.foo.bar.svc1.Greeting> sayHello(
        org.foo.bar.svc1.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceAImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceAImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.foo.bar.svc1.Person) request,
              (io.grpc.stub.StreamObserver<org.foo.bar.svc1.Greeting>) responseObserver);
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

  private static abstract class ServiceABaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceABaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.foo.bar.svc1.ServiceAOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceA");
    }
  }

  private static final class ServiceAFileDescriptorSupplier
      extends ServiceABaseDescriptorSupplier {
    ServiceAFileDescriptorSupplier() {}
  }

  private static final class ServiceAMethodDescriptorSupplier
      extends ServiceABaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceAMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceAGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceAFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
