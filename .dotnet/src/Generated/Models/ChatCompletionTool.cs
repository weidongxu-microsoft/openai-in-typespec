// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Internal.Models
{
    /// <summary> The ChatCompletionTool. </summary>
    internal partial class ChatCompletionTool
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

        /// <summary> Initializes a new instance of <see cref="ChatCompletionTool"/>. </summary>
        /// <param name="function"></param>
        /// <exception cref="ArgumentNullException"> <paramref name="function"/> is null. </exception>
        public ChatCompletionTool(FunctionObject function)
        {
            Argument.AssertNotNull(function, nameof(function));

            Function = function;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionTool"/>. </summary>
        /// <param name="type"> The type of the tool. Currently, only `function` is supported. </param>
        /// <param name="function"></param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal ChatCompletionTool(ChatCompletionToolType type, FunctionObject function, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Type = type;
            Function = function;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionTool"/> for deserialization. </summary>
        internal ChatCompletionTool()
        {
        }

        /// <summary> The type of the tool. Currently, only `function` is supported. </summary>
        public ChatCompletionToolType Type { get; } = ChatCompletionToolType.Function;

        /// <summary> Gets the function. </summary>
        public FunctionObject Function { get; }
    }
}
