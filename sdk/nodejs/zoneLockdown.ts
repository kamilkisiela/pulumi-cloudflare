// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Zone Lockdown resource. Zone Lockdown allows you to define one or more URLs (with wildcard matching on the domain or path) that will only permit access if the request originates from an IP address that matches a safelist of one or more IP addresses and/or IP ranges.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * // Restrict access to these endpoints to requests from a known IP address.
 * const endpointLockdown = new cloudflare.ZoneLockdown("endpoint_lockdown", {
 *     configurations: [{
 *         target: "ip",
 *         value: "198.51.100.4",
 *     }],
 *     description: "Restrict access to these endpoints to requests from a known IP address",
 *     paused: false,
 *     urls: ["api.mysite.com/some/endpoint*"],
 *     zone: "api.mysite.com",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/zone_lockdown.html.markdown.
 */
export class ZoneLockdown extends pulumi.CustomResource {
    /**
     * Get an existing ZoneLockdown resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneLockdownState, opts?: pulumi.CustomResourceOptions): ZoneLockdown {
        return new ZoneLockdown(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zoneLockdown:ZoneLockdown';

    /**
     * Returns true if the given object is an instance of ZoneLockdown.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZoneLockdown {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZoneLockdown.__pulumiType;
    }

    /**
     * A list of IP addresses or IP ranges to match the request against specified in target, value pairs.  It's a complex value. See description below.   The order of the configuration entries is unimportant.
     */
    public readonly configurations!: pulumi.Output<{ target: string, value: string }[]>;
    /**
     * A description about the lockdown entry. Typically used as a reminder or explanation for the lockdown.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Boolean of whether this zone lockdown is currently paused. Default: false.
     */
    public readonly paused!: pulumi.Output<boolean | undefined>;
    /**
     * A list of simple wildcard patterns to match requests against. The order of the urls is unimportant.
     */
    public readonly urls!: pulumi.Output<string[]>;
    /**
     * The DNS zone to which the lockdown will be added. Will be resolved to `zone_id` upon creation.
     */
    public readonly zone!: pulumi.Output<string | undefined>;
    /**
     * The DNS zone to which the access rule should be added.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ZoneLockdown resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneLockdownArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneLockdownArgs | ZoneLockdownState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ZoneLockdownState | undefined;
            inputs["configurations"] = state ? state.configurations : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["paused"] = state ? state.paused : undefined;
            inputs["urls"] = state ? state.urls : undefined;
            inputs["zone"] = state ? state.zone : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZoneLockdownArgs | undefined;
            if (!args || args.configurations === undefined) {
                throw new Error("Missing required property 'configurations'");
            }
            if (!args || args.urls === undefined) {
                throw new Error("Missing required property 'urls'");
            }
            inputs["configurations"] = args ? args.configurations : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["paused"] = args ? args.paused : undefined;
            inputs["urls"] = args ? args.urls : undefined;
            inputs["zone"] = args ? args.zone : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ZoneLockdown.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZoneLockdown resources.
 */
export interface ZoneLockdownState {
    /**
     * A list of IP addresses or IP ranges to match the request against specified in target, value pairs.  It's a complex value. See description below.   The order of the configuration entries is unimportant.
     */
    readonly configurations?: pulumi.Input<pulumi.Input<{ target: pulumi.Input<string>, value: pulumi.Input<string> }>[]>;
    /**
     * A description about the lockdown entry. Typically used as a reminder or explanation for the lockdown.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Boolean of whether this zone lockdown is currently paused. Default: false.
     */
    readonly paused?: pulumi.Input<boolean>;
    /**
     * A list of simple wildcard patterns to match requests against. The order of the urls is unimportant.
     */
    readonly urls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS zone to which the lockdown will be added. Will be resolved to `zone_id` upon creation.
     */
    readonly zone?: pulumi.Input<string>;
    /**
     * The DNS zone to which the access rule should be added.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZoneLockdown resource.
 */
export interface ZoneLockdownArgs {
    /**
     * A list of IP addresses or IP ranges to match the request against specified in target, value pairs.  It's a complex value. See description below.   The order of the configuration entries is unimportant.
     */
    readonly configurations: pulumi.Input<pulumi.Input<{ target: pulumi.Input<string>, value: pulumi.Input<string> }>[]>;
    /**
     * A description about the lockdown entry. Typically used as a reminder or explanation for the lockdown.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Boolean of whether this zone lockdown is currently paused. Default: false.
     */
    readonly paused?: pulumi.Input<boolean>;
    /**
     * A list of simple wildcard patterns to match requests against. The order of the urls is unimportant.
     */
    readonly urls: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS zone to which the lockdown will be added. Will be resolved to `zone_id` upon creation.
     */
    readonly zone?: pulumi.Input<string>;
    /**
     * The DNS zone to which the access rule should be added.
     */
    readonly zoneId?: pulumi.Input<string>;
}
