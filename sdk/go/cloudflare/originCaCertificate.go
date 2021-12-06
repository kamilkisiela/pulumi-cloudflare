// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.
//
// **This resource requires you use your Origin CA Key as the `apiUserServiceKey`, in conjunction with an `apiToken` or `email` and `apiKey`.**
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi-tls/sdk/v4/go/tls"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		examplePrivateKey, err := tls.NewPrivateKey(ctx, "examplePrivateKey", &tls.PrivateKeyArgs{
// 			Algorithm: pulumi.String("RSA"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleCertRequest, err := tls.NewCertRequest(ctx, "exampleCertRequest", &tls.CertRequestArgs{
// 			KeyAlgorithm:  examplePrivateKey.Algorithm,
// 			PrivateKeyPem: examplePrivateKey.PrivateKeyPem,
// 			Subjects: CertRequestSubjectArray{
// 				&CertRequestSubjectArgs{
// 					CommonName:   pulumi.String(""),
// 					Organization: pulumi.String("Terraform Test"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewOriginCaCertificate(ctx, "exampleOriginCaCertificate", &cloudflare.OriginCaCertificateArgs{
// 			Csr: exampleCertRequest.CertRequestPem,
// 			Hostnames: pulumi.StringArray{
// 				pulumi.String("example.com"),
// 			},
// 			RequestType:       pulumi.String("origin-rsa"),
// 			RequestedValidity: pulumi.Int(7),
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
// Origin CA certificate resource can be imported using an ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/originCaCertificate:OriginCaCertificate example 276266538771611802607153687288146423901027769273
// ```
type OriginCaCertificate struct {
	pulumi.CustomResourceState

	// The Origin CA certificate
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// The Certificate Signing Request. Must be newline-encoded.
	Csr pulumi.StringPtrOutput `pulumi:"csr"`
	// The datetime when the certificate will expire.
	ExpiresOn pulumi.StringOutput `pulumi:"expiresOn"`
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames pulumi.StringArrayOutput `pulumi:"hostnames"`
	// The signature type desired on the certificate.
	RequestType pulumi.StringOutput `pulumi:"requestType"`
	// The number of days for which the certificate should be valid.
	RequestedValidity pulumi.IntPtrOutput `pulumi:"requestedValidity"`
}

// NewOriginCaCertificate registers a new resource with the given unique name, arguments, and options.
func NewOriginCaCertificate(ctx *pulumi.Context,
	name string, args *OriginCaCertificateArgs, opts ...pulumi.ResourceOption) (*OriginCaCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hostnames == nil {
		return nil, errors.New("invalid value for required argument 'Hostnames'")
	}
	if args.RequestType == nil {
		return nil, errors.New("invalid value for required argument 'RequestType'")
	}
	var resource OriginCaCertificate
	err := ctx.RegisterResource("cloudflare:index/originCaCertificate:OriginCaCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOriginCaCertificate gets an existing OriginCaCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOriginCaCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OriginCaCertificateState, opts ...pulumi.ResourceOption) (*OriginCaCertificate, error) {
	var resource OriginCaCertificate
	err := ctx.ReadResource("cloudflare:index/originCaCertificate:OriginCaCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OriginCaCertificate resources.
type originCaCertificateState struct {
	// The Origin CA certificate
	Certificate *string `pulumi:"certificate"`
	// The Certificate Signing Request. Must be newline-encoded.
	Csr *string `pulumi:"csr"`
	// The datetime when the certificate will expire.
	ExpiresOn *string `pulumi:"expiresOn"`
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames []string `pulumi:"hostnames"`
	// The signature type desired on the certificate.
	RequestType *string `pulumi:"requestType"`
	// The number of days for which the certificate should be valid.
	RequestedValidity *int `pulumi:"requestedValidity"`
}

type OriginCaCertificateState struct {
	// The Origin CA certificate
	Certificate pulumi.StringPtrInput
	// The Certificate Signing Request. Must be newline-encoded.
	Csr pulumi.StringPtrInput
	// The datetime when the certificate will expire.
	ExpiresOn pulumi.StringPtrInput
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames pulumi.StringArrayInput
	// The signature type desired on the certificate.
	RequestType pulumi.StringPtrInput
	// The number of days for which the certificate should be valid.
	RequestedValidity pulumi.IntPtrInput
}

func (OriginCaCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*originCaCertificateState)(nil)).Elem()
}

type originCaCertificateArgs struct {
	// The Certificate Signing Request. Must be newline-encoded.
	Csr *string `pulumi:"csr"`
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames []string `pulumi:"hostnames"`
	// The signature type desired on the certificate.
	RequestType string `pulumi:"requestType"`
	// The number of days for which the certificate should be valid.
	RequestedValidity *int `pulumi:"requestedValidity"`
}

// The set of arguments for constructing a OriginCaCertificate resource.
type OriginCaCertificateArgs struct {
	// The Certificate Signing Request. Must be newline-encoded.
	Csr pulumi.StringPtrInput
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames pulumi.StringArrayInput
	// The signature type desired on the certificate.
	RequestType pulumi.StringInput
	// The number of days for which the certificate should be valid.
	RequestedValidity pulumi.IntPtrInput
}

func (OriginCaCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*originCaCertificateArgs)(nil)).Elem()
}

