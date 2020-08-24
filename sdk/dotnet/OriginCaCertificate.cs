// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.
    /// 
    /// **This resource requires you use your Origin CA Key as the `api_user_service_key`.**
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// using Tls = Pulumi.Tls;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a CSR and generate a CA certificate
    ///         var examplePrivateKey = new Tls.PrivateKey("examplePrivateKey", new Tls.PrivateKeyArgs
    ///         {
    ///             Algorithm = "RSA",
    ///         });
    ///         var exampleCertRequest = new Tls.CertRequest("exampleCertRequest", new Tls.CertRequestArgs
    ///         {
    ///             KeyAlgorithm = examplePrivateKey.Algorithm,
    ///             PrivateKeyPem = examplePrivateKey.PrivateKeyPem,
    ///             Subjects = 
    ///             {
    ///                 new Tls.Inputs.CertRequestSubjectArgs
    ///                 {
    ///                     CommonName = "",
    ///                     Organization = "Terraform Test",
    ///                 },
    ///             },
    ///         });
    ///         var exampleOriginCaCertificate = new Cloudflare.OriginCaCertificate("exampleOriginCaCertificate", new Cloudflare.OriginCaCertificateArgs
    ///         {
    ///             Csr = exampleCertRequest.CertRequestPem,
    ///             Hostnames = 
    ///             {
    ///                 "example.com",
    ///             },
    ///             RequestType = "origin-rsa",
    ///             RequestedValidity = 7,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class OriginCaCertificate : Pulumi.CustomResource
    {
        /// <summary>
        /// The Origin CA certificate
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// The Certificate Signing Request. Must be newline-encoded.
        /// </summary>
        [Output("csr")]
        public Output<string> Csr { get; private set; } = null!;

        /// <summary>
        /// The datetime when the certificate will expire.
        /// </summary>
        [Output("expiresOn")]
        public Output<string> ExpiresOn { get; private set; } = null!;

        /// <summary>
        /// An array of hostnames or wildcard names bound to the certificate.
        /// </summary>
        [Output("hostnames")]
        public Output<ImmutableArray<string>> Hostnames { get; private set; } = null!;

        /// <summary>
        /// The signature type desired on the certificate.
        /// </summary>
        [Output("requestType")]
        public Output<string> RequestType { get; private set; } = null!;

        /// <summary>
        /// The number of days for which the certificate should be valid.
        /// </summary>
        [Output("requestedValidity")]
        public Output<int?> RequestedValidity { get; private set; } = null!;


        /// <summary>
        /// Create a OriginCaCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OriginCaCertificate(string name, OriginCaCertificateArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/originCaCertificate:OriginCaCertificate", name, args ?? new OriginCaCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OriginCaCertificate(string name, Input<string> id, OriginCaCertificateState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/originCaCertificate:OriginCaCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing OriginCaCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OriginCaCertificate Get(string name, Input<string> id, OriginCaCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new OriginCaCertificate(name, id, state, options);
        }
    }

    public sealed class OriginCaCertificateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Certificate Signing Request. Must be newline-encoded.
        /// </summary>
        [Input("csr", required: true)]
        public Input<string> Csr { get; set; } = null!;

        [Input("hostnames", required: true)]
        private InputList<string>? _hostnames;

        /// <summary>
        /// An array of hostnames or wildcard names bound to the certificate.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// The signature type desired on the certificate.
        /// </summary>
        [Input("requestType", required: true)]
        public Input<string> RequestType { get; set; } = null!;

        /// <summary>
        /// The number of days for which the certificate should be valid.
        /// </summary>
        [Input("requestedValidity")]
        public Input<int>? RequestedValidity { get; set; }

        public OriginCaCertificateArgs()
        {
        }
    }

    public sealed class OriginCaCertificateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Origin CA certificate
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// The Certificate Signing Request. Must be newline-encoded.
        /// </summary>
        [Input("csr")]
        public Input<string>? Csr { get; set; }

        /// <summary>
        /// The datetime when the certificate will expire.
        /// </summary>
        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// An array of hostnames or wildcard names bound to the certificate.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// The signature type desired on the certificate.
        /// </summary>
        [Input("requestType")]
        public Input<string>? RequestType { get; set; }

        /// <summary>
        /// The number of days for which the certificate should be valid.
        /// </summary>
        [Input("requestedValidity")]
        public Input<int>? RequestedValidity { get; set; }

        public OriginCaCertificateState()
        {
        }
    }
}
