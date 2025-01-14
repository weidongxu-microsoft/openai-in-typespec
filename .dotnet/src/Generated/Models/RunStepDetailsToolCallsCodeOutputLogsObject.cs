// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Internal.Models
{
    /// <summary> Text output from the Code Interpreter tool call as part of a run step. </summary>
    internal partial class RunStepDetailsToolCallsCodeOutputLogsObject
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

        /// <summary> Initializes a new instance of <see cref="RunStepDetailsToolCallsCodeOutputLogsObject"/>. </summary>
        /// <param name="logs"> The text output from the Code Interpreter tool call. </param>
        /// <exception cref="ArgumentNullException"> <paramref name="logs"/> is null. </exception>
        internal RunStepDetailsToolCallsCodeOutputLogsObject(string logs)
        {
            Argument.AssertNotNull(logs, nameof(logs));

            Logs = logs;
        }

        /// <summary> Initializes a new instance of <see cref="RunStepDetailsToolCallsCodeOutputLogsObject"/>. </summary>
        /// <param name="type"> Always `logs`. </param>
        /// <param name="logs"> The text output from the Code Interpreter tool call. </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal RunStepDetailsToolCallsCodeOutputLogsObject(RunStepDetailsToolCallsCodeOutputLogsObjectType type, string logs, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Type = type;
            Logs = logs;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="RunStepDetailsToolCallsCodeOutputLogsObject"/> for deserialization. </summary>
        internal RunStepDetailsToolCallsCodeOutputLogsObject()
        {
        }

        /// <summary> Always `logs`. </summary>
        public RunStepDetailsToolCallsCodeOutputLogsObjectType Type { get; } = RunStepDetailsToolCallsCodeOutputLogsObjectType.Logs;

        /// <summary> The text output from the Code Interpreter tool call. </summary>
        public string Logs { get; }
    }
}
