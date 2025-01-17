// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneSettingsOverrideSettingsMobileRedirectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String value
        /// </summary>
        [Input("mobileSubdomain", required: true)]
        public Input<string> MobileSubdomain { get; set; } = null!;

        /// <summary>
        /// "on"/"off"
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        /// <summary>
        /// true/false
        /// </summary>
        [Input("stripUri", required: true)]
        public Input<bool> StripUri { get; set; } = null!;

        public ZoneSettingsOverrideSettingsMobileRedirectArgs()
        {
        }
        public static new ZoneSettingsOverrideSettingsMobileRedirectArgs Empty => new ZoneSettingsOverrideSettingsMobileRedirectArgs();
    }
}
