// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Cloudflare
{
    public static class GetWafRules
    {
        /// <summary>
        /// Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The example below matches all WAF Rules that are in the group of ID `de677e5818985db1285d0e80225f06e5`, contain `example` in their description, and are currently `on`. The matched WAF Rules are then returned as output.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Cloudflare.GetWafRules.InvokeAsync(new Cloudflare.GetWafRulesArgs
        ///         {
        ///             ZoneId = "ae36f999674d196762efcc5abb06b345",
        ///             PackageId = "a25a9a7e9c00afc1fb2e0245519d725b",
        ///             Filter = new Cloudflare.Inputs.GetWafRulesFilterArgs
        ///             {
        ///                 Description = ".*example.*",
        ///                 Mode = "on",
        ///                 GroupId = "de677e5818985db1285d0e80225f06e5",
        ///             },
        ///         }));
        ///         this.WafRules = test.Apply(test =&gt; test.Rules);
        ///     }
        /// 
        ///     [Output("wafRules")]
        ///     public Output&lt;string&gt; WafRules { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetWafRulesResult> InvokeAsync(GetWafRulesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetWafRulesResult>("cloudflare:index/getWafRules:getWafRules", args ?? new GetWafRulesArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The example below matches all WAF Rules that are in the group of ID `de677e5818985db1285d0e80225f06e5`, contain `example` in their description, and are currently `on`. The matched WAF Rules are then returned as output.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Cloudflare.GetWafRules.InvokeAsync(new Cloudflare.GetWafRulesArgs
        ///         {
        ///             ZoneId = "ae36f999674d196762efcc5abb06b345",
        ///             PackageId = "a25a9a7e9c00afc1fb2e0245519d725b",
        ///             Filter = new Cloudflare.Inputs.GetWafRulesFilterArgs
        ///             {
        ///                 Description = ".*example.*",
        ///                 Mode = "on",
        ///                 GroupId = "de677e5818985db1285d0e80225f06e5",
        ///             },
        ///         }));
        ///         this.WafRules = test.Apply(test =&gt; test.Rules);
        ///     }
        /// 
        ///     [Output("wafRules")]
        ///     public Output&lt;string&gt; WafRules { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetWafRulesResult> Invoke(GetWafRulesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetWafRulesResult>("cloudflare:index/getWafRules:getWafRules", args ?? new GetWafRulesInvokeArgs(), options.WithVersion());
    }


    public sealed class GetWafRulesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// One or more values used to look up WAF Rules. If more than one value is given all
        /// values must match in order to be included, see below for full list.
        /// </summary>
        [Input("filter")]
        public Inputs.GetWafRulesFilterArgs? Filter { get; set; }

        /// <summary>
        /// The ID of the WAF Rule Package in which to search for the WAF Rules.
        /// </summary>
        [Input("packageId")]
        public string? PackageId { get; set; }

        /// <summary>
        /// The ID of the DNS zone in which to search for the WAF Rules.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetWafRulesArgs()
        {
        }
    }

    public sealed class GetWafRulesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// One or more values used to look up WAF Rules. If more than one value is given all
        /// values must match in order to be included, see below for full list.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.GetWafRulesFilterInputArgs>? Filter { get; set; }

        /// <summary>
        /// The ID of the WAF Rule Package in which to search for the WAF Rules.
        /// </summary>
        [Input("packageId")]
        public Input<string>? PackageId { get; set; }

        /// <summary>
        /// The ID of the DNS zone in which to search for the WAF Rules.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetWafRulesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetWafRulesResult
    {
        public readonly Outputs.GetWafRulesFilterResult? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the WAF Rule Package that contains the WAF Rule
        /// </summary>
        public readonly string? PackageId;
        /// <summary>
        /// A map of WAF Rules details. Full list below:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWafRulesRuleResult> Rules;
        public readonly string ZoneId;

        [OutputConstructor]
        private GetWafRulesResult(
            Outputs.GetWafRulesFilterResult? filter,

            string id,

            string? packageId,

            ImmutableArray<Outputs.GetWafRulesRuleResult> rules,

            string zoneId)
        {
            Filter = filter;
            Id = id;
            PackageId = packageId;
            Rules = rules;
            ZoneId = zoneId;
        }
    }
}
