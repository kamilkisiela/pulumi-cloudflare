// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [Zone][1] records.
 * 
 * ## Example Usage
 * 
 * The example below matches all `active` zones that begin with `example.` and are not paused. The matched zones are then
 * locked down using the `cloudflare_zone_lockdown` resource.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * const test = pulumi.output(cloudflare.getZones({
 *     filter: {
 *         name: "example.*",
 *         paused: false,
 *         status: "active",
 *     },
 * }));
 * const endpointLockdown: cloudflare.ZoneLockdown[] = [];
 * for (let i = 0; i < test.apply(test => test.zones.length); i++) {
 *     endpointLockdown.push(new cloudflare.ZoneLockdown(`endpoint_lockdown-${i}`, {
 *         configurations: [{
 *             target: "ip",
 *             value: "198.51.100.4",
 *         }],
 *         description: "Restrict access to these endpoints to requests from a known IP address",
 *         paused: false,
 *         urls: ["api.mysite.com/some/endpoint*"],
 *         zone: test.apply(test => test.zones[i]),
 *     }));
 * }
 * ```
 */
export function getZones(args: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    return pulumi.runtime.invoke("cloudflare:index/getZones:getZones", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    readonly filter: { name?: string, paused?: boolean, status?: string };
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly zones: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
