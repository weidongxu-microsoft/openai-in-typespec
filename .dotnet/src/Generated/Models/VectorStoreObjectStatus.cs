// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Internal.Models
{
    /// <summary> Enum for status in VectorStoreObject. </summary>
    internal readonly partial struct VectorStoreObjectStatus : IEquatable<VectorStoreObjectStatus>
    {
        private readonly string _value;

        /// <summary> Initializes a new instance of <see cref="VectorStoreObjectStatus"/>. </summary>
        /// <exception cref="ArgumentNullException"> <paramref name="value"/> is null. </exception>
        public VectorStoreObjectStatus(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string ExpiredValue = "expired";
        private const string InProgressValue = "in_progress";
        private const string CompletedValue = "completed";

        /// <summary> expired. </summary>
        public static VectorStoreObjectStatus Expired { get; } = new VectorStoreObjectStatus(ExpiredValue);
        /// <summary> in_progress. </summary>
        public static VectorStoreObjectStatus InProgress { get; } = new VectorStoreObjectStatus(InProgressValue);
        /// <summary> completed. </summary>
        public static VectorStoreObjectStatus Completed { get; } = new VectorStoreObjectStatus(CompletedValue);
        /// <summary> Determines if two <see cref="VectorStoreObjectStatus"/> values are the same. </summary>
        public static bool operator ==(VectorStoreObjectStatus left, VectorStoreObjectStatus right) => left.Equals(right);
        /// <summary> Determines if two <see cref="VectorStoreObjectStatus"/> values are not the same. </summary>
        public static bool operator !=(VectorStoreObjectStatus left, VectorStoreObjectStatus right) => !left.Equals(right);
        /// <summary> Converts a string to a <see cref="VectorStoreObjectStatus"/>. </summary>
        public static implicit operator VectorStoreObjectStatus(string value) => new VectorStoreObjectStatus(value);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is VectorStoreObjectStatus other && Equals(other);
        /// <inheritdoc />
        public bool Equals(VectorStoreObjectStatus other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;
        /// <inheritdoc />
        public override string ToString() => _value;
    }
}