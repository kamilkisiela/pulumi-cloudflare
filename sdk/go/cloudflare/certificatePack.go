// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Certificate packs can be imported using a composite ID of the zone ID and certificate pack ID. This isn't recommended and it is advised to replace the certificate entirely instead.
//
// ```sh
//  $ pulumi import cloudflare:index/certificatePack:CertificatePack example cb029e245cfdd66dc8d2e570d5dd3322/8fda82e2-6af9-4eb2-992a-5ab65b792ef1
// ```
type CertificatePack struct {
	pulumi.CustomResourceState

	// Which certificate
	// authority to issue the certificate pack. Allowed values: `"digicert"`,
	// `"letsEncrypt"`.
	CertificateAuthority pulumi.StringPtrOutput `pulumi:"certificateAuthority"`
	// Whether or not to include
	// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
	// if set to `true`.
	CloudflareBranding pulumi.BoolPtrOutput `pulumi:"cloudflareBranding"`
	// List of hostnames to provision the certificate pack for.
	// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
	// wildcard for subdomain is available.
	Hosts pulumi.StringArrayOutput `pulumi:"hosts"`
	// Certificate pack configuration type.
	// Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
	Type pulumi.StringOutput `pulumi:"type"`
	// Which validation method to
	// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
	ValidationMethod pulumi.StringPtrOutput `pulumi:"validationMethod"`
	// How long the certificate is valid
	// for. Note: If using Let's Encrypt, this value can only be 90 days.
	// Allowed values: 14, 30, 90, 365.
	ValidityDays pulumi.IntPtrOutput `pulumi:"validityDays"`
	// The DNS zone to which the certificate pack should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCertificatePack registers a new resource with the given unique name, arguments, and options.
func NewCertificatePack(ctx *pulumi.Context,
	name string, args *CertificatePackArgs, opts ...pulumi.ResourceOption) (*CertificatePack, error) {
	if args == nil || args.Hosts == nil {
		return nil, errors.New("missing required argument 'Hosts'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &CertificatePackArgs{}
	}
	var resource CertificatePack
	err := ctx.RegisterResource("cloudflare:index/certificatePack:CertificatePack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificatePack gets an existing CertificatePack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificatePack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificatePackState, opts ...pulumi.ResourceOption) (*CertificatePack, error) {
	var resource CertificatePack
	err := ctx.ReadResource("cloudflare:index/certificatePack:CertificatePack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CertificatePack resources.
type certificatePackState struct {
	// Which certificate
	// authority to issue the certificate pack. Allowed values: `"digicert"`,
	// `"letsEncrypt"`.
	CertificateAuthority *string `pulumi:"certificateAuthority"`
	// Whether or not to include
	// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
	// if set to `true`.
	CloudflareBranding *bool `pulumi:"cloudflareBranding"`
	// List of hostnames to provision the certificate pack for.
	// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
	// wildcard for subdomain is available.
	Hosts []string `pulumi:"hosts"`
	// Certificate pack configuration type.
	// Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
	Type *string `pulumi:"type"`
	// Which validation method to
	// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
	ValidationMethod *string `pulumi:"validationMethod"`
	// How long the certificate is valid
	// for. Note: If using Let's Encrypt, this value can only be 90 days.
	// Allowed values: 14, 30, 90, 365.
	ValidityDays *int `pulumi:"validityDays"`
	// The DNS zone to which the certificate pack should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type CertificatePackState struct {
	// Which certificate
	// authority to issue the certificate pack. Allowed values: `"digicert"`,
	// `"letsEncrypt"`.
	CertificateAuthority pulumi.StringPtrInput
	// Whether or not to include
	// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
	// if set to `true`.
	CloudflareBranding pulumi.BoolPtrInput
	// List of hostnames to provision the certificate pack for.
	// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
	// wildcard for subdomain is available.
	Hosts pulumi.StringArrayInput
	// Certificate pack configuration type.
	// Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
	Type pulumi.StringPtrInput
	// Which validation method to
	// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
	ValidationMethod pulumi.StringPtrInput
	// How long the certificate is valid
	// for. Note: If using Let's Encrypt, this value can only be 90 days.
	// Allowed values: 14, 30, 90, 365.
	ValidityDays pulumi.IntPtrInput
	// The DNS zone to which the certificate pack should be added.
	ZoneId pulumi.StringPtrInput
}

func (CertificatePackState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificatePackState)(nil)).Elem()
}

type certificatePackArgs struct {
	// Which certificate
	// authority to issue the certificate pack. Allowed values: `"digicert"`,
	// `"letsEncrypt"`.
	CertificateAuthority *string `pulumi:"certificateAuthority"`
	// Whether or not to include
	// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
	// if set to `true`.
	CloudflareBranding *bool `pulumi:"cloudflareBranding"`
	// List of hostnames to provision the certificate pack for.
	// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
	// wildcard for subdomain is available.
	Hosts []string `pulumi:"hosts"`
	// Certificate pack configuration type.
	// Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
	Type string `pulumi:"type"`
	// Which validation method to
	// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
	ValidationMethod *string `pulumi:"validationMethod"`
	// How long the certificate is valid
	// for. Note: If using Let's Encrypt, this value can only be 90 days.
	// Allowed values: 14, 30, 90, 365.
	ValidityDays *int `pulumi:"validityDays"`
	// The DNS zone to which the certificate pack should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a CertificatePack resource.
type CertificatePackArgs struct {
	// Which certificate
	// authority to issue the certificate pack. Allowed values: `"digicert"`,
	// `"letsEncrypt"`.
	CertificateAuthority pulumi.StringPtrInput
	// Whether or not to include
	// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
	// if set to `true`.
	CloudflareBranding pulumi.BoolPtrInput
	// List of hostnames to provision the certificate pack for.
	// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
	// wildcard for subdomain is available.
	Hosts pulumi.StringArrayInput
	// Certificate pack configuration type.
	// Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
	Type pulumi.StringInput
	// Which validation method to
	// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
	ValidationMethod pulumi.StringPtrInput
	// How long the certificate is valid
	// for. Note: If using Let's Encrypt, this value can only be 90 days.
	// Allowed values: 14, 30, 90, 365.
	ValidityDays pulumi.IntPtrInput
	// The DNS zone to which the certificate pack should be added.
	ZoneId pulumi.StringInput
}

func (CertificatePackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificatePackArgs)(nil)).Elem()
}

type CertificatePackInput interface {
	pulumi.Input

	ToCertificatePackOutput() CertificatePackOutput
	ToCertificatePackOutputWithContext(ctx context.Context) CertificatePackOutput
}

func (CertificatePack) ElementType() reflect.Type {
	return reflect.TypeOf((*CertificatePack)(nil)).Elem()
}

func (i CertificatePack) ToCertificatePackOutput() CertificatePackOutput {
	return i.ToCertificatePackOutputWithContext(context.Background())
}

func (i CertificatePack) ToCertificatePackOutputWithContext(ctx context.Context) CertificatePackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificatePackOutput)
}

type CertificatePackOutput struct {
	*pulumi.OutputState
}

func (CertificatePackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CertificatePackOutput)(nil)).Elem()
}

func (o CertificatePackOutput) ToCertificatePackOutput() CertificatePackOutput {
	return o
}

func (o CertificatePackOutput) ToCertificatePackOutputWithContext(ctx context.Context) CertificatePackOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(CertificatePackOutput{})
}
