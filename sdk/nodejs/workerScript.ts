// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `cloudflare.WorkerRoute`.
 *
 * > This resource uses the Cloudflare account APIs. This requires setting the
 *   `CLOUDFLARE_ACCOUNT_ID` environment variable or `accountId` provider argument.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as fs from "fs";
 *
 * const myNamespace = new cloudflare.WorkersKvNamespace("myNamespace", {title: "example"});
 * // Sets the script with the name "script_1"
 * const myScript = new cloudflare.WorkerScript("myScript", {
 *     name: "script_1",
 *     content: fs.readFileSync("script.js"),
 *     kvNamespaceBindings: [{
 *         name: "MY_EXAMPLE_KV_NAMESPACE",
 *         namespaceId: myNamespace.id,
 *     }],
 *     plainTextBindings: [{
 *         name: "MY_EXAMPLE_PLAIN_TEXT",
 *         text: "foobar",
 *     }],
 *     secretTextBindings: [{
 *         name: "MY_EXAMPLE_SECRET_TEXT",
 *         text: _var.secret_foo_value,
 *     }],
 *     webassemblyBindings: [{
 *         name: "MY_EXAMPLE_WASM",
 *         module: Buffer.from(fs.readFileSync("example.wasm"), 'binary').toString('base64'),
 *     }],
 *     serviceBindings: [{
 *         name: "MY_SERVICE_BINDING",
 *         service: "MY_SERVICE",
 *         environment: "production",
 *     }],
 *     r2BucketBindings: [{
 *         name: "MY_BUCKET",
 *         bucketName: "MY_BUCKET_NAME",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/workerScript:WorkerScript example <script_name>
 * ```
 */
export class WorkerScript extends pulumi.CustomResource {
    /**
     * Get an existing WorkerScript resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerScriptState, opts?: pulumi.CustomResourceOptions): WorkerScript {
        return new WorkerScript(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerScript:WorkerScript';

    /**
     * Returns true if the given object is an instance of WorkerScript.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerScript {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerScript.__pulumiType;
    }

    public readonly analyticsEngineBindings!: pulumi.Output<outputs.WorkerScriptAnalyticsEngineBinding[] | undefined>;
    /**
     * The script content.
     */
    public readonly content!: pulumi.Output<string>;
    public readonly kvNamespaceBindings!: pulumi.Output<outputs.WorkerScriptKvNamespaceBinding[] | undefined>;
    /**
     * Whether to upload Worker as a module.
     */
    public readonly module!: pulumi.Output<boolean | undefined>;
    /**
     * The name for the script. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly name!: pulumi.Output<string>;
    public readonly plainTextBindings!: pulumi.Output<outputs.WorkerScriptPlainTextBinding[] | undefined>;
    public readonly r2BucketBindings!: pulumi.Output<outputs.WorkerScriptR2BucketBinding[] | undefined>;
    public readonly secretTextBindings!: pulumi.Output<outputs.WorkerScriptSecretTextBinding[] | undefined>;
    public readonly serviceBindings!: pulumi.Output<outputs.WorkerScriptServiceBinding[] | undefined>;
    public readonly webassemblyBindings!: pulumi.Output<outputs.WorkerScriptWebassemblyBinding[] | undefined>;

    /**
     * Create a WorkerScript resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerScriptArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerScriptArgs | WorkerScriptState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerScriptState | undefined;
            resourceInputs["analyticsEngineBindings"] = state ? state.analyticsEngineBindings : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["kvNamespaceBindings"] = state ? state.kvNamespaceBindings : undefined;
            resourceInputs["module"] = state ? state.module : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["plainTextBindings"] = state ? state.plainTextBindings : undefined;
            resourceInputs["r2BucketBindings"] = state ? state.r2BucketBindings : undefined;
            resourceInputs["secretTextBindings"] = state ? state.secretTextBindings : undefined;
            resourceInputs["serviceBindings"] = state ? state.serviceBindings : undefined;
            resourceInputs["webassemblyBindings"] = state ? state.webassemblyBindings : undefined;
        } else {
            const args = argsOrState as WorkerScriptArgs | undefined;
            if ((!args || args.content === undefined) && !opts.urn) {
                throw new Error("Missing required property 'content'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["analyticsEngineBindings"] = args ? args.analyticsEngineBindings : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["kvNamespaceBindings"] = args ? args.kvNamespaceBindings : undefined;
            resourceInputs["module"] = args ? args.module : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["plainTextBindings"] = args ? args.plainTextBindings : undefined;
            resourceInputs["r2BucketBindings"] = args ? args.r2BucketBindings : undefined;
            resourceInputs["secretTextBindings"] = args ? args.secretTextBindings : undefined;
            resourceInputs["serviceBindings"] = args ? args.serviceBindings : undefined;
            resourceInputs["webassemblyBindings"] = args ? args.webassemblyBindings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkerScript.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerScript resources.
 */
export interface WorkerScriptState {
    analyticsEngineBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptAnalyticsEngineBinding>[]>;
    /**
     * The script content.
     */
    content?: pulumi.Input<string>;
    kvNamespaceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptKvNamespaceBinding>[]>;
    /**
     * Whether to upload Worker as a module.
     */
    module?: pulumi.Input<boolean>;
    /**
     * The name for the script. **Modifying this attribute will force creation of a new resource.**
     */
    name?: pulumi.Input<string>;
    plainTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptPlainTextBinding>[]>;
    r2BucketBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptR2BucketBinding>[]>;
    secretTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptSecretTextBinding>[]>;
    serviceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptServiceBinding>[]>;
    webassemblyBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptWebassemblyBinding>[]>;
}

/**
 * The set of arguments for constructing a WorkerScript resource.
 */
export interface WorkerScriptArgs {
    analyticsEngineBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptAnalyticsEngineBinding>[]>;
    /**
     * The script content.
     */
    content: pulumi.Input<string>;
    kvNamespaceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptKvNamespaceBinding>[]>;
    /**
     * Whether to upload Worker as a module.
     */
    module?: pulumi.Input<boolean>;
    /**
     * The name for the script. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
    plainTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptPlainTextBinding>[]>;
    r2BucketBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptR2BucketBinding>[]>;
    secretTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptSecretTextBinding>[]>;
    serviceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptServiceBinding>[]>;
    webassemblyBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptWebassemblyBinding>[]>;
}
