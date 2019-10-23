// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare Spectrum Application. You can extend the power of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based services.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/spectrum_application.html.markdown.
type SpectrumApplication struct {
	s *pulumi.ResourceState
}

// NewSpectrumApplication registers a new resource with the given unique name, arguments, and options.
func NewSpectrumApplication(ctx *pulumi.Context,
	name string, args *SpectrumApplicationArgs, opts ...pulumi.ResourceOpt) (*SpectrumApplication, error) {
	if args == nil || args.Dns == nil {
		return nil, errors.New("missing required argument 'Dns'")
	}
	if args == nil || args.OriginPort == nil {
		return nil, errors.New("missing required argument 'OriginPort'")
	}
	if args == nil || args.Protocol == nil {
		return nil, errors.New("missing required argument 'Protocol'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["dns"] = nil
		inputs["ipFirewall"] = nil
		inputs["originDirects"] = nil
		inputs["originDns"] = nil
		inputs["originPort"] = nil
		inputs["protocol"] = nil
		inputs["proxyProtocol"] = nil
		inputs["tls"] = nil
		inputs["trafficType"] = nil
		inputs["zoneId"] = nil
	} else {
		inputs["dns"] = args.Dns
		inputs["ipFirewall"] = args.IpFirewall
		inputs["originDirects"] = args.OriginDirects
		inputs["originDns"] = args.OriginDns
		inputs["originPort"] = args.OriginPort
		inputs["protocol"] = args.Protocol
		inputs["proxyProtocol"] = args.ProxyProtocol
		inputs["tls"] = args.Tls
		inputs["trafficType"] = args.TrafficType
		inputs["zoneId"] = args.ZoneId
	}
	s, err := ctx.RegisterResource("cloudflare:index/spectrumApplication:SpectrumApplication", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &SpectrumApplication{s: s}, nil
}

// GetSpectrumApplication gets an existing SpectrumApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpectrumApplication(ctx *pulumi.Context,
	name string, id pulumi.ID, state *SpectrumApplicationState, opts ...pulumi.ResourceOpt) (*SpectrumApplication, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["dns"] = state.Dns
		inputs["ipFirewall"] = state.IpFirewall
		inputs["originDirects"] = state.OriginDirects
		inputs["originDns"] = state.OriginDns
		inputs["originPort"] = state.OriginPort
		inputs["protocol"] = state.Protocol
		inputs["proxyProtocol"] = state.ProxyProtocol
		inputs["tls"] = state.Tls
		inputs["trafficType"] = state.TrafficType
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/spectrumApplication:SpectrumApplication", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &SpectrumApplication{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *SpectrumApplication) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *SpectrumApplication) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The name and type of DNS record for the Spectrum application. Fields documented below.
func (r *SpectrumApplication) Dns() *pulumi.Output {
	return r.s.State["dns"]
}

// Enables the IP Firewall for this application. Defaults to `true`.
func (r *SpectrumApplication) IpFirewall() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["ipFirewall"])
}

// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
func (r *SpectrumApplication) OriginDirects() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["originDirects"])
}

// A destination DNS addresses to the origin. Fields documented below.
func (r *SpectrumApplication) OriginDns() *pulumi.Output {
	return r.s.State["originDns"]
}

// If using `originDns` this is a required attribute. Origin port to proxy traffice to e.g. `22`.
func (r *SpectrumApplication) OriginPort() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["originPort"])
}

// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
func (r *SpectrumApplication) Protocol() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["protocol"])
}

// Enables Proxy Protocol v1 to the origin. Defaults to `false`.
func (r *SpectrumApplication) ProxyProtocol() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["proxyProtocol"])
}

// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
func (r *SpectrumApplication) Tls() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["tls"])
}

// Set's application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
func (r *SpectrumApplication) TrafficType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["trafficType"])
}

func (r *SpectrumApplication) ZoneId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering SpectrumApplication resources.
type SpectrumApplicationState struct {
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns interface{}
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall interface{}
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects interface{}
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns interface{}
	// If using `originDns` this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort interface{}
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol interface{}
	// Enables Proxy Protocol v1 to the origin. Defaults to `false`.
	ProxyProtocol interface{}
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls interface{}
	// Set's application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType interface{}
	ZoneId interface{}
}

// The set of arguments for constructing a SpectrumApplication resource.
type SpectrumApplicationArgs struct {
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns interface{}
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall interface{}
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects interface{}
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns interface{}
	// If using `originDns` this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort interface{}
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol interface{}
	// Enables Proxy Protocol v1 to the origin. Defaults to `false`.
	ProxyProtocol interface{}
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls interface{}
	// Set's application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType interface{}
	ZoneId interface{}
}
