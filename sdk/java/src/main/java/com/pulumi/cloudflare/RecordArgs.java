// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.RecordDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordArgs Empty = new RecordArgs();

    @Import(name="allowOverwrite")
    private @Nullable Output<Boolean> allowOverwrite;

    public Optional<Output<Boolean>> allowOverwrite() {
        return Optional.ofNullable(this.allowOverwrite);
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
     * The name of the record
     * 
     */
    @Import(name="name", required=true)
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
    @Import(name="type", required=true)
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
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The DNS zone ID to add the record to
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private RecordArgs() {}

    private RecordArgs(RecordArgs $) {
        this.allowOverwrite = $.allowOverwrite;
        this.data = $.data;
        this.name = $.name;
        this.priority = $.priority;
        this.proxied = $.proxied;
        this.ttl = $.ttl;
        this.type = $.type;
        this.value = $.value;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordArgs $;

        public Builder() {
            $ = new RecordArgs();
        }

        public Builder(RecordArgs defaults) {
            $ = new RecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowOverwrite(@Nullable Output<Boolean> allowOverwrite) {
            $.allowOverwrite = allowOverwrite;
            return this;
        }

        public Builder allowOverwrite(Boolean allowOverwrite) {
            return allowOverwrite(Output.of(allowOverwrite));
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
         * @param name The name of the record
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
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
        public Builder type(Output<String> type) {
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
        public Builder zoneId(Output<String> zoneId) {
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

        public RecordArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}