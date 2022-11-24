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
    /// Provides a resource for managing Cloudflare Pages domains.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_domain = new Cloudflare.PagesDomain("my-domain", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Domain = "example.com",
    ///         ProjectName = "my-example-project",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/pagesDomain:PagesDomain")]
    public partial class PagesDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Custom domain.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// Name of the Pages Project.
        /// </summary>
        [Output("projectName")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// Status of the custom domain.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a PagesDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PagesDomain(string name, PagesDomainArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/pagesDomain:PagesDomain", name, args ?? new PagesDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PagesDomain(string name, Input<string> id, PagesDomainState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/pagesDomain:PagesDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PagesDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PagesDomain Get(string name, Input<string> id, PagesDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new PagesDomain(name, id, state, options);
        }
    }

    public sealed class PagesDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Custom domain.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// Name of the Pages Project.
        /// </summary>
        [Input("projectName", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        public PagesDomainArgs()
        {
        }
        public static new PagesDomainArgs Empty => new PagesDomainArgs();
    }

    public sealed class PagesDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Custom domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Name of the Pages Project.
        /// </summary>
        [Input("projectName")]
        public Input<string>? ProjectName { get; set; }

        /// <summary>
        /// Status of the custom domain.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public PagesDomainState()
        {
        }
        public static new PagesDomainState Empty => new PagesDomainState();
    }
}