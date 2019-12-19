// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Cloudflare Argo controls the routing to your origin and tiered caching options to speed up your website browsing experience.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/argo.html.markdown.
    /// </summary>
    public partial class Argo : Pulumi.CustomResource
    {
        /// <summary>
        /// Whether smart routing is enabled. Valid values: `on` or `off`. Defaults to `off`.
        /// </summary>
        [Output("smartRouting")]
        public Output<string?> SmartRouting { get; private set; } = null!;

        /// <summary>
        /// Whether tiered caching is enabled. Valid values: `on` or `off`. Defaults to `off`.
        /// </summary>
        [Output("tieredCaching")]
        public Output<string?> TieredCaching { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID that you wish to manage Argo on.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Argo resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Argo(string name, ArgoArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/argo:Argo", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Argo(string name, Input<string> id, ArgoState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/argo:Argo", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Argo resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Argo Get(string name, Input<string> id, ArgoState? state = null, CustomResourceOptions? options = null)
        {
            return new Argo(name, id, state, options);
        }
    }

    public sealed class ArgoArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether smart routing is enabled. Valid values: `on` or `off`. Defaults to `off`.
        /// </summary>
        [Input("smartRouting")]
        public Input<string>? SmartRouting { get; set; }

        /// <summary>
        /// Whether tiered caching is enabled. Valid values: `on` or `off`. Defaults to `off`.
        /// </summary>
        [Input("tieredCaching")]
        public Input<string>? TieredCaching { get; set; }

        /// <summary>
        /// The DNS zone ID that you wish to manage Argo on.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ArgoArgs()
        {
        }
    }

    public sealed class ArgoState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether smart routing is enabled. Valid values: `on` or `off`. Defaults to `off`.
        /// </summary>
        [Input("smartRouting")]
        public Input<string>? SmartRouting { get; set; }

        /// <summary>
        /// Whether tiered caching is enabled. Valid values: `on` or `off`. Defaults to `off`.
        /// </summary>
        [Input("tieredCaching")]
        public Input<string>? TieredCaching { get; set; }

        /// <summary>
        /// The DNS zone ID that you wish to manage Argo on.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ArgoState()
        {
        }
    }
}
