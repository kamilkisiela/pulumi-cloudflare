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
    public sealed class AccessGroupRequire
    {
        public readonly bool? AnyValidServiceToken;
        public readonly ImmutableArray<Outputs.AccessGroupRequireAzure> Azures;
        public readonly bool? Certificate;
        public readonly string? CommonName;
        public readonly ImmutableArray<string> EmailDomains;
        public readonly ImmutableArray<string> Emails;
        public readonly bool? Everyone;
        public readonly ImmutableArray<Outputs.AccessGroupRequireGithub> Githubs;
        public readonly ImmutableArray<string> Groups;
        public readonly ImmutableArray<Outputs.AccessGroupRequireGsuite> Gsuites;
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<Outputs.AccessGroupRequireOkta> Oktas;
        public readonly ImmutableArray<Outputs.AccessGroupRequireSaml> Samls;
        public readonly ImmutableArray<string> ServiceTokens;

        [OutputConstructor]
        private AccessGroupRequire(
            bool? anyValidServiceToken,

            ImmutableArray<Outputs.AccessGroupRequireAzure> azures,

            bool? certificate,

            string? commonName,

            ImmutableArray<string> emailDomains,

            ImmutableArray<string> emails,

            bool? everyone,

            ImmutableArray<Outputs.AccessGroupRequireGithub> githubs,

            ImmutableArray<string> groups,

            ImmutableArray<Outputs.AccessGroupRequireGsuite> gsuites,

            ImmutableArray<string> ips,

            ImmutableArray<Outputs.AccessGroupRequireOkta> oktas,

            ImmutableArray<Outputs.AccessGroupRequireSaml> samls,

            ImmutableArray<string> serviceTokens)
        {
            AnyValidServiceToken = anyValidServiceToken;
            Azures = azures;
            Certificate = certificate;
            CommonName = commonName;
            EmailDomains = emailDomains;
            Emails = emails;
            Everyone = everyone;
            Githubs = githubs;
            Groups = groups;
            Gsuites = gsuites;
            Ips = ips;
            Oktas = oktas;
            Samls = samls;
            ServiceTokens = serviceTokens;
        }
    }
}