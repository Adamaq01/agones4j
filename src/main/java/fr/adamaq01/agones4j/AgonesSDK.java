package fr.adamaq01.agones4j;

import agones.dev.sdk.SDKGrpc;
import agones.dev.sdk.Sdk;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.Duration;
import java.util.concurrent.*;
import java.util.function.Consumer;

/**
 * @author Adamaq01 (Adam THIBERT)
 */
public class AgonesSDK {

    private int port;
    private String address = "localhost";
    private ManagedChannel managedChannel;
    private SDKGrpc.SDKFutureStub futureStub;
    private SDKGrpc.SDKStub stub;

    public AgonesSDK() {
        String sPort = System.getenv("AGONES_SDK_GRPC_PORT");
        this.port = sPort == null || sPort.isEmpty() ? 9357 : Integer.parseInt(sPort);
        this.managedChannel = NettyChannelBuilder
                .forAddress(this.address, this.port)
                .keepAliveTimeout(30, TimeUnit.SECONDS)
                .build();
        this.futureStub = SDKGrpc.newFutureStub(this.managedChannel).withWaitForReady();
        this.stub = SDKGrpc.newStub(this.managedChannel).withWaitForReady();
    }

    // Marks the Game Server as ready to receive connections
    public CompletableFuture<Boolean> ready() {
        return makeCompletableFuture(this.futureStub.ready(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Allocate the Game Server
    public CompletableFuture<Boolean> allocate() {
        return makeCompletableFuture(this.futureStub.allocate(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Marks the Game Server as ready to shutdown
    public CompletableFuture<Boolean> shutdown() {
        return makeCompletableFuture(this.futureStub.shutdown(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // TODO
    // Sends a ping to the health check to indicate that this server is healthy
    public CompletableFuture<Boolean> health() {
        CompletableFuture<Boolean> completableFuture = new CompletableFuture<>();
        this.stub.health(new StreamObserver<Sdk.Empty>() {
            @Override
            public void onNext(Sdk.Empty value) {
                System.out.println("Hey");
            }

            @Override
            public void onError(Throwable t) {
                completableFuture.completeExceptionally(t);
            }

            @Override
            public void onCompleted() {
                completableFuture.complete(true);
            }
        });
        return completableFuture.exceptionally(throwable -> false);
    }

    // Set a Label value on the backing GameServer record that is stored in Kubernetes
    public CompletableFuture<Boolean> setLabel(String key, String value) {
        return makeCompletableFuture(this.futureStub.setLabel(Sdk.KeyValue.newBuilder().setKey(key).setValue(value).build()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Set a Annotation value on the backing Gameserver record that is stored in Kubernetes
    public CompletableFuture<Boolean> setAnnotation(String key, String value) {
        return makeCompletableFuture(this.futureStub.setAnnotation(Sdk.KeyValue.newBuilder().setKey(key).setValue(value).build()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Returns most of the backing GameServer configuration and Status
    public CompletableFuture<Sdk.GameServer> getGameServer() {
        return makeCompletableFuture(this.futureStub.getGameServer(Sdk.Empty.getDefaultInstance()));
    }

    // Reserve marks the Game Server as Reserved for a given duration, at which point
    // it will return the GameServer to a Ready state.
    // Do note, the smallest unit available in the Duration argument is a second.
    public CompletableFuture<Boolean> reserve(Duration duration) {
        return makeCompletableFuture(this.futureStub.reserve(Sdk.Duration.newBuilder().setSeconds(duration.getSeconds()).build()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Watch the backing GameServer configuration on updated
    public CompletableFuture<Boolean> watchGameServer(Consumer<Sdk.GameServer> consumer) {
        CompletableFuture<Boolean> completableFuture = new CompletableFuture<>();
        this.stub.watchGameServer(Sdk.Empty.getDefaultInstance(), new StreamObserver<Sdk.GameServer>() {
            @Override
            public void onNext(Sdk.GameServer value) {
                consumer.accept(value);
            }

            @Override
            public void onError(Throwable t) {
                completableFuture.completeExceptionally(t);
            }

            @Override
            public void onCompleted() {
                completableFuture.complete(true);
            }
        });
        return completableFuture.exceptionally(throwable -> false);
    }

    private static <T> CompletableFuture<T> makeCompletableFuture(Future<T> future) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return future.get();
            } catch (ExecutionException e) {
                throw new CompletionException(e.getCause());
            } catch (InterruptedException e) {
                throw new CompletionException(e);
            }
        });
    }
}
