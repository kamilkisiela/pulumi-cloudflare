// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerRouteState extends com.pulumi.resources.ResourceArgs {

    public static final WorkerRouteState Empty = new WorkerRouteState();

    /**
     * The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
     * 
     */
    @Import(name="scriptName")
    private @Nullable Output<String> scriptName;

    /**
     * @return Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
     * 
     */
    public Optional<Output<String>> scriptName() {
        return Optional.ofNullable(this.scriptName);
    }

    /**
     * The zone ID to add the route to.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone ID to add the route to.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private WorkerRouteState() {}

    private WorkerRouteState(WorkerRouteState $) {
        this.pattern = $.pattern;
        this.scriptName = $.scriptName;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerRouteState $;

        public Builder() {
            $ = new WorkerRouteState();
        }

        public Builder(WorkerRouteState defaults) {
            $ = new WorkerRouteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param scriptName Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(@Nullable Output<String> scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        /**
         * @param scriptName Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            return scriptName(Output.of(scriptName));
        }

        /**
         * @param zoneId The zone ID to add the route to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID to add the route to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public WorkerRouteState build() {
            return $;
        }
    }

}
