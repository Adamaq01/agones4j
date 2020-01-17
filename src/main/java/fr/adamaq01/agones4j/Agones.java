package fr.adamaq01.agones4j;

import agones.dev.sdk.SDKGrpc;
import agones.dev.sdk.Sdk;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

import java.util.concurrent.*;

/**
 * @author Adamaq01 (Adam THIBERT)
 */
public class Agones {

    private int port;
    private String address = "localhost";
    private ManagedChannel managedChannel;
    private SDKGrpc.SDKFutureStub sdkStub;

    public Agones() {
        String sPort = System.getenv("AGONES_SDK_GRPC_PORT");
        this.port = sPort == null || sPort.isEmpty() ? 9357 : Integer.parseInt(sPort);
        this.managedChannel = NettyChannelBuilder
                .forAddress(this.address, this.port)
                .keepAliveTimeout(30, TimeUnit.SECONDS)
                .build();
        this.sdkStub = SDKGrpc.newFutureStub(this.managedChannel).withWaitForReady();
    }

    // Marks the Game Server as ready to receive connections
    public void ready() {
        makeCompletableFuture(this.sdkStub.ready(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Allocate the Game Server
    public void allocate() {
        makeCompletableFuture(this.sdkStub.allocate(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // Marks the Game Server as ready to shutdown
    public void shutdown() {
        makeCompletableFuture(this.sdkStub.shutdown(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);
    }

    // TODO
    // Sends a ping to the health check to indicate that this server is healthy
    public void health() {
        /*makeCompletableFuture(this.sdkStub.reserve(Sdk.Empty.getDefaultInstance()))
                .thenApply(empty -> true).exceptionally(throwable -> false);*/
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
