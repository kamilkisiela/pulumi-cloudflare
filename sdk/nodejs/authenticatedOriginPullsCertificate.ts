// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Authenticated Origin Pulls certificate resource. An uploaded client certificate is required to use Per-Zone or Per-Hostname Authenticated Origin Pulls.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Per-Zone Authenticated Origin Pulls certificate
 * const myPerZoneAopCert = new cloudflare.AuthenticatedOriginPullsCertificate("my_per_zone_aop_cert", {
 *     certificate: "-----INSERT CERTIFICATE-----",
 *     privateKey: "-----INSERT PRIVATE KEY-----",
 *     type: "per-zone",
 *     zoneId: var_cloudflare_zone_id,
 * });
 * // Per-Hostname Authenticated Origin Pulls certificate
 * const myPerHostnameAopCert = new cloudflare.AuthenticatedOriginPullsCertificate("my_per_hostname_aop_cert", {
 *     certificate: "-----INSERT CERTIFICATE-----",
 *     privateKey: "-----INSERT PRIVATE KEY-----",
 *     type: "per-hostname",
 *     zoneId: var_cloudflare_zone_id,
 * });
 * ```
 */
export class AuthenticatedOriginPullsCertificate extends pulumi.CustomResource {
    /**
     * Get an existing AuthenticatedOriginPullsCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthenticatedOriginPullsCertificateState, opts?: pulumi.CustomResourceOptions): AuthenticatedOriginPullsCertificate {
        return new AuthenticatedOriginPullsCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate';

    /**
     * Returns true if the given object is an instance of AuthenticatedOriginPullsCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthenticatedOriginPullsCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthenticatedOriginPullsCertificate.__pulumiType;
    }

    /**
     * The public client certificate.
     */
    public readonly certificate!: pulumi.Output<string>;
    public /*out*/ readonly expiresOn!: pulumi.Output<string>;
    public /*out*/ readonly issuer!: pulumi.Output<string>;
    /**
     * The private key of the client certificate.
     */
    public readonly privateKey!: pulumi.Output<string>;
    public /*out*/ readonly serialNumber!: pulumi.Output<string>;
    public /*out*/ readonly signature!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The form of Authenticated Origin Pulls to upload the certificate to.
     */
    public readonly type!: pulumi.Output<string>;
    public /*out*/ readonly uploadedOn!: pulumi.Output<string>;
    /**
     * The zone ID to upload the certificate to.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AuthenticatedOriginPullsCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthenticatedOriginPullsCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthenticatedOriginPullsCertificateArgs | AuthenticatedOriginPullsCertificateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AuthenticatedOriginPullsCertificateState | undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["expiresOn"] = state ? state.expiresOn : undefined;
            inputs["issuer"] = state ? state.issuer : undefined;
            inputs["privateKey"] = state ? state.privateKey : undefined;
            inputs["serialNumber"] = state ? state.serialNumber : undefined;
            inputs["signature"] = state ? state.signature : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["uploadedOn"] = state ? state.uploadedOn : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AuthenticatedOriginPullsCertificateArgs | undefined;
            if (!args || args.certificate === undefined) {
                throw new Error("Missing required property 'certificate'");
            }
            if (!args || args.privateKey === undefined) {
                throw new Error("Missing required property 'privateKey'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            if (!args || args.zoneId === undefined) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["certificate"] = args ? args.certificate : undefined;
            inputs["privateKey"] = args ? args.privateKey : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["expiresOn"] = undefined /*out*/;
            inputs["issuer"] = undefined /*out*/;
            inputs["serialNumber"] = undefined /*out*/;
            inputs["signature"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["uploadedOn"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AuthenticatedOriginPullsCertificate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthenticatedOriginPullsCertificate resources.
 */
export interface AuthenticatedOriginPullsCertificateState {
    /**
     * The public client certificate.
     */
    readonly certificate?: pulumi.Input<string>;
    readonly expiresOn?: pulumi.Input<string>;
    readonly issuer?: pulumi.Input<string>;
    /**
     * The private key of the client certificate.
     */
    readonly privateKey?: pulumi.Input<string>;
    readonly serialNumber?: pulumi.Input<string>;
    readonly signature?: pulumi.Input<string>;
    readonly status?: pulumi.Input<string>;
    /**
     * The form of Authenticated Origin Pulls to upload the certificate to.
     */
    readonly type?: pulumi.Input<string>;
    readonly uploadedOn?: pulumi.Input<string>;
    /**
     * The zone ID to upload the certificate to.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthenticatedOriginPullsCertificate resource.
 */
export interface AuthenticatedOriginPullsCertificateArgs {
    /**
     * The public client certificate.
     */
    readonly certificate: pulumi.Input<string>;
    /**
     * The private key of the client certificate.
     */
    readonly privateKey: pulumi.Input<string>;
    /**
     * The form of Authenticated Origin Pulls to upload the certificate to.
     */
    readonly type: pulumi.Input<string>;
    /**
     * The zone ID to upload the certificate to.
     */
    readonly zoneId: pulumi.Input<string>;
}