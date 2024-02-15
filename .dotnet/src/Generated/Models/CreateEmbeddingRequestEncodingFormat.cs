// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Models
{
    /// <summary> Enum for encoding_format in CreateEmbeddingRequest. </summary>
    public readonly partial struct CreateEmbeddingRequestEncodingFormat : IEquatable<CreateEmbeddingRequestEncodingFormat>
    {
        private readonly string _value;

        /// <summary> Initializes a new instance of <see cref="CreateEmbeddingRequestEncodingFormat"/>. </summary>
        /// <exception cref="ArgumentNullException"> <paramref name="value"/> is null. </exception>
        public CreateEmbeddingRequestEncodingFormat(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string FloatValue = "float";
        private const string Base64Value = "base64";

        /// <summary> float. </summary>
        public static CreateEmbeddingRequestEncodingFormat Float { get; } = new CreateEmbeddingRequestEncodingFormat(FloatValue);
        /// <summary> base64. </summary>
        public static CreateEmbeddingRequestEncodingFormat Base64 { get; } = new CreateEmbeddingRequestEncodingFormat(Base64Value);
        /// <summary> Determines if two <see cref="CreateEmbeddingRequestEncodingFormat"/> values are the same. </summary>
        public static bool operator ==(CreateEmbeddingRequestEncodingFormat left, CreateEmbeddingRequestEncodingFormat right) => left.Equals(right);
        /// <summary> Determines if two <see cref="CreateEmbeddingRequestEncodingFormat"/> values are not the same. </summary>
        public static bool operator !=(CreateEmbeddingRequestEncodingFormat left, CreateEmbeddingRequestEncodingFormat right) => !left.Equals(right);
        /// <summary> Converts a string to a <see cref="CreateEmbeddingRequestEncodingFormat"/>. </summary>
        public static implicit operator CreateEmbeddingRequestEncodingFormat(string value) => new CreateEmbeddingRequestEncodingFormat(value);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is CreateEmbeddingRequestEncodingFormat other && Equals(other);
        /// <inheritdoc />
        public bool Equals(CreateEmbeddingRequestEncodingFormat other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;
        /// <inheritdoc />
        public override string ToString() => _value;
    }
}
