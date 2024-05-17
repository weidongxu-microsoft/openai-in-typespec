// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Assistants
{
    /// <summary> The AssistantToolsFileSearch. </summary>
    public partial class FileSearchToolDefinition : ToolDefinition
    {
        /// <summary> Initializes a new instance of <see cref="FileSearchToolDefinition"/>. </summary>
        public FileSearchToolDefinition()
        {
            Type = "file_search";
        }

        /// <summary> Initializes a new instance of <see cref="FileSearchToolDefinition"/>. </summary>
        /// <param name="type"></param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal FileSearchToolDefinition(string type, IDictionary<string, BinaryData> serializedAdditionalRawData) : base(type, serializedAdditionalRawData)
        {
        }
    }
}