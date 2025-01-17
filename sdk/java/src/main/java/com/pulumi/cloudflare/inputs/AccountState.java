// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * Whether 2FA is enforced on the account. Defaults to `false`.
     * 
     */
    @Import(name="enforceTwofactor")
    private @Nullable Output<Boolean> enforceTwofactor;

    /**
     * @return Whether 2FA is enforced on the account. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enforceTwofactor() {
        return Optional.ofNullable(this.enforceTwofactor);
    }

    /**
     * The name of the account that is displayed in the Cloudflare dashboard.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the account that is displayed in the Cloudflare dashboard.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Account type. Available values: `enterprise`, `standard`. Defaults to `standard`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Account type. Available values: `enterprise`, `standard`. Defaults to `standard`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AccountState() {}

    private AccountState(AccountState $) {
        this.enforceTwofactor = $.enforceTwofactor;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountState $;

        public Builder() {
            $ = new AccountState();
        }

        public Builder(AccountState defaults) {
            $ = new AccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforceTwofactor Whether 2FA is enforced on the account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforceTwofactor(@Nullable Output<Boolean> enforceTwofactor) {
            $.enforceTwofactor = enforceTwofactor;
            return this;
        }

        /**
         * @param enforceTwofactor Whether 2FA is enforced on the account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforceTwofactor(Boolean enforceTwofactor) {
            return enforceTwofactor(Output.of(enforceTwofactor));
        }

        /**
         * @param name The name of the account that is displayed in the Cloudflare dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the account that is displayed in the Cloudflare dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Account type. Available values: `enterprise`, `standard`. Defaults to `standard`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Account type. Available values: `enterprise`, `standard`. Defaults to `standard`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccountState build() {
            return $;
        }
    }

}
