// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GreTunnelState extends com.pulumi.resources.ResourceArgs {

    public static final GreTunnelState Empty = new GreTunnelState();

    /**
     * The ID of the account where the tunnel is being created.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The ID of the account where the tunnel is being created.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The IP address assigned to the Cloudflare side of the GRE tunnel.
     * 
     */
    @Import(name="cloudflareGreEndpoint")
    private @Nullable Output<String> cloudflareGreEndpoint;

    /**
     * @return The IP address assigned to the Cloudflare side of the GRE tunnel.
     * 
     */
    public Optional<Output<String>> cloudflareGreEndpoint() {
        return Optional.ofNullable(this.cloudflareGreEndpoint);
    }

    /**
     * The IP address assigned to the customer side of the GRE tunnel.
     * 
     */
    @Import(name="customerGreEndpoint")
    private @Nullable Output<String> customerGreEndpoint;

    /**
     * @return The IP address assigned to the customer side of the GRE tunnel.
     * 
     */
    public Optional<Output<String>> customerGreEndpoint() {
        return Optional.ofNullable(this.customerGreEndpoint);
    }

    /**
     * An optional description of the GRE tunnel.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the GRE tunnel.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies if ICMP tunnel health checks are enabled Default: `true`.
     * 
     */
    @Import(name="healthCheckEnabled")
    private @Nullable Output<Boolean> healthCheckEnabled;

    /**
     * @return Specifies if ICMP tunnel health checks are enabled Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> healthCheckEnabled() {
        return Optional.ofNullable(this.healthCheckEnabled);
    }

    /**
     * The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
     * 
     */
    @Import(name="healthCheckTarget")
    private @Nullable Output<String> healthCheckTarget;

    /**
     * @return The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
     * 
     */
    public Optional<Output<String>> healthCheckTarget() {
        return Optional.ofNullable(this.healthCheckTarget);
    }

    /**
     * Specifies the ICMP echo type for the health check (`request` or `reply`) Default: `reply`.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    /**
     * @return Specifies the ICMP echo type for the health check (`request` or `reply`) Default: `reply`.
     * 
     */
    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    @Import(name="interfaceAddress")
    private @Nullable Output<String> interfaceAddress;

    /**
     * @return 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    public Optional<Output<String>> interfaceAddress() {
        return Optional.ofNullable(this.interfaceAddress);
    }

    /**
     * Maximum Transmission Unit (MTU) in bytes for the GRE tunnel. Maximum value 1476 and minimum value 576. Default: `1476`.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit (MTU) in bytes for the GRE tunnel. Maximum value 1476 and minimum value 576. Default: `1476`.
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * Name of the GRE tunnel.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GRE tunnel.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Time To Live (TTL) in number of hops of the GRE tunnel. Minimum value 64. Default: `64`.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return Time To Live (TTL) in number of hops of the GRE tunnel. Minimum value 64. Default: `64`.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private GreTunnelState() {}

    private GreTunnelState(GreTunnelState $) {
        this.accountId = $.accountId;
        this.cloudflareGreEndpoint = $.cloudflareGreEndpoint;
        this.customerGreEndpoint = $.customerGreEndpoint;
        this.description = $.description;
        this.healthCheckEnabled = $.healthCheckEnabled;
        this.healthCheckTarget = $.healthCheckTarget;
        this.healthCheckType = $.healthCheckType;
        this.interfaceAddress = $.interfaceAddress;
        this.mtu = $.mtu;
        this.name = $.name;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GreTunnelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GreTunnelState $;

        public Builder() {
            $ = new GreTunnelState();
        }

        public Builder(GreTunnelState defaults) {
            $ = new GreTunnelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the account where the tunnel is being created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the account where the tunnel is being created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param cloudflareGreEndpoint The IP address assigned to the Cloudflare side of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder cloudflareGreEndpoint(@Nullable Output<String> cloudflareGreEndpoint) {
            $.cloudflareGreEndpoint = cloudflareGreEndpoint;
            return this;
        }

        /**
         * @param cloudflareGreEndpoint The IP address assigned to the Cloudflare side of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder cloudflareGreEndpoint(String cloudflareGreEndpoint) {
            return cloudflareGreEndpoint(Output.of(cloudflareGreEndpoint));
        }

        /**
         * @param customerGreEndpoint The IP address assigned to the customer side of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder customerGreEndpoint(@Nullable Output<String> customerGreEndpoint) {
            $.customerGreEndpoint = customerGreEndpoint;
            return this;
        }

        /**
         * @param customerGreEndpoint The IP address assigned to the customer side of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder customerGreEndpoint(String customerGreEndpoint) {
            return customerGreEndpoint(Output.of(customerGreEndpoint));
        }

        /**
         * @param description An optional description of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param healthCheckEnabled Specifies if ICMP tunnel health checks are enabled Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckEnabled(@Nullable Output<Boolean> healthCheckEnabled) {
            $.healthCheckEnabled = healthCheckEnabled;
            return this;
        }

        /**
         * @param healthCheckEnabled Specifies if ICMP tunnel health checks are enabled Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            return healthCheckEnabled(Output.of(healthCheckEnabled));
        }

        /**
         * @param healthCheckTarget The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTarget(@Nullable Output<String> healthCheckTarget) {
            $.healthCheckTarget = healthCheckTarget;
            return this;
        }

        /**
         * @param healthCheckTarget The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTarget(String healthCheckTarget) {
            return healthCheckTarget(Output.of(healthCheckTarget));
        }

        /**
         * @param healthCheckType Specifies the ICMP echo type for the health check (`request` or `reply`) Default: `reply`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * @param healthCheckType Specifies the ICMP echo type for the health check (`request` or `reply`) Default: `reply`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        /**
         * @param interfaceAddress 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder interfaceAddress(@Nullable Output<String> interfaceAddress) {
            $.interfaceAddress = interfaceAddress;
            return this;
        }

        /**
         * @param interfaceAddress 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder interfaceAddress(String interfaceAddress) {
            return interfaceAddress(Output.of(interfaceAddress));
        }

        /**
         * @param mtu Maximum Transmission Unit (MTU) in bytes for the GRE tunnel. Maximum value 1476 and minimum value 576. Default: `1476`.
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu Maximum Transmission Unit (MTU) in bytes for the GRE tunnel. Maximum value 1476 and minimum value 576. Default: `1476`.
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param name Name of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GRE tunnel.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ttl Time To Live (TTL) in number of hops of the GRE tunnel. Minimum value 64. Default: `64`.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Time To Live (TTL) in number of hops of the GRE tunnel. Minimum value 64. Default: `64`.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public GreTunnelState build() {
            return $;
        }
    }

}