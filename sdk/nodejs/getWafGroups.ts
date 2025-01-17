// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [WAF Rule Groups](https://api.cloudflare.com/#waf-rule-groups-properties).
 *
 * ## Example Usage
 *
 * The example below matches all WAF Rule Groups that contain the word `example` and are currently `on`. The matched WAF Rule Groups are then returned as output.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const test = cloudflare.getWafGroups({
 *     filter: {
 *         name: ".*example.*",
 *         mode: "on",
 *     },
 * });
 * export const wafGroups = test.then(test => test.groups);
 * ```
 */
export function getWafGroups(args: GetWafGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetWafGroupsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("cloudflare:index/getWafGroups:getWafGroups", {
        "filter": args.filter,
        "packageId": args.packageId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWafGroups.
 */
export interface GetWafGroupsArgs {
    /**
     * One or more values used to look up WAF Rule Groups. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter?: inputs.GetWafGroupsFilter;
    /**
     * The ID of the WAF Rule Package in which to search for the WAF Rule Groups.
     */
    packageId?: string;
    /**
     * The ID of the DNS zone in which to search for the WAF Rule Groups.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getWafGroups.
 */
export interface GetWafGroupsResult {
    readonly filter?: outputs.GetWafGroupsFilter;
    /**
     * A map of WAF Rule Groups details. Full list below:
     */
    readonly groups: outputs.GetWafGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the WAF Rule Package that contains the WAF Rule Group
     */
    readonly packageId?: string;
    readonly zoneId: string;
}

export function getWafGroupsOutput(args: GetWafGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWafGroupsResult> {
    return pulumi.output(args).apply(a => getWafGroups(a, opts))
}

/**
 * A collection of arguments for invoking getWafGroups.
 */
export interface GetWafGroupsOutputArgs {
    /**
     * One or more values used to look up WAF Rule Groups. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter?: pulumi.Input<inputs.GetWafGroupsFilterArgs>;
    /**
     * The ID of the WAF Rule Package in which to search for the WAF Rule Groups.
     */
    packageId?: pulumi.Input<string>;
    /**
     * The ID of the DNS zone in which to search for the WAF Rule Groups.
     */
    zoneId: pulumi.Input<string>;
}
