// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).
 *
 * ## Example Usage
 *
 * The example below matches all WAF Rules that are in the group of ID `de677e5818985db1285d0e80225f06e5`, contain `example` in their description, and are currently `on`. The matched WAF Rules are then returned as output.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const test = cloudflare.getWafRules({
 *     zoneId: "ae36f999674d196762efcc5abb06b345",
 *     packageId: "a25a9a7e9c00afc1fb2e0245519d725b",
 *     filter: {
 *         description: ".*example.*",
 *         mode: "on",
 *         groupId: "de677e5818985db1285d0e80225f06e5",
 *     },
 * });
 * export const wafRules = test.then(test => test.rules);
 * ```
 */
export function getWafRules(args: GetWafRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetWafRulesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("cloudflare:index/getWafRules:getWafRules", {
        "filter": args.filter,
        "packageId": args.packageId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWafRules.
 */
export interface GetWafRulesArgs {
    /**
     * One or more values used to look up WAF Rules. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    readonly filter?: inputs.GetWafRulesFilter;
    /**
     * The ID of the WAF Rule Package in which to search for the WAF Rules.
     */
    readonly packageId?: string;
    /**
     * The ID of the DNS zone in which to search for the WAF Rules.
     */
    readonly zoneId: string;
}

/**
 * A collection of values returned by getWafRules.
 */
export interface GetWafRulesResult {
    readonly filter?: outputs.GetWafRulesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the WAF Rule Package that contains the WAF Rule
     */
    readonly packageId?: string;
    /**
     * A map of WAF Rules details. Full list below:
     */
    readonly rules: outputs.GetWafRulesRule[];
    readonly zoneId: string;
}
