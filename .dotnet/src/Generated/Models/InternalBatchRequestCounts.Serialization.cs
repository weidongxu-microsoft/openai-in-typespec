// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.Batch
{
    internal partial struct InternalBatchRequestCounts : IJsonModel<InternalBatchRequestCounts>, IJsonModel<object>
    {
        void IJsonModel<InternalBatchRequestCounts>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalBatchRequestCounts>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(InternalBatchRequestCounts)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("total"u8);
            writer.WriteNumberValue(Total);
            writer.WritePropertyName("completed"u8);
            writer.WriteNumberValue(Completed);
            writer.WritePropertyName("failed"u8);
            writer.WriteNumberValue(Failed);
            if (options.Format != "W" && _serializedAdditionalRawData != null)
            {
                foreach (var item in _serializedAdditionalRawData)
                {
                    writer.WritePropertyName(item.Key);
#if NET6_0_OR_GREATER
				writer.WriteRawValue(item.Value);
#else
                    using (JsonDocument document = JsonDocument.Parse(item.Value))
                    {
                        JsonSerializer.Serialize(writer, document.RootElement);
                    }
#endif
                }
            }
            writer.WriteEndObject();
        }

        InternalBatchRequestCounts IJsonModel<InternalBatchRequestCounts>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalBatchRequestCounts>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(InternalBatchRequestCounts)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeInternalBatchRequestCounts(document.RootElement, options);
        }

        void IJsonModel<object>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options) => ((IJsonModel<InternalBatchRequestCounts>)this).Write(writer, options);

        object IJsonModel<object>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => ((IJsonModel<InternalBatchRequestCounts>)this).Create(ref reader, options);

        internal static InternalBatchRequestCounts DeserializeInternalBatchRequestCounts(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= ModelSerializationExtensions.WireOptions;

            int total = default;
            int completed = default;
            int failed = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> rawDataDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("total"u8))
                {
                    total = property.Value.GetInt32();
                    continue;
                }
                if (property.NameEquals("completed"u8))
                {
                    completed = property.Value.GetInt32();
                    continue;
                }
                if (property.NameEquals("failed"u8))
                {
                    failed = property.Value.GetInt32();
                    continue;
                }
                if (options.Format != "W")
                {
                    rawDataDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = rawDataDictionary;
            return new InternalBatchRequestCounts(total, completed, failed, serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<InternalBatchRequestCounts>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalBatchRequestCounts>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(InternalBatchRequestCounts)} does not support writing '{options.Format}' format.");
            }
        }

        InternalBatchRequestCounts IPersistableModel<InternalBatchRequestCounts>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalBatchRequestCounts>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeInternalBatchRequestCounts(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(InternalBatchRequestCounts)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<InternalBatchRequestCounts>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        BinaryData IPersistableModel<object>.Write(ModelReaderWriterOptions options) => ((IPersistableModel<InternalBatchRequestCounts>)this).Write(options);

        object IPersistableModel<object>.Create(BinaryData data, ModelReaderWriterOptions options) => ((IPersistableModel<InternalBatchRequestCounts>)this).Create(data, options);

        string IPersistableModel<object>.GetFormatFromOptions(ModelReaderWriterOptions options) => ((IPersistableModel<InternalBatchRequestCounts>)this).GetFormatFromOptions(options);

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static InternalBatchRequestCounts FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeInternalBatchRequestCounts(document.RootElement);
        }

        /// <summary> Convert into a <see cref="BinaryContent"/>. </summary>
        internal BinaryContent ToBinaryContent()
        {
            return BinaryContent.Create(this, ModelSerializationExtensions.WireOptions);
        }
    }
}