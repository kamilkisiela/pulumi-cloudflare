// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Cloudflare Argo controls the routing to your origin and tiered caching options to speed up your website browsing experience.
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
// 		_, err := cloudflare.NewArgo(ctx, "example", &cloudflare.ArgoArgs{
// 			SmartRouting:  pulumi.String("on"),
// 			TieredCaching: pulumi.String("on"),
// 			ZoneId:        pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
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
// Argo settings can be imported the zone ID.
//
// ```sh
//  $ pulumi import cloudflare:index/argo:Argo example d41d8cd98f00b204e9800998ecf8427e
// ```
//
//  where `d41d8cd98f00b204e9800998ecf8427e` is the zone ID.
type Argo struct {
	pulumi.CustomResourceState

	// Whether smart routing is enabled. Valid values: `on` or `off`.
	SmartRouting pulumi.StringPtrOutput `pulumi:"smartRouting"`
	// Whether tiered caching is enabled. Valid values: `on` or `off`.
	TieredCaching pulumi.StringPtrOutput `pulumi:"tieredCaching"`
	// The DNS zone ID that you wish to manage Argo on.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewArgo registers a new resource with the given unique name, arguments, and options.
func NewArgo(ctx *pulumi.Context,
	name string, args *ArgoArgs, opts ...pulumi.ResourceOption) (*Argo, error) {
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &ArgoArgs{}
	}
	var resource Argo
	err := ctx.RegisterResource("cloudflare:index/argo:Argo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetArgo gets an existing Argo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetArgo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ArgoState, opts ...pulumi.ResourceOption) (*Argo, error) {
	var resource Argo
	err := ctx.ReadResource("cloudflare:index/argo:Argo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Argo resources.
type argoState struct {
	// Whether smart routing is enabled. Valid values: `on` or `off`.
	SmartRouting *string `pulumi:"smartRouting"`
	// Whether tiered caching is enabled. Valid values: `on` or `off`.
	TieredCaching *string `pulumi:"tieredCaching"`
	// The DNS zone ID that you wish to manage Argo on.
	ZoneId *string `pulumi:"zoneId"`
}

type ArgoState struct {
	// Whether smart routing is enabled. Valid values: `on` or `off`.
	SmartRouting pulumi.StringPtrInput
	// Whether tiered caching is enabled. Valid values: `on` or `off`.
	TieredCaching pulumi.StringPtrInput
	// The DNS zone ID that you wish to manage Argo on.
	ZoneId pulumi.StringPtrInput
}

func (ArgoState) ElementType() reflect.Type {
	return reflect.TypeOf((*argoState)(nil)).Elem()
}

type argoArgs struct {
	// Whether smart routing is enabled. Valid values: `on` or `off`.
	SmartRouting *string `pulumi:"smartRouting"`
	// Whether tiered caching is enabled. Valid values: `on` or `off`.
	TieredCaching *string `pulumi:"tieredCaching"`
	// The DNS zone ID that you wish to manage Argo on.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Argo resource.
type ArgoArgs struct {
	// Whether smart routing is enabled. Valid values: `on` or `off`.
	SmartRouting pulumi.StringPtrInput
	// Whether tiered caching is enabled. Valid values: `on` or `off`.
	TieredCaching pulumi.StringPtrInput
	// The DNS zone ID that you wish to manage Argo on.
	ZoneId pulumi.StringInput
}

func (ArgoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*argoArgs)(nil)).Elem()
}

type ArgoInput interface {
	pulumi.Input

	ToArgoOutput() ArgoOutput
	ToArgoOutputWithContext(ctx context.Context) ArgoOutput
}

func (Argo) ElementType() reflect.Type {
	return reflect.TypeOf((*Argo)(nil)).Elem()
}

func (i Argo) ToArgoOutput() ArgoOutput {
	return i.ToArgoOutputWithContext(context.Background())
}

func (i Argo) ToArgoOutputWithContext(ctx context.Context) ArgoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArgoOutput)
}

type ArgoOutput struct {
	*pulumi.OutputState
}

func (ArgoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ArgoOutput)(nil)).Elem()
}

func (o ArgoOutput) ToArgoOutput() ArgoOutput {
	return o
}

func (o ArgoOutput) ToArgoOutputWithContext(ctx context.Context) ArgoOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ArgoOutput{})
}
