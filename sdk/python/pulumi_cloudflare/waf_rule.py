# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class WafRule(pulumi.CustomResource):
    mode: pulumi.Output[str]
    """
    The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
    """
    package_id: pulumi.Output[str]
    """
    The ID of the WAF Rule Package that contains the rule.
    """
    rule_id: pulumi.Output[str]
    """
    The WAF Rule ID.
    """
    zone: pulumi.Output[str]
    """
    The DNS zone to apply to.
    """
    zone_id: pulumi.Output[str]
    """
    The DNS zone ID.
    """
    def __init__(__self__, resource_name, opts=None, mode=None, rule_id=None, zone=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] mode: The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
        :param pulumi.Input[str] rule_id: The WAF Rule ID.
        :param pulumi.Input[str] zone: The DNS zone to apply to.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/waf_rule.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if mode is None:
            raise TypeError("Missing required property 'mode'")
        __props__['mode'] = mode

        if rule_id is None:
            raise TypeError("Missing required property 'rule_id'")
        __props__['rule_id'] = rule_id

        if zone is None:
            raise TypeError("Missing required property 'zone'")
        __props__['zone'] = zone

        __props__['package_id'] = None
        __props__['zone_id'] = None

        super(WafRule, __self__).__init__(
            'cloudflare:index/wafRule:WafRule',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

