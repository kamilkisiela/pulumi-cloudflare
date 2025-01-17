// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWafGroupsFilter {
    private @Nullable String mode;
    private @Nullable String name;

    private GetWafGroupsFilter() {}
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWafGroupsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String name;
        public Builder() {}
        public Builder(GetWafGroupsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GetWafGroupsFilter build() {
            final var o = new GetWafGroupsFilter();
            o.mode = mode;
            o.name = name;
            return o;
        }
    }
}
