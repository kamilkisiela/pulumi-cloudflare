// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsCacheKeyFieldsHostArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// `false` (default) - includes the Host header in the HTTP request sent to the origin; `true` - includes the Host header that was resolved to get the origin IP for the request (e.g. changed with Resolve Override Page Rule).
        /// </summary>
        [Input("resolved")]
        public Input<bool>? Resolved { get; set; }

        public PageRuleActionsCacheKeyFieldsHostArgs()
        {
        }
    }
}