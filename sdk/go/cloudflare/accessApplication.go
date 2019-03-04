// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare Access Application resource. Access Applications
// are used to restrict access to a whole application using an
// authorisation gateway managed by Cloudflare.
type AccessApplication struct {
	s *pulumi.ResourceState
}

// NewAccessApplication registers a new resource with the given unique name, arguments, and options.
func NewAccessApplication(ctx *pulumi.Context,
	name string, args *AccessApplicationArgs, opts ...pulumi.ResourceOpt) (*AccessApplication, error) {
	if args == nil || args.Domain == nil {
		return nil, errors.New("missing required argument 'Domain'")
	}
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["domain"] = nil
		inputs["name"] = nil
		inputs["sessionDuration"] = nil
		inputs["zoneId"] = nil
	} else {
		inputs["domain"] = args.Domain
		inputs["name"] = args.Name
		inputs["sessionDuration"] = args.SessionDuration
		inputs["zoneId"] = args.ZoneId
	}
	inputs["aud"] = nil
	s, err := ctx.RegisterResource("cloudflare:index/accessApplication:AccessApplication", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &AccessApplication{s: s}, nil
}

// GetAccessApplication gets an existing AccessApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessApplication(ctx *pulumi.Context,
	name string, id pulumi.ID, state *AccessApplicationState, opts ...pulumi.ResourceOpt) (*AccessApplication, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["aud"] = state.Aud
		inputs["domain"] = state.Domain
		inputs["name"] = state.Name
		inputs["sessionDuration"] = state.SessionDuration
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/accessApplication:AccessApplication", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &AccessApplication{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *AccessApplication) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *AccessApplication) ID() *pulumi.IDOutput {
	return r.s.ID()
}

func (r *AccessApplication) Aud() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["aud"])
}

// The complete URL of the asset you wish to put
// Cloudflare Access in front of. Can include subdomains or paths. Or both.
func (r *AccessApplication) Domain() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["domain"])
}

// Friendly name of the Access Application.
func (r *AccessApplication) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// How often a user will be forced to
// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
func (r *AccessApplication) SessionDuration() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["sessionDuration"])
}

// The DNS zone to which the access rule should be added.
func (r *AccessApplication) ZoneId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering AccessApplication resources.
type AccessApplicationState struct {
	Aud interface{}
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain interface{}
	// Friendly name of the Access Application.
	Name interface{}
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration interface{}
	// The DNS zone to which the access rule should be added.
	ZoneId interface{}
}

// The set of arguments for constructing a AccessApplication resource.
type AccessApplicationArgs struct {
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain interface{}
	// Friendly name of the Access Application.
	Name interface{}
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration interface{}
	// The DNS zone to which the access rule should be added.
	ZoneId interface{}
}
