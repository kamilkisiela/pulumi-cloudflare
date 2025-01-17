// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetIpRanges(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetIpRangesResult, error) {
	var rv GetIpRangesResult
	err := ctx.Invoke("cloudflare:index/getIpRanges:getIpRanges", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getIpRanges.
type GetIpRangesResult struct {
	ChinaIpv4CidrBlocks []string `pulumi:"chinaIpv4CidrBlocks"`
	ChinaIpv6CidrBlocks []string `pulumi:"chinaIpv6CidrBlocks"`
	CidrBlocks          []string `pulumi:"cidrBlocks"`
	// The provider-assigned unique ID for this managed resource.
	Id             string   `pulumi:"id"`
	Ipv4CidrBlocks []string `pulumi:"ipv4CidrBlocks"`
	Ipv6CidrBlocks []string `pulumi:"ipv6CidrBlocks"`
}
