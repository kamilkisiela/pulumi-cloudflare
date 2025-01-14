// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PagesProjectSourceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("deploymentsEnabled")]
        public Input<bool>? DeploymentsEnabled { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("prCommentsEnabled")]
        public Input<bool>? PrCommentsEnabled { get; set; }

        [Input("previewBranchExcludes")]
        private InputList<string>? _previewBranchExcludes;
        public InputList<string> PreviewBranchExcludes
        {
            get => _previewBranchExcludes ?? (_previewBranchExcludes = new InputList<string>());
            set => _previewBranchExcludes = value;
        }

        [Input("previewBranchIncludes")]
        private InputList<string>? _previewBranchIncludes;
        public InputList<string> PreviewBranchIncludes
        {
            get => _previewBranchIncludes ?? (_previewBranchIncludes = new InputList<string>());
            set => _previewBranchIncludes = value;
        }

        [Input("previewDeploymentSetting")]
        public Input<string>? PreviewDeploymentSetting { get; set; }

        /// <summary>
        /// The name of the branch that is used for the production environment.
        /// </summary>
        [Input("productionBranch", required: true)]
        public Input<string> ProductionBranch { get; set; } = null!;

        [Input("productionDeploymentEnabled")]
        public Input<bool>? ProductionDeploymentEnabled { get; set; }

        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        public PagesProjectSourceConfigGetArgs()
        {
        }
        public static new PagesProjectSourceConfigGetArgs Empty => new PagesProjectSourceConfigGetArgs();
    }
}
