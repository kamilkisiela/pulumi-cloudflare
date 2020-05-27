# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class LogpullRetention(pulumi.CustomResource):
    enabled: pulumi.Output[bool]
    """
    Whether you wish to retain logs or not.
    """
    zone_id: pulumi.Output[str]
    """
    The zone ID to apply the log retention to.
    """
    def __init__(__self__, resource_name, opts=None, enabled=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.LogpullRetention("example",
            enabled="true",
            zone_id="fb54f084ca7f7b732d3d3ecbd8ef7bf2")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether you wish to retain logs or not.
        :param pulumi.Input[str] zone_id: The zone ID to apply the log retention to.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if enabled is None:
                raise TypeError("Missing required property 'enabled'")
            __props__['enabled'] = enabled
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
        super(LogpullRetention, __self__).__init__(
            'cloudflare:index/logpullRetention:LogpullRetention',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, enabled=None, zone_id=None):
        """
        Get an existing LogpullRetention resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether you wish to retain logs or not.
        :param pulumi.Input[str] zone_id: The zone ID to apply the log retention to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["enabled"] = enabled
        __props__["zone_id"] = zone_id
        return LogpullRetention(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

