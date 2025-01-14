// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class TeamsRuleRuleSettingsCheckSessionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsRuleRuleSettingsCheckSessionArgs Empty = new TeamsRuleRuleSettingsCheckSessionArgs();

    /**
     * Configure how fresh the session needs to be to be considered valid.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return Configure how fresh the session needs to be to be considered valid.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * Enable session enforcement for this rule.
     * 
     */
    @Import(name="enforce", required=true)
    private Output<Boolean> enforce;

    /**
     * @return Enable session enforcement for this rule.
     * 
     */
    public Output<Boolean> enforce() {
        return this.enforce;
    }

    private TeamsRuleRuleSettingsCheckSessionArgs() {}

    private TeamsRuleRuleSettingsCheckSessionArgs(TeamsRuleRuleSettingsCheckSessionArgs $) {
        this.duration = $.duration;
        this.enforce = $.enforce;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsRuleRuleSettingsCheckSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsRuleRuleSettingsCheckSessionArgs $;

        public Builder() {
            $ = new TeamsRuleRuleSettingsCheckSessionArgs();
        }

        public Builder(TeamsRuleRuleSettingsCheckSessionArgs defaults) {
            $ = new TeamsRuleRuleSettingsCheckSessionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration Configure how fresh the session needs to be to be considered valid.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Configure how fresh the session needs to be to be considered valid.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param enforce Enable session enforcement for this rule.
         * 
         * @return builder
         * 
         */
        public Builder enforce(Output<Boolean> enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param enforce Enable session enforcement for this rule.
         * 
         * @return builder
         * 
         */
        public Builder enforce(Boolean enforce) {
            return enforce(Output.of(enforce));
        }

        public TeamsRuleRuleSettingsCheckSessionArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.enforce = Objects.requireNonNull($.enforce, "expected parameter 'enforce' to be non-null");
            return $;
        }
    }

}
