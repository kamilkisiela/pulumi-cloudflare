// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigsProduction {
    private @Nullable String compatibilityDate;
    private @Nullable List<String> compatibilityFlags;
    private @Nullable Map<String,Object> d1Databases;
    private @Nullable Map<String,Object> durableObjectNamespaces;
    private @Nullable Map<String,Object> environmentVariables;
    private @Nullable Map<String,Object> kvNamespaces;
    private @Nullable Map<String,Object> r2Buckets;

    private PagesProjectDeploymentConfigsProduction() {}
    public Optional<String> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }
    public List<String> compatibilityFlags() {
        return this.compatibilityFlags == null ? List.of() : this.compatibilityFlags;
    }
    public Map<String,Object> d1Databases() {
        return this.d1Databases == null ? Map.of() : this.d1Databases;
    }
    public Map<String,Object> durableObjectNamespaces() {
        return this.durableObjectNamespaces == null ? Map.of() : this.durableObjectNamespaces;
    }
    public Map<String,Object> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    public Map<String,Object> kvNamespaces() {
        return this.kvNamespaces == null ? Map.of() : this.kvNamespaces;
    }
    public Map<String,Object> r2Buckets() {
        return this.r2Buckets == null ? Map.of() : this.r2Buckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigsProduction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String compatibilityDate;
        private @Nullable List<String> compatibilityFlags;
        private @Nullable Map<String,Object> d1Databases;
        private @Nullable Map<String,Object> durableObjectNamespaces;
        private @Nullable Map<String,Object> environmentVariables;
        private @Nullable Map<String,Object> kvNamespaces;
        private @Nullable Map<String,Object> r2Buckets;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigsProduction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityDate = defaults.compatibilityDate;
    	      this.compatibilityFlags = defaults.compatibilityFlags;
    	      this.d1Databases = defaults.d1Databases;
    	      this.durableObjectNamespaces = defaults.durableObjectNamespaces;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.kvNamespaces = defaults.kvNamespaces;
    	      this.r2Buckets = defaults.r2Buckets;
        }

        @CustomType.Setter
        public Builder compatibilityDate(@Nullable String compatibilityDate) {
            this.compatibilityDate = compatibilityDate;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityFlags(@Nullable List<String> compatibilityFlags) {
            this.compatibilityFlags = compatibilityFlags;
            return this;
        }
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }
        @CustomType.Setter
        public Builder d1Databases(@Nullable Map<String,Object> d1Databases) {
            this.d1Databases = d1Databases;
            return this;
        }
        @CustomType.Setter
        public Builder durableObjectNamespaces(@Nullable Map<String,Object> durableObjectNamespaces) {
            this.durableObjectNamespaces = durableObjectNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(@Nullable Map<String,Object> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        @CustomType.Setter
        public Builder kvNamespaces(@Nullable Map<String,Object> kvNamespaces) {
            this.kvNamespaces = kvNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder r2Buckets(@Nullable Map<String,Object> r2Buckets) {
            this.r2Buckets = r2Buckets;
            return this;
        }
        public PagesProjectDeploymentConfigsProduction build() {
            final var o = new PagesProjectDeploymentConfigsProduction();
            o.compatibilityDate = compatibilityDate;
            o.compatibilityFlags = compatibilityFlags;
            o.d1Databases = d1Databases;
            o.durableObjectNamespaces = durableObjectNamespaces;
            o.environmentVariables = environmentVariables;
            o.kvNamespaces = kvNamespaces;
            o.r2Buckets = r2Buckets;
            return o;
        }
    }
}
