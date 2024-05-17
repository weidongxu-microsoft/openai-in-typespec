// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.Assistants
{
    internal partial class InternalListThreadsResponse : IJsonModel<InternalListThreadsResponse>
    {
        void IJsonModel<InternalListThreadsResponse>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalListThreadsResponse>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(InternalListThreadsResponse)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("object"u8);
            writer.WriteObjectValue<object>(Object, options);
            writer.WritePropertyName("data"u8);
            writer.WriteStartArray();
            foreach (var item in Data)
            {
                writer.WriteObjectValue(item, options);
            }
            writer.WriteEndArray();
            writer.WritePropertyName("first_id"u8);
            writer.WriteStringValue(FirstId);
            writer.WritePropertyName("last_id"u8);
            writer.WriteStringValue(LastId);
            writer.WritePropertyName("has_more"u8);
            writer.WriteBooleanValue(HasMore);
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

        InternalListThreadsResponse IJsonModel<InternalListThreadsResponse>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalListThreadsResponse>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(InternalListThreadsResponse)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeInternalListThreadsResponse(document.RootElement, options);
        }

        internal static InternalListThreadsResponse DeserializeInternalListThreadsResponse(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= ModelSerializationExtensions.WireOptions;

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            object @object = default;
            IReadOnlyList<AssistantThread> data = default;
            string firstId = default;
            string lastId = default;
            bool hasMore = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> rawDataDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("object"u8))
                {
                    @object = property.Value.GetObject();
                    continue;
                }
                if (property.NameEquals("data"u8))
                {
                    List<AssistantThread> array = new List<AssistantThread>();
                    foreach (var item in property.Value.EnumerateArray())
                    {
                        array.Add(AssistantThread.DeserializeAssistantThread(item, options));
                    }
                    data = array;
                    continue;
                }
                if (property.NameEquals("first_id"u8))
                {
                    firstId = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("last_id"u8))
                {
                    lastId = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("has_more"u8))
                {
                    hasMore = property.Value.GetBoolean();
                    continue;
                }
                if (options.Format != "W")
                {
                    rawDataDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = rawDataDictionary;
            return new InternalListThreadsResponse(
                @object,
                data,
                firstId,
                lastId,
                hasMore,
                serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<InternalListThreadsResponse>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalListThreadsResponse>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(InternalListThreadsResponse)} does not support writing '{options.Format}' format.");
            }
        }

        InternalListThreadsResponse IPersistableModel<InternalListThreadsResponse>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalListThreadsResponse>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeInternalListThreadsResponse(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(InternalListThreadsResponse)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<InternalListThreadsResponse>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static InternalListThreadsResponse FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeInternalListThreadsResponse(document.RootElement);
        }

        /// <summary> Convert into a <see cref="BinaryContent"/>. </summary>
        internal virtual BinaryContent ToBinaryContent()
        {
            return BinaryContent.Create(this, ModelSerializationExtensions.WireOptions);
        }
    }
}