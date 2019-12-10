// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

let __config = new pulumi.Config("cloudflare");

/**
 * Configure API client to always use that account.
 */
export let accountId: string | undefined = __config.get("accountId") || utilities.getEnv("CLOUDFLARE_ACCOUNT_ID");
/**
 * Whether to print logs from the API client (using the default log library logger)
 */
export let apiClientLogging: boolean | undefined = __config.getObject<boolean>("apiClientLogging") || (utilities.getEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") || false);
/**
 * The API key for operations.
 */
export let apiKey: string | undefined = __config.get("apiKey") || utilities.getEnv("CLOUDFLARE_API_KEY");
/**
 * The API Token for operations.
 */
export let apiToken: string | undefined = __config.get("apiToken") || utilities.getEnv("CLOUDFLARE_API_TOKEN");
/**
 * A registered Cloudflare email address.
 */
export let email: string | undefined = __config.get("email") || utilities.getEnv("CLOUDFLARE_EMAIL");
/**
 * Maximum backoff period in seconds after failed API calls
 */
export let maxBackoff: number | undefined = __config.getObject<number>("maxBackoff") || (utilities.getEnvNumber("CLOUDFLARE_MAX_BACKOFF") || 30);
/**
 * Minimum backoff period in seconds after failed API calls
 */
export let minBackoff: number | undefined = __config.getObject<number>("minBackoff") || (utilities.getEnvNumber("CLOUDFLARE_MIN_BACKOFF") || 1);
/**
 * Maximum number of retries to perform when an API request fails
 */
export let retries: number | undefined = __config.getObject<number>("retries") || (utilities.getEnvNumber("CLOUDFLARE_RETRIES") || 3);
/**
 * RPS limit to apply when making calls to the API
 */
export let rps: number | undefined = __config.getObject<number>("rps") || (utilities.getEnvNumber("CLOUDFLARE_RPS") || 4);
