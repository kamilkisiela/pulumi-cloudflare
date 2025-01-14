// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessIdentityProviderState extends com.pulumi.resources.ResourceArgs {

    public static final AccessIdentityProviderState Empty = new AccessIdentityProviderState();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
     * 
     */
    @Import(name="configs")
    private @Nullable Output<List<AccessIdentityProviderConfigArgs>> configs;

    /**
     * @return Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
     * 
     */
    public Optional<Output<List<AccessIdentityProviderConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * Friendly name of the Access Identity Provider configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name of the Access Identity Provider configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessIdentityProviderState() {}

    private AccessIdentityProviderState(AccessIdentityProviderState $) {
        this.accountId = $.accountId;
        this.configs = $.configs;
        this.name = $.name;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessIdentityProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessIdentityProviderState $;

        public Builder() {
            $ = new AccessIdentityProviderState();
        }

        public Builder(AccessIdentityProviderState defaults) {
            $ = new AccessIdentityProviderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param configs Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable Output<List<AccessIdentityProviderConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
         * 
         * @return builder
         * 
         */
        public Builder configs(List<AccessIdentityProviderConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        /**
         * @param configs Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
         * 
         * @return builder
         * 
         */
        public Builder configs(AccessIdentityProviderConfigArgs... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param name Friendly name of the Access Identity Provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the Access Identity Provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessIdentityProviderState build() {
            return $;
        }
    }

}
