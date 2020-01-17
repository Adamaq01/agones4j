package agones.dev.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * SDK service to be used in the GameServer SDK to the Pod Sidecar
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: sdk.proto")
public final class SDKGrpc {

  private SDKGrpc() {}

  public static final String SERVICE_NAME = "agones.dev.sdk.SDK";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ready",
      requestType = agones.dev.sdk.Sdk.Empty.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getReadyMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty> getReadyMethod;
    if ((getReadyMethod = SDKGrpc.getReadyMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getReadyMethod = SDKGrpc.getReadyMethod) == null) {
          SDKGrpc.getReadyMethod = getReadyMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ready"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("Ready"))
              .build();
        }
      }
    }
    return getReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getAllocateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Allocate",
      requestType = agones.dev.sdk.Sdk.Empty.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getAllocateMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty> getAllocateMethod;
    if ((getAllocateMethod = SDKGrpc.getAllocateMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getAllocateMethod = SDKGrpc.getAllocateMethod) == null) {
          SDKGrpc.getAllocateMethod = getAllocateMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Allocate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("Allocate"))
              .build();
        }
      }
    }
    return getAllocateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Shutdown",
      requestType = agones.dev.sdk.Sdk.Empty.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getShutdownMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty> getShutdownMethod;
    if ((getShutdownMethod = SDKGrpc.getShutdownMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getShutdownMethod = SDKGrpc.getShutdownMethod) == null) {
          SDKGrpc.getShutdownMethod = getShutdownMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Shutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("Shutdown"))
              .build();
        }
      }
    }
    return getShutdownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = agones.dev.sdk.Sdk.Empty.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.Empty> getHealthMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty> getHealthMethod;
    if ((getHealthMethod = SDKGrpc.getHealthMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getHealthMethod = SDKGrpc.getHealthMethod) == null) {
          SDKGrpc.getHealthMethod = getHealthMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("Health"))
              .build();
        }
      }
    }
    return getHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.GameServer> getGetGameServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGameServer",
      requestType = agones.dev.sdk.Sdk.Empty.class,
      responseType = agones.dev.sdk.Sdk.GameServer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.GameServer> getGetGameServerMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.GameServer> getGetGameServerMethod;
    if ((getGetGameServerMethod = SDKGrpc.getGetGameServerMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getGetGameServerMethod = SDKGrpc.getGetGameServerMethod) == null) {
          SDKGrpc.getGetGameServerMethod = getGetGameServerMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.GameServer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGameServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.GameServer.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("GetGameServer"))
              .build();
        }
      }
    }
    return getGetGameServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.GameServer> getWatchGameServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchGameServer",
      requestType = agones.dev.sdk.Sdk.Empty.class,
      responseType = agones.dev.sdk.Sdk.GameServer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty,
      agones.dev.sdk.Sdk.GameServer> getWatchGameServerMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.GameServer> getWatchGameServerMethod;
    if ((getWatchGameServerMethod = SDKGrpc.getWatchGameServerMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getWatchGameServerMethod = SDKGrpc.getWatchGameServerMethod) == null) {
          SDKGrpc.getWatchGameServerMethod = getWatchGameServerMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Empty, agones.dev.sdk.Sdk.GameServer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchGameServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.GameServer.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("WatchGameServer"))
              .build();
        }
      }
    }
    return getWatchGameServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.KeyValue,
      agones.dev.sdk.Sdk.Empty> getSetLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLabel",
      requestType = agones.dev.sdk.Sdk.KeyValue.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.KeyValue,
      agones.dev.sdk.Sdk.Empty> getSetLabelMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.KeyValue, agones.dev.sdk.Sdk.Empty> getSetLabelMethod;
    if ((getSetLabelMethod = SDKGrpc.getSetLabelMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getSetLabelMethod = SDKGrpc.getSetLabelMethod) == null) {
          SDKGrpc.getSetLabelMethod = getSetLabelMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.KeyValue, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.KeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("SetLabel"))
              .build();
        }
      }
    }
    return getSetLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.KeyValue,
      agones.dev.sdk.Sdk.Empty> getSetAnnotationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAnnotation",
      requestType = agones.dev.sdk.Sdk.KeyValue.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.KeyValue,
      agones.dev.sdk.Sdk.Empty> getSetAnnotationMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.KeyValue, agones.dev.sdk.Sdk.Empty> getSetAnnotationMethod;
    if ((getSetAnnotationMethod = SDKGrpc.getSetAnnotationMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getSetAnnotationMethod = SDKGrpc.getSetAnnotationMethod) == null) {
          SDKGrpc.getSetAnnotationMethod = getSetAnnotationMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.KeyValue, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAnnotation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.KeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("SetAnnotation"))
              .build();
        }
      }
    }
    return getSetAnnotationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Duration,
      agones.dev.sdk.Sdk.Empty> getReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reserve",
      requestType = agones.dev.sdk.Sdk.Duration.class,
      responseType = agones.dev.sdk.Sdk.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Duration,
      agones.dev.sdk.Sdk.Empty> getReserveMethod() {
    io.grpc.MethodDescriptor<agones.dev.sdk.Sdk.Duration, agones.dev.sdk.Sdk.Empty> getReserveMethod;
    if ((getReserveMethod = SDKGrpc.getReserveMethod) == null) {
      synchronized (SDKGrpc.class) {
        if ((getReserveMethod = SDKGrpc.getReserveMethod) == null) {
          SDKGrpc.getReserveMethod = getReserveMethod =
              io.grpc.MethodDescriptor.<agones.dev.sdk.Sdk.Duration, agones.dev.sdk.Sdk.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Duration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  agones.dev.sdk.Sdk.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SDKMethodDescriptorSupplier("Reserve"))
              .build();
        }
      }
    }
    return getReserveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SDKStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SDKStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SDKStub>() {
        @Override
        public SDKStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SDKStub(channel, callOptions);
        }
      };
    return SDKStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SDKBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SDKBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SDKBlockingStub>() {
        @Override
        public SDKBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SDKBlockingStub(channel, callOptions);
        }
      };
    return SDKBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SDKFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SDKFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SDKFutureStub>() {
        @Override
        public SDKFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SDKFutureStub(channel, callOptions);
        }
      };
    return SDKFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SDK service to be used in the GameServer SDK to the Pod Sidecar
   * </pre>
   */
  public static abstract class SDKImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Call when the GameServer is ready
     * </pre>
     */
    public void ready(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReadyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Call to self Allocation the GameServer
     * </pre>
     */
    public void allocate(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAllocateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Call when the GameServer is shutting down
     * </pre>
     */
    public void shutdown(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getShutdownMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a Empty every d Duration to declare that this GameSever is healthy
     * </pre>
     */
    public io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> health(
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getHealthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the current GameServer data
     * </pre>
     */
    public void getGameServer(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.GameServer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGameServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send GameServer details whenever the GameServer is updated
     * </pre>
     */
    public void watchGameServer(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.GameServer> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchGameServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply a Label to the backing GameServer metadata
     * </pre>
     */
    public void setLabel(agones.dev.sdk.Sdk.KeyValue request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply a Annotation to the backing GameServer metadata
     * </pre>
     */
    public void setAnnotation(agones.dev.sdk.Sdk.KeyValue request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAnnotationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marks the GameServer as the Reserved state for Duration
     * </pre>
     */
    public void reserve(agones.dev.sdk.Sdk.Duration request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReserveMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Empty,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_READY)))
          .addMethod(
            getAllocateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Empty,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_ALLOCATE)))
          .addMethod(
            getShutdownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Empty,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_SHUTDOWN)))
          .addMethod(
            getHealthMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Empty,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_HEALTH)))
          .addMethod(
            getGetGameServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Empty,
                agones.dev.sdk.Sdk.GameServer>(
                  this, METHODID_GET_GAME_SERVER)))
          .addMethod(
            getWatchGameServerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Empty,
                agones.dev.sdk.Sdk.GameServer>(
                  this, METHODID_WATCH_GAME_SERVER)))
          .addMethod(
            getSetLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.KeyValue,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_SET_LABEL)))
          .addMethod(
            getSetAnnotationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.KeyValue,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_SET_ANNOTATION)))
          .addMethod(
            getReserveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                agones.dev.sdk.Sdk.Duration,
                agones.dev.sdk.Sdk.Empty>(
                  this, METHODID_RESERVE)))
          .build();
    }
  }

  /**
   * <pre>
   * SDK service to be used in the GameServer SDK to the Pod Sidecar
   * </pre>
   */
  public static final class SDKStub extends io.grpc.stub.AbstractAsyncStub<SDKStub> {
    private SDKStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SDKStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SDKStub(channel, callOptions);
    }

    /**
     * <pre>
     * Call when the GameServer is ready
     * </pre>
     */
    public void ready(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Call to self Allocation the GameServer
     * </pre>
     */
    public void allocate(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllocateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Call when the GameServer is shutting down
     * </pre>
     */
    public void shutdown(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a Empty every d Duration to declare that this GameSever is healthy
     * </pre>
     */
    public io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> health(
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the current GameServer data
     * </pre>
     */
    public void getGameServer(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.GameServer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGameServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send GameServer details whenever the GameServer is updated
     * </pre>
     */
    public void watchGameServer(agones.dev.sdk.Sdk.Empty request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.GameServer> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchGameServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply a Label to the backing GameServer metadata
     * </pre>
     */
    public void setLabel(agones.dev.sdk.Sdk.KeyValue request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply a Annotation to the backing GameServer metadata
     * </pre>
     */
    public void setAnnotation(agones.dev.sdk.Sdk.KeyValue request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAnnotationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Marks the GameServer as the Reserved state for Duration
     * </pre>
     */
    public void reserve(agones.dev.sdk.Sdk.Duration request,
        io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SDK service to be used in the GameServer SDK to the Pod Sidecar
   * </pre>
   */
  public static final class SDKBlockingStub extends io.grpc.stub.AbstractBlockingStub<SDKBlockingStub> {
    private SDKBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SDKBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SDKBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Call when the GameServer is ready
     * </pre>
     */
    public agones.dev.sdk.Sdk.Empty ready(agones.dev.sdk.Sdk.Empty request) {
      return blockingUnaryCall(
          getChannel(), getReadyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Call to self Allocation the GameServer
     * </pre>
     */
    public agones.dev.sdk.Sdk.Empty allocate(agones.dev.sdk.Sdk.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllocateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Call when the GameServer is shutting down
     * </pre>
     */
    public agones.dev.sdk.Sdk.Empty shutdown(agones.dev.sdk.Sdk.Empty request) {
      return blockingUnaryCall(
          getChannel(), getShutdownMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the current GameServer data
     * </pre>
     */
    public agones.dev.sdk.Sdk.GameServer getGameServer(agones.dev.sdk.Sdk.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetGameServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send GameServer details whenever the GameServer is updated
     * </pre>
     */
    public java.util.Iterator<agones.dev.sdk.Sdk.GameServer> watchGameServer(
        agones.dev.sdk.Sdk.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchGameServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply a Label to the backing GameServer metadata
     * </pre>
     */
    public agones.dev.sdk.Sdk.Empty setLabel(agones.dev.sdk.Sdk.KeyValue request) {
      return blockingUnaryCall(
          getChannel(), getSetLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply a Annotation to the backing GameServer metadata
     * </pre>
     */
    public agones.dev.sdk.Sdk.Empty setAnnotation(agones.dev.sdk.Sdk.KeyValue request) {
      return blockingUnaryCall(
          getChannel(), getSetAnnotationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Marks the GameServer as the Reserved state for Duration
     * </pre>
     */
    public agones.dev.sdk.Sdk.Empty reserve(agones.dev.sdk.Sdk.Duration request) {
      return blockingUnaryCall(
          getChannel(), getReserveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SDK service to be used in the GameServer SDK to the Pod Sidecar
   * </pre>
   */
  public static final class SDKFutureStub extends io.grpc.stub.AbstractFutureStub<SDKFutureStub> {
    private SDKFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SDKFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SDKFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Call when the GameServer is ready
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.Empty> ready(
        agones.dev.sdk.Sdk.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getReadyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Call to self Allocation the GameServer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.Empty> allocate(
        agones.dev.sdk.Sdk.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllocateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Call when the GameServer is shutting down
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.Empty> shutdown(
        agones.dev.sdk.Sdk.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the current GameServer data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.GameServer> getGameServer(
        agones.dev.sdk.Sdk.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGameServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply a Label to the backing GameServer metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.Empty> setLabel(
        agones.dev.sdk.Sdk.KeyValue request) {
      return futureUnaryCall(
          getChannel().newCall(getSetLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply a Annotation to the backing GameServer metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.Empty> setAnnotation(
        agones.dev.sdk.Sdk.KeyValue request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAnnotationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Marks the GameServer as the Reserved state for Duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<agones.dev.sdk.Sdk.Empty> reserve(
        agones.dev.sdk.Sdk.Duration request) {
      return futureUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READY = 0;
  private static final int METHODID_ALLOCATE = 1;
  private static final int METHODID_SHUTDOWN = 2;
  private static final int METHODID_GET_GAME_SERVER = 3;
  private static final int METHODID_WATCH_GAME_SERVER = 4;
  private static final int METHODID_SET_LABEL = 5;
  private static final int METHODID_SET_ANNOTATION = 6;
  private static final int METHODID_RESERVE = 7;
  private static final int METHODID_HEALTH = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SDKImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SDKImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READY:
          serviceImpl.ready((agones.dev.sdk.Sdk.Empty) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
          break;
        case METHODID_ALLOCATE:
          serviceImpl.allocate((agones.dev.sdk.Sdk.Empty) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((agones.dev.sdk.Sdk.Empty) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
          break;
        case METHODID_GET_GAME_SERVER:
          serviceImpl.getGameServer((agones.dev.sdk.Sdk.Empty) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.GameServer>) responseObserver);
          break;
        case METHODID_WATCH_GAME_SERVER:
          serviceImpl.watchGameServer((agones.dev.sdk.Sdk.Empty) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.GameServer>) responseObserver);
          break;
        case METHODID_SET_LABEL:
          serviceImpl.setLabel((agones.dev.sdk.Sdk.KeyValue) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
          break;
        case METHODID_SET_ANNOTATION:
          serviceImpl.setAnnotation((agones.dev.sdk.Sdk.KeyValue) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
          break;
        case METHODID_RESERVE:
          serviceImpl.reserve((agones.dev.sdk.Sdk.Duration) request,
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
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
        case METHODID_HEALTH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.health(
              (io.grpc.stub.StreamObserver<agones.dev.sdk.Sdk.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SDKBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SDKBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return agones.dev.sdk.Sdk.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SDK");
    }
  }

  private static final class SDKFileDescriptorSupplier
      extends SDKBaseDescriptorSupplier {
    SDKFileDescriptorSupplier() {}
  }

  private static final class SDKMethodDescriptorSupplier
      extends SDKBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SDKMethodDescriptorSupplier(String methodName) {
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
      synchronized (SDKGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SDKFileDescriptorSupplier())
              .addMethod(getReadyMethod())
              .addMethod(getAllocateMethod())
              .addMethod(getShutdownMethod())
              .addMethod(getHealthMethod())
              .addMethod(getGetGameServerMethod())
              .addMethod(getWatchGameServerMethod())
              .addMethod(getSetLabelMethod())
              .addMethod(getSetAnnotationMethod())
              .addMethod(getReserveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
