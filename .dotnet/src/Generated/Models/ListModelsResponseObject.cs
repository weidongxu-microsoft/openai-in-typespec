// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Internal.Models
{
    /// <summary> The ListModelsResponse_object. </summary>
    internal readonly partial struct ListModelsResponseObject : IEquatable<ListModelsResponseObject>
    {
        private readonly string _value;

        /// <summary> Initializes a new instance of <see cref="ListModelsResponseObject"/>. </summary>
        /// <exception cref="ArgumentNullException"> <paramref name="value"/> is null. </exception>
        public ListModelsResponseObject(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string ListValue = "list";

        /// <summary> list. </summary>
        public static ListModelsResponseObject List { get; } = new ListModelsResponseObject(ListValue);
        /// <summary> Determines if two <see cref="ListModelsResponseObject"/> values are the same. </summary>
        public static bool operator ==(ListModelsResponseObject left, ListModelsResponseObject right) => left.Equals(right);
        /// <summary> Determines if two <see cref="ListModelsResponseObject"/> values are not the same. </summary>
        public static bool operator !=(ListModelsResponseObject left, ListModelsResponseObject right) => !left.Equals(right);
        /// <summary> Converts a string to a <see cref="ListModelsResponseObject"/>. </summary>
        public static implicit operator ListModelsResponseObject(string value) => new ListModelsResponseObject(value);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is ListModelsResponseObject other && Equals(other);
        /// <inheritdoc />
        public bool Equals(ListModelsResponseObject other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;
        /// <inheritdoc />
        public override string ToString() => _value;
    }
}
