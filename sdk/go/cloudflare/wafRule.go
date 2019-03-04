// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.
type WafRule struct {
	s *pulumi.ResourceState
}

// NewWafRule registers a new resource with the given unique name, arguments, and options.
func NewWafRule(ctx *pulumi.Context,
	name string, args *WafRuleArgs, opts ...pulumi.ResourceOpt) (*WafRule, error) {
	if args == nil || args.Mode == nil {
		return nil, errors.New("missing required argument 'Mode'")
	}
	if args == nil || args.RuleId == nil {
		return nil, errors.New("missing required argument 'RuleId'")
	}
	if args == nil || args.Zone == nil {
		return nil, errors.New("missing required argument 'Zone'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["mode"] = nil
		inputs["ruleId"] = nil
		inputs["zone"] = nil
	} else {
		inputs["mode"] = args.Mode
		inputs["ruleId"] = args.RuleId
		inputs["zone"] = args.Zone
	}
	inputs["packageId"] = nil
	inputs["zoneId"] = nil
	s, err := ctx.RegisterResource("cloudflare:index/wafRule:WafRule", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &WafRule{s: s}, nil
}

// GetWafRule gets an existing WafRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWafRule(ctx *pulumi.Context,
	name string, id pulumi.ID, state *WafRuleState, opts ...pulumi.ResourceOpt) (*WafRule, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["mode"] = state.Mode
		inputs["packageId"] = state.PackageId
		inputs["ruleId"] = state.RuleId
		inputs["zone"] = state.Zone
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/wafRule:WafRule", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &WafRule{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *WafRule) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *WafRule) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
func (r *WafRule) Mode() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["mode"])
}

// The ID of the WAF Rule Package that contains the rule.
func (r *WafRule) PackageId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["packageId"])
}

// The WAF Rule ID.
func (r *WafRule) RuleId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["ruleId"])
}

// The DNS zone to apply to.
func (r *WafRule) Zone() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zone"])
}

// The DNS zone ID.
func (r *WafRule) ZoneId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering WafRule resources.
type WafRuleState struct {
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode interface{}
	// The ID of the WAF Rule Package that contains the rule.
	PackageId interface{}
	// The WAF Rule ID.
	RuleId interface{}
	// The DNS zone to apply to.
	Zone interface{}
	// The DNS zone ID.
	ZoneId interface{}
}

// The set of arguments for constructing a WafRule resource.
type WafRuleArgs struct {
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode interface{}
	// The WAF Rule ID.
	RuleId interface{}
	// The DNS zone to apply to.
	Zone interface{}
}
