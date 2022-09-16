// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersKvArgs;
import com.pulumi.cloudflare.inputs.WorkersKvState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Workers KV Pair. _NOTE:_ This resource uses the Cloudflare account APIs. This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.
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
 * import com.pulumi.cloudflare.WorkersKv;
 * import com.pulumi.cloudflare.WorkersKvArgs;
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
 *         var exampleNs = new WorkersKvNamespace(&#34;exampleNs&#34;, WorkersKvNamespaceArgs.builder()        
 *             .title(&#34;test-namespace&#34;)
 *             .build());
 * 
 *         var example = new WorkersKv(&#34;example&#34;, WorkersKvArgs.builder()        
 *             .namespaceId(exampleNs.id())
 *             .key(&#34;test-key&#34;)
 *             .value(&#34;test value&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/workersKv:WorkersKv example beaeb6716c9443eaa4deef11763ccca6/test-key
 * ```
 * 
 *  where- `beaeb6716c9443eaa4deef11763ccca6` is the ID of the namespace and `test-key` is the key
 * 
 */
@ResourceType(type="cloudflare:index/workersKv:WorkersKv")
public class WorkersKv extends com.pulumi.resources.CustomResource {
    /**
     * The key name
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The key name
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The ID of the Workers KV namespace in which you want to create the KV pair
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The ID of the Workers KV namespace in which you want to create the KV pair
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * The string value to be stored in the key
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The string value to be stored in the key
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersKv(String name) {
        this(name, WorkersKvArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersKv(String name, WorkersKvArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersKv(String name, WorkersKvArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersKv:WorkersKv", name, args == null ? WorkersKvArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkersKv(String name, Output<String> id, @Nullable WorkersKvState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersKv:WorkersKv", name, state, makeResourceOptions(options, id));
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
    public static WorkersKv get(String name, Output<String> id, @Nullable WorkersKvState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersKv(name, id, state, options);
    }
}