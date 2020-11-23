// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.
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
// 		_, err := cloudflare.NewLogpullRetention(ctx, "example", &cloudflare.LogpullRetentionArgs{
// 			Enabled: pulumi.Bool(true),
// 			ZoneId:  pulumi.String("fb54f084ca7f7b732d3d3ecbd8ef7bf2"),
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
// You can import existing Logpull Retention using the zone ID as the identifier.
//
// ```sh
//  $ pulumi import cloudflare:index/logpullRetention:LogpullRetention example fb54f084ca7f7b732d3d3ecbd8ef7bf2
// ```
type LogpullRetention struct {
	pulumi.CustomResourceState

	// Whether you wish to retain logs or not.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The zone ID to apply the log retention to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewLogpullRetention registers a new resource with the given unique name, arguments, and options.
func NewLogpullRetention(ctx *pulumi.Context,
	name string, args *LogpullRetentionArgs, opts ...pulumi.ResourceOption) (*LogpullRetention, error) {
	if args == nil || args.Enabled == nil {
		return nil, errors.New("missing required argument 'Enabled'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &LogpullRetentionArgs{}
	}
	var resource LogpullRetention
	err := ctx.RegisterResource("cloudflare:index/logpullRetention:LogpullRetention", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogpullRetention gets an existing LogpullRetention resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogpullRetention(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogpullRetentionState, opts ...pulumi.ResourceOption) (*LogpullRetention, error) {
	var resource LogpullRetention
	err := ctx.ReadResource("cloudflare:index/logpullRetention:LogpullRetention", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogpullRetention resources.
type logpullRetentionState struct {
	// Whether you wish to retain logs or not.
	Enabled *bool `pulumi:"enabled"`
	// The zone ID to apply the log retention to.
	ZoneId *string `pulumi:"zoneId"`
}

type LogpullRetentionState struct {
	// Whether you wish to retain logs or not.
	Enabled pulumi.BoolPtrInput
	// The zone ID to apply the log retention to.
	ZoneId pulumi.StringPtrInput
}

func (LogpullRetentionState) ElementType() reflect.Type {
	return reflect.TypeOf((*logpullRetentionState)(nil)).Elem()
}

type logpullRetentionArgs struct {
	// Whether you wish to retain logs or not.
	Enabled bool `pulumi:"enabled"`
	// The zone ID to apply the log retention to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogpullRetention resource.
type LogpullRetentionArgs struct {
	// Whether you wish to retain logs or not.
	Enabled pulumi.BoolInput
	// The zone ID to apply the log retention to.
	ZoneId pulumi.StringInput
}

func (LogpullRetentionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logpullRetentionArgs)(nil)).Elem()
}

type LogpullRetentionInput interface {
	pulumi.Input

	ToLogpullRetentionOutput() LogpullRetentionOutput
	ToLogpullRetentionOutputWithContext(ctx context.Context) LogpullRetentionOutput
}

func (LogpullRetention) ElementType() reflect.Type {
	return reflect.TypeOf((*LogpullRetention)(nil)).Elem()
}

func (i LogpullRetention) ToLogpullRetentionOutput() LogpullRetentionOutput {
	return i.ToLogpullRetentionOutputWithContext(context.Background())
}

func (i LogpullRetention) ToLogpullRetentionOutputWithContext(ctx context.Context) LogpullRetentionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpullRetentionOutput)
}

type LogpullRetentionOutput struct {
	*pulumi.OutputState
}

func (LogpullRetentionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LogpullRetentionOutput)(nil)).Elem()
}

func (o LogpullRetentionOutput) ToLogpullRetentionOutput() LogpullRetentionOutput {
	return o
}

func (o LogpullRetentionOutput) ToLogpullRetentionOutputWithContext(ctx context.Context) LogpullRetentionOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(LogpullRetentionOutput{})
}
