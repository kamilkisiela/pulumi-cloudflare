// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare Load Balancer pool resource. This provides a pool of origins that can be used by a Cloudflare Load Balancer. Note that the load balancing feature must be enabled in your Clouflare account before you can use this resource.
type LoadBalancerPool struct {
	s *pulumi.ResourceState
}

// NewLoadBalancerPool registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerPool(ctx *pulumi.Context,
	name string, args *LoadBalancerPoolArgs, opts ...pulumi.ResourceOpt) (*LoadBalancerPool, error) {
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil || args.Origins == nil {
		return nil, errors.New("missing required argument 'Origins'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["checkRegions"] = nil
		inputs["description"] = nil
		inputs["enabled"] = nil
		inputs["minimumOrigins"] = nil
		inputs["monitor"] = nil
		inputs["name"] = nil
		inputs["notificationEmail"] = nil
		inputs["origins"] = nil
	} else {
		inputs["checkRegions"] = args.CheckRegions
		inputs["description"] = args.Description
		inputs["enabled"] = args.Enabled
		inputs["minimumOrigins"] = args.MinimumOrigins
		inputs["monitor"] = args.Monitor
		inputs["name"] = args.Name
		inputs["notificationEmail"] = args.NotificationEmail
		inputs["origins"] = args.Origins
	}
	inputs["createdOn"] = nil
	inputs["modifiedOn"] = nil
	s, err := ctx.RegisterResource("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoadBalancerPool{s: s}, nil
}

// GetLoadBalancerPool gets an existing LoadBalancerPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerPool(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LoadBalancerPoolState, opts ...pulumi.ResourceOpt) (*LoadBalancerPool, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["checkRegions"] = state.CheckRegions
		inputs["createdOn"] = state.CreatedOn
		inputs["description"] = state.Description
		inputs["enabled"] = state.Enabled
		inputs["minimumOrigins"] = state.MinimumOrigins
		inputs["modifiedOn"] = state.ModifiedOn
		inputs["monitor"] = state.Monitor
		inputs["name"] = state.Name
		inputs["notificationEmail"] = state.NotificationEmail
		inputs["origins"] = state.Origins
	}
	s, err := ctx.ReadResource("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoadBalancerPool{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *LoadBalancerPool) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *LoadBalancerPool) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
func (r *LoadBalancerPool) CheckRegions() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["checkRegions"])
}

// The RFC3339 timestamp of when the load balancer was created.
func (r *LoadBalancerPool) CreatedOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["createdOn"])
}

// Free text description.
func (r *LoadBalancerPool) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
func (r *LoadBalancerPool) Enabled() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enabled"])
}

// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
func (r *LoadBalancerPool) MinimumOrigins() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["minimumOrigins"])
}

// The RFC3339 timestamp of when the load balancer was last modified.
func (r *LoadBalancerPool) ModifiedOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["modifiedOn"])
}

// The ID of the Monitor to use for health checking origins within this pool.
func (r *LoadBalancerPool) Monitor() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["monitor"])
}

// A human-identifiable name for the origin.
func (r *LoadBalancerPool) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
func (r *LoadBalancerPool) NotificationEmail() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["notificationEmail"])
}

// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
func (r *LoadBalancerPool) Origins() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["origins"])
}

// Input properties used for looking up and filtering LoadBalancerPool resources.
type LoadBalancerPoolState struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions interface{}
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn interface{}
	// Free text description.
	Description interface{}
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled interface{}
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins interface{}
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn interface{}
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor interface{}
	// A human-identifiable name for the origin.
	Name interface{}
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail interface{}
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins interface{}
}

// The set of arguments for constructing a LoadBalancerPool resource.
type LoadBalancerPoolArgs struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions interface{}
	// Free text description.
	Description interface{}
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled interface{}
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins interface{}
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor interface{}
	// A human-identifiable name for the origin.
	Name interface{}
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail interface{}
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins interface{}
}
