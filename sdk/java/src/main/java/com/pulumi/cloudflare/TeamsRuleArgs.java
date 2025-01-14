// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamsRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsRuleArgs Empty = new TeamsRuleArgs();

    /**
     * The account to which the teams rule should be added.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account to which the teams rule should be added.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The action executed by matched teams rule.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action executed by matched teams rule.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The description of the teams rule.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the teams rule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The wirefilter expression to be used for device_posture check matching.
     * 
     */
    @Import(name="devicePosture")
    private @Nullable Output<String> devicePosture;

    /**
     * @return The wirefilter expression to be used for device_posture check matching.
     * 
     */
    public Optional<Output<String>> devicePosture() {
        return Optional.ofNullable(this.devicePosture);
    }

    /**
     * Indicator of rule enablement.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicator of rule enablement.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The protocol or layer to evaluate the traffic and identity expressions.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<String>> filters;

    /**
     * @return The protocol or layer to evaluate the traffic and identity expressions.
     * 
     */
    public Optional<Output<List<String>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The wirefilter expression to be used for identity matching.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<String> identity;

    /**
     * @return The wirefilter expression to be used for identity matching.
     * 
     */
    public Optional<Output<String>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The name of the teams rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the teams rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The evaluation precedence of the teams rule.
     * 
     */
    @Import(name="precedence", required=true)
    private Output<Integer> precedence;

    /**
     * @return The evaluation precedence of the teams rule.
     * 
     */
    public Output<Integer> precedence() {
        return this.precedence;
    }

    /**
     * Additional rule settings (refer to the nested schema).
     * 
     */
    @Import(name="ruleSettings")
    private @Nullable Output<TeamsRuleRuleSettingsArgs> ruleSettings;

    /**
     * @return Additional rule settings (refer to the nested schema).
     * 
     */
    public Optional<Output<TeamsRuleRuleSettingsArgs>> ruleSettings() {
        return Optional.ofNullable(this.ruleSettings);
    }

    /**
     * The wirefilter expression to be used for traffic matching.
     * 
     */
    @Import(name="traffic")
    private @Nullable Output<String> traffic;

    /**
     * @return The wirefilter expression to be used for traffic matching.
     * 
     */
    public Optional<Output<String>> traffic() {
        return Optional.ofNullable(this.traffic);
    }

    private TeamsRuleArgs() {}

    private TeamsRuleArgs(TeamsRuleArgs $) {
        this.accountId = $.accountId;
        this.action = $.action;
        this.description = $.description;
        this.devicePosture = $.devicePosture;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.identity = $.identity;
        this.name = $.name;
        this.precedence = $.precedence;
        this.ruleSettings = $.ruleSettings;
        this.traffic = $.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsRuleArgs $;

        public Builder() {
            $ = new TeamsRuleArgs();
        }

        public Builder(TeamsRuleArgs defaults) {
            $ = new TeamsRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account to which the teams rule should be added.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account to which the teams rule should be added.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param action The action executed by matched teams rule.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action executed by matched teams rule.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description The description of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param devicePosture The wirefilter expression to be used for device_posture check matching.
         * 
         * @return builder
         * 
         */
        public Builder devicePosture(@Nullable Output<String> devicePosture) {
            $.devicePosture = devicePosture;
            return this;
        }

        /**
         * @param devicePosture The wirefilter expression to be used for device_posture check matching.
         * 
         * @return builder
         * 
         */
        public Builder devicePosture(String devicePosture) {
            return devicePosture(Output.of(devicePosture));
        }

        /**
         * @param enabled Indicator of rule enablement.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicator of rule enablement.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters The protocol or layer to evaluate the traffic and identity expressions.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters The protocol or layer to evaluate the traffic and identity expressions.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters The protocol or layer to evaluate the traffic and identity expressions.
         * 
         * @return builder
         * 
         */
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param identity The wirefilter expression to be used for identity matching.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<String> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The wirefilter expression to be used for identity matching.
         * 
         * @return builder
         * 
         */
        public Builder identity(String identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param name The name of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param precedence The evaluation precedence of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder precedence(Output<Integer> precedence) {
            $.precedence = precedence;
            return this;
        }

        /**
         * @param precedence The evaluation precedence of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder precedence(Integer precedence) {
            return precedence(Output.of(precedence));
        }

        /**
         * @param ruleSettings Additional rule settings (refer to the nested schema).
         * 
         * @return builder
         * 
         */
        public Builder ruleSettings(@Nullable Output<TeamsRuleRuleSettingsArgs> ruleSettings) {
            $.ruleSettings = ruleSettings;
            return this;
        }

        /**
         * @param ruleSettings Additional rule settings (refer to the nested schema).
         * 
         * @return builder
         * 
         */
        public Builder ruleSettings(TeamsRuleRuleSettingsArgs ruleSettings) {
            return ruleSettings(Output.of(ruleSettings));
        }

        /**
         * @param traffic The wirefilter expression to be used for traffic matching.
         * 
         * @return builder
         * 
         */
        public Builder traffic(@Nullable Output<String> traffic) {
            $.traffic = traffic;
            return this;
        }

        /**
         * @param traffic The wirefilter expression to be used for traffic matching.
         * 
         * @return builder
         * 
         */
        public Builder traffic(String traffic) {
            return traffic(Output.of(traffic));
        }

        public TeamsRuleArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.precedence = Objects.requireNonNull($.precedence, "expected parameter 'precedence' to be non-null");
            return $;
        }
    }

}
