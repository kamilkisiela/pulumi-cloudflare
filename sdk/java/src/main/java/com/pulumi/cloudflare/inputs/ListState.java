// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ListItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListState extends com.pulumi.resources.ResourceArgs {

    public static final ListState Empty = new ListState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * An optional description of the list.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the list.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="items")
    private @Nullable Output<List<ListItemArgs>> items;

    public Optional<Output<List<ListItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The type of items the list will contain.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The type of items the list will contain.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The name of the list.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the list.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ListState() {}

    private ListState(ListState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.items = $.items;
        this.kind = $.kind;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListState $;

        public Builder() {
            $ = new ListState();
        }

        public Builder(ListState defaults) {
            $ = new ListState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description An optional description of the list.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the list.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder items(@Nullable Output<List<ListItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<ListItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(ListItemArgs... items) {
            return items(List.of(items));
        }

        /**
         * @param kind The type of items the list will contain.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of items the list will contain.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name The name of the list.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the list.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ListState build() {
            return $;
        }
    }

}
