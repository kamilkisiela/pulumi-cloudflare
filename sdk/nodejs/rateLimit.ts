// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare rate limit resource for a given zone. This can be used to limit the traffic you receive zone-wide, or matching more specific types of requests/responses.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * const example = new cloudflare.RateLimit("example", {
 *     action: {
 *         mode: "simulate",
 *         response: {
 *             body: "custom response body",
 *             contentType: "text/plain",
 *         },
 *         timeout: 43200,
 *     },
 *     bypassUrlPatterns: [
 *         `${var_cloudflare_zone}/bypass1`,
 *         `${var_cloudflare_zone}/bypass2`,
 *     ],
 *     correlate: {
 *         by: "nat",
 *     },
 *     description: "example rate limit for a zone",
 *     disabled: false,
 *     match: {
 *         request: {
 *             methods: [
 *                 "GET",
 *                 "POST",
 *                 "PUT",
 *                 "DELETE",
 *                 "PATCH",
 *                 "HEAD",
 *             ],
 *             schemes: [
 *                 "HTTP",
 *                 "HTTPS",
 *             ],
 *             urlPattern: `${var_cloudflare_zone}/*`,
 *         },
 *         response: {
 *             originTraffic: false,
 *             statuses: [
 *                 200,
 *                 201,
 *                 202,
 *                 301,
 *                 429,
 *             ],
 *         },
 *     },
 *     period: 2,
 *     threshold: 2000,
 *     zone: var_cloudflare_zone,
 * });
 * ```
 */
export class RateLimit extends pulumi.CustomResource {
    /**
     * Get an existing RateLimit resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RateLimitState, opts?: pulumi.CustomResourceOptions): RateLimit {
        return new RateLimit(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/rateLimit:RateLimit';

    /**
     * Returns true if the given object is an instance of RateLimit.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RateLimit {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RateLimit.__pulumiType;
    }

    /**
     * The action to be performed when the threshold of matched traffic within the period defined is exceeded.
     */
    public readonly action!: pulumi.Output<{ mode: string, response?: { body: string, contentType: string }, timeout?: number }>;
    /**
     * URLs matching the patterns specified here will be excluded from rate limiting.
     */
    public readonly bypassUrlPatterns!: pulumi.Output<string[] | undefined>;
    /**
     * Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
     */
    public readonly correlate!: pulumi.Output<{ by?: string } | undefined>;
    /**
     * A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether this ratelimit is currently disabled. Default: `false`.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
     */
    public readonly match!: pulumi.Output<{ request: { methods: string[], schemes: string[], urlPattern: string }, response: { originTraffic: boolean, statuses: number[] } }>;
    /**
     * The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
     */
    public readonly period!: pulumi.Output<number>;
    /**
     * The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
     */
    public readonly threshold!: pulumi.Output<number>;
    /**
     * The DNS zone to apply rate limiting to.
     */
    public readonly zone!: pulumi.Output<string>;
    /**
     * The DNS zone ID.
     */
    public /*out*/ readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a RateLimit resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RateLimitArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RateLimitArgs | RateLimitState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RateLimitState | undefined;
            inputs["action"] = state ? state.action : undefined;
            inputs["bypassUrlPatterns"] = state ? state.bypassUrlPatterns : undefined;
            inputs["correlate"] = state ? state.correlate : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["disabled"] = state ? state.disabled : undefined;
            inputs["match"] = state ? state.match : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["threshold"] = state ? state.threshold : undefined;
            inputs["zone"] = state ? state.zone : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as RateLimitArgs | undefined;
            if (!args || args.action === undefined) {
                throw new Error("Missing required property 'action'");
            }
            if (!args || args.period === undefined) {
                throw new Error("Missing required property 'period'");
            }
            if (!args || args.threshold === undefined) {
                throw new Error("Missing required property 'threshold'");
            }
            if (!args || args.zone === undefined) {
                throw new Error("Missing required property 'zone'");
            }
            inputs["action"] = args ? args.action : undefined;
            inputs["bypassUrlPatterns"] = args ? args.bypassUrlPatterns : undefined;
            inputs["correlate"] = args ? args.correlate : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["disabled"] = args ? args.disabled : undefined;
            inputs["match"] = args ? args.match : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["threshold"] = args ? args.threshold : undefined;
            inputs["zone"] = args ? args.zone : undefined;
            inputs["zoneId"] = undefined /*out*/;
        }
        super(RateLimit.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RateLimit resources.
 */
export interface RateLimitState {
    /**
     * The action to be performed when the threshold of matched traffic within the period defined is exceeded.
     */
    readonly action?: pulumi.Input<{ mode: pulumi.Input<string>, response?: pulumi.Input<{ body: pulumi.Input<string>, contentType: pulumi.Input<string> }>, timeout?: pulumi.Input<number> }>;
    /**
     * URLs matching the patterns specified here will be excluded from rate limiting.
     */
    readonly bypassUrlPatterns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
     */
    readonly correlate?: pulumi.Input<{ by?: pulumi.Input<string> }>;
    /**
     * A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether this ratelimit is currently disabled. Default: `false`.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
     */
    readonly match?: pulumi.Input<{ request?: pulumi.Input<{ methods?: pulumi.Input<pulumi.Input<string>[]>, schemes?: pulumi.Input<pulumi.Input<string>[]>, urlPattern?: pulumi.Input<string> }>, response?: pulumi.Input<{ originTraffic?: pulumi.Input<boolean>, statuses?: pulumi.Input<pulumi.Input<number>[]> }> }>;
    /**
     * The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
     */
    readonly threshold?: pulumi.Input<number>;
    /**
     * The DNS zone to apply rate limiting to.
     */
    readonly zone?: pulumi.Input<string>;
    /**
     * The DNS zone ID.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RateLimit resource.
 */
export interface RateLimitArgs {
    /**
     * The action to be performed when the threshold of matched traffic within the period defined is exceeded.
     */
    readonly action: pulumi.Input<{ mode: pulumi.Input<string>, response?: pulumi.Input<{ body: pulumi.Input<string>, contentType: pulumi.Input<string> }>, timeout?: pulumi.Input<number> }>;
    /**
     * URLs matching the patterns specified here will be excluded from rate limiting.
     */
    readonly bypassUrlPatterns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
     */
    readonly correlate?: pulumi.Input<{ by?: pulumi.Input<string> }>;
    /**
     * A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether this ratelimit is currently disabled. Default: `false`.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
     */
    readonly match?: pulumi.Input<{ request?: pulumi.Input<{ methods?: pulumi.Input<pulumi.Input<string>[]>, schemes?: pulumi.Input<pulumi.Input<string>[]>, urlPattern?: pulumi.Input<string> }>, response?: pulumi.Input<{ originTraffic?: pulumi.Input<boolean>, statuses?: pulumi.Input<pulumi.Input<number>[]> }> }>;
    /**
     * The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
     */
    readonly period: pulumi.Input<number>;
    /**
     * The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
     */
    readonly threshold: pulumi.Input<number>;
    /**
     * The DNS zone to apply rate limiting to.
     */
    readonly zone: pulumi.Input<string>;
}
