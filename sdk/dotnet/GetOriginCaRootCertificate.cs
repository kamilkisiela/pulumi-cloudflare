// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Cloudflare
{
    public static class GetOriginCaRootCertificate
    {
        /// <summary>
        /// Use this data source to get the [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates) for a given algorithm.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var originCa = Output.Create(Cloudflare.GetOriginCaRootCertificate.InvokeAsync(new Cloudflare.GetOriginCaRootCertificateArgs
        ///         {
        ///             Algorithm = "&lt;algorithm&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOriginCaRootCertificateResult> InvokeAsync(GetOriginCaRootCertificateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetOriginCaRootCertificateResult>("cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate", args ?? new GetOriginCaRootCertificateArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to get the [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates) for a given algorithm.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var originCa = Output.Create(Cloudflare.GetOriginCaRootCertificate.InvokeAsync(new Cloudflare.GetOriginCaRootCertificateArgs
        ///         {
        ///             Algorithm = "&lt;algorithm&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOriginCaRootCertificateResult> Invoke(GetOriginCaRootCertificateInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetOriginCaRootCertificateResult>("cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate", args ?? new GetOriginCaRootCertificateInvokeArgs(), options.WithVersion());
    }


    public sealed class GetOriginCaRootCertificateArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the algorithm used when creating an Origin CA certificate. Currently-supported values are "rsa" and "ecc" (case-insensitive).
        /// </summary>
        [Input("algorithm", required: true)]
        public string Algorithm { get; set; } = null!;

        public GetOriginCaRootCertificateArgs()
        {
        }
    }

    public sealed class GetOriginCaRootCertificateInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the algorithm used when creating an Origin CA certificate. Currently-supported values are "rsa" and "ecc" (case-insensitive).
        /// </summary>
        [Input("algorithm", required: true)]
        public Input<string> Algorithm { get; set; } = null!;

        public GetOriginCaRootCertificateInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetOriginCaRootCertificateResult
    {
        public readonly string Algorithm;
        /// <summary>
        /// The Origin CA root certificate in PEM format.
        /// </summary>
        public readonly string CertPem;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetOriginCaRootCertificateResult(
            string algorithm,

            string certPem,

            string id)
        {
            Algorithm = algorithm;
            CertPem = certPem;
            Id = id;
        }
    }
}
