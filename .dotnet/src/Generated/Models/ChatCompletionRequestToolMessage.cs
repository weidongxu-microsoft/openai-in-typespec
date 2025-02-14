// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Internal.Models
{
    /// <summary> The ChatCompletionRequestToolMessage. </summary>
    internal partial class ChatCompletionRequestToolMessage
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

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestToolMessage"/>. </summary>
        /// <param name="content"> The contents of the tool message. </param>
        /// <param name="toolCallId"> Tool call that this message is responding to. </param>
        /// <exception cref="ArgumentNullException"> <paramref name="content"/> or <paramref name="toolCallId"/> is null. </exception>
        public ChatCompletionRequestToolMessage(string content, string toolCallId)
        {
            Argument.AssertNotNull(content, nameof(content));
            Argument.AssertNotNull(toolCallId, nameof(toolCallId));

            Content = content;
            ToolCallId = toolCallId;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestToolMessage"/>. </summary>
        /// <param name="role"> The role of the messages author, in this case `tool`. </param>
        /// <param name="content"> The contents of the tool message. </param>
        /// <param name="toolCallId"> Tool call that this message is responding to. </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal ChatCompletionRequestToolMessage(ChatCompletionRequestToolMessageRole role, string content, string toolCallId, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Role = role;
            Content = content;
            ToolCallId = toolCallId;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestToolMessage"/> for deserialization. </summary>
        internal ChatCompletionRequestToolMessage()
        {
        }

        /// <summary> The role of the messages author, in this case `tool`. </summary>
        public ChatCompletionRequestToolMessageRole Role { get; } = ChatCompletionRequestToolMessageRole.Tool;

        /// <summary> The contents of the tool message. </summary>
        public string Content { get; }
        /// <summary> Tool call that this message is responding to. </summary>
        public string ToolCallId { get; }
    }
}
