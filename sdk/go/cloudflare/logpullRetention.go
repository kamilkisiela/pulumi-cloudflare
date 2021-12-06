// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
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

func (*LogpullRetention) ElementType() reflect.Type {
	return reflect.TypeOf((*LogpullRetention)(nil))
}

func (i *LogpullRetention) ToLogpullRetentionOutput() LogpullRetentionOutput {
	return i.ToLogpullRetentionOutputWithContext(context.Background())
}

func (i *LogpullRetention) ToLogpullRetentionOutputWithContext(ctx context.Context) LogpullRetentionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpullRetentionOutput)
}

func (i *LogpullRetention) ToLogpullRetentionPtrOutput() LogpullRetentionPtrOutput {
	return i.ToLogpullRetentionPtrOutputWithContext(context.Background())
}

func (i *LogpullRetention) ToLogpullRetentionPtrOutputWithContext(ctx context.Context) LogpullRetentionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpullRetentionPtrOutput)
}

type LogpullRetentionPtrInput interface {
	pulumi.Input

	ToLogpullRetentionPtrOutput() LogpullRetentionPtrOutput
	ToLogpullRetentionPtrOutputWithContext(ctx context.Context) LogpullRetentionPtrOutput
}

type logpullRetentionPtrType LogpullRetentionArgs

func (*logpullRetentionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpullRetention)(nil))
}

func (i *logpullRetentionPtrType) ToLogpullRetentionPtrOutput() LogpullRetentionPtrOutput {
	return i.ToLogpullRetentionPtrOutputWithContext(context.Background())
}

func (i *logpullRetentionPtrType) ToLogpullRetentionPtrOutputWithContext(ctx context.Context) LogpullRetentionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpullRetentionPtrOutput)
}

// LogpullRetentionArrayInput is an input type that accepts LogpullRetentionArray and LogpullRetentionArrayOutput values.
// You can construct a concrete instance of `LogpullRetentionArrayInput` via:
//
//          LogpullRetentionArray{ LogpullRetentionArgs{...} }
type LogpullRetentionArrayInput interface {
	pulumi.Input

	ToLogpullRetentionArrayOutput() LogpullRetentionArrayOutput
	ToLogpullRetentionArrayOutputWithContext(context.Context) LogpullRetentionArrayOutput
}

type LogpullRetentionArray []LogpullRetentionInput

func (LogpullRetentionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpullRetention)(nil)).Elem()
}

func (i LogpullRetentionArray) ToLogpullRetentionArrayOutput() LogpullRetentionArrayOutput {
	return i.ToLogpullRetentionArrayOutputWithContext(context.Background())
}

func (i LogpullRetentionArray) ToLogpullRetentionArrayOutputWithContext(ctx context.Context) LogpullRetentionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpullRetentionArrayOutput)
}

// LogpullRetentionMapInput is an input type that accepts LogpullRetentionMap and LogpullRetentionMapOutput values.
// You can construct a concrete instance of `LogpullRetentionMapInput` via:
//
//          LogpullRetentionMap{ "key": LogpullRetentionArgs{...} }
type LogpullRetentionMapInput interface {
	pulumi.Input

	ToLogpullRetentionMapOutput() LogpullRetentionMapOutput
	ToLogpullRetentionMapOutputWithContext(context.Context) LogpullRetentionMapOutput
}

type LogpullRetentionMap map[string]LogpullRetentionInput

func (LogpullRetentionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpullRetention)(nil)).Elem()
}

func (i LogpullRetentionMap) ToLogpullRetentionMapOutput() LogpullRetentionMapOutput {
	return i.ToLogpullRetentionMapOutputWithContext(context.Background())
}

func (i LogpullRetentionMap) ToLogpullRetentionMapOutputWithContext(ctx context.Context) LogpullRetentionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpullRetentionMapOutput)
}

type LogpullRetentionOutput struct{ *pulumi.OutputState }

func (LogpullRetentionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LogpullRetention)(nil))
}

func (o LogpullRetentionOutput) ToLogpullRetentionOutput() LogpullRetentionOutput {
	return o
}

func (o LogpullRetentionOutput) ToLogpullRetentionOutputWithContext(ctx context.Context) LogpullRetentionOutput {
	return o
}

func (o LogpullRetentionOutput) ToLogpullRetentionPtrOutput() LogpullRetentionPtrOutput {
	return o.ToLogpullRetentionPtrOutputWithContext(context.Background())
}

func (o LogpullRetentionOutput) ToLogpullRetentionPtrOutputWithContext(ctx context.Context) LogpullRetentionPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v LogpullRetention) *LogpullRetention {
		return &v
	}).(LogpullRetentionPtrOutput)
}

type LogpullRetentionPtrOutput struct{ *pulumi.OutputState }

func (LogpullRetentionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpullRetention)(nil))
}

func (o LogpullRetentionPtrOutput) ToLogpullRetentionPtrOutput() LogpullRetentionPtrOutput {
	return o
}

func (o LogpullRetentionPtrOutput) ToLogpullRetentionPtrOutputWithContext(ctx context.Context) LogpullRetentionPtrOutput {
	return o
}

func (o LogpullRetentionPtrOutput) Elem() LogpullRetentionOutput {
	return o.ApplyT(func(v *LogpullRetention) LogpullRetention {
		if v != nil {
			return *v
		}
		var ret LogpullRetention
		return ret
	}).(LogpullRetentionOutput)
}

type LogpullRetentionArrayOutput struct{ *pulumi.OutputState }

func (LogpullRetentionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LogpullRetention)(nil))
}

func (o LogpullRetentionArrayOutput) ToLogpullRetentionArrayOutput() LogpullRetentionArrayOutput {
	return o
}

func (o LogpullRetentionArrayOutput) ToLogpullRetentionArrayOutputWithContext(ctx context.Context) LogpullRetentionArrayOutput {
	return o
}

func (o LogpullRetentionArrayOutput) Index(i pulumi.IntInput) LogpullRetentionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LogpullRetention {
		return vs[0].([]LogpullRetention)[vs[1].(int)]
	}).(LogpullRetentionOutput)
}

type LogpullRetentionMapOutput struct{ *pulumi.OutputState }

func (LogpullRetentionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LogpullRetention)(nil))
}

func (o LogpullRetentionMapOutput) ToLogpullRetentionMapOutput() LogpullRetentionMapOutput {
	return o
}

func (o LogpullRetentionMapOutput) ToLogpullRetentionMapOutputWithContext(ctx context.Context) LogpullRetentionMapOutput {
	return o
}

func (o LogpullRetentionMapOutput) MapIndex(k pulumi.StringInput) LogpullRetentionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LogpullRetention {
		return vs[0].(map[string]LogpullRetention)[vs[1].(string)]
	}).(LogpullRetentionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogpullRetentionInput)(nil)).Elem(), &LogpullRetention{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpullRetentionPtrInput)(nil)).Elem(), &LogpullRetention{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpullRetentionArrayInput)(nil)).Elem(), LogpullRetentionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpullRetentionMapInput)(nil)).Elem(), LogpullRetentionMap{})
	pulumi.RegisterOutputType(LogpullRetentionOutput{})
	pulumi.RegisterOutputType(LogpullRetentionPtrOutput{})
	pulumi.RegisterOutputType(LogpullRetentionArrayOutput{})
	pulumi.RegisterOutputType(LogpullRetentionMapOutput{})
}
