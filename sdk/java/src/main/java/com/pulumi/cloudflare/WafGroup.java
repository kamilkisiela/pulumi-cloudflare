// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WafGroupArgs;
import com.pulumi.cloudflare.inputs.WafGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare WAF rule group resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall groups.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.WafGroup;
 * import com.pulumi.cloudflare.WafGroupArgs;
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
 *         var honeyPot = new WafGroup(&#34;honeyPot&#34;, WafGroupArgs.builder()        
 *             .groupId(&#34;de677e5818985db1285d0e80225f06e5&#34;)
 *             .mode(&#34;on&#34;)
 *             .zoneId(&#34;ae36f999674d196762efcc5abb06b345&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WAF Rule Groups can be imported using a composite ID formed of zone ID and the WAF Rule Group ID, e.g.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/wafGroup:WafGroup honey_pot ae36f999674d196762efcc5abb06b345/de677e5818985db1285d0e80225f06e5
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/wafGroup:WafGroup")
public class WafGroup extends com.pulumi.resources.CustomResource {
    /**
     * The WAF Rule Group ID.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The WAF Rule Group ID.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The mode of the group, can be one of [&#34;on&#34;, &#34;off&#34;].
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The mode of the group, can be one of [&#34;on&#34;, &#34;off&#34;].
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The ID of the WAF Rule Package that contains the group.
     * 
     */
    @Export(name="packageId", type=String.class, parameters={})
    private Output<String> packageId;

    /**
     * @return The ID of the WAF Rule Package that contains the group.
     * 
     */
    public Output<String> packageId() {
        return this.packageId;
    }
    /**
     * The DNS zone ID to apply to.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The DNS zone ID to apply to.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WafGroup(String name) {
        this(name, WafGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WafGroup(String name, WafGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WafGroup(String name, WafGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/wafGroup:WafGroup", name, args == null ? WafGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WafGroup(String name, Output<String> id, @Nullable WafGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/wafGroup:WafGroup", name, state, makeResourceOptions(options, id));
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
    public static WafGroup get(String name, Output<String> id, @Nullable WafGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WafGroup(name, id, state, options);
    }
}
