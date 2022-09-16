// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TeamsAccountAntivirusArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsAccountAntivirusArgs Empty = new TeamsAccountAntivirusArgs();

    /**
     * Scan on file download.
     * 
     */
    @Import(name="enabledDownloadPhase", required=true)
    private Output<Boolean> enabledDownloadPhase;

    /**
     * @return Scan on file download.
     * 
     */
    public Output<Boolean> enabledDownloadPhase() {
        return this.enabledDownloadPhase;
    }

    /**
     * Scan on file upload.
     * 
     */
    @Import(name="enabledUploadPhase", required=true)
    private Output<Boolean> enabledUploadPhase;

    /**
     * @return Scan on file upload.
     * 
     */
    public Output<Boolean> enabledUploadPhase() {
        return this.enabledUploadPhase;
    }

    /**
     * Block requests for files that cannot be scanned.
     * 
     */
    @Import(name="failClosed", required=true)
    private Output<Boolean> failClosed;

    /**
     * @return Block requests for files that cannot be scanned.
     * 
     */
    public Output<Boolean> failClosed() {
        return this.failClosed;
    }

    private TeamsAccountAntivirusArgs() {}

    private TeamsAccountAntivirusArgs(TeamsAccountAntivirusArgs $) {
        this.enabledDownloadPhase = $.enabledDownloadPhase;
        this.enabledUploadPhase = $.enabledUploadPhase;
        this.failClosed = $.failClosed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsAccountAntivirusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsAccountAntivirusArgs $;

        public Builder() {
            $ = new TeamsAccountAntivirusArgs();
        }

        public Builder(TeamsAccountAntivirusArgs defaults) {
            $ = new TeamsAccountAntivirusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabledDownloadPhase Scan on file download.
         * 
         * @return builder
         * 
         */
        public Builder enabledDownloadPhase(Output<Boolean> enabledDownloadPhase) {
            $.enabledDownloadPhase = enabledDownloadPhase;
            return this;
        }

        /**
         * @param enabledDownloadPhase Scan on file download.
         * 
         * @return builder
         * 
         */
        public Builder enabledDownloadPhase(Boolean enabledDownloadPhase) {
            return enabledDownloadPhase(Output.of(enabledDownloadPhase));
        }

        /**
         * @param enabledUploadPhase Scan on file upload.
         * 
         * @return builder
         * 
         */
        public Builder enabledUploadPhase(Output<Boolean> enabledUploadPhase) {
            $.enabledUploadPhase = enabledUploadPhase;
            return this;
        }

        /**
         * @param enabledUploadPhase Scan on file upload.
         * 
         * @return builder
         * 
         */
        public Builder enabledUploadPhase(Boolean enabledUploadPhase) {
            return enabledUploadPhase(Output.of(enabledUploadPhase));
        }

        /**
         * @param failClosed Block requests for files that cannot be scanned.
         * 
         * @return builder
         * 
         */
        public Builder failClosed(Output<Boolean> failClosed) {
            $.failClosed = failClosed;
            return this;
        }

        /**
         * @param failClosed Block requests for files that cannot be scanned.
         * 
         * @return builder
         * 
         */
        public Builder failClosed(Boolean failClosed) {
            return failClosed(Output.of(failClosed));
        }

        public TeamsAccountAntivirusArgs build() {
            $.enabledDownloadPhase = Objects.requireNonNull($.enabledDownloadPhase, "expected parameter 'enabledDownloadPhase' to be non-null");
            $.enabledUploadPhase = Objects.requireNonNull($.enabledUploadPhase, "expected parameter 'enabledUploadPhase' to be non-null");
            $.failClosed = Objects.requireNonNull($.failClosed, "expected parameter 'failClosed' to be non-null");
            return $;
        }
    }

}