// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.RealtimeConversation
{
    public partial class ConversationRateLimitsUpdatedUpdate : IJsonModel<ConversationRateLimitsUpdatedUpdate>
    {
        void IJsonModel<ConversationRateLimitsUpdatedUpdate>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ConversationRateLimitsUpdatedUpdate>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(ConversationRateLimitsUpdatedUpdate)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            if (SerializedAdditionalRawData?.ContainsKey("rate_limits") != true)
            {
                writer.WritePropertyName("rate_limits"u8);
                writer.WriteStartArray();
                foreach (var item in RateLimits)
                {
                    writer.WriteObjectValue(item, options);
                }
                writer.WriteEndArray();
            }
            if (SerializedAdditionalRawData?.ContainsKey("type") != true)
            {
                writer.WritePropertyName("type"u8);
                writer.WriteStringValue(Kind.ToSerialString());
            }
            if (SerializedAdditionalRawData?.ContainsKey("event_id") != true)
            {
                if (EventId != null)
                {
                    writer.WritePropertyName("event_id"u8);
                    writer.WriteStringValue(EventId);
                }
                else
                {
                    writer.WriteNull("event_id");
                }
            }
            if (SerializedAdditionalRawData != null)
            {
                foreach (var item in SerializedAdditionalRawData)
                {
                    if (ModelSerializationExtensions.IsSentinelValue(item.Value))
                    {
                        continue;
                    }
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

        ConversationRateLimitsUpdatedUpdate IJsonModel<ConversationRateLimitsUpdatedUpdate>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ConversationRateLimitsUpdatedUpdate>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(ConversationRateLimitsUpdatedUpdate)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeConversationRateLimitsUpdatedUpdate(document.RootElement, options);
        }

        internal static ConversationRateLimitsUpdatedUpdate DeserializeConversationRateLimitsUpdatedUpdate(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= ModelSerializationExtensions.WireOptions;

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            IReadOnlyList<ConversationRateLimitDetailsItem> rateLimits = default;
            ConversationUpdateKind type = default;
            string eventId = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> rawDataDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("rate_limits"u8))
                {
                    List<ConversationRateLimitDetailsItem> array = new List<ConversationRateLimitDetailsItem>();
                    foreach (var item in property.Value.EnumerateArray())
                    {
                        array.Add(ConversationRateLimitDetailsItem.DeserializeConversationRateLimitDetailsItem(item, options));
                    }
                    rateLimits = array;
                    continue;
                }
                if (property.NameEquals("type"u8))
                {
                    type = property.Value.GetString().ToConversationUpdateKind();
                    continue;
                }
                if (property.NameEquals("event_id"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        eventId = null;
                        continue;
                    }
                    eventId = property.Value.GetString();
                    continue;
                }
                if (true)
                {
                    rawDataDictionary ??= new Dictionary<string, BinaryData>();
                    rawDataDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = rawDataDictionary;
            return new ConversationRateLimitsUpdatedUpdate(type, eventId, serializedAdditionalRawData, rateLimits);
        }

        BinaryData IPersistableModel<ConversationRateLimitsUpdatedUpdate>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ConversationRateLimitsUpdatedUpdate>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(ConversationRateLimitsUpdatedUpdate)} does not support writing '{options.Format}' format.");
            }
        }

        ConversationRateLimitsUpdatedUpdate IPersistableModel<ConversationRateLimitsUpdatedUpdate>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ConversationRateLimitsUpdatedUpdate>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeConversationRateLimitsUpdatedUpdate(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(ConversationRateLimitsUpdatedUpdate)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<ConversationRateLimitsUpdatedUpdate>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        internal static new ConversationRateLimitsUpdatedUpdate FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeConversationRateLimitsUpdatedUpdate(document.RootElement);
        }

        internal override BinaryContent ToBinaryContent()
        {
            return BinaryContent.Create(this, ModelSerializationExtensions.WireOptions);
        }
    }
}
