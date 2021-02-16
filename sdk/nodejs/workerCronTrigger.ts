// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Worker Cron Triggers allow users to map a cron expression to a Worker script
 * using a `ScheduledEvent` listener that enables Workers to be executed on a
 * schedule. Worker Cron Triggers are ideal for running periodic jobs for
 * maintenance or calling third-party APIs to collect up-to-date data.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * from "fs";
 *
 * const exampleScript = new cloudflare.WorkerScript("exampleScript", {
 *     name: "example-script",
 *     content: fs.readFileSync("path/to/my.js"),
 * });
 * const exampleTrigger = new cloudflare.WorkerCronTrigger("exampleTrigger", {
 *     scriptName: exampleScript.name,
 *     schedules: [
 *         "*&#47;5 * * * *",
 *         "10 7 * * mon-fri",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Worker Cron Triggers can be imported using the script name of the Worker they are targeting.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example my-script
 * ```
 */
export class WorkerCronTrigger extends pulumi.CustomResource {
    /**
     * Get an existing WorkerCronTrigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerCronTriggerState, opts?: pulumi.CustomResourceOptions): WorkerCronTrigger {
        return new WorkerCronTrigger(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerCronTrigger:WorkerCronTrigger';

    /**
     * Returns true if the given object is an instance of WorkerCronTrigger.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerCronTrigger {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerCronTrigger.__pulumiType;
    }

    /**
     * List of cron expressions to execute the Worker Script
     */
    public readonly schedules!: pulumi.Output<string[]>;
    /**
     * Worker script to target for the schedules
     */
    public readonly scriptName!: pulumi.Output<string>;

    /**
     * Create a WorkerCronTrigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerCronTriggerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerCronTriggerArgs | WorkerCronTriggerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerCronTriggerState | undefined;
            inputs["schedules"] = state ? state.schedules : undefined;
            inputs["scriptName"] = state ? state.scriptName : undefined;
        } else {
            const args = argsOrState as WorkerCronTriggerArgs | undefined;
            if ((!args || args.schedules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedules'");
            }
            if ((!args || args.scriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptName'");
            }
            inputs["schedules"] = args ? args.schedules : undefined;
            inputs["scriptName"] = args ? args.scriptName : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(WorkerCronTrigger.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerCronTrigger resources.
 */
export interface WorkerCronTriggerState {
    /**
     * List of cron expressions to execute the Worker Script
     */
    readonly schedules?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Worker script to target for the schedules
     */
    readonly scriptName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkerCronTrigger resource.
 */
export interface WorkerCronTriggerArgs {
    /**
     * List of cron expressions to execute the Worker Script
     */
    readonly schedules: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Worker script to target for the schedules
     */
    readonly scriptName: pulumi.Input<string>;
}
