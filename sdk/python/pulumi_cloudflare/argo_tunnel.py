# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ArgoTunnelArgs', 'ArgoTunnel']

@pulumi.input_type
class ArgoTunnelArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 secret: pulumi.Input[str]):
        """
        The set of arguments for constructing a ArgoTunnel resource.
        :param pulumi.Input[str] account_id: The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. Cannot be empty.
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "secret", secret)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        A user-friendly name chosen when the tunnel is created. Cannot be empty.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Input[str]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret", value)


@pulumi.input_type
class _ArgoTunnelState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cname: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 tunnel_token: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ArgoTunnel resources.
        :param pulumi.Input[str] account_id: The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        :param pulumi.Input[str] cname: Usable CNAME for accessing the Argo Tunnel.
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. Cannot be empty.
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        :param pulumi.Input[str] tunnel_token: Token used by a connector to authenticate and run the tunnel.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cname is not None:
            pulumi.set(__self__, "cname", cname)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if tunnel_token is not None:
            pulumi.set(__self__, "tunnel_token", tunnel_token)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def cname(self) -> Optional[pulumi.Input[str]]:
        """
        Usable CNAME for accessing the Argo Tunnel.
        """
        return pulumi.get(self, "cname")

    @cname.setter
    def cname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cname", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A user-friendly name chosen when the tunnel is created. Cannot be empty.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="tunnelToken")
    def tunnel_token(self) -> Optional[pulumi.Input[str]]:
        """
        Token used by a connector to authenticate and run the tunnel.
        """
        return pulumi.get(self, "tunnel_token")

    @tunnel_token.setter
    def tunnel_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tunnel_token", value)


class ArgoTunnel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Argo Tunnel exposes applications running on your local web server on any network with an internet connection without manually adding DNS records or configuring a firewall or router.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ArgoTunnel("example",
            account_id="d41d8cd98f00b204e9800998ecf8427e",
            name="my-tunnel",
            secret="AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=")
        ```

        ## Import

        Argo Tunnels can be imported a composite ID of the account ID and tunnel UUID.

        ```sh
         $ pulumi import cloudflare:index/argoTunnel:ArgoTunnel example d41d8cd98f00b204e9800998ecf8427e/fd2455cb-5fcc-4c13-8738-8d8d2605237f
        ```

         where - `d41d8cd98f00b204e9800998ecf8427e` is the account ID - `fd2455cb-5fcc-4c13-8738-8d8d2605237f` is the Argo Tunnel UUID

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. Cannot be empty.
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ArgoTunnelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Argo Tunnel exposes applications running on your local web server on any network with an internet connection without manually adding DNS records or configuring a firewall or router.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ArgoTunnel("example",
            account_id="d41d8cd98f00b204e9800998ecf8427e",
            name="my-tunnel",
            secret="AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=")
        ```

        ## Import

        Argo Tunnels can be imported a composite ID of the account ID and tunnel UUID.

        ```sh
         $ pulumi import cloudflare:index/argoTunnel:ArgoTunnel example d41d8cd98f00b204e9800998ecf8427e/fd2455cb-5fcc-4c13-8738-8d8d2605237f
        ```

         where - `d41d8cd98f00b204e9800998ecf8427e` is the account ID - `fd2455cb-5fcc-4c13-8738-8d8d2605237f` is the Argo Tunnel UUID

        :param str resource_name: The name of the resource.
        :param ArgoTunnelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ArgoTunnelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ArgoTunnelArgs.__new__(ArgoTunnelArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if secret is None and not opts.urn:
                raise TypeError("Missing required property 'secret'")
            __props__.__dict__["secret"] = secret
            __props__.__dict__["cname"] = None
            __props__.__dict__["tunnel_token"] = None
        super(ArgoTunnel, __self__).__init__(
            'cloudflare:index/argoTunnel:ArgoTunnel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            cname: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            tunnel_token: Optional[pulumi.Input[str]] = None) -> 'ArgoTunnel':
        """
        Get an existing ArgoTunnel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        :param pulumi.Input[str] cname: Usable CNAME for accessing the Argo Tunnel.
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. Cannot be empty.
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        :param pulumi.Input[str] tunnel_token: Token used by a connector to authenticate and run the tunnel.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ArgoTunnelState.__new__(_ArgoTunnelState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["cname"] = cname
        __props__.__dict__["name"] = name
        __props__.__dict__["secret"] = secret
        __props__.__dict__["tunnel_token"] = tunnel_token
        return ArgoTunnel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def cname(self) -> pulumi.Output[str]:
        """
        Usable CNAME for accessing the Argo Tunnel.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A user-friendly name chosen when the tunnel is created. Cannot be empty.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[str]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter(name="tunnelToken")
    def tunnel_token(self) -> pulumi.Output[str]:
        """
        Token used by a connector to authenticate and run the tunnel.
        """
        return pulumi.get(self, "tunnel_token")

