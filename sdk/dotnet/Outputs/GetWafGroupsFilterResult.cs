// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetWafGroupsFilterResult
    {
        /// <summary>
        /// Mode of the WAF Rule Groups to lookup. Valid values: on and off.
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// A regular expression matching the name of the WAF Rule Groups to lookup.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetWafGroupsFilterResult(
            string? mode,

            string? name)
        {
            Mode = mode;
            Name = name;
        }
    }
}
