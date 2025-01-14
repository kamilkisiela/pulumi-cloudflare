// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.RecordArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.RecordState;
import com.pulumi.cloudflare.outputs.RecordData;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare record resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.Record;
 * import com.pulumi.cloudflare.RecordArgs;
 * import com.pulumi.cloudflare.inputs.RecordDataArgs;
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
 *         var foobar = new Record(&#34;foobar&#34;, RecordArgs.builder()        
 *             .zoneId(var_.cloudflare_zone_id())
 *             .name(&#34;example&#34;)
 *             .value(&#34;192.168.0.11&#34;)
 *             .type(&#34;A&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         var _sipTls = new Record(&#34;_sipTls&#34;, RecordArgs.builder()        
 *             .zoneId(var_.cloudflare_zone_id())
 *             .name(&#34;_sip._tls&#34;)
 *             .type(&#34;SRV&#34;)
 *             .data(RecordDataArgs.builder()
 *                 .service(&#34;_sip&#34;)
 *                 .proto(&#34;_tls&#34;)
 *                 .name(&#34;example-srv&#34;)
 *                 .priority(0)
 *                 .weight(0)
 *                 .port(443)
 *                 .target(&#34;example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Records can be imported using a composite ID formed of zone ID and record ID, e.g.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/record:Record default ae36f999674d196762efcc5abb06b345/d41d8cd98f00b204e9800998ecf8427e
 * ```
 * 
 *  where- `ae36f999674d196762efcc5abb06b345` - the zone ID - `d41d8cd98f00b204e9800998ecf8427e` - record ID as returned by [API](https://api.cloudflare.com/#dns-records-for-a-zone-list-dns-records)
 * 
 */
@ResourceType(type="cloudflare:index/record:Record")
public class Record extends com.pulumi.resources.CustomResource {
    @Export(name="allowOverwrite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowOverwrite;

    public Output<Optional<Boolean>> allowOverwrite() {
        return Codegen.optional(this.allowOverwrite);
    }
    /**
     * The RFC3339 timestamp of when the record was created
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the record was created
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     * 
     */
    @Export(name="data", type=RecordData.class, parameters={})
    private Output</* @Nullable */ RecordData> data;

    /**
     * @return Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     * 
     */
    public Output<Optional<RecordData>> data() {
        return Codegen.optional(this.data);
    }
    /**
     * The FQDN of the record
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return The FQDN of the record
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * A key-value map of string metadata Cloudflare associates with the record
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> metadata;

    /**
     * @return A key-value map of string metadata Cloudflare associates with the record
     * 
     */
    public Output<Map<String,Object>> metadata() {
        return this.metadata;
    }
    /**
     * The RFC3339 timestamp of when the record was last modified
     * 
     */
    @Export(name="modifiedOn", type=String.class, parameters={})
    private Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the record was last modified
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * The name of the record
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the record
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The priority of the record
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the record
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Shows whether this record can be proxied, must be true if setting `proxied=true`
     * 
     */
    @Export(name="proxiable", type=Boolean.class, parameters={})
    private Output<Boolean> proxiable;

    /**
     * @return Shows whether this record can be proxied, must be true if setting `proxied=true`
     * 
     */
    public Output<Boolean> proxiable() {
        return this.proxiable;
    }
    /**
     * Whether the record gets Cloudflare&#39;s origin protection; defaults to `false`.
     * 
     */
    @Export(name="proxied", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> proxied;

    /**
     * @return Whether the record gets Cloudflare&#39;s origin protection; defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> proxied() {
        return Codegen.optional(this.proxied);
    }
    /**
     * The TTL of the record ([automatic: &#39;1&#39;](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return The TTL of the record ([automatic: &#39;1&#39;](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * The type of the record
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the record
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The (string) value of the record. Either this or `data` must be specified
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The (string) value of the record. Either this or `data` must be specified
     * 
     */
    public Output<String> value() {
        return this.value;
    }
    /**
     * The DNS zone ID to add the record to
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The DNS zone ID to add the record to
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Record(String name) {
        this(name, RecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Record(String name, RecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Record(String name, RecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/record:Record", name, args == null ? RecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Record(String name, Output<String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/record:Record", name, state, makeResourceOptions(options, id));
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
    public static Record get(String name, Output<String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Record(name, id, state, options);
    }
}
