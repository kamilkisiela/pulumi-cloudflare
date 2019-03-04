// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to get the [IP ranges][1] of Cloudflare edge nodes.
func LookupIpRanges(ctx *pulumi.Context) (*GetIpRangesResult, error) {
	outputs, err := ctx.Invoke("cloudflare:index/getIpRanges:getIpRanges", nil)
	if err != nil {
		return nil, err
	}
	return &GetIpRangesResult{
		CidrBlocks: outputs["cidrBlocks"],
		Ipv4CidrBlocks: outputs["ipv4CidrBlocks"],
		Ipv6CidrBlocks: outputs["ipv6CidrBlocks"],
		Id: outputs["id"],
	}, nil
}

// A collection of values returned by getIpRanges.
type GetIpRangesResult struct {
	CidrBlocks interface{}
	Ipv4CidrBlocks interface{}
	Ipv6CidrBlocks interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
