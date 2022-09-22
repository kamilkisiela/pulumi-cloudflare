// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PagesProjectSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for the source of the Cloudflare Pages project.
        /// </summary>
        [Input("config")]
        public Input<Inputs.PagesProjectSourceConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// Project host type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PagesProjectSourceGetArgs()
        {
        }
        public static new PagesProjectSourceGetArgs Empty => new PagesProjectSourceGetArgs();
    }
}
