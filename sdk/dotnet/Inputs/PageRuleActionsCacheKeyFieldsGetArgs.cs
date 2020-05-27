// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsCacheKeyFieldsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls what cookies go into Cache Key:
        /// </summary>
        [Input("cookie", required: true)]
        public Input<Inputs.PageRuleActionsCacheKeyFieldsCookieGetArgs> Cookie { get; set; } = null!;

        /// <summary>
        /// Controls what HTTP headers go into Cache Key:
        /// </summary>
        [Input("header", required: true)]
        public Input<Inputs.PageRuleActionsCacheKeyFieldsHeaderGetArgs> Header { get; set; } = null!;

        /// <summary>
        /// Controls which Host header goes into Cache Key:
        /// </summary>
        [Input("host", required: true)]
        public Input<Inputs.PageRuleActionsCacheKeyFieldsHostGetArgs> Host { get; set; } = null!;

        /// <summary>
        /// Controls which URL query string parameters go into the Cache Key.
        /// </summary>
        [Input("queryString", required: true)]
        public Input<Inputs.PageRuleActionsCacheKeyFieldsQueryStringGetArgs> QueryString { get; set; } = null!;

        /// <summary>
        /// Controls which end user-related features go into the Cache Key.
        /// </summary>
        [Input("user", required: true)]
        public Input<Inputs.PageRuleActionsCacheKeyFieldsUserGetArgs> User { get; set; } = null!;

        public PageRuleActionsCacheKeyFieldsGetArgs()
        {
        }
    }
}
