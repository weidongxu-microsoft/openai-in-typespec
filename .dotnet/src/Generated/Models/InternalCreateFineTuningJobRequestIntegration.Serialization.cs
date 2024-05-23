// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.FineTuning
{
    internal partial class InternalCreateFineTuningJobRequestIntegration : IJsonModel<InternalCreateFineTuningJobRequestIntegration>
    {
        void IJsonModel<InternalCreateFineTuningJobRequestIntegration>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalCreateFineTuningJobRequestIntegration>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(InternalCreateFineTuningJobRequestIntegration)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("type"u8);
            writer.WriteStringValue(Type.ToString());
            writer.WritePropertyName("wandb"u8);
            writer.WriteObjectValue(Wandb, options);
            if (true && _serializedAdditionalRawData != null)
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

        InternalCreateFineTuningJobRequestIntegration IJsonModel<InternalCreateFineTuningJobRequestIntegration>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalCreateFineTuningJobRequestIntegration>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(InternalCreateFineTuningJobRequestIntegration)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeInternalCreateFineTuningJobRequestIntegration(document.RootElement, options);
        }

        internal static InternalCreateFineTuningJobRequestIntegration DeserializeInternalCreateFineTuningJobRequestIntegration(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= ModelSerializationExtensions.WireOptions;

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            InternalCreateFineTuningJobRequestIntegrationType type = default;
            InternalCreateFineTuningJobRequestIntegrationWandb wandb = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> rawDataDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("type"u8))
                {
                    type = new InternalCreateFineTuningJobRequestIntegrationType(property.Value.GetString());
                    continue;
                }
                if (property.NameEquals("wandb"u8))
                {
                    wandb = InternalCreateFineTuningJobRequestIntegrationWandb.DeserializeInternalCreateFineTuningJobRequestIntegrationWandb(property.Value, options);
                    continue;
                }
                if (true)
                {
                    rawDataDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = rawDataDictionary;
            return new InternalCreateFineTuningJobRequestIntegration(type, wandb, serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<InternalCreateFineTuningJobRequestIntegration>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalCreateFineTuningJobRequestIntegration>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(InternalCreateFineTuningJobRequestIntegration)} does not support writing '{options.Format}' format.");
            }
        }

        InternalCreateFineTuningJobRequestIntegration IPersistableModel<InternalCreateFineTuningJobRequestIntegration>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<InternalCreateFineTuningJobRequestIntegration>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeInternalCreateFineTuningJobRequestIntegration(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(InternalCreateFineTuningJobRequestIntegration)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<InternalCreateFineTuningJobRequestIntegration>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static InternalCreateFineTuningJobRequestIntegration FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeInternalCreateFineTuningJobRequestIntegration(document.RootElement);
        }

        /// <summary> Convert into a <see cref="BinaryContent"/>. </summary>
        internal virtual BinaryContent ToBinaryContent()
        {
            return BinaryContent.Create(this, ModelSerializationExtensions.WireOptions);
        }
    }
}
