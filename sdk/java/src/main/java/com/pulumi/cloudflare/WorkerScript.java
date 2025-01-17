// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkerScriptArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptState;
import com.pulumi.cloudflare.outputs.WorkerScriptKvNamespaceBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptPlainTextBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptR2BucketBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptSecretTextBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptServiceBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptWebassemblyBinding;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare worker script resource. In order for a script to be active, you&#39;ll also need to setup a `cloudflare.WorkerRoute`.
 * 
 * &gt; This resource uses the Cloudflare account APIs. This requires setting the
 *   `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.WorkersKvNamespace;
 * import com.pulumi.cloudflare.WorkersKvNamespaceArgs;
 * import com.pulumi.cloudflare.WorkerScript;
 * import com.pulumi.cloudflare.WorkerScriptArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptKvNamespaceBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptPlainTextBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptSecretTextBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptWebassemblyBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptServiceBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptR2BucketBindingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myNamespace = new WorkersKvNamespace(&#34;myNamespace&#34;, WorkersKvNamespaceArgs.builder()        
 *             .title(&#34;example&#34;)
 *             .build());
 * 
 *         var myScript = new WorkerScript(&#34;myScript&#34;, WorkerScriptArgs.builder()        
 *             .name(&#34;script_1&#34;)
 *             .content(Files.readString(Paths.get(&#34;script.js&#34;)))
 *             .kvNamespaceBindings(WorkerScriptKvNamespaceBindingArgs.builder()
 *                 .name(&#34;MY_EXAMPLE_KV_NAMESPACE&#34;)
 *                 .namespaceId(myNamespace.id())
 *                 .build())
 *             .plainTextBindings(WorkerScriptPlainTextBindingArgs.builder()
 *                 .name(&#34;MY_EXAMPLE_PLAIN_TEXT&#34;)
 *                 .text(&#34;foobar&#34;)
 *                 .build())
 *             .secretTextBindings(WorkerScriptSecretTextBindingArgs.builder()
 *                 .name(&#34;MY_EXAMPLE_SECRET_TEXT&#34;)
 *                 .text(var_.secret_foo_value())
 *                 .build())
 *             .webassemblyBindings(WorkerScriptWebassemblyBindingArgs.builder()
 *                 .name(&#34;MY_EXAMPLE_WASM&#34;)
 *                 .module(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(&#34;example.wasm&#34;))))
 *                 .build())
 *             .serviceBindings(WorkerScriptServiceBindingArgs.builder()
 *                 .name(&#34;MY_SERVICE_BINDING&#34;)
 *                 .service(&#34;MY_SERVICE&#34;)
 *                 .environment(&#34;production&#34;)
 *                 .build())
 *             .r2BucketBindings(WorkerScriptR2BucketBindingArgs.builder()
 *                 .name(&#34;MY_BUCKET&#34;)
 *                 .bucketName(&#34;MY_BUCKET_NAME&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/workerScript:WorkerScript example &lt;script_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workerScript:WorkerScript")
public class WorkerScript extends com.pulumi.resources.CustomResource {
    /**
     * The script content.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return The script content.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    @Export(name="kvNamespaceBindings", type=List.class, parameters={WorkerScriptKvNamespaceBinding.class})
    private Output</* @Nullable */ List<WorkerScriptKvNamespaceBinding>> kvNamespaceBindings;

    public Output<Optional<List<WorkerScriptKvNamespaceBinding>>> kvNamespaceBindings() {
        return Codegen.optional(this.kvNamespaceBindings);
    }
    /**
     * Whether to upload Worker as a module.
     * 
     */
    @Export(name="module", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> module;

    /**
     * @return Whether to upload Worker as a module.
     * 
     */
    public Output<Optional<Boolean>> module() {
        return Codegen.optional(this.module);
    }
    /**
     * The name for the script.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the script.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="plainTextBindings", type=List.class, parameters={WorkerScriptPlainTextBinding.class})
    private Output</* @Nullable */ List<WorkerScriptPlainTextBinding>> plainTextBindings;

    public Output<Optional<List<WorkerScriptPlainTextBinding>>> plainTextBindings() {
        return Codegen.optional(this.plainTextBindings);
    }
    @Export(name="r2BucketBindings", type=List.class, parameters={WorkerScriptR2BucketBinding.class})
    private Output</* @Nullable */ List<WorkerScriptR2BucketBinding>> r2BucketBindings;

    public Output<Optional<List<WorkerScriptR2BucketBinding>>> r2BucketBindings() {
        return Codegen.optional(this.r2BucketBindings);
    }
    @Export(name="secretTextBindings", type=List.class, parameters={WorkerScriptSecretTextBinding.class})
    private Output</* @Nullable */ List<WorkerScriptSecretTextBinding>> secretTextBindings;

    public Output<Optional<List<WorkerScriptSecretTextBinding>>> secretTextBindings() {
        return Codegen.optional(this.secretTextBindings);
    }
    @Export(name="serviceBindings", type=List.class, parameters={WorkerScriptServiceBinding.class})
    private Output</* @Nullable */ List<WorkerScriptServiceBinding>> serviceBindings;

    public Output<Optional<List<WorkerScriptServiceBinding>>> serviceBindings() {
        return Codegen.optional(this.serviceBindings);
    }
    @Export(name="webassemblyBindings", type=List.class, parameters={WorkerScriptWebassemblyBinding.class})
    private Output</* @Nullable */ List<WorkerScriptWebassemblyBinding>> webassemblyBindings;

    public Output<Optional<List<WorkerScriptWebassemblyBinding>>> webassemblyBindings() {
        return Codegen.optional(this.webassemblyBindings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerScript(String name) {
        this(name, WorkerScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerScript(String name, WorkerScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerScript(String name, WorkerScriptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workerScript:WorkerScript", name, args == null ? WorkerScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerScript(String name, Output<String> id, @Nullable WorkerScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workerScript:WorkerScript", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WorkerScript get(String name, Output<String> id, @Nullable WorkerScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerScript(name, id, state, options);
    }
}
