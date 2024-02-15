// <auto-generated/>

#nullable disable

using System;
using System.ClientModel.Internal;
using System.Collections.Generic;

namespace OpenAI.Models
{
    /// <summary> Represents an embedding vector returned by embedding endpoint. </summary>
    public partial class Embedding
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

        /// <summary> Initializes a new instance of <see cref="Embedding"/>. </summary>
        /// <param name="index"> The index of the embedding in the list of embeddings. </param>
        /// <param name="embeddingProperty">
        /// The embedding vector, which is a list of floats. The length of vector depends on the model as
        /// listed in the [embedding guide](/docs/guides/embeddings).
        /// </param>
        /// <exception cref="ArgumentNullException"> <paramref name="embeddingProperty"/> is null. </exception>
        internal Embedding(long index, BinaryData embeddingProperty)
        {
            ClientUtilities.AssertNotNull(embeddingProperty, nameof(embeddingProperty));

            Index = index;
            EmbeddingProperty = embeddingProperty;
        }

        /// <summary> Initializes a new instance of <see cref="Embedding"/>. </summary>
        /// <param name="index"> The index of the embedding in the list of embeddings. </param>
        /// <param name="embeddingProperty">
        /// The embedding vector, which is a list of floats. The length of vector depends on the model as
        /// listed in the [embedding guide](/docs/guides/embeddings).
        /// </param>
        /// <param name="object"> The object type, which is always "embedding". </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal Embedding(long index, BinaryData embeddingProperty, EmbeddingObject @object, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Index = index;
            EmbeddingProperty = embeddingProperty;
            Object = @object;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="Embedding"/> for deserialization. </summary>
        internal Embedding()
        {
        }

        /// <summary> The index of the embedding in the list of embeddings. </summary>
        public long Index { get; }
        /// <summary>
        /// The embedding vector, which is a list of floats. The length of vector depends on the model as
        /// listed in the [embedding guide](/docs/guides/embeddings).
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
        /// <description><see cref="IList{T}"/> where <c>T</c> is of type <see cref="double"/></description>
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
        public BinaryData EmbeddingProperty { get; }
        /// <summary> The object type, which is always "embedding". </summary>
        public EmbeddingObject Object { get; } = EmbeddingObject.Embedding;
    }
}
