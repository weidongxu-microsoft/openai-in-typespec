// <auto-generated/>

#nullable disable

using System;
using System.ClientModel.Internal;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.Models
{
    public partial class SubmitToolOutputsRunRequestToolOutputs : IUtf8JsonWriteable, IJsonModel<SubmitToolOutputsRunRequestToolOutputs>
    {
        void IUtf8JsonWriteable.Write(Utf8JsonWriter writer) => ((IJsonModel<SubmitToolOutputsRunRequestToolOutputs>)this).Write(writer, new ModelReaderWriterOptions("W"));

        void IJsonModel<SubmitToolOutputsRunRequestToolOutputs>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(SubmitToolOutputsRunRequestToolOutputs)} does not support '{format}' format.");
            }

            writer.WriteStartObject();
            if (OptionalProperty.IsDefined(ToolCallId))
            {
                writer.WritePropertyName("tool_call_id"u8);
                writer.WriteStringValue(ToolCallId);
            }
            if (OptionalProperty.IsDefined(Output))
            {
                writer.WritePropertyName("output"u8);
                writer.WriteStringValue(Output);
            }
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

        SubmitToolOutputsRunRequestToolOutputs IJsonModel<SubmitToolOutputsRunRequestToolOutputs>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(SubmitToolOutputsRunRequestToolOutputs)} does not support '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeSubmitToolOutputsRunRequestToolOutputs(document.RootElement, options);
        }

        internal static SubmitToolOutputsRunRequestToolOutputs DeserializeSubmitToolOutputsRunRequestToolOutputs(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= new ModelReaderWriterOptions("W");

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            OptionalProperty<string> toolCallId = default;
            OptionalProperty<string> output = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> additionalPropertiesDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("tool_call_id"u8))
                {
                    toolCallId = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("output"u8))
                {
                    output = property.Value.GetString();
                    continue;
                }
                if (options.Format != "W")
                {
                    additionalPropertiesDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = additionalPropertiesDictionary;
            return new SubmitToolOutputsRunRequestToolOutputs(toolCallId.Value, output.Value, serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(SubmitToolOutputsRunRequestToolOutputs)} does not support '{options.Format}' format.");
            }
        }

        SubmitToolOutputsRunRequestToolOutputs IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeSubmitToolOutputsRunRequestToolOutputs(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(SubmitToolOutputsRunRequestToolOutputs)} does not support '{options.Format}' format.");
            }
        }

        string IPersistableModel<SubmitToolOutputsRunRequestToolOutputs>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static SubmitToolOutputsRunRequestToolOutputs FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeSubmitToolOutputsRunRequestToolOutputs(document.RootElement);
        }

        /// <summary> Convert into a Utf8JsonRequestBody. </summary>
        internal virtual RequestBody ToRequestBody()
        {
            var content = new Utf8JsonRequestBody();
            content.JsonWriter.WriteObjectValue(this);
            return content;
        }
    }
}
