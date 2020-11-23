// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Access Application resource. Access Applications
// are used to restrict access to a whole application using an
// authorisation gateway managed by Cloudflare.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewAccessApplication(ctx, "stagingApp", &cloudflare.AccessApplicationArgs{
// 			CorsHeaders: cloudflare.AccessApplicationCorsHeaderArray{
// 				&cloudflare.AccessApplicationCorsHeaderArgs{
// 					AllowCredentials: pulumi.Bool(true),
// 					AllowedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 						pulumi.String("POST"),
// 						pulumi.String("OPTIONS"),
// 					},
// 					AllowedOrigins: pulumi.StringArray{
// 						pulumi.String("https://example.com"),
// 					},
// 					MaxAge: pulumi.Int(10),
// 				},
// 			},
// 			Domain:          pulumi.String("staging.example.com"),
// 			Name:            pulumi.String("staging application"),
// 			SessionDuration: pulumi.String("24h"),
// 			ZoneId:          pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Access Applications can be imported using a composite ID formed of zone ID and application ID.
//
// ```sh
//  $ pulumi import cloudflare:index/accessApplication:AccessApplication staging cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
// ```
type AccessApplication struct {
	pulumi.CustomResourceState

	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayOutput `pulumi:"allowedIdps"`
	// Application Audience (AUD) Tag of the application
	Aud pulumi.StringOutput `pulumi:"aud"`
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity pulumi.BoolPtrOutput `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayOutput `pulumi:"corsHeaders"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie pulumi.BoolPtrOutput `pulumi:"enableBindingCookie"`
	// Friendly name of the Access Application.
	Name pulumi.StringOutput `pulumi:"name"`
	// How often a user will be forced to
	// re-authorise. Must be one of `0s`, `15m`, `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessApplication registers a new resource with the given unique name, arguments, and options.
func NewAccessApplication(ctx *pulumi.Context,
	name string, args *AccessApplicationArgs, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	if args == nil || args.Domain == nil {
		return nil, errors.New("missing required argument 'Domain'")
	}
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil {
		args = &AccessApplicationArgs{}
	}
	var resource AccessApplication
	err := ctx.RegisterResource("cloudflare:index/accessApplication:AccessApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessApplication gets an existing AccessApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessApplicationState, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	var resource AccessApplication
	err := ctx.ReadResource("cloudflare:index/accessApplication:AccessApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessApplication resources.
type accessApplicationState struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps []string `pulumi:"allowedIdps"`
	// Application Audience (AUD) Tag of the application
	Aud *string `pulumi:"aud"`
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders []AccessApplicationCorsHeader `pulumi:"corsHeaders"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain *string `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie *bool `pulumi:"enableBindingCookie"`
	// Friendly name of the Access Application.
	Name *string `pulumi:"name"`
	// How often a user will be forced to
	// re-authorise. Must be one of `0s`, `15m`, `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessApplicationState struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayInput
	// Application Audience (AUD) Tag of the application
	Aud pulumi.StringPtrInput
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayInput
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringPtrInput
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie pulumi.BoolPtrInput
	// Friendly name of the Access Application.
	Name pulumi.StringPtrInput
	// How often a user will be forced to
	// re-authorise. Must be one of `0s`, `15m`, `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration pulumi.StringPtrInput
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationState)(nil)).Elem()
}

type accessApplicationArgs struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps []string `pulumi:"allowedIdps"`
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders []AccessApplicationCorsHeader `pulumi:"corsHeaders"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain string `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie *bool `pulumi:"enableBindingCookie"`
	// Friendly name of the Access Application.
	Name string `pulumi:"name"`
	// How often a user will be forced to
	// re-authorise. Must be one of `0s`, `15m`, `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessApplication resource.
type AccessApplicationArgs struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayInput
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayInput
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringInput
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie pulumi.BoolPtrInput
	// Friendly name of the Access Application.
	Name pulumi.StringInput
	// How often a user will be forced to
	// re-authorise. Must be one of `0s`, `15m`, `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration pulumi.StringPtrInput
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationArgs)(nil)).Elem()
}

type AccessApplicationInput interface {
	pulumi.Input

	ToAccessApplicationOutput() AccessApplicationOutput
	ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput
}

func (AccessApplication) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessApplication)(nil)).Elem()
}

func (i AccessApplication) ToAccessApplicationOutput() AccessApplicationOutput {
	return i.ToAccessApplicationOutputWithContext(context.Background())
}

func (i AccessApplication) ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationOutput)
}

type AccessApplicationOutput struct {
	*pulumi.OutputState
}

func (AccessApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessApplicationOutput)(nil)).Elem()
}

func (o AccessApplicationOutput) ToAccessApplicationOutput() AccessApplicationOutput {
	return o
}

func (o AccessApplicationOutput) ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AccessApplicationOutput{})
}
