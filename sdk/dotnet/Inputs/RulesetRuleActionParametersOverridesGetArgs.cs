// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersOverridesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("categories")]
        private InputList<Inputs.RulesetRuleActionParametersOverridesCategoryGetArgs>? _categories;
        public InputList<Inputs.RulesetRuleActionParametersOverridesCategoryGetArgs> Categories
        {
            get => _categories ?? (_categories = new InputList<Inputs.RulesetRuleActionParametersOverridesCategoryGetArgs>());
            set => _categories = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("rules")]
        private InputList<Inputs.RulesetRuleActionParametersOverridesRuleGetArgs>? _rules;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersOverridesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RulesetRuleActionParametersOverridesRuleGetArgs>());
            set => _rules = value;
        }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public RulesetRuleActionParametersOverridesGetArgs()
        {
        }
        public static new RulesetRuleActionParametersOverridesGetArgs Empty => new RulesetRuleActionParametersOverridesGetArgs();
    }
}
