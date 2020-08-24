# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['WorkersKv']


class WorkersKv(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Workers KV Pair.  *NOTE:*  This resource uses the Cloudflare account APIs.  This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_ns = cloudflare.WorkersKvNamespace("exampleNs", title="test-namespace")
        example = cloudflare.WorkersKv("example",
            namespace_id=example_ns.id,
            key="test-key",
            value="test value")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The key name
        :param pulumi.Input[str] namespace_id: The ID of the Workers KV namespace in which you want to create the KV pair
        :param pulumi.Input[str] value: The string value to be stored in the key
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

            if key is None:
                raise TypeError("Missing required property 'key'")
            __props__['key'] = key
            if namespace_id is None:
                raise TypeError("Missing required property 'namespace_id'")
            __props__['namespace_id'] = namespace_id
            if value is None:
                raise TypeError("Missing required property 'value'")
            __props__['value'] = value
        super(WorkersKv, __self__).__init__(
            'cloudflare:index/workersKv:WorkersKv',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'WorkersKv':
        """
        Get an existing WorkersKv resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The key name
        :param pulumi.Input[str] namespace_id: The ID of the Workers KV namespace in which you want to create the KV pair
        :param pulumi.Input[str] value: The string value to be stored in the key
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["key"] = key
        __props__["namespace_id"] = namespace_id
        __props__["value"] = value
        return WorkersKv(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The key name
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        The ID of the Workers KV namespace in which you want to create the KV pair
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The string value to be stored in the key
        """
        return pulumi.get(self, "value")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

