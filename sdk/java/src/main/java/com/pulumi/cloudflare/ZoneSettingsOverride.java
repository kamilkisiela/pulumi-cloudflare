// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZoneSettingsOverrideArgs;
import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideState;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideInitialSetting;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource which customizes Cloudflare zone settings. Note that after destroying this resource Zone Settings will be reset to their initial values.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.ZoneSettingsOverride;
 * import com.pulumi.cloudflare.ZoneSettingsOverrideArgs;
 * import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsArgs;
 * import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsMinifyArgs;
 * import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsSecurityHeaderArgs;
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
 *         var test = new ZoneSettingsOverride(&#34;test&#34;, ZoneSettingsOverrideArgs.builder()        
 *             .zoneId(var_.cloudflare_zone_id())
 *             .settings(ZoneSettingsOverrideSettingsArgs.builder()
 *                 .brotli(&#34;on&#34;)
 *                 .challengeTtl(2700)
 *                 .securityLevel(&#34;high&#34;)
 *                 .opportunisticEncryption(&#34;on&#34;)
 *                 .automaticHttpsRewrites(&#34;on&#34;)
 *                 .mirage(&#34;on&#34;)
 *                 .waf(&#34;on&#34;)
 *                 .minify(ZoneSettingsOverrideSettingsMinifyArgs.builder()
 *                     .css(&#34;on&#34;)
 *                     .js(&#34;off&#34;)
 *                     .html(&#34;off&#34;)
 *                     .build())
 *                 .securityHeader(ZoneSettingsOverrideSettingsSecurityHeaderArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride")
public class ZoneSettingsOverride extends com.pulumi.resources.CustomResource {
    /**
     * Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
     * 
     */
    @Export(name="initialSettings", type=List.class, parameters={ZoneSettingsOverrideInitialSetting.class})
    private Output<List<ZoneSettingsOverrideInitialSetting>> initialSettings;

    /**
     * @return Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
     * 
     */
    public Output<List<ZoneSettingsOverrideInitialSetting>> initialSettings() {
        return this.initialSettings;
    }
    /**
     * Time when this resource was created and the `initial_settings` were set.
     * 
     */
    @Export(name="initialSettingsReadAt", type=String.class, parameters={})
    private Output<String> initialSettingsReadAt;

    /**
     * @return Time when this resource was created and the `initial_settings` were set.
     * 
     */
    public Output<String> initialSettingsReadAt() {
        return this.initialSettingsReadAt;
    }
    /**
     * Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
     * - `zone_status`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
     * - `zone_type`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
     * 
     */
    @Export(name="readonlySettings", type=List.class, parameters={String.class})
    private Output<List<String>> readonlySettings;

    /**
     * @return Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
     * - `zone_status`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
     * - `zone_type`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
     * 
     */
    public Output<List<String>> readonlySettings() {
        return this.readonlySettings;
    }
    /**
     * Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
     * 
     */
    @Export(name="settings", type=ZoneSettingsOverrideSettings.class, parameters={})
    private Output<ZoneSettingsOverrideSettings> settings;

    /**
     * @return Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
     * 
     */
    public Output<ZoneSettingsOverrideSettings> settings() {
        return this.settings;
    }
    /**
     * The DNS zone ID to which apply settings.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The DNS zone ID to which apply settings.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }
    @Export(name="zoneStatus", type=String.class, parameters={})
    private Output<String> zoneStatus;

    public Output<String> zoneStatus() {
        return this.zoneStatus;
    }
    @Export(name="zoneType", type=String.class, parameters={})
    private Output<String> zoneType;

    public Output<String> zoneType() {
        return this.zoneType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneSettingsOverride(String name) {
        this(name, ZoneSettingsOverrideArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneSettingsOverride(String name, ZoneSettingsOverrideArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneSettingsOverride(String name, ZoneSettingsOverrideArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride", name, args == null ? ZoneSettingsOverrideArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ZoneSettingsOverride(String name, Output<String> id, @Nullable ZoneSettingsOverrideState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride", name, state, makeResourceOptions(options, id));
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
    public static ZoneSettingsOverride get(String name, Output<String> id, @Nullable ZoneSettingsOverrideState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZoneSettingsOverride(name, id, state, options);
    }
}
