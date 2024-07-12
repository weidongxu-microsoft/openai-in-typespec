// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Assistants
{
    internal readonly partial struct InternalMessageDeltaObjectDeltaRole : IEquatable<InternalMessageDeltaObjectDeltaRole>
    {
        private readonly string _value;

        public InternalMessageDeltaObjectDeltaRole(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string UserValue = "user";
        private const string AssistantValue = "assistant";

        public static InternalMessageDeltaObjectDeltaRole User { get; } = new InternalMessageDeltaObjectDeltaRole(UserValue);
        public static InternalMessageDeltaObjectDeltaRole Assistant { get; } = new InternalMessageDeltaObjectDeltaRole(AssistantValue);
        public static bool operator ==(InternalMessageDeltaObjectDeltaRole left, InternalMessageDeltaObjectDeltaRole right) => left.Equals(right);
        public static bool operator !=(InternalMessageDeltaObjectDeltaRole left, InternalMessageDeltaObjectDeltaRole right) => !left.Equals(right);
        public static implicit operator InternalMessageDeltaObjectDeltaRole(string value) => new InternalMessageDeltaObjectDeltaRole(value);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is InternalMessageDeltaObjectDeltaRole other && Equals(other);
        public bool Equals(InternalMessageDeltaObjectDeltaRole other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value != null ? StringComparer.InvariantCultureIgnoreCase.GetHashCode(_value) : 0;
        public override string ToString() => _value;
    }
}
