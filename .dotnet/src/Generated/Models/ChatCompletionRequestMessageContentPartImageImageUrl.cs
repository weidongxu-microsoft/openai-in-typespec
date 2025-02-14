// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.Internal.Models
{
    /// <summary> The ChatCompletionRequestMessageContentPartImageImageUrl. </summary>
    internal partial class ChatCompletionRequestMessageContentPartImageImageUrl
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

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestMessageContentPartImageImageUrl"/>. </summary>
        /// <param name="url"> Either a URL of the image or the base64 encoded image data. </param>
        /// <exception cref="ArgumentNullException"> <paramref name="url"/> is null. </exception>
        public ChatCompletionRequestMessageContentPartImageImageUrl(BinaryData url)
        {
            Argument.AssertNotNull(url, nameof(url));

            Url = url;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestMessageContentPartImageImageUrl"/>. </summary>
        /// <param name="url"> Either a URL of the image or the base64 encoded image data. </param>
        /// <param name="detail">
        /// Specifies the detail level of the image. Learn more in the
        /// [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
        /// </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal ChatCompletionRequestMessageContentPartImageImageUrl(BinaryData url, ChatCompletionRequestMessageContentPartImageImageUrlDetail? detail, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Url = url;
            Detail = detail;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="ChatCompletionRequestMessageContentPartImageImageUrl"/> for deserialization. </summary>
        internal ChatCompletionRequestMessageContentPartImageImageUrl()
        {
        }

        /// <summary>
        /// Either a URL of the image or the base64 encoded image data.
        /// <para>
        /// To assign an object to this property use <see cref="BinaryData.FromObjectAsJson{T}(T, System.Text.Json.JsonSerializerOptions?)"/>.
        /// </para>
        /// <para>
        /// To assign an already formatted json string to this property use <see cref="BinaryData.FromString(string)"/>.
        /// </para>
        /// <para>
        /// <remarks>
        /// Supported types:
        /// <list type="bullet">
        /// <item>
        /// <description><see cref="Uri"/></description>
        /// </item>
        /// <item>
        /// <description><see cref="string"/></description>
        /// </item>
        /// </list>
        /// </remarks>
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
        public BinaryData Url { get; }
        /// <summary>
        /// Specifies the detail level of the image. Learn more in the
        /// [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
        /// </summary>
        public ChatCompletionRequestMessageContentPartImageImageUrlDetail? Detail { get; set; }
    }
}
