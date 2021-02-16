// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a resource which manages Cloudflare account members.
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
// 		_, err := cloudflare.NewAccountMember(ctx, "exampleUser", &cloudflare.AccountMemberArgs{
// 			EmailAddress: pulumi.String("user@example.com"),
// 			RoleIds: pulumi.StringArray{
// 				pulumi.String("68b329da9893e34099c7d8ad5cb9c940"),
// 				pulumi.String("d784fa8b6d98d27699781bd9a7cf19f0"),
// 			},
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
// Account members can be imported using a composite ID formed of account ID and account member ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/accountMember:AccountMember example_user d41d8cd98f00b204e9800998ecf8427e/b58c6f14d292556214bd64909bcdb118
// ```
//
//  where* `d41d8cd98f00b204e9800998ecf8427e` - account ID as returned by the [API](https://api.cloudflare.com/#accounts-account-details) * `b58c6f14d292556214bd64909bcdb118` - account member ID as returned by the [API](https://api.cloudflare.com/#account-members-member-details)
type AccountMember struct {
	pulumi.CustomResourceState

	// The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
	EmailAddress pulumi.StringOutput `pulumi:"emailAddress"`
	// Array of account role IDs that you want to assign to a member.
	RoleIds pulumi.StringArrayOutput `pulumi:"roleIds"`
}

// NewAccountMember registers a new resource with the given unique name, arguments, and options.
func NewAccountMember(ctx *pulumi.Context,
	name string, args *AccountMemberArgs, opts ...pulumi.ResourceOption) (*AccountMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EmailAddress == nil {
		return nil, errors.New("invalid value for required argument 'EmailAddress'")
	}
	if args.RoleIds == nil {
		return nil, errors.New("invalid value for required argument 'RoleIds'")
	}
	var resource AccountMember
	err := ctx.RegisterResource("cloudflare:index/accountMember:AccountMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountMember gets an existing AccountMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountMemberState, opts ...pulumi.ResourceOption) (*AccountMember, error) {
	var resource AccountMember
	err := ctx.ReadResource("cloudflare:index/accountMember:AccountMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountMember resources.
type accountMemberState struct {
	// The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
	EmailAddress *string `pulumi:"emailAddress"`
	// Array of account role IDs that you want to assign to a member.
	RoleIds []string `pulumi:"roleIds"`
}

type AccountMemberState struct {
	// The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
	EmailAddress pulumi.StringPtrInput
	// Array of account role IDs that you want to assign to a member.
	RoleIds pulumi.StringArrayInput
}

func (AccountMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountMemberState)(nil)).Elem()
}

type accountMemberArgs struct {
	// The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
	EmailAddress string `pulumi:"emailAddress"`
	// Array of account role IDs that you want to assign to a member.
	RoleIds []string `pulumi:"roleIds"`
}

// The set of arguments for constructing a AccountMember resource.
type AccountMemberArgs struct {
	// The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
	EmailAddress pulumi.StringInput
	// Array of account role IDs that you want to assign to a member.
	RoleIds pulumi.StringArrayInput
}

func (AccountMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountMemberArgs)(nil)).Elem()
}

type AccountMemberInput interface {
	pulumi.Input

	ToAccountMemberOutput() AccountMemberOutput
	ToAccountMemberOutputWithContext(ctx context.Context) AccountMemberOutput
}

func (*AccountMember) ElementType() reflect.Type {
	return reflect.TypeOf((*AccountMember)(nil))
}

func (i *AccountMember) ToAccountMemberOutput() AccountMemberOutput {
	return i.ToAccountMemberOutputWithContext(context.Background())
}

func (i *AccountMember) ToAccountMemberOutputWithContext(ctx context.Context) AccountMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMemberOutput)
}

func (i *AccountMember) ToAccountMemberPtrOutput() AccountMemberPtrOutput {
	return i.ToAccountMemberPtrOutputWithContext(context.Background())
}

func (i *AccountMember) ToAccountMemberPtrOutputWithContext(ctx context.Context) AccountMemberPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMemberPtrOutput)
}

type AccountMemberPtrInput interface {
	pulumi.Input

	ToAccountMemberPtrOutput() AccountMemberPtrOutput
	ToAccountMemberPtrOutputWithContext(ctx context.Context) AccountMemberPtrOutput
}

type accountMemberPtrType AccountMemberArgs

func (*accountMemberPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountMember)(nil))
}

func (i *accountMemberPtrType) ToAccountMemberPtrOutput() AccountMemberPtrOutput {
	return i.ToAccountMemberPtrOutputWithContext(context.Background())
}