type OriginCaCertificateInput interface {
	pulumi.Input

	ToOriginCaCertificateOutput() OriginCaCertificateOutput
	ToOriginCaCertificateOutputWithContext(ctx context.Context) OriginCaCertificateOutput
}

func (*OriginCaCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((*OriginCaCertificate)(nil))
}

func (i *OriginCaCertificate) ToOriginCaCertificateOutput() OriginCaCertificateOutput {
	return i.ToOriginCaCertificateOutputWithContext(context.Background())
}

func (i *OriginCaCertificate) ToOriginCaCertificateOutputWithContext(ctx context.Context) OriginCaCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginCaCertificateOutput)
}

func (i *OriginCaCertificate) ToOriginCaCertificatePtrOutput() OriginCaCertificatePtrOutput {
	return i.ToOriginCaCertificatePtrOutputWithContext(context.Background())
}

func (i *OriginCaCertificate) ToOriginCaCertificatePtrOutputWithContext(ctx context.Context) OriginCaCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginCaCertificatePtrOutput)
}

type OriginCaCertificatePtrInput interface {
	pulumi.Input

	ToOriginCaCertificatePtrOutput() OriginCaCertificatePtrOutput
	ToOriginCaCertificatePtrOutputWithContext(ctx context.Context) OriginCaCertificatePtrOutput
}

type originCaCertificatePtrType OriginCaCertificateArgs

func (*originCaCertificatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**OriginCaCertificate)(nil))
}

func (i *originCaCertificatePtrType) ToOriginCaCertificatePtrOutput() OriginCaCertificatePtrOutput {
	return i.ToOriginCaCertificatePtrOutputWithContext(context.Background())
}

func (i *originCaCertificatePtrType) ToOriginCaCertificatePtrOutputWithContext(ctx context.Context) OriginCaCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginCaCertificatePtrOutput)
}

// OriginCaCertificateArrayInput is an input type that accepts OriginCaCertificateArray and OriginCaCertificateArrayOutput values.
// You can construct a concrete instance of `OriginCaCertificateArrayInput` via:
//
//          OriginCaCertificateArray{ OriginCaCertificateArgs{...} }
type OriginCaCertificateArrayInput interface {
	pulumi.Input

	ToOriginCaCertificateArrayOutput() OriginCaCertificateArrayOutput
	ToOriginCaCertificateArrayOutputWithContext(context.Context) OriginCaCertificateArrayOutput
}

type OriginCaCertificateArray []OriginCaCertificateInput

func (OriginCaCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OriginCaCertificate)(nil)).Elem()
}

func (i OriginCaCertificateArray) ToOriginCaCertificateArrayOutput() OriginCaCertificateArrayOutput {
	return i.ToOriginCaCertificateArrayOutputWithContext(context.Background())
}

func (i OriginCaCertificateArray) ToOriginCaCertificateArrayOutputWithContext(ctx context.Context) OriginCaCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginCaCertificateArrayOutput)
}

// OriginCaCertificateMapInput is an input type that accepts OriginCaCertificateMap and OriginCaCertificateMapOutput values.
// You can construct a concrete instance of `OriginCaCertificateMapInput` via:
//
//          OriginCaCertificateMap{ "key": OriginCaCertificateArgs{...} }
type OriginCaCertificateMapInput interface {
	pulumi.Input

	ToOriginCaCertificateMapOutput() OriginCaCertificateMapOutput
	ToOriginCaCertificateMapOutputWithContext(context.Context) OriginCaCertificateMapOutput
}

