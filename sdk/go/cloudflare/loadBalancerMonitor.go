// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// If you're using Cloudflare's Load Balancing to load-balance across multiple origin servers or data centers, you configure one of these Monitors to actively check the availability of those servers over HTTP(S) or TCP.
//
// > **Note:** When creating a monitor, you have to pass `accountId` to the provider configuration in order to create account level resources. Otherwise, by default, it will be a user level resource.
//
// ## Example Usage
// ### HTTP Monitor
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
// 		_, err := cloudflare.NewLoadBalancerMonitor(ctx, "httpMonitor", &cloudflare.LoadBalancerMonitorArgs{
// 			AllowInsecure:   pulumi.Bool(false),
// 			Description:     pulumi.String("example http load balancer"),
// 			ExpectedBody:    pulumi.String("alive"),
// 			ExpectedCodes:   pulumi.String("2xx"),
// 			FollowRedirects: pulumi.Bool(true),
// 			Headers: cloudflare.LoadBalancerMonitorHeaderArray{
// 				&cloudflare.LoadBalancerMonitorHeaderArgs{
// 					Header: pulumi.String("Host"),
// 					Values: pulumi.StringArray{
// 						pulumi.String("example.com"),
// 					},
// 				},
// 			},
// 			Interval: pulumi.Int(60),
// 			Method:   pulumi.String("GET"),
// 			Path:     pulumi.String("/health"),
// 			Retries:  pulumi.Int(5),
// 			Timeout:  pulumi.Int(7),
// 			Type:     pulumi.String("http"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### TCP Monitor
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
// 		_, err := cloudflare.NewLoadBalancerMonitor(ctx, "tcpMonitor", &cloudflare.LoadBalancerMonitorArgs{
// 			Description: pulumi.String("example tcp load balancer"),
// 			Interval:    pulumi.Int(60),
// 			Method:      pulumi.String("connection_established"),
// 			Port:        pulumi.Int(8080),
// 			Retries:     pulumi.Int(5),
// 			Timeout:     pulumi.Int(7),
// 			Type:        pulumi.String("tcp"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type LoadBalancerMonitor struct {
	pulumi.CustomResourceState

	// Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
	AllowInsecure pulumi.BoolPtrOutput `pulumi:"allowInsecure"`
	// The RFC3339 timestamp of when the load balancer monitor was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Free text description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https". Default: "".
	ExpectedBody pulumi.StringPtrOutput `pulumi:"expectedBody"`
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes pulumi.StringPtrOutput `pulumi:"expectedCodes"`
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects pulumi.BoolPtrOutput `pulumi:"followRedirects"`
	// The header name.
	Headers LoadBalancerMonitorHeaderArrayOutput `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
	Interval pulumi.IntPtrOutput `pulumi:"interval"`
	// The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
	Method pulumi.StringOutput `pulumi:"method"`
	// The RFC3339 timestamp of when the load balancer monitor was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
	Path pulumi.StringOutput `pulumi:"path"`
	// The port number to use for the healthcheck, required when creating a TCP monitor. Valid values are in the range `0-65535`.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
	Retries pulumi.IntPtrOutput `pulumi:"retries"`
	// The timeout (in seconds) before marking the health check as failed. Default: 5.
	Timeout pulumi.IntPtrOutput `pulumi:"timeout"`
	// The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewLoadBalancerMonitor registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerMonitor(ctx *pulumi.Context,
	name string, args *LoadBalancerMonitorArgs, opts ...pulumi.ResourceOption) (*LoadBalancerMonitor, error) {
	if args == nil {
		args = &LoadBalancerMonitorArgs{}
	}
	var resource LoadBalancerMonitor
	err := ctx.RegisterResource("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerMonitor gets an existing LoadBalancerMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerMonitorState, opts ...pulumi.ResourceOption) (*LoadBalancerMonitor, error) {
	var resource LoadBalancerMonitor
	err := ctx.ReadResource("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerMonitor resources.
type loadBalancerMonitorState struct {
	// Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// The RFC3339 timestamp of when the load balancer monitor was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Free text description.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https". Default: "".
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes *string `pulumi:"expectedCodes"`
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []LoadBalancerMonitorHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
	Interval *int `pulumi:"interval"`
	// The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
	Method *string `pulumi:"method"`
	// The RFC3339 timestamp of when the load balancer monitor was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
	Path *string `pulumi:"path"`
	// The port number to use for the healthcheck, required when creating a TCP monitor. Valid values are in the range `0-65535`.
	Port *int `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
	Retries *int `pulumi:"retries"`
	// The timeout (in seconds) before marking the health check as failed. Default: 5.
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
	Type *string `pulumi:"type"`
}

