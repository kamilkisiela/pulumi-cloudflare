// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Access Service Tokens are used for service-to-service communication
    /// when an application is behind Cloudflare Access.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/access_service_token.html.markdown.
    /// </summary>
    public partial class AccessServiceToken : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the account where the Access
        /// Service is being created.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// UUID client ID associated with the Service Token.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// A secret for interacting with Access protocols.
        /// </summary>
        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the token's intent.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AccessServiceToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessServiceToken(string name, AccessServiceTokenArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessServiceToken:AccessServiceToken", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private AccessServiceToken(string name, Input<string> id, AccessServiceTokenState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessServiceToken:AccessServiceToken", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessServiceToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessServiceToken Get(string name, Input<string> id, AccessServiceTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessServiceToken(name, id, state, options);
        }
    }

    public sealed class AccessServiceTokenArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the account where the Access
        /// Service is being created.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Friendly name of the token's intent.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public AccessServiceTokenArgs()
        {
        }
    }

    public sealed class AccessServiceTokenState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the account where the Access
        /// Service is being created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// UUID client ID associated with the Service Token.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// A secret for interacting with Access protocols.
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// Friendly name of the token's intent.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccessServiceTokenState()
        {
        }
    }
}
