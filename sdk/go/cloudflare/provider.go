// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the cloudflare package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// Configure API client to always use a specific account. Alternatively, can be configured using the
	// `CLOUDFLARE_ACCOUNT_ID` environment variable.
	//
	// Deprecated: Use resource specific `account_id` attributes instead.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
	// environment variable.
	ApiBasePath pulumi.StringPtrOutput `pulumi:"apiBasePath"`
	// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
	// environment variable.
	ApiHostname pulumi.StringPtrOutput `pulumi:"apiHostname"`
	// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
	// keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
	// should be used instead.
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
	ApiToken pulumi.StringPtrOutput `pulumi:"apiToken"`
	// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
	// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable.
	ApiUserServiceKey pulumi.StringPtrOutput `pulumi:"apiUserServiceKey"`
	// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
	// variable.
	Email pulumi.StringPtrOutput `pulumi:"email"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if isZero(args.ApiClientLogging) {
		args.ApiClientLogging = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "CLOUDFLARE_API_CLIENT_LOGGING").(bool))
	}
	if isZero(args.MaxBackoff) {
		args.MaxBackoff = pulumi.IntPtr(getEnvOrDefault(30, parseEnvInt, "CLOUDFLARE_MAX_BACKOFF").(int))
	}
	if isZero(args.MinBackoff) {
		args.MinBackoff = pulumi.IntPtr(getEnvOrDefault(1, parseEnvInt, "CLOUDFLARE_MIN_BACKOFF").(int))
	}
	if isZero(args.Retries) {
		args.Retries = pulumi.IntPtr(getEnvOrDefault(3, parseEnvInt, "CLOUDFLARE_RETRIES").(int))
	}
	if isZero(args.Rps) {
		args.Rps = pulumi.IntPtr(getEnvOrDefault(4, parseEnvInt, "CLOUDFLARE_RPS").(int))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:cloudflare", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Configure API client to always use a specific account. Alternatively, can be configured using the
	// `CLOUDFLARE_ACCOUNT_ID` environment variable.
	//
	// Deprecated: Use resource specific `account_id` attributes instead.
	AccountId *string `pulumi:"accountId"`
	// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
	// environment variable.
	ApiBasePath *string `pulumi:"apiBasePath"`
	// Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
	// the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
	ApiClientLogging *bool `pulumi:"apiClientLogging"`
	// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
	// environment variable.
	ApiHostname *string `pulumi:"apiHostname"`
	// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
	// keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
	// should be used instead.
	ApiKey *string `pulumi:"apiKey"`
	// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
	ApiToken *string `pulumi:"apiToken"`
	// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
	// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable.
	ApiUserServiceKey *string `pulumi:"apiUserServiceKey"`
	// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
	// variable.
	Email *string `pulumi:"email"`
	// Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MAX_BACKOFF` environment variable.
	MaxBackoff *int `pulumi:"maxBackoff"`
	// Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MIN_BACKOFF` environment variable.
	MinBackoff *int `pulumi:"minBackoff"`
	// Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
	// `CLOUDFLARE_RETRIES` environment variable.
	Retries *int `pulumi:"retries"`
	// RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
	// variable.
	Rps *int `pulumi:"rps"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Configure API client to always use a specific account. Alternatively, can be configured using the
	// `CLOUDFLARE_ACCOUNT_ID` environment variable.
	//
	// Deprecated: Use resource specific `account_id` attributes instead.
	AccountId pulumi.StringPtrInput
	// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
	// environment variable.
	ApiBasePath pulumi.StringPtrInput
	// Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
	// the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
	ApiClientLogging pulumi.BoolPtrInput
	// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
	// environment variable.
	ApiHostname pulumi.StringPtrInput
	// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
	// keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
	// should be used instead.
	ApiKey pulumi.StringPtrInput
	// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
	ApiToken pulumi.StringPtrInput
	// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
	// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable.
	ApiUserServiceKey pulumi.StringPtrInput
	// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
	// variable.
	Email pulumi.StringPtrInput
	// Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MAX_BACKOFF` environment variable.
	MaxBackoff pulumi.IntPtrInput
	// Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MIN_BACKOFF` environment variable.
	MinBackoff pulumi.IntPtrInput
	// Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
	// `CLOUDFLARE_RETRIES` environment variable.
	Retries pulumi.IntPtrInput
	// RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
	// variable.
	Rps pulumi.IntPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// Configure API client to always use a specific account. Alternatively, can be configured using the
// `CLOUDFLARE_ACCOUNT_ID` environment variable.
//
// Deprecated: Use resource specific `account_id` attributes instead.
func (o ProviderOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
// environment variable.
func (o ProviderOutput) ApiBasePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiBasePath }).(pulumi.StringPtrOutput)
}

// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
// environment variable.
func (o ProviderOutput) ApiHostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiHostname }).(pulumi.StringPtrOutput)
}

// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
// keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
// should be used instead.
func (o ProviderOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
func (o ProviderOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable.
func (o ProviderOutput) ApiUserServiceKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiUserServiceKey }).(pulumi.StringPtrOutput)
}

// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
// variable.
func (o ProviderOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
