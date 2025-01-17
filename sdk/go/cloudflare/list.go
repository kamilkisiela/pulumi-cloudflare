// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides Lists (IPs, Redirects) to be used in Edge Rules Engine
// across all zones within the same account.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/list:List example <account_id>/<list_id>
//
// ```
type List struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// An optional description of the list.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	Items       ListItemArrayOutput    `pulumi:"items"`
	// The type of items the list will contain.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// The name of the list.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewList registers a new resource with the given unique name, arguments, and options.
func NewList(ctx *pulumi.Context,
	name string, args *ListArgs, opts ...pulumi.ResourceOption) (*List, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource List
	err := ctx.RegisterResource("cloudflare:index/list:List", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetList gets an existing List resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListState, opts ...pulumi.ResourceOption) (*List, error) {
	var resource List
	err := ctx.ReadResource("cloudflare:index/list:List", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering List resources.
type listState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// An optional description of the list.
	Description *string    `pulumi:"description"`
	Items       []ListItem `pulumi:"items"`
	// The type of items the list will contain.
	Kind *string `pulumi:"kind"`
	// The name of the list.
	Name *string `pulumi:"name"`
}

type ListState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// An optional description of the list.
	Description pulumi.StringPtrInput
	Items       ListItemArrayInput
	// The type of items the list will contain.
	Kind pulumi.StringPtrInput
	// The name of the list.
	Name pulumi.StringPtrInput
}

func (ListState) ElementType() reflect.Type {
	return reflect.TypeOf((*listState)(nil)).Elem()
}

type listArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// An optional description of the list.
	Description *string    `pulumi:"description"`
	Items       []ListItem `pulumi:"items"`
	// The type of items the list will contain.
	Kind string `pulumi:"kind"`
	// The name of the list.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a List resource.
type ListArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// An optional description of the list.
	Description pulumi.StringPtrInput
	Items       ListItemArrayInput
	// The type of items the list will contain.
	Kind pulumi.StringInput
	// The name of the list.
	Name pulumi.StringInput
}

func (ListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listArgs)(nil)).Elem()
}

type ListInput interface {
	pulumi.Input

	ToListOutput() ListOutput
	ToListOutputWithContext(ctx context.Context) ListOutput
}

func (*List) ElementType() reflect.Type {
	return reflect.TypeOf((**List)(nil)).Elem()
}

func (i *List) ToListOutput() ListOutput {
	return i.ToListOutputWithContext(context.Background())
}

func (i *List) ToListOutputWithContext(ctx context.Context) ListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListOutput)
}

// ListArrayInput is an input type that accepts ListArray and ListArrayOutput values.
// You can construct a concrete instance of `ListArrayInput` via:
//
//	ListArray{ ListArgs{...} }
type ListArrayInput interface {
	pulumi.Input

	ToListArrayOutput() ListArrayOutput
	ToListArrayOutputWithContext(context.Context) ListArrayOutput
}

type ListArray []ListInput

func (ListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*List)(nil)).Elem()
}

func (i ListArray) ToListArrayOutput() ListArrayOutput {
	return i.ToListArrayOutputWithContext(context.Background())
}

func (i ListArray) ToListArrayOutputWithContext(ctx context.Context) ListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListArrayOutput)
}

// ListMapInput is an input type that accepts ListMap and ListMapOutput values.
// You can construct a concrete instance of `ListMapInput` via:
//
//	ListMap{ "key": ListArgs{...} }
type ListMapInput interface {
	pulumi.Input

	ToListMapOutput() ListMapOutput
	ToListMapOutputWithContext(context.Context) ListMapOutput
}

type ListMap map[string]ListInput

func (ListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*List)(nil)).Elem()
}

func (i ListMap) ToListMapOutput() ListMapOutput {
	return i.ToListMapOutputWithContext(context.Background())
}

func (i ListMap) ToListMapOutputWithContext(ctx context.Context) ListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListMapOutput)
}

type ListOutput struct{ *pulumi.OutputState }

func (ListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**List)(nil)).Elem()
}

func (o ListOutput) ToListOutput() ListOutput {
	return o
}

func (o ListOutput) ToListOutputWithContext(ctx context.Context) ListOutput {
	return o
}

// The account identifier to target for the resource.
func (o ListOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *List) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// An optional description of the list.
func (o ListOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *List) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o ListOutput) Items() ListItemArrayOutput {
	return o.ApplyT(func(v *List) ListItemArrayOutput { return v.Items }).(ListItemArrayOutput)
}

// The type of items the list will contain.
func (o ListOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *List) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// The name of the list.
func (o ListOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *List) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ListArrayOutput struct{ *pulumi.OutputState }

func (ListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*List)(nil)).Elem()
}

func (o ListArrayOutput) ToListArrayOutput() ListArrayOutput {
	return o
}

func (o ListArrayOutput) ToListArrayOutputWithContext(ctx context.Context) ListArrayOutput {
	return o
}

func (o ListArrayOutput) Index(i pulumi.IntInput) ListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *List {
		return vs[0].([]*List)[vs[1].(int)]
	}).(ListOutput)
}

type ListMapOutput struct{ *pulumi.OutputState }

func (ListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*List)(nil)).Elem()
}

func (o ListMapOutput) ToListMapOutput() ListMapOutput {
	return o
}

func (o ListMapOutput) ToListMapOutputWithContext(ctx context.Context) ListMapOutput {
	return o
}

func (o ListMapOutput) MapIndex(k pulumi.StringInput) ListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *List {
		return vs[0].(map[string]*List)[vs[1].(string)]
	}).(ListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListInput)(nil)).Elem(), &List{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListArrayInput)(nil)).Elem(), ListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListMapInput)(nil)).Elem(), ListMap{})
	pulumi.RegisterOutputType(ListOutput{})
	pulumi.RegisterOutputType(ListArrayOutput{})
	pulumi.RegisterOutputType(ListMapOutput{})
}