type OriginCaCertificateMap map[string]OriginCaCertificateInput

func (OriginCaCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OriginCaCertificate)(nil)).Elem()
}

func (i OriginCaCertificateMap) ToOriginCaCertificateMapOutput() OriginCaCertificateMapOutput {
	return i.ToOriginCaCertificateMapOutputWithContext(context.Background())
}

func (i OriginCaCertificateMap) ToOriginCaCertificateMapOutputWithContext(ctx context.Context) OriginCaCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OriginCaCertificateMapOutput)
}

type OriginCaCertificateOutput struct{ *pulumi.OutputState }

func (OriginCaCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*OriginCaCertificate)(nil))
}

func (o OriginCaCertificateOutput) ToOriginCaCertificateOutput() OriginCaCertificateOutput {
	return o
}

func (o OriginCaCertificateOutput) ToOriginCaCertificateOutputWithContext(ctx context.Context) OriginCaCertificateOutput {
	return o
}

func (o OriginCaCertificateOutput) ToOriginCaCertificatePtrOutput() OriginCaCertificatePtrOutput {
	return o.ToOriginCaCertificatePtrOutputWithContext(context.Background())
}

func (o OriginCaCertificateOutput) ToOriginCaCertificatePtrOutputWithContext(ctx context.Context) OriginCaCertificatePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v OriginCaCertificate) *OriginCaCertificate {
		return &v
	}).(OriginCaCertificatePtrOutput)
}

type OriginCaCertificatePtrOutput struct{ *pulumi.OutputState }

func (OriginCaCertificatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OriginCaCertificate)(nil))
}

func (o OriginCaCertificatePtrOutput) ToOriginCaCertificatePtrOutput() OriginCaCertificatePtrOutput {
	return o
}

func (o OriginCaCertificatePtrOutput) ToOriginCaCertificatePtrOutputWithContext(ctx context.Context) OriginCaCertificatePtrOutput {
	return o
}

func (o OriginCaCertificatePtrOutput) Elem() OriginCaCertificateOutput {
	return o.ApplyT(func(v *OriginCaCertificate) OriginCaCertificate {
		if v != nil {
			return *v
		}
		var ret OriginCaCertificate
		return ret
	}).(OriginCaCertificateOutput)
}

type OriginCaCertificateArrayOutput struct{ *pulumi.OutputState }

func (OriginCaCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]OriginCaCertificate)(nil))
}

func (o OriginCaCertificateArrayOutput) ToOriginCaCertificateArrayOutput() OriginCaCertificateArrayOutput {
	return o
}

func (o OriginCaCertificateArrayOutput) ToOriginCaCertificateArrayOutputWithContext(ctx context.Context) OriginCaCertificateArrayOutput {
	return o
}

func (o OriginCaCertificateArrayOutput) Index(i pulumi.IntInput) OriginCaCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) OriginCaCertificate {
		return vs[0].([]OriginCaCertificate)[vs[1].(int)]
	}).(OriginCaCertificateOutput)
}

type OriginCaCertificateMapOutput struct{ *pulumi.OutputState }

func (OriginCaCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]OriginCaCertificate)(nil))
}

func (o OriginCaCertificateMapOutput) ToOriginCaCertificateMapOutput() OriginCaCertificateMapOutput {
	return o
}

func (o OriginCaCertificateMapOutput) ToOriginCaCertificateMapOutputWithContext(ctx context.Context) OriginCaCertificateMapOutput {
	return o
}

func (o OriginCaCertificateMapOutput) MapIndex(k pulumi.StringInput) OriginCaCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) OriginCaCertificate {
		return vs[0].(map[string]OriginCaCertificate)[vs[1].(string)]
	}).(OriginCaCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OriginCaCertificateInput)(nil)).Elem(), &OriginCaCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*OriginCaCertificatePtrInput)(nil)).Elem(), &OriginCaCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*OriginCaCertificateArrayInput)(nil)).Elem(), OriginCaCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OriginCaCertificateMapInput)(nil)).Elem(), OriginCaCertificateMap{})
	pulumi.RegisterOutputType(OriginCaCertificateOutput{})
	pulumi.RegisterOutputType(OriginCaCertificatePtrOutput{})
	pulumi.RegisterOutputType(OriginCaCertificateArrayOutput{})
	pulumi.RegisterOutputType(OriginCaCertificateMapOutput{})
}
