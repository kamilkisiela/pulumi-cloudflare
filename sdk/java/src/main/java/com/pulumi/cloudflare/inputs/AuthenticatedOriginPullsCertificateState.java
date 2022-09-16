// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticatedOriginPullsCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticatedOriginPullsCertificateState Empty = new AuthenticatedOriginPullsCertificateState();

    /**
     * The public client certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The public client certificate.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="expiresOn")
    private @Nullable Output<String> expiresOn;

    public Optional<Output<String>> expiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }

    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * The private key of the client certificate.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The private key of the client certificate.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    @Import(name="signature")
    private @Nullable Output<String> signature;

    public Optional<Output<String>> signature() {
        return Optional.ofNullable(this.signature);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The form of Authenticated Origin Pulls to upload the certificate to.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The form of Authenticated Origin Pulls to upload the certificate to.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="uploadedOn")
    private @Nullable Output<String> uploadedOn;

    public Optional<Output<String>> uploadedOn() {
        return Optional.ofNullable(this.uploadedOn);
    }

    /**
     * The zone ID to upload the certificate to.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone ID to upload the certificate to.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AuthenticatedOriginPullsCertificateState() {}

    private AuthenticatedOriginPullsCertificateState(AuthenticatedOriginPullsCertificateState $) {
        this.certificate = $.certificate;
        this.expiresOn = $.expiresOn;
        this.issuer = $.issuer;
        this.privateKey = $.privateKey;
        this.serialNumber = $.serialNumber;
        this.signature = $.signature;
        this.status = $.status;
        this.type = $.type;
        this.uploadedOn = $.uploadedOn;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticatedOriginPullsCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticatedOriginPullsCertificateState $;

        public Builder() {
            $ = new AuthenticatedOriginPullsCertificateState();
        }

        public Builder(AuthenticatedOriginPullsCertificateState defaults) {
            $ = new AuthenticatedOriginPullsCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The public client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The public client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder expiresOn(@Nullable Output<String> expiresOn) {
            $.expiresOn = expiresOn;
            return this;
        }

        public Builder expiresOn(String expiresOn) {
            return expiresOn(Output.of(expiresOn));
        }

        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param privateKey The private key of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The private key of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        public Builder signature(@Nullable Output<String> signature) {
            $.signature = signature;
            return this;
        }

        public Builder signature(String signature) {
            return signature(Output.of(signature));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type The form of Authenticated Origin Pulls to upload the certificate to.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The form of Authenticated Origin Pulls to upload the certificate to.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder uploadedOn(@Nullable Output<String> uploadedOn) {
            $.uploadedOn = uploadedOn;
            return this;
        }

        public Builder uploadedOn(String uploadedOn) {
            return uploadedOn(Output.of(uploadedOn));
        }

        /**
         * @param zoneId The zone ID to upload the certificate to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID to upload the certificate to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AuthenticatedOriginPullsCertificateState build() {
            return $;
        }
    }

}