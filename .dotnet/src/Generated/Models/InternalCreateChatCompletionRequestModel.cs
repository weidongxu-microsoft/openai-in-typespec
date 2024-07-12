// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace OpenAI.Chat
{
    internal readonly partial struct InternalCreateChatCompletionRequestModel : IEquatable<InternalCreateChatCompletionRequestModel>
    {
        private readonly string _value;

        public InternalCreateChatCompletionRequestModel(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        private const string Gpt4oValue = "gpt-4o";
        private const string Gpt4o20240513Value = "gpt-4o-2024-05-13";
        private const string Gpt4TurboValue = "gpt-4-turbo";
        private const string Gpt4Turbo20240409Value = "gpt-4-turbo-2024-04-09";
        private const string Gpt40125PreviewValue = "gpt-4-0125-preview";
        private const string Gpt4TurboPreviewValue = "gpt-4-turbo-preview";
        private const string Gpt41106PreviewValue = "gpt-4-1106-preview";
        private const string Gpt4VisionPreviewValue = "gpt-4-vision-preview";
        private const string Gpt4Value = "gpt-4";
        private const string Gpt40314Value = "gpt-4-0314";
        private const string Gpt40613Value = "gpt-4-0613";
        private const string Gpt432kValue = "gpt-4-32k";
        private const string Gpt432k0314Value = "gpt-4-32k-0314";
        private const string Gpt432k0613Value = "gpt-4-32k-0613";
        private const string Gpt35TurboValue = "gpt-3.5-turbo";
        private const string Gpt35Turbo16kValue = "gpt-3.5-turbo-16k";
        private const string Gpt35Turbo0301Value = "gpt-3.5-turbo-0301";
        private const string Gpt35Turbo0613Value = "gpt-3.5-turbo-0613";
        private const string Gpt35Turbo1106Value = "gpt-3.5-turbo-1106";
        private const string Gpt35Turbo0125Value = "gpt-3.5-turbo-0125";
        private const string Gpt35Turbo16k0613Value = "gpt-3.5-turbo-16k-0613";

        public static InternalCreateChatCompletionRequestModel Gpt4o { get; } = new InternalCreateChatCompletionRequestModel(Gpt4oValue);
        public static InternalCreateChatCompletionRequestModel Gpt4o20240513 { get; } = new InternalCreateChatCompletionRequestModel(Gpt4o20240513Value);
        public static InternalCreateChatCompletionRequestModel Gpt4Turbo { get; } = new InternalCreateChatCompletionRequestModel(Gpt4TurboValue);
        public static InternalCreateChatCompletionRequestModel Gpt4Turbo20240409 { get; } = new InternalCreateChatCompletionRequestModel(Gpt4Turbo20240409Value);
        public static InternalCreateChatCompletionRequestModel Gpt40125Preview { get; } = new InternalCreateChatCompletionRequestModel(Gpt40125PreviewValue);
        public static InternalCreateChatCompletionRequestModel Gpt4TurboPreview { get; } = new InternalCreateChatCompletionRequestModel(Gpt4TurboPreviewValue);
        public static InternalCreateChatCompletionRequestModel Gpt41106Preview { get; } = new InternalCreateChatCompletionRequestModel(Gpt41106PreviewValue);
        public static InternalCreateChatCompletionRequestModel Gpt4VisionPreview { get; } = new InternalCreateChatCompletionRequestModel(Gpt4VisionPreviewValue);
        public static InternalCreateChatCompletionRequestModel Gpt4 { get; } = new InternalCreateChatCompletionRequestModel(Gpt4Value);
        public static InternalCreateChatCompletionRequestModel Gpt40314 { get; } = new InternalCreateChatCompletionRequestModel(Gpt40314Value);
        public static InternalCreateChatCompletionRequestModel Gpt40613 { get; } = new InternalCreateChatCompletionRequestModel(Gpt40613Value);
        public static InternalCreateChatCompletionRequestModel Gpt432k { get; } = new InternalCreateChatCompletionRequestModel(Gpt432kValue);
        public static InternalCreateChatCompletionRequestModel Gpt432k0314 { get; } = new InternalCreateChatCompletionRequestModel(Gpt432k0314Value);
        public static InternalCreateChatCompletionRequestModel Gpt432k0613 { get; } = new InternalCreateChatCompletionRequestModel(Gpt432k0613Value);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo { get; } = new InternalCreateChatCompletionRequestModel(Gpt35TurboValue);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo16k { get; } = new InternalCreateChatCompletionRequestModel(Gpt35Turbo16kValue);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo0301 { get; } = new InternalCreateChatCompletionRequestModel(Gpt35Turbo0301Value);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo0613 { get; } = new InternalCreateChatCompletionRequestModel(Gpt35Turbo0613Value);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo1106 { get; } = new InternalCreateChatCompletionRequestModel(Gpt35Turbo1106Value);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo0125 { get; } = new InternalCreateChatCompletionRequestModel(Gpt35Turbo0125Value);
        public static InternalCreateChatCompletionRequestModel Gpt35Turbo16k0613 { get; } = new InternalCreateChatCompletionRequestModel(Gpt35Turbo16k0613Value);
        public static bool operator ==(InternalCreateChatCompletionRequestModel left, InternalCreateChatCompletionRequestModel right) => left.Equals(right);
        public static bool operator !=(InternalCreateChatCompletionRequestModel left, InternalCreateChatCompletionRequestModel right) => !left.Equals(right);
        public static implicit operator InternalCreateChatCompletionRequestModel(string value) => new InternalCreateChatCompletionRequestModel(value);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is InternalCreateChatCompletionRequestModel other && Equals(other);
        public bool Equals(InternalCreateChatCompletionRequestModel other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value != null ? StringComparer.InvariantCultureIgnoreCase.GetHashCode(_value) : 0;
        public override string ToString() => _value;
    }
}
