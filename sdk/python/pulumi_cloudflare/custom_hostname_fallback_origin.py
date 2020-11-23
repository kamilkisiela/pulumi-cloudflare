# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['CustomHostnameFallbackOrigin']


class CustomHostnameFallbackOrigin(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare custom hostname fallback origin resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        fallback_origin = cloudflare.CustomHostnameFallbackOrigin("fallbackOrigin",
            origin="fallback.example.com",
            zone_id="d41d8cd98f00b204e9800998ecf8427e")
        ```

        ## Import

        Custom hostname fallback origins can be imported using a composite ID formed of the zone ID and [fallback origin](https://api.cloudflare.com/#custom-hostname-fallback-origin-for-a-zone-properties), separated by a "/" e.g.

        ```sh
         $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example d41d8cd98f00b204e9800998ecf8427e/fallback.example.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] origin: Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        :param pulumi.Input[str] zone_id: The DNS zone ID where the custom hostname should be assigned.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if origin is None:
                raise TypeError("Missing required property 'origin'")
            __props__['origin'] = origin
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['status'] = None
        super(CustomHostnameFallbackOrigin, __self__).__init__(
            'cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            origin: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'CustomHostnameFallbackOrigin':
        """
        Get an existing CustomHostnameFallbackOrigin resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] origin: Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        :param pulumi.Input[str] status: Status of the fallback origin's activation.
        :param pulumi.Input[str] zone_id: The DNS zone ID where the custom hostname should be assigned.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["origin"] = origin
        __props__["status"] = status
        __props__["zone_id"] = zone_id
        return CustomHostnameFallbackOrigin(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def origin(self) -> pulumi.Output[str]:
        """
        Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        """
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the fallback origin's activation.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone ID where the custom hostname should be assigned.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

