// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Assistants
{
    /// <summary> Details of the tool call. </summary>
    internal partial class InternalRunStepDeltaStepDetailsToolCallsObject : InternalRunStepDeltaStepDetails
    {
        /// <summary> Initializes a new instance of <see cref="InternalRunStepDeltaStepDetailsToolCallsObject"/>. </summary>
        internal InternalRunStepDeltaStepDetailsToolCallsObject()
        {
            Type = "tool_calls";
            ToolCalls = new ChangeTrackingList<InternalRunStepDeltaStepDetailsToolCallsObjectToolCallsObject>();
        }

        /// <summary> Initializes a new instance of <see cref="InternalRunStepDeltaStepDetailsToolCallsObject"/>. </summary>
        /// <param name="type"> The discriminated type identifier for the details object. </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        /// <param name="toolCalls">
        /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.
        /// Please note <see cref="InternalRunStepDeltaStepDetailsToolCallsObjectToolCallsObject"/> is the base class. According to the scenario, a derived class of the base class might need to be assigned here, or this property needs to be casted to one of the possible derived classes.
        /// The available derived classes include <see cref="InternalRunStepDeltaStepDetailsToolCallsCodeObject"/>, <see cref="InternalRunStepDeltaStepDetailsToolCallsFileSearchObject"/> and <see cref="InternalRunStepDeltaStepDetailsToolCallsFunctionObject"/>.
        /// </param>
        internal InternalRunStepDeltaStepDetailsToolCallsObject(string type, IDictionary<string, BinaryData> serializedAdditionalRawData, IReadOnlyList<InternalRunStepDeltaStepDetailsToolCallsObjectToolCallsObject> toolCalls) : base(type, serializedAdditionalRawData)
        {
            ToolCalls = toolCalls;
        }

        /// <summary>
        /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.
        /// Please note <see cref="InternalRunStepDeltaStepDetailsToolCallsObjectToolCallsObject"/> is the base class. According to the scenario, a derived class of the base class might need to be assigned here, or this property needs to be casted to one of the possible derived classes.
        /// The available derived classes include <see cref="InternalRunStepDeltaStepDetailsToolCallsCodeObject"/>, <see cref="InternalRunStepDeltaStepDetailsToolCallsFileSearchObject"/> and <see cref="InternalRunStepDeltaStepDetailsToolCallsFunctionObject"/>.
        /// </summary>
        public IReadOnlyList<InternalRunStepDeltaStepDetailsToolCallsObjectToolCallsObject> ToolCalls { get; }
    }
}