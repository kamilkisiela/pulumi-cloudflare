// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WafOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final WafOverrideArgs Empty = new WafOverrideArgs();

    /**
     * Description of what the WAF override does.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of what the WAF override does.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Similar to `rules`; which WAF groups you want to alter.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<Map<String,String>> groups;

    /**
     * @return Similar to `rules`; which WAF groups you want to alter.
     * 
     */
    public Optional<Output<Map<String,String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Whether this package is currently paused.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Whether this package is currently paused.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * Relative priority of this configuration when multiple configurations match a single URL.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Relative priority of this configuration when multiple configurations match a single URL.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * When a WAF rule matches, substitute its configured action for a different action specified by this definition.
     * 
     */
    @Import(name="rewriteAction")
    private @Nullable Output<Map<String,String>> rewriteAction;

    /**
     * @return When a WAF rule matches, substitute its configured action for a different action specified by this definition.
     * 
     */
    public Optional<Output<Map<String,String>>> rewriteAction() {
        return Optional.ofNullable(this.rewriteAction);
    }

    /**
     * A list of WAF rule ID to rule action you intend to apply.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<Map<String,String>> rules;

    /**
     * @return A list of WAF rule ID to rule action you intend to apply.
     * 
     */
    public Optional<Output<Map<String,String>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * An array of URLs to apply the WAF override to.
     * 
     */
    @Import(name="urls", required=true)
    private Output<List<String>> urls;

    /**
     * @return An array of URLs to apply the WAF override to.
     * 
     */
    public Output<List<String>> urls() {
        return this.urls;
    }

    /**
     * The DNS zone to which the WAF override condition should be added.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The DNS zone to which the WAF override condition should be added.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private WafOverrideArgs() {}

    private WafOverrideArgs(WafOverrideArgs $) {
        this.description = $.description;
        this.groups = $.groups;
        this.paused = $.paused;
        this.priority = $.priority;
        this.rewriteAction = $.rewriteAction;
        this.rules = $.rules;
        this.urls = $.urls;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WafOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WafOverrideArgs $;

        public Builder() {
            $ = new WafOverrideArgs();
        }

        public Builder(WafOverrideArgs defaults) {
            $ = new WafOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of what the WAF override does.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of what the WAF override does.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param groups Similar to `rules`; which WAF groups you want to alter.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<Map<String,String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Similar to `rules`; which WAF groups you want to alter.
         * 
         * @return builder
         * 
         */
        public Builder groups(Map<String,String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param paused Whether this package is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Whether this package is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param priority Relative priority of this configuration when multiple configurations match a single URL.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Relative priority of this configuration when multiple configurations match a single URL.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rewriteAction When a WAF rule matches, substitute its configured action for a different action specified by this definition.
         * 
         * @return builder
         * 
         */
        public Builder rewriteAction(@Nullable Output<Map<String,String>> rewriteAction) {
            $.rewriteAction = rewriteAction;
            return this;
        }

        /**
         * @param rewriteAction When a WAF rule matches, substitute its configured action for a different action specified by this definition.
         * 
         * @return builder
         * 
         */
        public Builder rewriteAction(Map<String,String> rewriteAction) {
            return rewriteAction(Output.of(rewriteAction));
        }

        /**
         * @param rules A list of WAF rule ID to rule action you intend to apply.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<Map<String,String>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of WAF rule ID to rule action you intend to apply.
         * 
         * @return builder
         * 
         */
        public Builder rules(Map<String,String> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param urls An array of URLs to apply the WAF override to.
         * 
         * @return builder
         * 
         */
        public Builder urls(Output<List<String>> urls) {
            $.urls = urls;
            return this;
        }

        /**
         * @param urls An array of URLs to apply the WAF override to.
         * 
         * @return builder
         * 
         */
        public Builder urls(List<String> urls) {
            return urls(Output.of(urls));
        }

        /**
         * @param urls An array of URLs to apply the WAF override to.
         * 
         * @return builder
         * 
         */
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }

        /**
         * @param zoneId The DNS zone to which the WAF override condition should be added.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone to which the WAF override condition should be added.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public WafOverrideArgs build() {
            $.urls = Objects.requireNonNull($.urls, "expected parameter 'urls' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
