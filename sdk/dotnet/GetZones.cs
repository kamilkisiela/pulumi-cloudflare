// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZones
    {
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("cloudflare:index/getZones:getZones", args ?? new GetZonesArgs(), options.WithDefaults());

        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetZonesResult>("cloudflare:index/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZonesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filter", required: true)]
        public Inputs.GetZonesFilterArgs Filter { get; set; } = null!;

        public GetZonesArgs()
        {
        }
        public static new GetZonesArgs Empty => new GetZonesArgs();
    }

    public sealed class GetZonesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filter", required: true)]
        public Input<Inputs.GetZonesFilterInputArgs> Filter { get; set; } = null!;

        public GetZonesInvokeArgs()
        {
        }
        public static new GetZonesInvokeArgs Empty => new GetZonesInvokeArgs();
    }


    [OutputType]
    public sealed class GetZonesResult
    {
        public readonly Outputs.GetZonesFilterResult Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            Outputs.GetZonesFilterResult filter,

            string id,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            Filter = filter;
            Id = id;
            Zones = zones;
        }
    }
}
