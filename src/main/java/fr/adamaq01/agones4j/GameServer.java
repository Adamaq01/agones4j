package fr.adamaq01.agones4j;

import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Adamaq01 (Adam THIBERT)
 */
public class GameServer {

    private static Map<String, String> getKeyValues(JSONObject jsonObject) {
        Map<String, String> keyValues = new HashMap<>();
        for (String key : jsonObject.keySet()) {
            keyValues.put(key, jsonObject.getString(key));
        }
        return keyValues;
    }

    public static GameServer fromJson(JSONObject jsonObject) {
        JSONObject objectMeta = jsonObject.getJSONObject("object_meta");
        JSONObject spec = jsonObject.getJSONObject("spec");
        JSONObject health = spec.getJSONObject("health");
        JSONObject status = jsonObject.getJSONObject("status");
        return new GameServer(
                objectMeta.getString("name"),
                objectMeta.getString("namespace"),
                objectMeta.getString("uid"),
                objectMeta.getString("resource_version"),
                objectMeta.getString("generation"),
                Instant.ofEpochSecond(Long.parseLong(objectMeta.getString("creation_timestamp"))),
                orNull(() -> {
                    if (objectMeta.has("deletion_timestamp"))
                        return Instant.ofEpochSecond(Long.parseLong(objectMeta.getString("deletion_timestamp")));
                    return null;
                }),
                getKeyValues(objectMeta.getJSONObject("annotations")),
                getKeyValues(objectMeta.getJSONObject("labels")),
                Health.fromJson(health),
                Status.fromJson(status)
        );
    }

    private static <T> T orNull(Supplier<T> valueSupplier) {
        return getAsOptional(valueSupplier).orElse(null);
    }

    private static <T> Optional<T> getAsOptional(Supplier<T> valueSupplier) {
        return Optional.ofNullable(valueSupplier.get());
    }

    private String name;
    private String namespace;
    private String uid;
    private String resourceVersion;
    private String generation;
    private Instant creationInstant;
    private Instant deletionInstant;
    private Map<String, String> annotations;
    private Map<String, String> labels;
    private Health health;
    private Status status;

    private GameServer() {
    }

    public GameServer(String name, String namespace, String uid, String resourceVersion, String generation, Instant creationInstant, Instant deletionInstant, Map<String, String> annotations, Map<String, String> labels, Health health, Status status) {
        this.name = name;
        this.namespace = namespace;
        this.uid = uid;
        this.resourceVersion = resourceVersion;
        this.generation = generation;
        this.creationInstant = creationInstant;
        this.deletionInstant = deletionInstant;
        this.annotations = annotations;
        this.labels = labels;
        this.health = health;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getUid() {
        return uid;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public String getGeneration() {
        return generation;
    }

    public Instant getCreationInstant() {
        return creationInstant;
    }

    public Instant getDeletionInstant() {
        return deletionInstant;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public Health getHealth() {
        return health;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "GameServer{" +
                "name='" + name + '\'' +
                ", namespace='" + namespace + '\'' +
                ", uid='" + uid + '\'' +
                ", resourceVersion='" + resourceVersion + '\'' +
                ", generation='" + generation + '\'' +
                ", creationInstant=" + creationInstant +
                ", deletionInstant=" + deletionInstant +
                ", annotations=" + annotations +
                ", labels=" + labels +
                ", health=" + health +
                ", status=" + status +
                '}';
    }

    public static class Status {

        private static Map<String, Integer> getPorts(JSONArray jsonArray) {
            Map<String, Integer> ports = new HashMap<>();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject port = jsonArray.getJSONObject(i);
                ports.put(port.getString("name"), port.getInt("port"));
            }
            return ports;
        }

        public static Status fromJson(JSONObject jsonObject) {
            return new Status(
                    jsonObject.getString("state"),
                    jsonObject.getString("address"),
                    getPorts(jsonObject.getJSONArray("ports"))
            );
        }

        private String state;
        private String address;
        private Map<String, Integer> ports;

        private Status() {
        }

        public Status(String state, String address, Map<String, Integer> ports) {
            this.state = state;
            this.address = address;
            this.ports = ports;
        }

        public String getState() {
            return state;
        }

        public String getAddress() {
            return address;
        }

        public Map<String, Integer> getPorts() {
            return ports;
        }

        @Override
        public String toString() {
            return "Status{" +
                    "state='" + state + '\'' +
                    ", address='" + address + '\'' +
                    ", ports=" + ports +
                    '}';
        }
    }

    public static class Health {

        public static Health fromJson(JSONObject jsonObject) {
            return new Health(
                    getAsOptional(() -> {
                        if (jsonObject.has("disabled"))
                            return jsonObject.getBoolean("disabled");
                        return false;
                    }).orElse(false),
                    Duration.ofSeconds(jsonObject.getInt("period_seconds")),
                    jsonObject.getInt("failure_threshold"),
                    Duration.ofSeconds(jsonObject.getInt("initial_delay_seconds"))
            );
        }

        private boolean disabled;
        private Duration period;
        private int failureThreshold;
        private Duration initialDelay;

        private Health() {
        }

        public Health(boolean disabled, Duration period, int failureThreshold, Duration initialDelay) {
            this.disabled = disabled;
            this.period = period;
            this.failureThreshold = failureThreshold;
            this.initialDelay = initialDelay;
        }

        public boolean isDisabled() {
            return disabled;
        }

        public Duration getPeriod() {
            return period;
        }

        public int getFailureThreshold() {
            return failureThreshold;
        }

        public Duration getInitialDelay() {
            return initialDelay;
        }

        @Override
        public String toString() {
            return "Health{" +
                    "disabled=" + disabled +
                    ", period=" + period.getSeconds() +
                    ", failureThreshold=" + failureThreshold +
                    ", initialDelay=" + initialDelay.getSeconds() +
                    '}';
        }
    }
}
