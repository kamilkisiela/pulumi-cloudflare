// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class NotificationPolicyPagerdutyIntegrationArgs : Pulumi.ResourceArgs
    {
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The name of the notification policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public NotificationPolicyPagerdutyIntegrationArgs()
        {
        }
    }
}