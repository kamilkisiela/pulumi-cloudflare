// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WafGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final WafGroupArgs Empty = new WafGroupArgs();

    /**
     * The WAF Rule Group ID.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The WAF Rule Group ID.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The mode of the group, can be one of [&#34;on&#34;, &#34;off&#34;].
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode of the group, can be one of [&#34;on&#34;, &#34;off&#34;].
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The ID of the WAF Rule Package that contains the group.
     * 
     */
    @Import(name="packageId")
    private @Nullable Output<String> packageId;

    /**
     * @return The ID of the WAF Rule Package that contains the group.
     * 
     */
    public Optional<Output<String>> packageId() {
        return Optional.ofNullable(this.packageId);
    }

    /**
     * The DNS zone ID to apply to.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The DNS zone ID to apply to.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private WafGroupArgs() {}

    private WafGroupArgs(WafGroupArgs $) {
        this.groupId = $.groupId;
        this.mode = $.mode;
        this.packageId = $.packageId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WafGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WafGroupArgs $;

        public Builder() {
            $ = new WafGroupArgs();
        }

        public Builder(WafGroupArgs defaults) {
            $ = new WafGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The WAF Rule Group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The WAF Rule Group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param mode The mode of the group, can be one of [&#34;on&#34;, &#34;off&#34;].
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the group, can be one of [&#34;on&#34;, &#34;off&#34;].
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param packageId The ID of the WAF Rule Package that contains the group.
         * 
         * @return builder
         * 
         */
        public Builder packageId(@Nullable Output<String> packageId) {
            $.packageId = packageId;
            return this;
        }

        /**
         * @param packageId The ID of the WAF Rule Package that contains the group.
         * 
         * @return builder
         * 
         */
        public Builder packageId(String packageId) {
            return packageId(Output.of(packageId));
        }

        /**
         * @param zoneId The DNS zone ID to apply to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone ID to apply to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public WafGroupArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
