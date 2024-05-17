// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Assistants
{
    /// <summary> Text output from the Code Interpreter tool call as part of a run step. </summary>
    internal partial class InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject : RunStepUpdateCodeInterpreterOutput
    {
        /// <summary> Initializes a new instance of <see cref="InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject"/>. </summary>
        /// <param name="index"> The index of the output in the outputs array. </param>
        internal InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(int index)
        {
            Type = "logs";
            Index = index;
        }

        /// <summary> Initializes a new instance of <see cref="InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject"/>. </summary>
        /// <param name="type"> The discriminated type identifier for the details object. </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        /// <param name="index"> The index of the output in the outputs array. </param>
        /// <param name="internalLogs"> The text output from the Code Interpreter tool call. </param>
        internal InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(string type, IDictionary<string, BinaryData> serializedAdditionalRawData, int index, string internalLogs) : base(type, serializedAdditionalRawData)
        {
            Index = index;
            InternalLogs = internalLogs;
        }

        /// <summary> Initializes a new instance of <see cref="InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject"/> for deserialization. </summary>
        internal InternalRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
        {
        }

        /// <summary> The index of the output in the outputs array. </summary>
        public int Index { get; }
    }
}