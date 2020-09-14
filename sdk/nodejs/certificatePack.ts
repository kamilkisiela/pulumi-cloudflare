// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class CertificatePack extends pulumi.CustomResource {
    /**
     * Get an existing CertificatePack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificatePackState, opts?: pulumi.CustomResourceOptions): CertificatePack {
        return new CertificatePack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/certificatePack:CertificatePack';

    /**
     * Returns true if the given object is an instance of CertificatePack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertificatePack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertificatePack.__pulumiType;
    }

    /**
     * Which certificate
     * authority to issue the certificate pack. Allowed values: `"digicert"`,
     * `"letsEncrypt"`.
     */
    public readonly certificateAuthority!: pulumi.Output<string | undefined>;
    /**
     * Whether or not to include
     * Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
     * if set to `true`.
     */
    public readonly cloudflareBranding!: pulumi.Output<boolean | undefined>;
    /**
     * List of hostnames to provision the certificate pack for.
     * Note: If using Let's Encrypt, you cannot use individual subdomains and only a
     * wildcard for subdomain is available.
     */
    public readonly hosts!: pulumi.Output<string[]>;
    /**
     * Certificate pack configuration type.
     * Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Which validation method to
     * use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
     */
    public readonly validationMethod!: pulumi.Output<string | undefined>;
    /**
     * How long the certificate is valid
     * for. Note: If using Let's Encrypt, this value can only be 90 days.
     * Allowed values: 14, 30, 90, 365.
     */
    public readonly validityDays!: pulumi.Output<number | undefined>;
    /**
     * The DNS zone to which the certificate pack should be added.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a CertificatePack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertificatePackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificatePackArgs | CertificatePackState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as CertificatePackState | undefined;
            inputs["certificateAuthority"] = state ? state.certificateAuthority : undefined;
            inputs["cloudflareBranding"] = state ? state.cloudflareBranding : undefined;
            inputs["hosts"] = state ? state.hosts : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["validationMethod"] = state ? state.validationMethod : undefined;
            inputs["validityDays"] = state ? state.validityDays : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CertificatePackArgs | undefined;
            if (!args || args.hosts === undefined) {
                throw new Error("Missing required property 'hosts'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            if (!args || args.zoneId === undefined) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["certificateAuthority"] = args ? args.certificateAuthority : undefined;
            inputs["cloudflareBranding"] = args ? args.cloudflareBranding : undefined;
            inputs["hosts"] = args ? args.hosts : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["validationMethod"] = args ? args.validationMethod : undefined;
            inputs["validityDays"] = args ? args.validityDays : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(CertificatePack.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertificatePack resources.
 */
export interface CertificatePackState {
    /**
     * Which certificate
     * authority to issue the certificate pack. Allowed values: `"digicert"`,
     * `"letsEncrypt"`.
     */
    readonly certificateAuthority?: pulumi.Input<string>;
    /**
     * Whether or not to include
     * Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
     * if set to `true`.
     */
    readonly cloudflareBranding?: pulumi.Input<boolean>;
    /**
     * List of hostnames to provision the certificate pack for.
     * Note: If using Let's Encrypt, you cannot use individual subdomains and only a
     * wildcard for subdomain is available.
     */
    readonly hosts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Certificate pack configuration type.
     * Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * Which validation method to
     * use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
     */
    readonly validationMethod?: pulumi.Input<string>;
    /**
     * How long the certificate is valid
     * for. Note: If using Let's Encrypt, this value can only be 90 days.
     * Allowed values: 14, 30, 90, 365.
     */
    readonly validityDays?: pulumi.Input<number>;
    /**
     * The DNS zone to which the certificate pack should be added.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CertificatePack resource.
 */
export interface CertificatePackArgs {
    /**
     * Which certificate
     * authority to issue the certificate pack. Allowed values: `"digicert"`,
     * `"letsEncrypt"`.
     */
    readonly certificateAuthority?: pulumi.Input<string>;
    /**
     * Whether or not to include
     * Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
     * if set to `true`.
     */
    readonly cloudflareBranding?: pulumi.Input<boolean>;
    /**
     * List of hostnames to provision the certificate pack for.
     * Note: If using Let's Encrypt, you cannot use individual subdomains and only a
     * wildcard for subdomain is available.
     */
    readonly hosts: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Certificate pack configuration type.
     * Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
     */
    readonly type: pulumi.Input<string>;
    /**
     * Which validation method to
     * use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
     */
    readonly validationMethod?: pulumi.Input<string>;
    /**
     * How long the certificate is valid
     * for. Note: If using Let's Encrypt, this value can only be 90 days.
     * Allowed values: 14, 30, 90, 365.
     */
    readonly validityDays?: pulumi.Input<number>;
    /**
     * The DNS zone to which the certificate pack should be added.
     */
    readonly zoneId: pulumi.Input<string>;
}
