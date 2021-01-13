// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Filter expressions that can be referenced across multiple features, e.g. Firewall Rule. The expression format is similar to [Wireshark Display Filter](https://www.wireshark.org/docs/man-pages/wireshark-filter.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const wordpress = new cloudflare.Filter("wordpress", {
 *     description: "Wordpress break-in attempts that are outside of the office",
 *     expression: "(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1",
 *     zoneId: "d41d8cd98f00b204e9800998ecf8427e",
 * });
 * ```
 *
 * ## Import
 *
 * Filter can be imported using a composite ID formed of zone ID and filter ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/filter:Filter default d41d8cd98f00b204e9800998ecf8427e/9e107d9d372bb6826bd81d3542a419d6
 * ```
 *
 *  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID * `9e107d9d372bb6826bd81d3542a419d6` - filter ID as returned by [API](https://api.cloudflare.com/#zone-firewall-filters)
 */
export class Filter extends pulumi.CustomResource {
    /**
     * Get an existing Filter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FilterState, opts?: pulumi.CustomResourceOptions): Filter {
        return new Filter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/filter:Filter';

    /**
     * Returns true if the given object is an instance of Filter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Filter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Filter.__pulumiType;
    }

    /**
     * A note that you can use to describe the purpose of the filter.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The filter expression to be used.
     */
    public readonly expression!: pulumi.Output<string>;
    /**
     * Whether this filter is currently paused. Boolean value.
     */
    public readonly paused!: pulumi.Output<boolean | undefined>;
    /**
     * Short reference tag to quickly select related rules.
     */
    public readonly ref!: pulumi.Output<string | undefined>;
    /**
     * The DNS zone to which the Filter should be added.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Filter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FilterArgs | FilterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as FilterState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["expression"] = state ? state.expression : undefined;
            inputs["paused"] = state ? state.paused : undefined;
            inputs["ref"] = state ? state.ref : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as FilterArgs | undefined;
            if ((!args || args.expression === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'expression'");
            }
            if ((!args || args.zoneId === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["expression"] = args ? args.expression : undefined;
            inputs["paused"] = args ? args.paused : undefined;
            inputs["ref"] = args ? args.ref : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Filter.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Filter resources.
 */
export interface FilterState {
    /**
     * A note that you can use to describe the purpose of the filter.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The filter expression to be used.
     */
    readonly expression?: pulumi.Input<string>;
    /**
     * Whether this filter is currently paused. Boolean value.
     */
    readonly paused?: pulumi.Input<boolean>;
    /**
     * Short reference tag to quickly select related rules.
     */
    readonly ref?: pulumi.Input<string>;
    /**
     * The DNS zone to which the Filter should be added.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Filter resource.
 */
export interface FilterArgs {
    /**
     * A note that you can use to describe the purpose of the filter.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The filter expression to be used.
     */
    readonly expression: pulumi.Input<string>;
    /**
     * Whether this filter is currently paused. Boolean value.
     */
    readonly paused?: pulumi.Input<boolean>;
    /**
     * Short reference tag to quickly select related rules.
     */
    readonly ref?: pulumi.Input<string>;
    /**
     * The DNS zone to which the Filter should be added.
     */
    readonly zoneId: pulumi.Input<string>;
}
