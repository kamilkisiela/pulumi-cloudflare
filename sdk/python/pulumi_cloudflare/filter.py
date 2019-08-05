# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class Filter(pulumi.CustomResource):
    description: pulumi.Output[str]
    """
    A note that you can use to describe the purpose of the filter.
    """
    expression: pulumi.Output[str]
    """
    The filter expression to be used.
    """
    paused: pulumi.Output[bool]
    """
    Whether this filter is currently paused. Boolean value.
    """
    ref: pulumi.Output[str]
    """
    Short reference tag to quickly select related rules.
    """
    zone: pulumi.Output[str]
    """
    The DNS zone to which the Filter should be added. Will be resolved to `zone_id` upon creation.
    """
    zone_id: pulumi.Output[str]
    """
    The DNS zone to which the Filter should be added.
    """
    def __init__(__self__, resource_name, opts=None, description=None, expression=None, paused=None, ref=None, zone=None, zone_id=None, __name__=None, __opts__=None):
        """
        Filter expressions that can be referenced across multiple features, e.g. Firewall Rule. The expression format is similar to [Wireshark Display Filter](https://www.wireshark.org/docs/man-pages/wireshark-filter.html).
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A note that you can use to describe the purpose of the filter.
        :param pulumi.Input[str] expression: The filter expression to be used.
        :param pulumi.Input[bool] paused: Whether this filter is currently paused. Boolean value.
        :param pulumi.Input[str] ref: Short reference tag to quickly select related rules.
        :param pulumi.Input[str] zone: The DNS zone to which the Filter should be added. Will be resolved to `zone_id` upon creation.
        :param pulumi.Input[str] zone_id: The DNS zone to which the Filter should be added.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/filter.html.markdown.
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

        __props__['description'] = description

        if expression is None:
            raise TypeError("Missing required property 'expression'")
        __props__['expression'] = expression

        __props__['paused'] = paused

        __props__['ref'] = ref

        __props__['zone'] = zone

        __props__['zone_id'] = zone_id

        if opts is None:
            opts = pulumi.ResourceOptions()
        if opts.version is None:
            opts.version = utilities.get_version()
        super(Filter, __self__).__init__(
            'cloudflare:index/filter:Filter',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

