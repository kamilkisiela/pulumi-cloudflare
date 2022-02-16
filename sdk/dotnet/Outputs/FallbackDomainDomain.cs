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
    public sealed class FallbackDomainDomain
    {
        /// <summary>
        /// The description of the domain.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The DNS servers to receive the redirected request.
        /// </summary>
        public readonly ImmutableArray<string> DnsServers;
        /// <summary>
        /// The domain to ignore DNS requests.
        /// </summary>
        public readonly string? Suffix;

        [OutputConstructor]
        private FallbackDomainDomain(
            string? description,

            ImmutableArray<string> dnsServers,

            string? suffix)
        {
            Description = description;
            DnsServers = dnsServers;
            Suffix = suffix;
        }
    }
}