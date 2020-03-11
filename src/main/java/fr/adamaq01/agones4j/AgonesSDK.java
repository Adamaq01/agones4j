package fr.adamaq01.agones4j;

import kong.unirest.HttpMethod;
import kong.unirest.HttpRequestWithBody;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.IOControl;
import org.apache.http.nio.client.methods.AsyncCharConsumer;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.nio.CharBuffer;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @author Adamaq01 (Adam THIBERT)
 */
public class AgonesSDK {

    private static final int DEFAULT_PORT;
    private static final String DEFAULT_ADDRESS;

    static {
        String sPort = System.getenv("AGONES_SDK_HTTP_PORT");
        DEFAULT_PORT = sPort == null || sPort.isEmpty() ? 9358 : Integer.parseInt(sPort);

        DEFAULT_ADDRESS = "localhost";
    }

    private int port;
    private String address;

    public AgonesSDK() {
        this(DEFAULT_ADDRESS, DEFAULT_PORT);
    }

    public AgonesSDK(int port) {
        this(DEFAULT_ADDRESS, port);
    }

    public AgonesSDK(String address) {
        this(address, DEFAULT_PORT);
    }

    public AgonesSDK(String address, int port) {
        this.address = address;
        this.port = port;
        Unirest.config()
                .automaticRetries(true)
                .socketTimeout(Math.toIntExact(TimeUnit.SECONDS.toMillis(30)))
                .connectTimeout(Math.toIntExact(TimeUnit.SECONDS.toMillis(30)));
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }

    // Marks the Game Server as ready to receive connections
    public CompletableFuture<Boolean> ready() {
        return request(HttpMethod.POST, "/ready")
                .body("{}")
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    // Sends a ping to the health check to indicate that this server is healthy
    public CompletableFuture<Boolean> health() {
        return request(HttpMethod.POST, "/health")
                .body("{}")
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    // Marks the Game Server as ready to shutdown
    public CompletableFuture<Boolean> shutdown() {
        return request(HttpMethod.POST, "/shutdown")
                .body("{}")
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    // Set a Label value on the backing GameServer record that is stored in Kubernetes
    public CompletableFuture<Boolean> setLabel(String key, String value) {
        return request(HttpMethod.PUT, "/metadata/label")
                .body(String.format("{\"key\": \"%s\", \"value\": \"%s\"}", key, value))
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    // Set a Annotation value on the backing GameServer record that is stored in Kubernetes
    public CompletableFuture<Boolean> setAnnotation(String key, String value) {
        return request(HttpMethod.PUT, "/metadata/annotation")
                .body(String.format("{\"key\": \"%s\", \"value\": \"%s\"}", key, value))
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    // Returns most of the backing GameServer configuration and Status
    public CompletableFuture<GameServer> gameServer() {
        return request(HttpMethod.GET, "/gameserver")
                .asJsonAsync()
                .thenApply(response -> GameServer.fromJson(response.getBody().getObject()));
    }

    // Watch the backing GameServer configuration on updated
    public Thread watchGameServer(Consumer<GameServer> consumer) {
        Thread thread = new Thread(() -> {
            CloseableHttpAsyncClient httpClient = HttpAsyncClients.createMinimal();
            try {
                httpClient.start();
                httpClient.execute(HttpAsyncMethods.createGet("http://" + address + ":" + port + "/watch/gameserver"), new GameServerWatcherConsumer(consumer), null).get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        return thread;
    }

    private static class GameServerWatcherConsumer extends AsyncCharConsumer<Void> {

        private Consumer<GameServer> consumer;

        public GameServerWatcherConsumer(Consumer<GameServer> consumer) {
            this.consumer = consumer;
        }

        @Override
        protected void onCharReceived(CharBuffer buf, IOControl ioctrl) {
            consumer.accept(GameServer.fromJson(new JSONObject(buf.toString()).getJSONObject("result")));
        }

        @Override
        protected void onResponseReceived(org.apache.http.HttpResponse response) {
        }

        @Override
        protected Void buildResult(HttpContext context) {
            return null;
        }
    }

    // Reserve marks the Game Server as Reserved for a given duration, at which point
    // it will return the GameServer to a Ready state.
    // Do note, the smallest unit available in the Duration argument is a second.
    public CompletableFuture<Boolean> reserve(Duration duration) {
        return request(HttpMethod.POST, "/reserve")
                .body(String.format("{\"seconds\": \"%s\"}", duration.getSeconds()))
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    // Allocate the Game Server
    public CompletableFuture<Boolean> allocate() {
        return request(HttpMethod.POST, "/allocate")
                .body("{}")
                .asEmptyAsync()
                .thenApply(HttpResponse::isSuccess);
    }

    private HttpRequestWithBody request(HttpMethod method, String path) {
        return Unirest.request(method.name(), "http://" + address + ":" + port + path).header("Content-Type", "application/json");
    }
}
