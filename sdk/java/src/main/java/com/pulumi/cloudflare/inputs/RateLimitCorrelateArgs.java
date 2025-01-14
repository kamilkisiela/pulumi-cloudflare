// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateLimitCorrelateArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitCorrelateArgs Empty = new RateLimitCorrelateArgs();

    /**
     * If set to &#39;nat&#39;, NAT support will be enabled for rate limiting.
     * 
     */
    @Import(name="by")
    private @Nullable Output<String> by;

    /**
     * @return If set to &#39;nat&#39;, NAT support will be enabled for rate limiting.
     * 
     */
    public Optional<Output<String>> by() {
        return Optional.ofNullable(this.by);
    }

    private RateLimitCorrelateArgs() {}

    private RateLimitCorrelateArgs(RateLimitCorrelateArgs $) {
        this.by = $.by;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitCorrelateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitCorrelateArgs $;

        public Builder() {
            $ = new RateLimitCorrelateArgs();
        }

        public Builder(RateLimitCorrelateArgs defaults) {
            $ = new RateLimitCorrelateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param by If set to &#39;nat&#39;, NAT support will be enabled for rate limiting.
         * 
         * @return builder
         * 
         */
        public Builder by(@Nullable Output<String> by) {
            $.by = by;
            return this;
        }

        /**
         * @param by If set to &#39;nat&#39;, NAT support will be enabled for rate limiting.
         * 
         * @return builder
         * 
         */
        public Builder by(String by) {
            return by(Output.of(by));
        }

        public RateLimitCorrelateArgs build() {
            return $;
        }
    }

}
