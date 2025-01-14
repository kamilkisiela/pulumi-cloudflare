// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NotificationPolicyFilters {
    /**
     * @return State of the pool to alert on.
     * 
     */
    private @Nullable List<String> enableds;
    /**
     * @return Source configuration to alert on for pool or origin.
     * 
     */
    private @Nullable List<String> eventSources;
    /**
     * @return Stream event type to alert on.
     * 
     */
    private @Nullable List<String> eventTypes;
    /**
     * @return Identifier health check. Required when using `filters.0.status`.
     * 
     */
    private @Nullable List<String> healthCheckIds;
    /**
     * @return Stream input id to alert on.
     * 
     */
    private @Nullable List<String> inputIds;
    /**
     * @return A numerical limit. Example: `100`.
     * 
     */
    private @Nullable List<String> limits;
    /**
     * @return Health status to alert on for pool or origin.
     * 
     */
    private @Nullable List<String> newHealths;
    /**
     * @return Packets per second threshold for dos alert.
     * 
     */
    private @Nullable List<String> packetsPerSeconds;
    /**
     * @return Load balancer pool identifier.
     * 
     */
    private @Nullable List<String> poolIds;
    /**
     * @return Product name. Available values: `worker_requests`, `worker_durable_objects_requests`, `worker_durable_objects_duration`, `worker_durable_objects_data_transfer`, `worker_durable_objects_stored_data`, `worker_durable_objects_storage_deletes`, `worker_durable_objects_storage_writes`, `worker_durable_objects_storage_reads`.
     * 
     */
    private @Nullable List<String> products;
    /**
     * @return Protocol to alert on for dos.
     * 
     */
    private @Nullable List<String> protocols;
    /**
     * @return Requests per second threshold for dos alert.
     * 
     */
    private @Nullable List<String> requestsPerSeconds;
    private @Nullable List<String> services;
    /**
     * @return A numerical limit. Example: `99.9`.
     * 
     */
    private @Nullable List<String> slos;
    /**
     * @return Status to alert on.
     * 
     */
    private @Nullable List<String> statuses;
    /**
     * @return Target host to alert on for dos.
     * 
     */
    private @Nullable List<String> targetHosts;
    /**
     * @return Target domain to alert on.
     * 
     */
    private @Nullable List<String> targetZoneNames;
    /**
     * @return A list of zone identifiers.
     * 
     */
    private @Nullable List<String> zones;

    private NotificationPolicyFilters() {}
    /**
     * @return State of the pool to alert on.
     * 
     */
    public List<String> enableds() {
        return this.enableds == null ? List.of() : this.enableds;
    }
    /**
     * @return Source configuration to alert on for pool or origin.
     * 
     */
    public List<String> eventSources() {
        return this.eventSources == null ? List.of() : this.eventSources;
    }
    /**
     * @return Stream event type to alert on.
     * 
     */
    public List<String> eventTypes() {
        return this.eventTypes == null ? List.of() : this.eventTypes;
    }
    /**
     * @return Identifier health check. Required when using `filters.0.status`.
     * 
     */
    public List<String> healthCheckIds() {
        return this.healthCheckIds == null ? List.of() : this.healthCheckIds;
    }
    /**
     * @return Stream input id to alert on.
     * 
     */
    public List<String> inputIds() {
        return this.inputIds == null ? List.of() : this.inputIds;
    }
    /**
     * @return A numerical limit. Example: `100`.
     * 
     */
    public List<String> limits() {
        return this.limits == null ? List.of() : this.limits;
    }
    /**
     * @return Health status to alert on for pool or origin.
     * 
     */
    public List<String> newHealths() {
        return this.newHealths == null ? List.of() : this.newHealths;
    }
    /**
     * @return Packets per second threshold for dos alert.
     * 
     */
    public List<String> packetsPerSeconds() {
        return this.packetsPerSeconds == null ? List.of() : this.packetsPerSeconds;
    }
    /**
     * @return Load balancer pool identifier.
     * 
     */
    public List<String> poolIds() {
        return this.poolIds == null ? List.of() : this.poolIds;
    }
    /**
     * @return Product name. Available values: `worker_requests`, `worker_durable_objects_requests`, `worker_durable_objects_duration`, `worker_durable_objects_data_transfer`, `worker_durable_objects_stored_data`, `worker_durable_objects_storage_deletes`, `worker_durable_objects_storage_writes`, `worker_durable_objects_storage_reads`.
     * 
     */
    public List<String> products() {
        return this.products == null ? List.of() : this.products;
    }
    /**
     * @return Protocol to alert on for dos.
     * 
     */
    public List<String> protocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    /**
     * @return Requests per second threshold for dos alert.
     * 
     */
    public List<String> requestsPerSeconds() {
        return this.requestsPerSeconds == null ? List.of() : this.requestsPerSeconds;
    }
    public List<String> services() {
        return this.services == null ? List.of() : this.services;
    }
    /**
     * @return A numerical limit. Example: `99.9`.
     * 
     */
    public List<String> slos() {
        return this.slos == null ? List.of() : this.slos;
    }
    /**
     * @return Status to alert on.
     * 
     */
    public List<String> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * @return Target host to alert on for dos.
     * 
     */
    public List<String> targetHosts() {
        return this.targetHosts == null ? List.of() : this.targetHosts;
    }
    /**
     * @return Target domain to alert on.
     * 
     */
    public List<String> targetZoneNames() {
        return this.targetZoneNames == null ? List.of() : this.targetZoneNames;
    }
    /**
     * @return A list of zone identifiers.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPolicyFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> enableds;
        private @Nullable List<String> eventSources;
        private @Nullable List<String> eventTypes;
        private @Nullable List<String> healthCheckIds;
        private @Nullable List<String> inputIds;
        private @Nullable List<String> limits;
        private @Nullable List<String> newHealths;
        private @Nullable List<String> packetsPerSeconds;
        private @Nullable List<String> poolIds;
        private @Nullable List<String> products;
        private @Nullable List<String> protocols;
        private @Nullable List<String> requestsPerSeconds;
        private @Nullable List<String> services;
        private @Nullable List<String> slos;
        private @Nullable List<String> statuses;
        private @Nullable List<String> targetHosts;
        private @Nullable List<String> targetZoneNames;
        private @Nullable List<String> zones;
        public Builder() {}
        public Builder(NotificationPolicyFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableds = defaults.enableds;
    	      this.eventSources = defaults.eventSources;
    	      this.eventTypes = defaults.eventTypes;
    	      this.healthCheckIds = defaults.healthCheckIds;
    	      this.inputIds = defaults.inputIds;
    	      this.limits = defaults.limits;
    	      this.newHealths = defaults.newHealths;
    	      this.packetsPerSeconds = defaults.packetsPerSeconds;
    	      this.poolIds = defaults.poolIds;
    	      this.products = defaults.products;
    	      this.protocols = defaults.protocols;
    	      this.requestsPerSeconds = defaults.requestsPerSeconds;
    	      this.services = defaults.services;
    	      this.slos = defaults.slos;
    	      this.statuses = defaults.statuses;
    	      this.targetHosts = defaults.targetHosts;
    	      this.targetZoneNames = defaults.targetZoneNames;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder enableds(@Nullable List<String> enableds) {
            this.enableds = enableds;
            return this;
        }
        public Builder enableds(String... enableds) {
            return enableds(List.of(enableds));
        }
        @CustomType.Setter
        public Builder eventSources(@Nullable List<String> eventSources) {
            this.eventSources = eventSources;
            return this;
        }
        public Builder eventSources(String... eventSources) {
            return eventSources(List.of(eventSources));
        }
        @CustomType.Setter
        public Builder eventTypes(@Nullable List<String> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public Builder eventTypes(String... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }
        @CustomType.Setter
        public Builder healthCheckIds(@Nullable List<String> healthCheckIds) {
            this.healthCheckIds = healthCheckIds;
            return this;
        }
        public Builder healthCheckIds(String... healthCheckIds) {
            return healthCheckIds(List.of(healthCheckIds));
        }
        @CustomType.Setter
        public Builder inputIds(@Nullable List<String> inputIds) {
            this.inputIds = inputIds;
            return this;
        }
        public Builder inputIds(String... inputIds) {
            return inputIds(List.of(inputIds));
        }
        @CustomType.Setter
        public Builder limits(@Nullable List<String> limits) {
            this.limits = limits;
            return this;
        }
        public Builder limits(String... limits) {
            return limits(List.of(limits));
        }
        @CustomType.Setter
        public Builder newHealths(@Nullable List<String> newHealths) {
            this.newHealths = newHealths;
            return this;
        }
        public Builder newHealths(String... newHealths) {
            return newHealths(List.of(newHealths));
        }
        @CustomType.Setter
        public Builder packetsPerSeconds(@Nullable List<String> packetsPerSeconds) {
            this.packetsPerSeconds = packetsPerSeconds;
            return this;
        }
        public Builder packetsPerSeconds(String... packetsPerSeconds) {
            return packetsPerSeconds(List.of(packetsPerSeconds));
        }
        @CustomType.Setter
        public Builder poolIds(@Nullable List<String> poolIds) {
            this.poolIds = poolIds;
            return this;
        }
        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }
        @CustomType.Setter
        public Builder products(@Nullable List<String> products) {
            this.products = products;
            return this;
        }
        public Builder products(String... products) {
            return products(List.of(products));
        }
        @CustomType.Setter
        public Builder protocols(@Nullable List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        @CustomType.Setter
        public Builder requestsPerSeconds(@Nullable List<String> requestsPerSeconds) {
            this.requestsPerSeconds = requestsPerSeconds;
            return this;
        }
        public Builder requestsPerSeconds(String... requestsPerSeconds) {
            return requestsPerSeconds(List.of(requestsPerSeconds));
        }
        @CustomType.Setter
        public Builder services(@Nullable List<String> services) {
            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder slos(@Nullable List<String> slos) {
            this.slos = slos;
            return this;
        }
        public Builder slos(String... slos) {
            return slos(List.of(slos));
        }
        @CustomType.Setter
        public Builder statuses(@Nullable List<String> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }
        @CustomType.Setter
        public Builder targetHosts(@Nullable List<String> targetHosts) {
            this.targetHosts = targetHosts;
            return this;
        }
        public Builder targetHosts(String... targetHosts) {
            return targetHosts(List.of(targetHosts));
        }
        @CustomType.Setter
        public Builder targetZoneNames(@Nullable List<String> targetZoneNames) {
            this.targetZoneNames = targetZoneNames;
            return this;
        }
        public Builder targetZoneNames(String... targetZoneNames) {
            return targetZoneNames(List.of(targetZoneNames));
        }
        @CustomType.Setter
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public NotificationPolicyFilters build() {
            final var o = new NotificationPolicyFilters();
            o.enableds = enableds;
            o.eventSources = eventSources;
            o.eventTypes = eventTypes;
            o.healthCheckIds = healthCheckIds;
            o.inputIds = inputIds;
            o.limits = limits;
            o.newHealths = newHealths;
            o.packetsPerSeconds = packetsPerSeconds;
            o.poolIds = poolIds;
            o.products = products;
            o.protocols = protocols;
            o.requestsPerSeconds = requestsPerSeconds;
            o.services = services;
            o.slos = slos;
            o.statuses = statuses;
            o.targetHosts = targetHosts;
            o.targetZoneNames = targetZoneNames;
            o.zones = zones;
            return o;
        }
    }
}
