// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare rate limit resource for a given zone. This can be used to limit the traffic you receive zone-wide, or matching more specific types of requests/responses.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.RateLimit("example", new()
    ///     {
    ///         ZoneId = @var.Cloudflare_zone_id,
    ///         Threshold = 2000,
    ///         Period = 2,
    ///         Match = new Cloudflare.Inputs.RateLimitMatchArgs
    ///         {
    ///             Request = new Cloudflare.Inputs.RateLimitMatchRequestArgs
    ///             {
    ///                 UrlPattern = $"{@var.Cloudflare_zone}/*",
    ///                 Schemes = new[]
    ///                 {
    ///                     "HTTP",
    ///                     "HTTPS",
    ///                 },
    ///                 Methods = new[]
    ///                 {
    ///                     "GET",
    ///                     "POST",
    ///                     "PUT",
    ///                     "DELETE",
    ///                     "PATCH",
    ///                     "HEAD",
    ///                 },
    ///             },
    ///             Response = new Cloudflare.Inputs.RateLimitMatchResponseArgs
    ///             {
    ///                 Statuses = new[]
    ///                 {
    ///                     200,
    ///                     201,
    ///                     202,
    ///                     301,
    ///                     429,
    ///                 },
    ///                 OriginTraffic = false,
    ///                 Headers = new[]
    ///                 {
    ///                     
    ///                     {
    ///                         { "name", "Host" },
    ///                         { "op", "eq" },
    ///                         { "value", "localhost" },
    ///                     },
    ///                     
    ///                     {
    ///                         { "name", "X-Example" },
    ///                         { "op", "ne" },
    ///                         { "value", "my-example" },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Action = new Cloudflare.Inputs.RateLimitActionArgs
    ///         {
    ///             Mode = "simulate",
    ///             Timeout = 43200,
    ///             Response = new Cloudflare.Inputs.RateLimitActionResponseArgs
    ///             {
    ///                 ContentType = "text/plain",
    ///                 Body = "custom response body",
    ///             },
    ///         },
    ///         Correlate = new Cloudflare.Inputs.RateLimitCorrelateArgs
    ///         {
    ///             By = "nat",
    ///         },
    ///         Disabled = false,
    ///         Description = "example rate limit for a zone",
    ///         BypassUrlPatterns = new[]
    ///         {
    ///             $"{@var.Cloudflare_zone}/bypass1",
    ///             $"{@var.Cloudflare_zone}/bypass2",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Rate limits can be imported using a composite ID formed of zone name and rate limit ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/rateLimit:RateLimit default d41d8cd98f00b204e9800998ecf8427e/ch8374ftwdghsif43
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/rateLimit:RateLimit")]
    public partial class RateLimit : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
        /// </summary>
        [Output("action")]
        public Output<Outputs.RateLimitAction> Action { get; private set; } = null!;

        /// <summary>
        /// URLs matching the patterns specified here will be excluded from rate limiting.
        /// </summary>
        [Output("bypassUrlPatterns")]
        public Output<ImmutableArray<string>> BypassUrlPatterns { get; private set; } = null!;

        /// <summary>
        /// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
        /// </summary>
        [Output("correlate")]
        public Output<Outputs.RateLimitCorrelate?> Correlate { get; private set; } = null!;

        /// <summary>
        /// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether this ratelimit is currently disabled. Default: `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
        /// </summary>
        [Output("match")]
        public Output<Outputs.RateLimitMatch> Match { get; private set; } = null!;

        /// <summary>
        /// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
        /// </summary>
        [Output("period")]
        public Output<int> Period { get; private set; } = null!;

        /// <summary>
        /// The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
        /// </summary>
        [Output("threshold")]
        public Output<int> Threshold { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to apply rate limiting to.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a RateLimit resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RateLimit(string name, RateLimitArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/rateLimit:RateLimit", name, args ?? new RateLimitArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RateLimit(string name, Input<string> id, RateLimitState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/rateLimit:RateLimit", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RateLimit resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RateLimit Get(string name, Input<string> id, RateLimitState? state = null, CustomResourceOptions? options = null)
        {
            return new RateLimit(name, id, state, options);
        }
    }

    public sealed class RateLimitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.RateLimitActionArgs> Action { get; set; } = null!;

        [Input("bypassUrlPatterns")]
        private InputList<string>? _bypassUrlPatterns;

        /// <summary>
        /// URLs matching the patterns specified here will be excluded from rate limiting.
        /// </summary>
        public InputList<string> BypassUrlPatterns
        {
            get => _bypassUrlPatterns ?? (_bypassUrlPatterns = new InputList<string>());
            set => _bypassUrlPatterns = value;
        }

        /// <summary>
        /// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
        /// </summary>
        [Input("correlate")]
        public Input<Inputs.RateLimitCorrelateArgs>? Correlate { get; set; }

        /// <summary>
        /// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether this ratelimit is currently disabled. Default: `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
        /// </summary>
        [Input("match")]
        public Input<Inputs.RateLimitMatchArgs>? Match { get; set; }

        /// <summary>
        /// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
        /// </summary>
        [Input("period", required: true)]
        public Input<int> Period { get; set; } = null!;

        /// <summary>
        /// The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
        /// </summary>
        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        /// <summary>
        /// The DNS zone ID to apply rate limiting to.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public RateLimitArgs()
        {
        }
        public static new RateLimitArgs Empty => new RateLimitArgs();
    }

    public sealed class RateLimitState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
        /// </summary>
        [Input("action")]
        public Input<Inputs.RateLimitActionGetArgs>? Action { get; set; }

        [Input("bypassUrlPatterns")]
        private InputList<string>? _bypassUrlPatterns;

        /// <summary>
        /// URLs matching the patterns specified here will be excluded from rate limiting.
        /// </summary>
        public InputList<string> BypassUrlPatterns
        {
            get => _bypassUrlPatterns ?? (_bypassUrlPatterns = new InputList<string>());
            set => _bypassUrlPatterns = value;
        }

        /// <summary>
        /// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
        /// </summary>
        [Input("correlate")]
        public Input<Inputs.RateLimitCorrelateGetArgs>? Correlate { get; set; }

        /// <summary>
        /// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether this ratelimit is currently disabled. Default: `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
        /// </summary>
        [Input("match")]
        public Input<Inputs.RateLimitMatchGetArgs>? Match { get; set; }

        /// <summary>
        /// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
        /// </summary>
        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        /// <summary>
        /// The DNS zone ID to apply rate limiting to.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public RateLimitState()
        {
        }
        public static new RateLimitState Empty => new RateLimitState();
    }
}
