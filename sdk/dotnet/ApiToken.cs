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
    /// Provides a resource which manages Cloudflare API tokens.
    /// 
    /// Read more about permission groups and their applicable scopes in
    /// [the official documentation](https://developers.cloudflare.com/api/tokens/create/permissions).
    /// 
    /// ## Example Usage
    /// ### User Permissions
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var all = Output.Create(Cloudflare.GetApiTokenPermissionGroups.InvokeAsync());
    ///         // Token allowed to create new tokens.
    ///         // Can only be used from specific ip range.
    ///         var apiTokenCreate = new Cloudflare.ApiToken("apiTokenCreate", new Cloudflare.ApiTokenArgs
    ///         {
    ///             Name = "api_token_create",
    ///             Policies = 
    ///             {
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.API_Tokens_Write),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { $"com.cloudflare.api.user.{@var.User_id}", "*" },
    ///                     },
    ///                 },
    ///             },
    ///             Condition = new Cloudflare.Inputs.ApiTokenConditionArgs
    ///             {
    ///                 RequestIp = new Cloudflare.Inputs.ApiTokenConditionRequestIpArgs
    ///                 {
    ///                     Ins = 
    ///                     {
    ///                         "192.0.2.1/32",
    ///                     },
    ///                     NotIns = 
    ///                     {
    ///                         "198.51.100.1/32",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Account permissions
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var all = Output.Create(Cloudflare.GetApiTokenPermissionGroups.InvokeAsync());
    ///         // Token allowed to read audit logs from all accounts.
    ///         var logsAccountAll = new Cloudflare.ApiToken("logsAccountAll", new Cloudflare.ApiTokenArgs
    ///         {
    ///             Name = "logs_account_all",
    ///             Policies = 
    ///             {
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.Access__Audit_Logs_Read),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { "com.cloudflare.api.account.*", "*" },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         // Token allowed to read audit logs from specific account.
    ///         var logsAccount = new Cloudflare.ApiToken("logsAccount", new Cloudflare.ApiTokenArgs
    ///         {
    ///             Name = "logs_account",
    ///             Policies = 
    ///             {
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.Access__Audit_Logs_Read),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { $"com.cloudflare.api.account.{@var.Account_id}", "*" },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Zone Permissions
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var all = Output.Create(Cloudflare.GetApiTokenPermissionGroups.InvokeAsync());
    ///         // Token allowed to edit DNS entries and TLS certs for specific zone.
    ///         var dnsTlsEdit = new Cloudflare.ApiToken("dnsTlsEdit", new Cloudflare.ApiTokenArgs
    ///         {
    ///             Name = "dns_tls_edit",
    ///             Policies = 
    ///             {
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.DNS_Write),
    ///                         all.Apply(all =&gt; all.Permissions?.SSL_and_Certificates_Write),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { $"com.cloudflare.api.account.zone.{@var.Zone_id}", "*" },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         // Token allowed to edit DNS entries for all zones except one.
    ///         var dnsTlsEditAllExceptOne = new Cloudflare.ApiToken("dnsTlsEditAllExceptOne", new Cloudflare.ApiTokenArgs
    ///         {
    ///             Name = "dns_tls_edit_all_except_one",
    ///             Policies = 
    ///             {
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.DNS_Write),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { "com.cloudflare.api.account.zone.*", "*" },
    ///                     },
    ///                 },
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.DNS_Write),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { $"com.cloudflare.api.account.zone.{@var.Zone_id}", "*" },
    ///                     },
    ///                     Effect = "deny",
    ///                 },
    ///             },
    ///         });
    ///         // Token allowed to edit DNS entries for all zones from specific account.
    ///         var dnsEditAllAccount = new Cloudflare.ApiToken("dnsEditAllAccount", new Cloudflare.ApiTokenArgs
    ///         {
    ///             Name = "dns_edit_all_account",
    ///             Policies = 
    ///             {
    ///                 new Cloudflare.Inputs.ApiTokenPolicyArgs
    ///                 {
    ///                     PermissionGroups = 
    ///                     {
    ///                         all.Apply(all =&gt; all.Permissions?.DNS_Write),
    ///                     },
    ///                     Resources = 
    ///                     {
    ///                         { $"com.cloudflare.api.account.{@var.Account_id}", JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             { "com.cloudflare.api.account.zone.*", "*" },
    ///                         }) },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/apiToken:ApiToken")]
    public partial class ApiToken : Pulumi.CustomResource
    {
        /// <summary>
        /// Condition block. See the definition below.
        /// </summary>
        [Output("condition")]
        public Output<Outputs.ApiTokenCondition?> Condition { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the API Token was issued.
        /// </summary>
        [Output("issuedOn")]
        public Output<string> IssuedOn { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the API Token was last modified.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// Name of the APIToken.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Permissions policy. Multiple policy blocks can be defined.
        /// See the definition below.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.ApiTokenPolicy>> Policies { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The value of the API Token.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a ApiToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiToken(string name, ApiTokenArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiToken:ApiToken", name, args ?? new ApiTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiToken(string name, Input<string> id, ApiTokenState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiToken:ApiToken", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApiToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiToken Get(string name, Input<string> id, ApiTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiToken(name, id, state, options);
        }
    }

    public sealed class ApiTokenArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Condition block. See the definition below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.ApiTokenConditionArgs>? Condition { get; set; }

        /// <summary>
        /// Name of the APIToken.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("policies", required: true)]
        private InputList<Inputs.ApiTokenPolicyArgs>? _policies;

        /// <summary>
        /// Permissions policy. Multiple policy blocks can be defined.
        /// See the definition below.
        /// </summary>
        public InputList<Inputs.ApiTokenPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.ApiTokenPolicyArgs>());
            set => _policies = value;
        }

        public ApiTokenArgs()
        {
        }
    }

    public sealed class ApiTokenState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Condition block. See the definition below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.ApiTokenConditionGetArgs>? Condition { get; set; }

        /// <summary>
        /// The RFC3339 timestamp of when the API Token was issued.
        /// </summary>
        [Input("issuedOn")]
        public Input<string>? IssuedOn { get; set; }

        /// <summary>
        /// The RFC3339 timestamp of when the API Token was last modified.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// Name of the APIToken.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies")]
        private InputList<Inputs.ApiTokenPolicyGetArgs>? _policies;

        /// <summary>
        /// Permissions policy. Multiple policy blocks can be defined.
        /// See the definition below.
        /// </summary>
        public InputList<Inputs.ApiTokenPolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.ApiTokenPolicyGetArgs>());
            set => _policies = value;
        }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The value of the API Token.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ApiTokenState()
        {
        }
    }
}
