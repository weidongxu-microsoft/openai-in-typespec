// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Internal.Models
{
    /// <summary> Enum for type in AssistantsNamedToolChoice. </summary>
    internal readonly partial struct AssistantsNamedToolChoiceType : IEquatable<AssistantsNamedToolChoiceType>
    {
        private readonly string _value;

        /// <summary> Initializes a new instance of <see cref="AssistantsNamedToolChoiceType"/>. </summary>
        /// <exception cref="ArgumentNullException"> <paramref name="value"/> is null. </exception>
        public AssistantsNamedToolChoiceType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string FunctionValue = "function";
        private const string CodeInterpreterValue = "code_interpreter";
        private const string FileSearchValue = "file_search";

        /// <summary> function. </summary>
        public static AssistantsNamedToolChoiceType Function { get; } = new AssistantsNamedToolChoiceType(FunctionValue);
        /// <summary> code_interpreter. </summary>
        public static AssistantsNamedToolChoiceType CodeInterpreter { get; } = new AssistantsNamedToolChoiceType(CodeInterpreterValue);
        /// <summary> file_search. </summary>
        public static AssistantsNamedToolChoiceType FileSearch { get; } = new AssistantsNamedToolChoiceType(FileSearchValue);
        /// <summary> Determines if two <see cref="AssistantsNamedToolChoiceType"/> values are the same. </summary>
        public static bool operator ==(AssistantsNamedToolChoiceType left, AssistantsNamedToolChoiceType right) => left.Equals(right);
        /// <summary> Determines if two <see cref="AssistantsNamedToolChoiceType"/> values are not the same. </summary>
        public static bool operator !=(AssistantsNamedToolChoiceType left, AssistantsNamedToolChoiceType right) => !left.Equals(right);
        /// <summary> Converts a string to a <see cref="AssistantsNamedToolChoiceType"/>. </summary>
        public static implicit operator AssistantsNamedToolChoiceType(string value) => new AssistantsNamedToolChoiceType(value);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is AssistantsNamedToolChoiceType other && Equals(other);
        /// <inheritdoc />
        public bool Equals(AssistantsNamedToolChoiceType other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        /// <inheritdoc />
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;
        /// <inheritdoc />
        public override string ToString() => _value;
    }
}