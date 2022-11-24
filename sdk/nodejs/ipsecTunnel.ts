// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource, that manages IPsec tunnels for Magic Transit.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.IpsecTunnel("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     allowNullCipher: false,
 *     cloudflareEndpoint: "203.0.113.1",
 *     customerEndpoint: "203.0.113.1",
 *     description: "Tunnel for ISP X",
 *     healthCheckEnabled: true,
 *     healthCheckTarget: "203.0.113.1",
 *     healthCheckType: "reply",
 *     interfaceAddress: "192.0.2.0/31",
 *     name: "IPsec_1",
 *     psk: "asdf12341234",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/ipsecTunnel:IpsecTunnel example <account_id>/<tunnel_id>
 * ```
 */
export class IpsecTunnel extends pulumi.CustomResource {
    /**
     * Get an existing IpsecTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpsecTunnelState, opts?: pulumi.CustomResourceOptions): IpsecTunnel {
        return new IpsecTunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/ipsecTunnel:IpsecTunnel';

    /**
     * Returns true if the given object is an instance of IpsecTunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpsecTunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpsecTunnel.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     */
    public readonly allowNullCipher!: pulumi.Output<boolean | undefined>;
    /**
     * IP address assigned to the Cloudflare side of the IPsec tunnel.
     */
    public readonly cloudflareEndpoint!: pulumi.Output<string>;
    /**
     * IP address assigned to the customer side of the IPsec tunnel.
     */
    public readonly customerEndpoint!: pulumi.Output<string>;
    /**
     * An optional description of the IPsec tunnel.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * `remoteId` in the form of a fqdn. This value is generated by cloudflare.
     */
    public readonly fqdnId!: pulumi.Output<string>;
    /**
     * Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     */
    public readonly healthCheckEnabled!: pulumi.Output<boolean>;
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
     */
    public readonly healthCheckTarget!: pulumi.Output<string>;
    /**
     * Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     */
    public readonly healthCheckType!: pulumi.Output<string>;
    /**
     * `remoteId` as a hex string. This value is generated by cloudflare.
     */
    public readonly hexId!: pulumi.Output<string>;
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     */
    public readonly interfaceAddress!: pulumi.Output<string>;
    /**
     * Name of the IPsec tunnel.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     */
    public readonly psk!: pulumi.Output<string>;
    /**
     * ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     */
    public readonly remoteId!: pulumi.Output<string>;
    /**
     * `remoteId` in the form of an email address. This value is generated by cloudflare.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a IpsecTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpsecTunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpsecTunnelArgs | IpsecTunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpsecTunnelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowNullCipher"] = state ? state.allowNullCipher : undefined;
            resourceInputs["cloudflareEndpoint"] = state ? state.cloudflareEndpoint : undefined;
            resourceInputs["customerEndpoint"] = state ? state.customerEndpoint : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fqdnId"] = state ? state.fqdnId : undefined;
            resourceInputs["healthCheckEnabled"] = state ? state.healthCheckEnabled : undefined;
            resourceInputs["healthCheckTarget"] = state ? state.healthCheckTarget : undefined;
            resourceInputs["healthCheckType"] = state ? state.healthCheckType : undefined;
            resourceInputs["hexId"] = state ? state.hexId : undefined;
            resourceInputs["interfaceAddress"] = state ? state.interfaceAddress : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["psk"] = state ? state.psk : undefined;
            resourceInputs["remoteId"] = state ? state.remoteId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as IpsecTunnelArgs | undefined;
            if ((!args || args.cloudflareEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloudflareEndpoint'");
            }
            if ((!args || args.customerEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customerEndpoint'");
            }
            if ((!args || args.interfaceAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'interfaceAddress'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowNullCipher"] = args ? args.allowNullCipher : undefined;
            resourceInputs["cloudflareEndpoint"] = args ? args.cloudflareEndpoint : undefined;
            resourceInputs["customerEndpoint"] = args ? args.customerEndpoint : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fqdnId"] = args ? args.fqdnId : undefined;
            resourceInputs["healthCheckEnabled"] = args ? args.healthCheckEnabled : undefined;
            resourceInputs["healthCheckTarget"] = args ? args.healthCheckTarget : undefined;
            resourceInputs["healthCheckType"] = args ? args.healthCheckType : undefined;
            resourceInputs["hexId"] = args ? args.hexId : undefined;
            resourceInputs["interfaceAddress"] = args ? args.interfaceAddress : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["psk"] = args ? args.psk : undefined;
            resourceInputs["remoteId"] = args ? args.remoteId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpsecTunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpsecTunnel resources.
 */
export interface IpsecTunnelState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     */
    allowNullCipher?: pulumi.Input<boolean>;
    /**
     * IP address assigned to the Cloudflare side of the IPsec tunnel.
     */
    cloudflareEndpoint?: pulumi.Input<string>;
    /**
     * IP address assigned to the customer side of the IPsec tunnel.
     */
    customerEndpoint?: pulumi.Input<string>;
    /**
     * An optional description of the IPsec tunnel.
     */
    description?: pulumi.Input<string>;
    /**
     * `remoteId` in the form of a fqdn. This value is generated by cloudflare.
     */
    fqdnId?: pulumi.Input<string>;
    /**
     * Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     */
    healthCheckEnabled?: pulumi.Input<boolean>;
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
     */
    healthCheckTarget?: pulumi.Input<string>;
    /**
     * Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     */
    healthCheckType?: pulumi.Input<string>;
    /**
     * `remoteId` as a hex string. This value is generated by cloudflare.
     */
    hexId?: pulumi.Input<string>;
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     */
    interfaceAddress?: pulumi.Input<string>;
    /**
     * Name of the IPsec tunnel.
     */
    name?: pulumi.Input<string>;
    /**
     * Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     */
    psk?: pulumi.Input<string>;
    /**
     * ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     */
    remoteId?: pulumi.Input<string>;
    /**
     * `remoteId` in the form of an email address. This value is generated by cloudflare.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IpsecTunnel resource.
 */
export interface IpsecTunnelArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     */
    allowNullCipher?: pulumi.Input<boolean>;
    /**
     * IP address assigned to the Cloudflare side of the IPsec tunnel.
     */
    cloudflareEndpoint: pulumi.Input<string>;
    /**
     * IP address assigned to the customer side of the IPsec tunnel.
     */
    customerEndpoint: pulumi.Input<string>;
    /**
     * An optional description of the IPsec tunnel.
     */
    description?: pulumi.Input<string>;
    /**
     * `remoteId` in the form of a fqdn. This value is generated by cloudflare.
     */
    fqdnId?: pulumi.Input<string>;
    /**
     * Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     */
    healthCheckEnabled?: pulumi.Input<boolean>;
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
     */
    healthCheckTarget?: pulumi.Input<string>;
    /**
     * Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     */
    healthCheckType?: pulumi.Input<string>;
    /**
     * `remoteId` as a hex string. This value is generated by cloudflare.
     */
    hexId?: pulumi.Input<string>;
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     */
    interfaceAddress: pulumi.Input<string>;
    /**
     * Name of the IPsec tunnel.
     */
    name: pulumi.Input<string>;
    /**
     * Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     */
    psk?: pulumi.Input<string>;
    /**
     * ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     */
    remoteId?: pulumi.Input<string>;
    /**
     * `remoteId` in the form of an email address. This value is generated by cloudflare.
     */
    userId?: pulumi.Input<string>;
}
