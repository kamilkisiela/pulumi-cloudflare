// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.CustomSslCustomSslOptionsArgs;
import com.pulumi.cloudflare.inputs.CustomSslCustomSslPriorityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomSslArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomSslArgs Empty = new CustomSslArgs();

    /**
     * The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
     * 
     */
    @Import(name="customSslOptions")
    private @Nullable Output<CustomSslCustomSslOptionsArgs> customSslOptions;

    /**
     * @return The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
     * 
     */
    public Optional<Output<CustomSslCustomSslOptionsArgs>> customSslOptions() {
        return Optional.ofNullable(this.customSslOptions);
    }

    @Import(name="customSslPriorities")
    private @Nullable Output<List<CustomSslCustomSslPriorityArgs>> customSslPriorities;

    public Optional<Output<List<CustomSslCustomSslPriorityArgs>>> customSslPriorities() {
        return Optional.ofNullable(this.customSslPriorities);
    }

    /**
     * The DNS zone id to the custom ssl cert should be added.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The DNS zone id to the custom ssl cert should be added.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private CustomSslArgs() {}

    private CustomSslArgs(CustomSslArgs $) {
        this.customSslOptions = $.customSslOptions;
        this.customSslPriorities = $.customSslPriorities;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomSslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomSslArgs $;

        public Builder() {
            $ = new CustomSslArgs();
        }

        public Builder(CustomSslArgs defaults) {
            $ = new CustomSslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customSslOptions The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
         * 
         * @return builder
         * 
         */
        public Builder customSslOptions(@Nullable Output<CustomSslCustomSslOptionsArgs> customSslOptions) {
            $.customSslOptions = customSslOptions;
            return this;
        }

        /**
         * @param customSslOptions The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
         * 
         * @return builder
         * 
         */
        public Builder customSslOptions(CustomSslCustomSslOptionsArgs customSslOptions) {
            return customSslOptions(Output.of(customSslOptions));
        }

        public Builder customSslPriorities(@Nullable Output<List<CustomSslCustomSslPriorityArgs>> customSslPriorities) {
            $.customSslPriorities = customSslPriorities;
            return this;
        }

        public Builder customSslPriorities(List<CustomSslCustomSslPriorityArgs> customSslPriorities) {
            return customSslPriorities(Output.of(customSslPriorities));
        }

        public Builder customSslPriorities(CustomSslCustomSslPriorityArgs... customSslPriorities) {
            return customSslPriorities(List.of(customSslPriorities));
        }

        /**
         * @param zoneId The DNS zone id to the custom ssl cert should be added.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone id to the custom ssl cert should be added.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public CustomSslArgs build() {
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}