// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace Azure.AI.OpenAI
{
    /// <summary> The AzureContentFilterResultForChoiceProtectedMaterialCodeCitation. </summary>
    internal partial class InternalAzureContentFilterResultForChoiceProtectedMaterialCodeCitation
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

        /// <summary> Initializes a new instance of <see cref="InternalAzureContentFilterResultForChoiceProtectedMaterialCodeCitation"/>. </summary>
        internal InternalAzureContentFilterResultForChoiceProtectedMaterialCodeCitation()
        {
        }

        /// <summary> Initializes a new instance of <see cref="InternalAzureContentFilterResultForChoiceProtectedMaterialCodeCitation"/>. </summary>
        /// <param name="license"></param>
        /// <param name="url"></param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal InternalAzureContentFilterResultForChoiceProtectedMaterialCodeCitation(string license, Uri url, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            License = license;
            URL = url;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Gets the license. </summary>
        public string License { get; }
        /// <summary> Gets the url. </summary>
        public Uri URL { get; }
    }
}