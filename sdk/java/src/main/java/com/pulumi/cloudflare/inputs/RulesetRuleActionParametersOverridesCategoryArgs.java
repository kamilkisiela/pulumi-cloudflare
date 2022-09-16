// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersOverridesCategoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersOverridesCategoryArgs Empty = new RulesetRuleActionParametersOverridesCategoryArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="category")
    private @Nullable Output<String> category;

    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private RulesetRuleActionParametersOverridesCategoryArgs() {}

    private RulesetRuleActionParametersOverridesCategoryArgs(RulesetRuleActionParametersOverridesCategoryArgs $) {
        this.action = $.action;
        this.category = $.category;
        this.enabled = $.enabled;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersOverridesCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersOverridesCategoryArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersOverridesCategoryArgs();
        }

        public Builder(RulesetRuleActionParametersOverridesCategoryArgs defaults) {
            $ = new RulesetRuleActionParametersOverridesCategoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
         * 
         */
        @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
         * 
         */
        @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public RulesetRuleActionParametersOverridesCategoryArgs build() {
            return $;
        }
    }

}