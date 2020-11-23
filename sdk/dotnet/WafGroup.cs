// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare WAF rule group resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall groups.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var honeyPot = new Cloudflare.WafGroup("honeyPot", new Cloudflare.WafGroupArgs
    ///         {
    ///             GroupId = "de677e5818985db1285d0e80225f06e5",
    ///             Mode = "on",
    ///             ZoneId = "ae36f999674d196762efcc5abb06b345",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// WAF Rule Groups can be imported using a composite ID formed of zone ID and the WAF Rule Group ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/wafGroup:WafGroup honey_pot ae36f999674d196762efcc5abb06b345/de677e5818985db1285d0e80225f06e5
    /// ```
    /// </summary>
    public partial class WafGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// The WAF Rule Group ID.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The mode of the group, can be one of ["on", "off"].
        /// </summary>
        [Output("mode")]
        public Output<string?> Mode { get; private set; } = null!;

        /// <summary>
        /// The ID of the WAF Rule Package that contains the group.
        /// </summary>
        [Output("packageId")]
        public Output<string> PackageId { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to apply to.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WafGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WafGroup(string name, WafGroupArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/wafGroup:WafGroup", name, args ?? new WafGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WafGroup(string name, Input<string> id, WafGroupState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/wafGroup:WafGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WafGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WafGroup Get(string name, Input<string> id, WafGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new WafGroup(name, id, state, options);
        }
    }

    public sealed class WafGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The WAF Rule Group ID.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The mode of the group, can be one of ["on", "off"].
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the WAF Rule Package that contains the group.
        /// </summary>
        [Input("packageId")]
        public Input<string>? PackageId { get; set; }

        /// <summary>
        /// The DNS zone ID to apply to.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WafGroupArgs()
        {
        }
    }

    public sealed class WafGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The WAF Rule Group ID.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The mode of the group, can be one of ["on", "off"].
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the WAF Rule Package that contains the group.
        /// </summary>
        [Input("packageId")]
        public Input<string>? PackageId { get; set; }

        /// <summary>
        /// The DNS zone ID to apply to.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WafGroupState()
        {
        }
    }
}