func (i *accountMemberPtrType) ToAccountMemberPtrOutputWithContext(ctx context.Context) AccountMemberPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMemberPtrOutput)
}

// AccountMemberArrayInput is an input type that accepts AccountMemberArray and AccountMemberArrayOutput values.
// You can construct a concrete instance of `AccountMemberArrayInput` via:
//
//          AccountMemberArray{ AccountMemberArgs{...} }
type AccountMemberArrayInput interface {
	pulumi.Input

	ToAccountMemberArrayOutput() AccountMemberArrayOutput
	ToAccountMemberArrayOutputWithContext(context.Context) AccountMemberArrayOutput
}

type AccountMemberArray []AccountMemberInput

func (AccountMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AccountMember)(nil))
}

func (i AccountMemberArray) ToAccountMemberArrayOutput() AccountMemberArrayOutput {
	return i.ToAccountMemberArrayOutputWithContext(context.Background())
}

func (i AccountMemberArray) ToAccountMemberArrayOutputWithContext(ctx context.Context) AccountMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMemberArrayOutput)
}

// AccountMemberMapInput is an input type that accepts AccountMemberMap and AccountMemberMapOutput values.
// You can construct a concrete instance of `AccountMemberMapInput` via:
//
//          AccountMemberMap{ "key": AccountMemberArgs{...} }
type AccountMemberMapInput interface {
	pulumi.Input

	ToAccountMemberMapOutput() AccountMemberMapOutput
	ToAccountMemberMapOutputWithContext(context.Context) AccountMemberMapOutput
}

type AccountMemberMap map[string]AccountMemberInput

func (AccountMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AccountMember)(nil))
}

func (i AccountMemberMap) ToAccountMemberMapOutput() AccountMemberMapOutput {
	return i.ToAccountMemberMapOutputWithContext(context.Background())
}

func (i AccountMemberMap) ToAccountMemberMapOutputWithContext(ctx context.Context) AccountMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMemberMapOutput)
}

type AccountMemberOutput struct {
	*pulumi.OutputState
}

func (AccountMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccountMember)(nil))
}

func (o AccountMemberOutput) ToAccountMemberOutput() AccountMemberOutput {
	return o
}

func (o AccountMemberOutput) ToAccountMemberOutputWithContext(ctx context.Context) AccountMemberOutput {
	return o
}

func (o AccountMemberOutput) ToAccountMemberPtrOutput() AccountMemberPtrOutput {
	return o.ToAccountMemberPtrOutputWithContext(context.Background())
}

func (o AccountMemberOutput) ToAccountMemberPtrOutputWithContext(ctx context.Context) AccountMemberPtrOutput {
	return o.ApplyT(func(v AccountMember) *AccountMember {
		return &v
	}).(AccountMemberPtrOutput)
}

type AccountMemberPtrOutput struct {
	*pulumi.OutputState
}

func (AccountMemberPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountMember)(nil))
}

func (o AccountMemberPtrOutput) ToAccountMemberPtrOutput() AccountMemberPtrOutput {
	return o
}

func (o AccountMemberPtrOutput) ToAccountMemberPtrOutputWithContext(ctx context.Context) AccountMemberPtrOutput {
	return o
}

type AccountMemberArrayOutput struct{ *pulumi.OutputState }

func (AccountMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AccountMember)(nil))
}

func (o AccountMemberArrayOutput) ToAccountMemberArrayOutput() AccountMemberArrayOutput {
	return o
}

func (o AccountMemberArrayOutput) ToAccountMemberArrayOutputWithContext(ctx context.Context) AccountMemberArrayOutput {
	return o
}

func (o AccountMemberArrayOutput) Index(i pulumi.IntInput) AccountMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AccountMember {
		return vs[0].([]AccountMember)[vs[1].(int)]
	}).(AccountMemberOutput)
}

type AccountMemberMapOutput struct{ *pulumi.OutputState }

func (AccountMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AccountMember)(nil))
}

func (o AccountMemberMapOutput) ToAccountMemberMapOutput() AccountMemberMapOutput {
	return o
}

func (o AccountMemberMapOutput) ToAccountMemberMapOutputWithContext(ctx context.Context) AccountMemberMapOutput {
	return o
}

func (o AccountMemberMapOutput) MapIndex(k pulumi.StringInput) AccountMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AccountMember {
		return vs[0].(map[string]AccountMember)[vs[1].(string)]
	}).(AccountMemberOutput)
}

func init() {
	pulumi.RegisterOutputType(AccountMemberOutput{})
	pulumi.RegisterOutputType(AccountMemberPtrOutput{})
	pulumi.RegisterOutputType(AccountMemberArrayOutput{})
	pulumi.RegisterOutputType(AccountMemberMapOutput{})
}
