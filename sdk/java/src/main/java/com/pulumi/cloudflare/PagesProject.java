// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.PagesProjectArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.PagesProjectState;
import com.pulumi.cloudflare.outputs.PagesProjectBuildConfig;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigs;
import com.pulumi.cloudflare.outputs.PagesProjectSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource which manages Cloudflare Pages projects.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.PagesProject;
 * import com.pulumi.cloudflare.PagesProjectArgs;
 * import com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs;
 * import com.pulumi.cloudflare.inputs.PagesProjectSourceArgs;
 * import com.pulumi.cloudflare.inputs.PagesProjectSourceConfigArgs;
 * import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs;
 * import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsPreviewArgs;
 * import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionArgs;
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
 *         var basicProject = new PagesProject(&#34;basicProject&#34;, PagesProjectArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;this-is-my-project-01&#34;)
 *             .productionBranch(&#34;main&#34;)
 *             .build());
 * 
 *         var buildConfig = new PagesProject(&#34;buildConfig&#34;, PagesProjectArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .buildConfig(PagesProjectBuildConfigArgs.builder()
 *                 .buildCommand(&#34;npm run build&#34;)
 *                 .destinationDir(&#34;build&#34;)
 *                 .rootDir(&#34;/&#34;)
 *                 .webAnalyticsTag(&#34;cee1c73f6e4743d0b5e6bb1a0bcaabcc&#34;)
 *                 .webAnalyticsToken(&#34;021e1057c18547eca7b79f2516f06o7x&#34;)
 *                 .build())
 *             .name(&#34;this-is-my-project-01&#34;)
 *             .productionBranch(&#34;main&#34;)
 *             .build());
 * 
 *         var sourceConfig = new PagesProject(&#34;sourceConfig&#34;, PagesProjectArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;this-is-my-project-01&#34;)
 *             .productionBranch(&#34;main&#34;)
 *             .source(PagesProjectSourceArgs.builder()
 *                 .config(PagesProjectSourceConfigArgs.builder()
 *                     .deploymentsEnabled(true)
 *                     .owner(&#34;cloudflare&#34;)
 *                     .prCommentsEnabled(true)
 *                     .previewBranchExcludes(                    
 *                         &#34;main&#34;,
 *                         &#34;prod&#34;)
 *                     .previewBranchIncludes(                    
 *                         &#34;dev&#34;,
 *                         &#34;preview&#34;)
 *                     .previewDeploymentSetting(&#34;custom&#34;)
 *                     .productionBranch(&#34;main&#34;)
 *                     .productionDeploymentEnabled(true)
 *                     .repoName(&#34;ninjakittens&#34;)
 *                     .build())
 *                 .type(&#34;github&#34;)
 *                 .build())
 *             .build());
 * 
 *         var deploymentConfigs = new PagesProject(&#34;deploymentConfigs&#34;, PagesProjectArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .deploymentConfigs(PagesProjectDeploymentConfigsArgs.builder()
 *                 .preview(PagesProjectDeploymentConfigsPreviewArgs.builder()
 *                     .compatibilityDate(&#34;2022-08-15&#34;)
 *                     .compatibilityFlags(&#34;preview_flag&#34;)
 *                     .d1Databases(Map.of(&#34;D1BINDING&#34;, &#34;445e2955-951a-4358-a35b-a4d0c813f63&#34;))
 *                     .durableObjectNamespaces(Map.of(&#34;DOBINDING&#34;, &#34;5eb63bbbe01eeed093cb22bb8f5acdc3&#34;))
 *                     .environmentVariables(Map.of(&#34;ENVIRONMENT&#34;, &#34;preview&#34;))
 *                     .kvNamespaces(Map.of(&#34;KVBINDING&#34;, &#34;5eb63bbbe01eeed093cb22bb8f5acdc3&#34;))
 *                     .r2Buckets(Map.of(&#34;R2BINDING&#34;, &#34;some-bucket&#34;))
 *                     .build())
 *                 .production(PagesProjectDeploymentConfigsProductionArgs.builder()
 *                     .compatibilityDate(&#34;2022-08-16&#34;)
 *                     .compatibilityFlags(                    
 *                         &#34;production_flag&#34;,
 *                         &#34;second flag&#34;)
 *                     .d1Databases(Map.ofEntries(
 *                         Map.entry(&#34;D1BINDING1&#34;, &#34;445e2955-951a-4358-a35b-a4d0c813f63&#34;),
 *                         Map.entry(&#34;D1BINDING2&#34;, &#34;a399414b-c697-409a-a688-377db6433cd9&#34;)
 *                     ))
 *                     .durableObjectNamespaces(Map.ofEntries(
 *                         Map.entry(&#34;DOBINDING1&#34;, &#34;5eb63bbbe01eeed093cb22bb8f5acdc3&#34;),
 *                         Map.entry(&#34;DOBINDING2&#34;, &#34;3cdca5f8bb22bc390deee10ebbb36be5&#34;)
 *                     ))
 *                     .environmentVariables(Map.ofEntries(
 *                         Map.entry(&#34;ENVIRONMENT&#34;, &#34;production&#34;),
 *                         Map.entry(&#34;OTHERVALUE&#34;, &#34;other value&#34;)
 *                     ))
 *                     .kvNamespaces(Map.ofEntries(
 *                         Map.entry(&#34;KVBINDING1&#34;, &#34;5eb63bbbe01eeed093cb22bb8f5acdc3&#34;),
 *                         Map.entry(&#34;KVBINDING2&#34;, &#34;3cdca5f8bb22bc390deee10ebbb36be5&#34;)
 *                     ))
 *                     .r2Buckets(Map.ofEntries(
 *                         Map.entry(&#34;R2BINDING1&#34;, &#34;some-bucket&#34;),
 *                         Map.entry(&#34;R2BINDING2&#34;, &#34;other-bucket&#34;)
 *                     ))
 *                     .build())
 *                 .build())
 *             .name(&#34;this-is-my-project-01&#34;)
 *             .productionBranch(&#34;main&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/pagesProject:PagesProject example &lt;account_id&gt;/&lt;project_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/pagesProject:PagesProject")
public class PagesProject extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Configuration for the project build process.
     * 
     */
    @Export(name="buildConfig", type=PagesProjectBuildConfig.class, parameters={})
    private Output</* @Nullable */ PagesProjectBuildConfig> buildConfig;

    /**
     * @return Configuration for the project build process.
     * 
     */
    public Output<Optional<PagesProjectBuildConfig>> buildConfig() {
        return Codegen.optional(this.buildConfig);
    }
    /**
     * When the project was created.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return When the project was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Configuration for deployments in a project.
     * 
     */
    @Export(name="deploymentConfigs", type=PagesProjectDeploymentConfigs.class, parameters={})
    private Output</* @Nullable */ PagesProjectDeploymentConfigs> deploymentConfigs;

    /**
     * @return Configuration for deployments in a project.
     * 
     */
    public Output<Optional<PagesProjectDeploymentConfigs>> deploymentConfigs() {
        return Codegen.optional(this.deploymentConfigs);
    }
    /**
     * A list of associated custom domains for the project.
     * 
     */
    @Export(name="domains", type=List.class, parameters={String.class})
    private Output<List<String>> domains;

    /**
     * @return A list of associated custom domains for the project.
     * 
     */
    public Output<List<String>> domains() {
        return this.domains;
    }
    /**
     * Name of the project.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the branch that is used for the production environment.
     * 
     */
    @Export(name="productionBranch", type=String.class, parameters={})
    private Output<String> productionBranch;

    /**
     * @return The name of the branch that is used for the production environment.
     * 
     */
    public Output<String> productionBranch() {
        return this.productionBranch;
    }
    /**
     * Configuration for the project source.
     * 
     */
    @Export(name="source", type=PagesProjectSource.class, parameters={})
    private Output</* @Nullable */ PagesProjectSource> source;

    /**
     * @return Configuration for the project source.
     * 
     */
    public Output<Optional<PagesProjectSource>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * The Cloudflare subdomain associated with the project.
     * 
     */
    @Export(name="subdomain", type=String.class, parameters={})
    private Output<String> subdomain;

    /**
     * @return The Cloudflare subdomain associated with the project.
     * 
     */
    public Output<String> subdomain() {
        return this.subdomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PagesProject(String name) {
        this(name, PagesProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PagesProject(String name, PagesProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PagesProject(String name, PagesProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/pagesProject:PagesProject", name, args == null ? PagesProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PagesProject(String name, Output<String> id, @Nullable PagesProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/pagesProject:PagesProject", name, state, makeResourceOptions(options, id));
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
    public static PagesProject get(String name, Output<String> id, @Nullable PagesProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PagesProject(name, id, state, options);
    }
}
