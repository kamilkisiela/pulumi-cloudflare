// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetWafRulesFilterArgs : global::Pulumi.InvokeArgs
    {
        [Input("description")]
        public string? Description { get; set; }

        [Input("groupId")]
        public string? GroupId { get; set; }

        [Input("mode")]
        public string? Mode { get; set; }

        public GetWafRulesFilterArgs()
        {
        }
        public static new GetWafRulesFilterArgs Empty => new GetWafRulesFilterArgs();
    }
}
