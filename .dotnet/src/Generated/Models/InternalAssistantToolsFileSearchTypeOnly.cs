// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Assistants
{
    internal partial class InternalAssistantToolsFileSearchTypeOnly
    {
        internal IDictionary<string, BinaryData> _serializedAdditionalRawData;

        public InternalAssistantToolsFileSearchTypeOnly()
        {
        }

        internal InternalAssistantToolsFileSearchTypeOnly(InternalAssistantToolsFileSearchTypeOnlyType type, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Type = type;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        public InternalAssistantToolsFileSearchTypeOnlyType Type { get; } = InternalAssistantToolsFileSearchTypeOnlyType.FileSearch;
    }
}