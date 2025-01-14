// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Internal.Models
{
    /// <summary> The ChatCompletionRequestMessageContentPartText. </summary>
    internal partial class ChatCompletionRequestMessageContentPartText
    {
        /// <summary>
        /// Keeps track of any properties unknown to the library.
        /// <para>
        /// To assign an object to the value of this property use <see cref="BinaryData.FromObjectAsJson{T}(T, System.Text.Json.JsonSerializerOptions?)"/>.
        /// </para>
        /// <para>
        /// To assign an already formatted json string to this property use <see cref="BinaryData.FromString(string)"/>.
        /// </para>
        /// <para>
        /// Examples:
        /// <list type="bullet">
        /// <item>
        /// <term>BinaryData.FromObjectAsJson("foo")</term>
        /// <description>Creates a payload of "foo".</description>
        /// </item>
        /// <item>
        /// <term>BinaryData.FromString("\"foo\"")</term>
        /// <description>Creates a payload of "foo".</description>
        /// </item>
        /// <item>
        /// <term>BinaryData.FromObjectAsJson(new { key = "value" })</term>
        /// <description>Creates a payload of { "key": "value" }.</description>
        /// </item>
        /// <item>
        /// <term>BinaryData.FromString("{\"key\": \"value\"}")</term>
        /// <description>Creates a payload of { "key": "value" }.</description>
        /// </item>
        /// </list>
        /// </para>
        /// </summary>
        private IDictionary<string, BinaryData> _serializedAdditionalRawData;

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestMessageContentPartText"/>. </summary>
        /// <param name="text"> The text content. </param>
        /// <exception cref="ArgumentNullException"> <paramref name="text"/> is null. </exception>
        public ChatCompletionRequestMessageContentPartText(string text)
        {
            Argument.AssertNotNull(text, nameof(text));

            Text = text;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestMessageContentPartText"/>. </summary>
        /// <param name="type"> The type of the content part. </param>
        /// <param name="text"> The text content. </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal ChatCompletionRequestMessageContentPartText(ChatCompletionRequestMessageContentPartTextType type, string text, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Type = type;
            Text = text;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestMessageContentPartText"/> for deserialization. </summary>
        internal ChatCompletionRequestMessageContentPartText()
        {
        }

        /// <summary> The type of the content part. </summary>
        public ChatCompletionRequestMessageContentPartTextType Type { get; } = ChatCompletionRequestMessageContentPartTextType.Text;

        /// <summary> The text content. </summary>
        public string Text { get; }
    }
}
