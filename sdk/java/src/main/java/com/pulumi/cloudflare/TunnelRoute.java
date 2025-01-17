// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TunnelRouteArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TunnelRouteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource, that manages Cloudflare tunnel routes for Zero
 * Trust. Tunnel routes are used to direct IP traffic through
 * Cloudflare Tunnels.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.TunnelRoute;
 * import com.pulumi.cloudflare.TunnelRouteArgs;
 * import com.pulumi.cloudflare.ArgoTunnel;
 * import com.pulumi.cloudflare.ArgoTunnelArgs;
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
 *         var exampleTunnelRoute = new TunnelRoute(&#34;exampleTunnelRoute&#34;, TunnelRouteArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .tunnelId(&#34;f70ff985-a4ef-4643-bbbc-4a0ed4fc8415&#34;)
 *             .network(&#34;192.0.2.24/32&#34;)
 *             .comment(&#34;New tunnel route for documentation&#34;)
 *             .virtualNetworkId(&#34;bdc39a3c-3104-4c23-8ac0-9f455dda691a&#34;)
 *             .build());
 * 
 *         var tunnel = new ArgoTunnel(&#34;tunnel&#34;, ArgoTunnelArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;my_tunnel&#34;)
 *             .secret(&#34;AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=&#34;)
 *             .build());
 * 
 *         var exampleIndex_tunnelRouteTunnelRoute = new TunnelRoute(&#34;exampleIndex/tunnelRouteTunnelRoute&#34;, TunnelRouteArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .tunnelId(tunnel.id())
 *             .network(&#34;192.0.2.24/32&#34;)
 *             .comment(&#34;New tunnel route for documentation&#34;)
 *             .virtualNetworkId(&#34;bdc39a3c-3104-4c23-8ac0-9f455dda691a&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Use account ID, network CIDR and virtual network ID.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/tunnelRoute:TunnelRoute example &lt;account_id/&lt;network_cidr&gt;/&lt;virtual_network_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/tunnelRoute:TunnelRoute")
public class TunnelRoute extends com.pulumi.resources.CustomResource {
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
     * Description of the tunnel route.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Description of the tunnel route.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The ID of the tunnel that will service the tunnel route.
     * 
     */
    @Export(name="tunnelId", type=String.class, parameters={})
    private Output<String> tunnelId;

    /**
     * @return The ID of the tunnel that will service the tunnel route.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }
    /**
     * The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided.
     * 
     */
    @Export(name="virtualNetworkId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkId;

    /**
     * @return The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided.
     * 
     */
    public Output<Optional<String>> virtualNetworkId() {
        return Codegen.optional(this.virtualNetworkId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TunnelRoute(String name) {
        this(name, TunnelRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TunnelRoute(String name, TunnelRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TunnelRoute(String name, TunnelRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/tunnelRoute:TunnelRoute", name, args == null ? TunnelRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TunnelRoute(String name, Output<String> id, @Nullable TunnelRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/tunnelRoute:TunnelRoute", name, state, makeResourceOptions(options, id));
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
    public static TunnelRoute get(String name, Output<String> id, @Nullable TunnelRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TunnelRoute(name, id, state, options);
    }
}
