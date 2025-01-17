// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Authenticated Origin Pulls certificate resource. An uploaded client certificate is required to use Per-Zone or Per-Hostname Authenticated Origin Pulls.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificate;
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs;
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
 *         var myPerZoneAopCert = new AuthenticatedOriginPullsCertificate(&#34;myPerZoneAopCert&#34;, AuthenticatedOriginPullsCertificateArgs.builder()        
 *             .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *             .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *             .type(&#34;per-zone&#34;)
 *             .zoneId(var_.cloudflare_zone_id())
 *             .build());
 * 
 *         var myPerHostnameAopCert = new AuthenticatedOriginPullsCertificate(&#34;myPerHostnameAopCert&#34;, AuthenticatedOriginPullsCertificateArgs.builder()        
 *             .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *             .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *             .type(&#34;per-hostname&#34;)
 *             .zoneId(var_.cloudflare_zone_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Authenticated Origin Pull certificates can be imported using a composite ID formed of the zone ID, the form of Authenticated Origin Pulls, and the certificate ID, e.g. # Import Per-Zone Authenticated Origin Pull certificate
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 023e105f4ecef8ad9ca31a8372d0c353/per-zone/2458ce5a-0c35-4c7f-82c7-8e9487d3ff60
 * ```
 * 
 * # Import Per-Hostname Authenticated Origin Pull certificate
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 023e105f4ecef8ad9ca31a8372d0c353/per-hostname/2458ce5a-0c35-4c7f-82c7-8e9487d3ff60
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate")
public class AuthenticatedOriginPullsCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The public client certificate.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return The public client certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    @Export(name="expiresOn", type=String.class, parameters={})
    private Output<String> expiresOn;

    public Output<String> expiresOn() {
        return this.expiresOn;
    }
    @Export(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * The private key of the client certificate.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return The private key of the client certificate.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    @Export(name="serialNumber", type=String.class, parameters={})
    private Output<String> serialNumber;

    public Output<String> serialNumber() {
        return this.serialNumber;
    }
    @Export(name="signature", type=String.class, parameters={})
    private Output<String> signature;

    public Output<String> signature() {
        return this.signature;
    }
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    /**
     * The form of Authenticated Origin Pulls to upload the certificate to.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The form of Authenticated Origin Pulls to upload the certificate to.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="uploadedOn", type=String.class, parameters={})
    private Output<String> uploadedOn;

    public Output<String> uploadedOn() {
        return this.uploadedOn;
    }
    /**
     * The zone ID to upload the certificate to.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone ID to upload the certificate to.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthenticatedOriginPullsCertificate(String name) {
        this(name, AuthenticatedOriginPullsCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthenticatedOriginPullsCertificate(String name, AuthenticatedOriginPullsCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthenticatedOriginPullsCertificate(String name, AuthenticatedOriginPullsCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, args == null ? AuthenticatedOriginPullsCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthenticatedOriginPullsCertificate(String name, Output<String> id, @Nullable AuthenticatedOriginPullsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, state, makeResourceOptions(options, id));
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
    public static AuthenticatedOriginPullsCertificate get(String name, Output<String> id, @Nullable AuthenticatedOriginPullsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthenticatedOriginPullsCertificate(name, id, state, options);
    }
}
