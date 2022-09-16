// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessIdentityProviderConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessIdentityProviderConfigArgs Empty = new AccessIdentityProviderConfigArgs();

    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    @Import(name="appsDomain")
    private @Nullable Output<String> appsDomain;

    public Optional<Output<String>> appsDomain() {
        return Optional.ofNullable(this.appsDomain);
    }

    @Import(name="attributes")
    private @Nullable Output<List<String>> attributes;

    public Optional<Output<List<String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    @Import(name="authUrl")
    private @Nullable Output<String> authUrl;

    public Optional<Output<String>> authUrl() {
        return Optional.ofNullable(this.authUrl);
    }

    @Import(name="centrifyAccount")
    private @Nullable Output<String> centrifyAccount;

    public Optional<Output<String>> centrifyAccount() {
        return Optional.ofNullable(this.centrifyAccount);
    }

    @Import(name="centrifyAppId")
    private @Nullable Output<String> centrifyAppId;

    public Optional<Output<String>> centrifyAppId() {
        return Optional.ofNullable(this.centrifyAppId);
    }

    @Import(name="certsUrl")
    private @Nullable Output<String> certsUrl;

    public Optional<Output<String>> certsUrl() {
        return Optional.ofNullable(this.certsUrl);
    }

    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    @Import(name="emailAttributeName")
    private @Nullable Output<String> emailAttributeName;

    public Optional<Output<String>> emailAttributeName() {
        return Optional.ofNullable(this.emailAttributeName);
    }

    @Import(name="idpPublicCert")
    private @Nullable Output<String> idpPublicCert;

    public Optional<Output<String>> idpPublicCert() {
        return Optional.ofNullable(this.idpPublicCert);
    }

    @Import(name="issuerUrl")
    private @Nullable Output<String> issuerUrl;

    public Optional<Output<String>> issuerUrl() {
        return Optional.ofNullable(this.issuerUrl);
    }

    @Import(name="oktaAccount")
    private @Nullable Output<String> oktaAccount;

    public Optional<Output<String>> oktaAccount() {
        return Optional.ofNullable(this.oktaAccount);
    }

    @Import(name="oneloginAccount")
    private @Nullable Output<String> oneloginAccount;

    public Optional<Output<String>> oneloginAccount() {
        return Optional.ofNullable(this.oneloginAccount);
    }

    @Import(name="pkceEnabled")
    private @Nullable Output<Boolean> pkceEnabled;

    public Optional<Output<Boolean>> pkceEnabled() {
        return Optional.ofNullable(this.pkceEnabled);
    }

    @Import(name="redirectUrl")
    private @Nullable Output<String> redirectUrl;

    public Optional<Output<String>> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    @Import(name="signRequest")
    private @Nullable Output<Boolean> signRequest;

    public Optional<Output<Boolean>> signRequest() {
        return Optional.ofNullable(this.signRequest);
    }

    @Import(name="ssoTargetUrl")
    private @Nullable Output<String> ssoTargetUrl;

    public Optional<Output<String>> ssoTargetUrl() {
        return Optional.ofNullable(this.ssoTargetUrl);
    }

    @Import(name="supportGroups")
    private @Nullable Output<Boolean> supportGroups;

    public Optional<Output<Boolean>> supportGroups() {
        return Optional.ofNullable(this.supportGroups);
    }

    @Import(name="tokenUrl")
    private @Nullable Output<String> tokenUrl;

    public Optional<Output<String>> tokenUrl() {
        return Optional.ofNullable(this.tokenUrl);
    }

    private AccessIdentityProviderConfigArgs() {}

    private AccessIdentityProviderConfigArgs(AccessIdentityProviderConfigArgs $) {
        this.apiToken = $.apiToken;
        this.appsDomain = $.appsDomain;
        this.attributes = $.attributes;
        this.authUrl = $.authUrl;
        this.centrifyAccount = $.centrifyAccount;
        this.centrifyAppId = $.centrifyAppId;
        this.certsUrl = $.certsUrl;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.directoryId = $.directoryId;
        this.emailAttributeName = $.emailAttributeName;
        this.idpPublicCert = $.idpPublicCert;
        this.issuerUrl = $.issuerUrl;
        this.oktaAccount = $.oktaAccount;
        this.oneloginAccount = $.oneloginAccount;
        this.pkceEnabled = $.pkceEnabled;
        this.redirectUrl = $.redirectUrl;
        this.signRequest = $.signRequest;
        this.ssoTargetUrl = $.ssoTargetUrl;
        this.supportGroups = $.supportGroups;
        this.tokenUrl = $.tokenUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessIdentityProviderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessIdentityProviderConfigArgs $;

        public Builder() {
            $ = new AccessIdentityProviderConfigArgs();
        }

        public Builder(AccessIdentityProviderConfigArgs defaults) {
            $ = new AccessIdentityProviderConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

        public Builder apiToken(String apiToken) {
            return apiToken(Output.of(apiToken));
        }

        public Builder appsDomain(@Nullable Output<String> appsDomain) {
            $.appsDomain = appsDomain;
            return this;
        }

        public Builder appsDomain(String appsDomain) {
            return appsDomain(Output.of(appsDomain));
        }

        public Builder attributes(@Nullable Output<List<String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        public Builder attributes(List<String> attributes) {
            return attributes(Output.of(attributes));
        }

        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }

        public Builder authUrl(@Nullable Output<String> authUrl) {
            $.authUrl = authUrl;
            return this;
        }

        public Builder authUrl(String authUrl) {
            return authUrl(Output.of(authUrl));
        }

        public Builder centrifyAccount(@Nullable Output<String> centrifyAccount) {
            $.centrifyAccount = centrifyAccount;
            return this;
        }

        public Builder centrifyAccount(String centrifyAccount) {
            return centrifyAccount(Output.of(centrifyAccount));
        }

        public Builder centrifyAppId(@Nullable Output<String> centrifyAppId) {
            $.centrifyAppId = centrifyAppId;
            return this;
        }

        public Builder centrifyAppId(String centrifyAppId) {
            return centrifyAppId(Output.of(centrifyAppId));
        }

        public Builder certsUrl(@Nullable Output<String> certsUrl) {
            $.certsUrl = certsUrl;
            return this;
        }

        public Builder certsUrl(String certsUrl) {
            return certsUrl(Output.of(certsUrl));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public Builder emailAttributeName(@Nullable Output<String> emailAttributeName) {
            $.emailAttributeName = emailAttributeName;
            return this;
        }

        public Builder emailAttributeName(String emailAttributeName) {
            return emailAttributeName(Output.of(emailAttributeName));
        }

        public Builder idpPublicCert(@Nullable Output<String> idpPublicCert) {
            $.idpPublicCert = idpPublicCert;
            return this;
        }

        public Builder idpPublicCert(String idpPublicCert) {
            return idpPublicCert(Output.of(idpPublicCert));
        }

        public Builder issuerUrl(@Nullable Output<String> issuerUrl) {
            $.issuerUrl = issuerUrl;
            return this;
        }

        public Builder issuerUrl(String issuerUrl) {
            return issuerUrl(Output.of(issuerUrl));
        }

        public Builder oktaAccount(@Nullable Output<String> oktaAccount) {
            $.oktaAccount = oktaAccount;
            return this;
        }

        public Builder oktaAccount(String oktaAccount) {
            return oktaAccount(Output.of(oktaAccount));
        }

        public Builder oneloginAccount(@Nullable Output<String> oneloginAccount) {
            $.oneloginAccount = oneloginAccount;
            return this;
        }

        public Builder oneloginAccount(String oneloginAccount) {
            return oneloginAccount(Output.of(oneloginAccount));
        }

        public Builder pkceEnabled(@Nullable Output<Boolean> pkceEnabled) {
            $.pkceEnabled = pkceEnabled;
            return this;
        }

        public Builder pkceEnabled(Boolean pkceEnabled) {
            return pkceEnabled(Output.of(pkceEnabled));
        }

        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        public Builder redirectUrl(String redirectUrl) {
            return redirectUrl(Output.of(redirectUrl));
        }

        public Builder signRequest(@Nullable Output<Boolean> signRequest) {
            $.signRequest = signRequest;
            return this;
        }

        public Builder signRequest(Boolean signRequest) {
            return signRequest(Output.of(signRequest));
        }

        public Builder ssoTargetUrl(@Nullable Output<String> ssoTargetUrl) {
            $.ssoTargetUrl = ssoTargetUrl;
            return this;
        }

        public Builder ssoTargetUrl(String ssoTargetUrl) {
            return ssoTargetUrl(Output.of(ssoTargetUrl));
        }

        public Builder supportGroups(@Nullable Output<Boolean> supportGroups) {
            $.supportGroups = supportGroups;
            return this;
        }

        public Builder supportGroups(Boolean supportGroups) {
            return supportGroups(Output.of(supportGroups));
        }

        public Builder tokenUrl(@Nullable Output<String> tokenUrl) {
            $.tokenUrl = tokenUrl;
            return this;
        }

        public Builder tokenUrl(String tokenUrl) {
            return tokenUrl(Output.of(tokenUrl));
        }

        public AccessIdentityProviderConfigArgs build() {
            return $;
        }
    }

}