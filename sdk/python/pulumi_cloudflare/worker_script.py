# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['WorkerScript']


class WorkerScript(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`. *NOTE:*  This resource uses the Cloudflare account APIs. This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_namespace = cloudflare.WorkersKvNamespace("myNamespace", title="example")
        # Sets the script with the name "script_1"
        my_script = cloudflare.WorkerScript("myScript",
            name="script_1",
            content=(lambda path: open(path).read())("script.js"),
            kv_namespace_bindings=[cloudflare.WorkerScriptKvNamespaceBindingArgs(
                name="MY_EXAMPLE_KV_NAMESPACE",
                namespace_id=my_namespace.id,
            )],
            plain_text_bindings=[cloudflare.WorkerScriptPlainTextBindingArgs(
                name="MY_EXAMPLE_PLAIN_TEXT",
                text="foobar",
            )],
            secret_text_bindings=[cloudflare.WorkerScriptSecretTextBindingArgs(
                name="MY_EXAMPLE_SECRET_TEXT",
                text=var["secret_foo_value"],
            )])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
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

            if content is None:
                raise TypeError("Missing required property 'content'")
            __props__['content'] = content
            __props__['kv_namespace_bindings'] = kv_namespace_bindings
            if name is None:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['plain_text_bindings'] = plain_text_bindings
            __props__['secret_text_bindings'] = secret_text_bindings
        super(WorkerScript, __self__).__init__(
            'cloudflare:index/workerScript:WorkerScript',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content: Optional[pulumi.Input[str]] = None,
            kv_namespace_bindings: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            plain_text_bindings: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
            secret_text_bindings: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None) -> 'WorkerScript':
        """
        Get an existing WorkerScript resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["content"] = content
        __props__["kv_namespace_bindings"] = kv_namespace_bindings
        __props__["name"] = name
        __props__["plain_text_bindings"] = plain_text_bindings
        __props__["secret_text_bindings"] = secret_text_bindings
        return WorkerScript(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> Optional[List['outputs.WorkerScriptKvNamespaceBinding']]:
        return pulumi.get(self, "kv_namespace_bindings")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> Optional[List['outputs.WorkerScriptPlainTextBinding']]:
        return pulumi.get(self, "plain_text_bindings")

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> Optional[List['outputs.WorkerScriptSecretTextBinding']]:
        return pulumi.get(self, "secret_text_bindings")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

