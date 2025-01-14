// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RecordDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordState extends com.pulumi.resources.ResourceArgs {

    public static final RecordState Empty = new RecordState();

    @Import(name="allowOverwrite")
    private @Nullable Output<Boolean> allowOverwrite;

    public Optional<Output<Boolean>> allowOverwrite() {
        return Optional.ofNullable(this.allowOverwrite);
    }

    /**
     * The RFC3339 timestamp of when the record was created
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the record was created
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     * 
     */
    @Import(name="data")
    private @Nullable Output<RecordDataArgs> data;

    /**
     * @return Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     * 
     */
    public Optional<Output<RecordDataArgs>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * The FQDN of the record
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The FQDN of the record
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * A key-value map of string metadata Cloudflare associates with the record
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,Object>> metadata;

    /**
     * @return A key-value map of string metadata Cloudflare associates with the record
     * 
     */
    public Optional<Output<Map<String,Object>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The RFC3339 timestamp of when the record was last modified
     * 
     */
    @Import(name="modifiedOn")
    private @Nullable Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the record was last modified
     * 
     */
    public Optional<Output<String>> modifiedOn() {
        return Optional.ofNullable(this.modifiedOn);
    }

    /**
     * The name of the record
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the record
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The priority of the record
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the record
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Shows whether this record can be proxied, must be true if setting `proxied=true`
     * 
     */
    @Import(name="proxiable")
    private @Nullable Output<Boolean> proxiable;

    /**
     * @return Shows whether this record can be proxied, must be true if setting `proxied=true`
     * 
     */
    public Optional<Output<Boolean>> proxiable() {
        return Optional.ofNullable(this.proxiable);
    }

    /**
     * Whether the record gets Cloudflare&#39;s origin protection; defaults to `false`.
     * 
     */
    @Import(name="proxied")
    private @Nullable Output<Boolean> proxied;

    /**
     * @return Whether the record gets Cloudflare&#39;s origin protection; defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> proxied() {
        return Optional.ofNullable(this.proxied);
    }

    /**
     * The TTL of the record ([automatic: &#39;1&#39;](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The TTL of the record ([automatic: &#39;1&#39;](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The type of the record
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the record
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The (string) value of the record. Either this or `data` must be specified
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The (string) value of the record. Either this or `data` must be specified
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The DNS zone ID to add the record to
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The DNS zone ID to add the record to
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private RecordState() {}

    private RecordState(RecordState $) {
        this.allowOverwrite = $.allowOverwrite;
        this.createdOn = $.createdOn;
        this.data = $.data;
        this.hostname = $.hostname;
        this.metadata = $.metadata;
        this.modifiedOn = $.modifiedOn;
        this.name = $.name;
        this.priority = $.priority;
        this.proxiable = $.proxiable;
        this.proxied = $.proxied;
        this.ttl = $.ttl;
        this.type = $.type;
        this.value = $.value;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordState $;

        public Builder() {
            $ = new RecordState();
        }

        public Builder(RecordState defaults) {
            $ = new RecordState(Objects.requireNonNull(defaults));
        }

        public Builder allowOverwrite(@Nullable Output<Boolean> allowOverwrite) {
            $.allowOverwrite = allowOverwrite;
            return this;
        }

        public Builder allowOverwrite(Boolean allowOverwrite) {
            return allowOverwrite(Output.of(allowOverwrite));
        }

        /**
         * @param createdOn The RFC3339 timestamp of when the record was created
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn The RFC3339 timestamp of when the record was created
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param data Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<RecordDataArgs> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
         * 
         * @return builder
         * 
         */
        public Builder data(RecordDataArgs data) {
            return data(Output.of(data));
        }

        /**
         * @param hostname The FQDN of the record
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The FQDN of the record
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param metadata A key-value map of string metadata Cloudflare associates with the record
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,Object>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A key-value map of string metadata Cloudflare associates with the record
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,Object> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param modifiedOn The RFC3339 timestamp of when the record was last modified
         * 
         * @return builder
         * 
         */
        public Builder modifiedOn(@Nullable Output<String> modifiedOn) {
            $.modifiedOn = modifiedOn;
            return this;
        }

        /**
         * @param modifiedOn The RFC3339 timestamp of when the record was last modified
         * 
         * @return builder
         * 
         */
        public Builder modifiedOn(String modifiedOn) {
            return modifiedOn(Output.of(modifiedOn));
        }

        /**
         * @param name The name of the record
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the record
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority of the record
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the record
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param proxiable Shows whether this record can be proxied, must be true if setting `proxied=true`
         * 
         * @return builder
         * 
         */
        public Builder proxiable(@Nullable Output<Boolean> proxiable) {
            $.proxiable = proxiable;
            return this;
        }

        /**
         * @param proxiable Shows whether this record can be proxied, must be true if setting `proxied=true`
         * 
         * @return builder
         * 
         */
        public Builder proxiable(Boolean proxiable) {
            return proxiable(Output.of(proxiable));
        }

        /**
         * @param proxied Whether the record gets Cloudflare&#39;s origin protection; defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder proxied(@Nullable Output<Boolean> proxied) {
            $.proxied = proxied;
            return this;
        }

        /**
         * @param proxied Whether the record gets Cloudflare&#39;s origin protection; defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder proxied(Boolean proxied) {
            return proxied(Output.of(proxied));
        }

        /**
         * @param ttl The TTL of the record ([automatic: &#39;1&#39;](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The TTL of the record ([automatic: &#39;1&#39;](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param type The type of the record
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the record
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The (string) value of the record. Either this or `data` must be specified
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The (string) value of the record. Either this or `data` must be specified
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param zoneId The DNS zone ID to add the record to
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone ID to add the record to
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public RecordState build() {
            return $;
        }
    }

}
