// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Cloudflare
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly Pulumi.Config __config = new Pulumi.Config("cloudflare");

        private static readonly __Value<string?> _accountId = new __Value<string?>(() => __config.Get("accountId"));
        /// <summary>
        /// Configure API client to always use a specific account. Alternatively, can be configured using the
        /// `CLOUDFLARE_ACCOUNT_ID` environment variable.
        /// </summary>
        public static string? AccountId
        {
            get => _accountId.Get();
            set => _accountId.Set(value);
        }

        private static readonly __Value<string?> _apiBasePath = new __Value<string?>(() => __config.Get("apiBasePath"));
        /// <summary>
        /// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
        /// environment variable.
        /// </summary>
        public static string? ApiBasePath
        {
            get => _apiBasePath.Get();
            set => _apiBasePath.Set(value);
        }

        private static readonly __Value<bool?> _apiClientLogging = new __Value<bool?>(() => __config.GetBoolean("apiClientLogging") ?? Utilities.GetEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") ?? false);
        /// <summary>
        /// Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
        /// the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
        /// </summary>
        public static bool? ApiClientLogging
        {
            get => _apiClientLogging.Get();
            set => _apiClientLogging.Set(value);
        }

        private static readonly __Value<string?> _apiHostname = new __Value<string?>(() => __config.Get("apiHostname"));
        /// <summary>
        /// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
        /// environment variable.
        /// </summary>
        public static string? ApiHostname
        {
            get => _apiHostname.Get();
            set => _apiHostname.Set(value);
        }

        private static readonly __Value<string?> _apiKey = new __Value<string?>(() => __config.Get("apiKey"));
        /// <summary>
        /// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
        /// keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
        /// should be used instead.
        /// </summary>
        public static string? ApiKey
        {
            get => _apiKey.Get();
            set => _apiKey.Set(value);
        }

        private static readonly __Value<string?> _apiToken = new __Value<string?>(() => __config.Get("apiToken"));
        /// <summary>
        /// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
        /// </summary>
        public static string? ApiToken
        {
            get => _apiToken.Get();
            set => _apiToken.Set(value);
        }

        private static readonly __Value<string?> _apiUserServiceKey = new __Value<string?>(() => __config.Get("apiUserServiceKey"));
        /// <summary>
        /// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
        /// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable.
        /// </summary>
        public static string? ApiUserServiceKey
        {
            get => _apiUserServiceKey.Get();
            set => _apiUserServiceKey.Set(value);
        }

        private static readonly __Value<string?> _email = new __Value<string?>(() => __config.Get("email"));
        /// <summary>
        /// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
        /// variable.
        /// </summary>
        public static string? Email
        {
            get => _email.Get();
            set => _email.Set(value);
        }

        private static readonly __Value<int?> _maxBackoff = new __Value<int?>(() => __config.GetInt32("maxBackoff") ?? Utilities.GetEnvInt32("CLOUDFLARE_MAX_BACKOFF") ?? 30);
        /// <summary>
        /// Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
        /// `CLOUDFLARE_MAX_BACKOFF` environment variable.
        /// </summary>
        public static int? MaxBackoff
        {
            get => _maxBackoff.Get();
            set => _maxBackoff.Set(value);
        }

        private static readonly __Value<int?> _minBackoff = new __Value<int?>(() => __config.GetInt32("minBackoff") ?? Utilities.GetEnvInt32("CLOUDFLARE_MIN_BACKOFF") ?? 1);
        /// <summary>
        /// Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
        /// `CLOUDFLARE_MIN_BACKOFF` environment variable.
        /// </summary>
        public static int? MinBackoff
        {
            get => _minBackoff.Get();
            set => _minBackoff.Set(value);
        }

        private static readonly __Value<int?> _retries = new __Value<int?>(() => __config.GetInt32("retries") ?? Utilities.GetEnvInt32("CLOUDFLARE_RETRIES") ?? 3);
        /// <summary>
        /// Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
        /// `CLOUDFLARE_RETRIES` environment variable.
        /// </summary>
        public static int? Retries
        {
            get => _retries.Get();
            set => _retries.Set(value);
        }

        private static readonly __Value<int?> _rps = new __Value<int?>(() => __config.GetInt32("rps") ?? Utilities.GetEnvInt32("CLOUDFLARE_RPS") ?? 4);
        /// <summary>
        /// RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
        /// variable.
        /// </summary>
        public static int? Rps
        {
            get => _rps.Get();
            set => _rps.Set(value);
        }

    }
}
