// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare WAF rule package resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall packages.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const owasp = new cloudflare.WafPackage("owasp", {
 *     actionMode: "simulate",
 *     packageId: "a25a9a7e9c00afc1fb2e0245519d725b",
 *     sensitivity: "medium",
 *     zoneId: "ae36f999674d196762efcc5abb06b345",
 * });
 * ```
 *
 * ## Import
 *
 * Packages can be imported using a composite ID formed of zone ID and the WAF Package ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/wafPackage:WafPackage owasp ae36f999674d196762efcc5abb06b345/a25a9a7e9c00afc1fb2e0245519d725b
 * ```
 */
export class WafPackage extends pulumi.CustomResource {
    /**
     * Get an existing WafPackage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WafPackageState, opts?: pulumi.CustomResourceOptions): WafPackage {
        return new WafPackage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/wafPackage:WafPackage';

    /**
     * Returns true if the given object is an instance of WafPackage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WafPackage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WafPackage.__pulumiType;
    }

    /**
     * The action mode of the package, can be one of ["block", "challenge", "simulate"].
     */
    public readonly actionMode!: pulumi.Output<string | undefined>;
    /**
     * The WAF Package ID.
     */
    public readonly packageId!: pulumi.Output<string>;
    /**
     * The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
     */
    public readonly sensitivity!: pulumi.Output<string | undefined>;
    /**
     * The DNS zone ID to apply to.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WafPackage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WafPackageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WafPackageArgs | WafPackageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WafPackageState | undefined;
            resourceInputs["actionMode"] = state ? state.actionMode : undefined;
            resourceInputs["packageId"] = state ? state.packageId : undefined;
            resourceInputs["sensitivity"] = state ? state.sensitivity : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WafPackageArgs | undefined;
            if ((!args || args.packageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'packageId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["actionMode"] = args ? args.actionMode : undefined;
            resourceInputs["packageId"] = args ? args.packageId : undefined;
            resourceInputs["sensitivity"] = args ? args.sensitivity : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WafPackage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WafPackage resources.
 */
export interface WafPackageState {
    /**
     * The action mode of the package, can be one of ["block", "challenge", "simulate"].
     */
    actionMode?: pulumi.Input<string>;
    /**
     * The WAF Package ID.
     */
    packageId?: pulumi.Input<string>;
    /**
     * The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
     */
    sensitivity?: pulumi.Input<string>;
    /**
     * The DNS zone ID to apply to.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WafPackage resource.
 */
export interface WafPackageArgs {
    /**
     * The action mode of the package, can be one of ["block", "challenge", "simulate"].
     */
    actionMode?: pulumi.Input<string>;
    /**
     * The WAF Package ID.
     */
    packageId: pulumi.Input<string>;
    /**
     * The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
     */
    sensitivity?: pulumi.Input<string>;
    /**
     * The DNS zone ID to apply to.
     */
    zoneId: pulumi.Input<string>;
}
