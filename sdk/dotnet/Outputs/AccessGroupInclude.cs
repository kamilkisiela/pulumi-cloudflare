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
    public sealed class AccessGroupInclude
    {
        public readonly bool? AnyValidServiceToken;
        public readonly string? AuthMethod;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeAzure> Azures;
        public readonly bool? Certificate;
        public readonly string? CommonName;
        public readonly ImmutableArray<string> DevicePostures;
        public readonly ImmutableArray<string> EmailDomains;
        public readonly ImmutableArray<string> Emails;
        public readonly bool? Everyone;
        public readonly Outputs.AccessGroupIncludeExternalEvaluation? ExternalEvaluation;
        public readonly ImmutableArray<string> Geos;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeGithub> Githubs;
        public readonly ImmutableArray<string> Groups;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeGsuite> Gsuites;
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<string> LoginMethods;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeOkta> Oktas;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeSaml> Samls;
        public readonly ImmutableArray<string> ServiceTokens;

        [OutputConstructor]
        private AccessGroupInclude(
            bool? anyValidServiceToken,

            string? authMethod,

            ImmutableArray<Outputs.AccessGroupIncludeAzure> azures,

            bool? certificate,

            string? commonName,

            ImmutableArray<string> devicePostures,

            ImmutableArray<string> emailDomains,

            ImmutableArray<string> emails,

            bool? everyone,

            Outputs.AccessGroupIncludeExternalEvaluation? externalEvaluation,

            ImmutableArray<string> geos,

            ImmutableArray<Outputs.AccessGroupIncludeGithub> githubs,

            ImmutableArray<string> groups,

            ImmutableArray<Outputs.AccessGroupIncludeGsuite> gsuites,

            ImmutableArray<string> ips,

            ImmutableArray<string> loginMethods,

            ImmutableArray<Outputs.AccessGroupIncludeOkta> oktas,

            ImmutableArray<Outputs.AccessGroupIncludeSaml> samls,

            ImmutableArray<string> serviceTokens)
        {
            AnyValidServiceToken = anyValidServiceToken;
            AuthMethod = authMethod;
            Azures = azures;
            Certificate = certificate;
            CommonName = commonName;
            DevicePostures = devicePostures;
            EmailDomains = emailDomains;
            Emails = emails;
            Everyone = everyone;
            ExternalEvaluation = externalEvaluation;
            Geos = geos;
            Githubs = githubs;
            Groups = groups;
            Gsuites = gsuites;
            Ips = ips;
            LoginMethods = loginMethods;
            Oktas = oktas;
            Samls = samls;
            ServiceTokens = serviceTokens;
        }
    }
}
