// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Internal.Models
{
    /// <summary> The MessageDeltaContentTextAnnotationsFilePathObject_type. </summary>
    internal readonly partial struct MessageDeltaContentTextAnnotationsFilePathObjectType : IEquatable<MessageDeltaContentTextAnnotationsFilePathObjectType>
    {
        private readonly string _value;

        /// <summary> Initializes a new instance of <see cref="MessageDeltaContentTextAnnotationsFilePathObjectType"/>. </summary>
        /// <exception cref="ArgumentNullException"> <paramref name="value"/> is null. </exception>
        public MessageDeltaContentTextAnnotationsFilePathObjectType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string FilePathValue = "file_path";

        /// <summary> file_path. </summary>
        public static MessageDeltaContentTextAnnotationsFilePathObjectType FilePath { get; } = new MessageDeltaContentTextAnnotationsFilePathObjectType(FilePathValue);
        /// <summary> Determines if two <see cref="MessageDeltaContentTextAnnotationsFilePathObjectType"/> values are the same. </summary>
        public static bool operator ==(MessageDeltaContentTextAnnotationsFilePathObjectType left, MessageDeltaContentTextAnnotationsFilePathObjectType right) => left.Equals(right);
        /// <summary> Determines if two <see cref="MessageDeltaContentTextAnnotationsFilePathObjectType"/> values are not the same. </summary>
        public static bool operator !=(MessageDeltaContentTextAnnotationsFilePathObjectType left, MessageDeltaContentTextAnnotationsFilePathObjectType right) => !left.Equals(right);
        /// <summary> Converts a string to a <see cref="MessageDeltaContentTextAnnotationsFilePathObjectType"/>. </summary>
        public static implicit operator MessageDeltaContentTextAnnotationsFilePathObjectType(string value) => new MessageDeltaContentTextAnnotationsFilePathObjectType(value);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is MessageDeltaContentTextAnnotationsFilePathObjectType other && Equals(other);
        /// <inheritdoc />
        public bool Equals(MessageDeltaContentTextAnnotationsFilePathObjectType other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;
        /// <inheritdoc />
        public override string ToString() => _value;
    }
}