type LoadBalancerMonitorState struct {
	// Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
	AllowInsecure pulumi.BoolPtrInput
	// The RFC3339 timestamp of when the load balancer monitor was created.
	CreatedOn pulumi.StringPtrInput
	// Free text description.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https". Default: "".
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes pulumi.StringPtrInput
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers LoadBalancerMonitorHeaderArrayInput
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
	Interval pulumi.IntPtrInput
	// The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
	Method pulumi.StringPtrInput
	// The RFC3339 timestamp of when the load balancer monitor was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
	Path pulumi.StringPtrInput
	// The port number to use for the healthcheck, required when creating a TCP monitor. Valid values are in the range `0-65535`.
	Port pulumi.IntPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
	Retries pulumi.IntPtrInput
	// The timeout (in seconds) before marking the health check as failed. Default: 5.
	Timeout pulumi.IntPtrInput
	// The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
	Type pulumi.StringPtrInput
}

func (LoadBalancerMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerMonitorState)(nil)).Elem()
}

type loadBalancerMonitorArgs struct {
	// Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// Free text description.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https". Default: "".
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes *string `pulumi:"expectedCodes"`
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []LoadBalancerMonitorHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
	Interval *int `pulumi:"interval"`
	// The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
	Method *string `pulumi:"method"`
	// The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
	Path *string `pulumi:"path"`
	// The port number to use for the healthcheck, required when creating a TCP monitor. Valid values are in the range `0-65535`.
	Port *int `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
	Retries *int `pulumi:"retries"`
	// The timeout (in seconds) before marking the health check as failed. Default: 5.
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a LoadBalancerMonitor resource.
type LoadBalancerMonitorArgs struct {
	// Do not validate the certificate when monitor use HTTPS. Only valid if `type` is "http" or "https".
	AllowInsecure pulumi.BoolPtrInput
	// Free text description.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https". Default: "".
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes pulumi.StringPtrInput
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers LoadBalancerMonitorHeaderArrayInput
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Default: 60.
	Interval pulumi.IntPtrInput
	// The method to use for the health check. Valid values are any valid HTTP verb if `type` is "http" or "https", or `connectionEstablished` if `type` is "tcp". Default: "GET" if `type` is "http" or "https", or "connectionEstablished" if `type` is "tcp" .
	Method pulumi.StringPtrInput
	// The endpoint path to health check against. Default: "/". Only valid if `type` is "http" or "https".
	Path pulumi.StringPtrInput
	// The port number to use for the healthcheck, required when creating a TCP monitor. Valid values are in the range `0-65535`.
	Port pulumi.IntPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Default: 2.
	Retries pulumi.IntPtrInput
	// The timeout (in seconds) before marking the health check as failed. Default: 5.
	Timeout pulumi.IntPtrInput
	// The protocol to use for the healthcheck. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'. Default: "http".
	Type pulumi.StringPtrInput
}

func (LoadBalancerMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerMonitorArgs)(nil)).Elem()
}

type LoadBalancerMonitorInput interface {
	pulumi.Input

	ToLoadBalancerMonitorOutput() LoadBalancerMonitorOutput
	ToLoadBalancerMonitorOutputWithContext(ctx context.Context) LoadBalancerMonitorOutput
}

func (LoadBalancerMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancerMonitor)(nil)).Elem()
}

func (i LoadBalancerMonitor) ToLoadBalancerMonitorOutput() LoadBalancerMonitorOutput {
	return i.ToLoadBalancerMonitorOutputWithContext(context.Background())
}

func (i LoadBalancerMonitor) ToLoadBalancerMonitorOutputWithContext(ctx context.Context) LoadBalancerMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMonitorOutput)
}

type LoadBalancerMonitorOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancerMonitorOutput)(nil)).Elem()
}

func (o LoadBalancerMonitorOutput) ToLoadBalancerMonitorOutput() LoadBalancerMonitorOutput {
	return o
}

func (o LoadBalancerMonitorOutput) ToLoadBalancerMonitorOutputWithContext(ctx context.Context) LoadBalancerMonitorOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(LoadBalancerMonitorOutput{})
}
