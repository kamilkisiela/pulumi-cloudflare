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
    public sealed class AccessPolicyExcludeGithub
    {
        public readonly string? IdentityProviderId;
        /// <summary>
        /// Friendly name of the Access Policy.
        /// </summary>
        public readonly string? Name;
        public readonly ImmutableArray<string> Teams;

        [OutputConstructor]
        private AccessPolicyExcludeGithub(
            string? identityProviderId,

            string? name,

            ImmutableArray<string> teams)
        {
            IdentityProviderId = identityProviderId;
            Name = name;
            Teams = teams;
        }
    }
}
