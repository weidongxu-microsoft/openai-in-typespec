// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Assistants
{
    internal partial class MessageDeltaContentImageUrlObjectImageUrl
    {
        internal IDictionary<string, BinaryData> SerializedAdditionalRawData { get; set; }
        internal MessageDeltaContentImageUrlObjectImageUrl()
        {
        }

        internal MessageDeltaContentImageUrlObjectImageUrl(Uri url, string detail, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Url = url;
            Detail = detail;
            SerializedAdditionalRawData = serializedAdditionalRawData;
        }

        public Uri Url { get; }
    }
}
