// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.Internal.Models
{
    internal partial class TranscriptionSegment : IJsonModel<TranscriptionSegment>
    {
        void IJsonModel<TranscriptionSegment>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<TranscriptionSegment>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(TranscriptionSegment)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("id"u8);
            writer.WriteNumberValue(Id);
            writer.WritePropertyName("seek"u8);
            writer.WriteNumberValue(Seek);
            writer.WritePropertyName("start"u8);
            writer.WriteNumberValue(Convert.ToInt32(Start.ToString("%s")));
            writer.WritePropertyName("end"u8);
            writer.WriteNumberValue(Convert.ToInt32(End.ToString("%s")));
            writer.WritePropertyName("text"u8);
            writer.WriteStringValue(Text);
            writer.WritePropertyName("tokens"u8);
            writer.WriteStartArray();
            foreach (var item in Tokens)
            {
                writer.WriteNumberValue(item);
            }
            writer.WriteEndArray();
            writer.WritePropertyName("temperature"u8);
            writer.WriteNumberValue(Temperature);
            writer.WritePropertyName("avg_logprob"u8);
            writer.WriteNumberValue(AvgLogprob);
            writer.WritePropertyName("compression_ratio"u8);
            writer.WriteNumberValue(CompressionRatio);
            writer.WritePropertyName("no_speech_prob"u8);
            writer.WriteNumberValue(NoSpeechProb);
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

        TranscriptionSegment IJsonModel<TranscriptionSegment>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<TranscriptionSegment>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(TranscriptionSegment)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeTranscriptionSegment(document.RootElement, options);
        }

        internal static TranscriptionSegment DeserializeTranscriptionSegment(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= new ModelReaderWriterOptions("W");

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            long id = default;
            long seek = default;
            TimeSpan start = default;
            TimeSpan end = default;
            string text = default;
            IReadOnlyList<long> tokens = default;
            double temperature = default;
            double avgLogprob = default;
            double compressionRatio = default;
            double noSpeechProb = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> additionalPropertiesDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("id"u8))
                {
                    id = property.Value.GetInt64();
                    continue;
                }
                if (property.NameEquals("seek"u8))
                {
                    seek = property.Value.GetInt64();
                    continue;
                }
                if (property.NameEquals("start"u8))
                {
                    start = TimeSpan.FromSeconds(property.Value.GetInt32());
                    continue;
                }
                if (property.NameEquals("end"u8))
                {
                    end = TimeSpan.FromSeconds(property.Value.GetInt32());
                    continue;
                }
                if (property.NameEquals("text"u8))
                {
                    text = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("tokens"u8))
                {
                    List<long> array = new List<long>();
                    foreach (var item in property.Value.EnumerateArray())
                    {
                        array.Add(item.GetInt64());
                    }
                    tokens = array;
                    continue;
                }
                if (property.NameEquals("temperature"u8))
                {
                    temperature = property.Value.GetDouble();
                    continue;
                }
                if (property.NameEquals("avg_logprob"u8))
                {
                    avgLogprob = property.Value.GetDouble();
                    continue;
                }
                if (property.NameEquals("compression_ratio"u8))
                {
                    compressionRatio = property.Value.GetDouble();
                    continue;
                }
                if (property.NameEquals("no_speech_prob"u8))
                {
                    noSpeechProb = property.Value.GetDouble();
                    continue;
                }
                if (options.Format != "W")
                {
                    additionalPropertiesDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = additionalPropertiesDictionary;
            return new TranscriptionSegment(
                id,
                seek,
                start,
                end,
                text,
                tokens,
                temperature,
                avgLogprob,
                compressionRatio,
                noSpeechProb,
                serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<TranscriptionSegment>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<TranscriptionSegment>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(TranscriptionSegment)} does not support writing '{options.Format}' format.");
            }
        }

        TranscriptionSegment IPersistableModel<TranscriptionSegment>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<TranscriptionSegment>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeTranscriptionSegment(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(TranscriptionSegment)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<TranscriptionSegment>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static TranscriptionSegment FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeTranscriptionSegment(document.RootElement);
        }

        /// <summary> Convert into a Utf8JsonRequestBody. </summary>
        internal virtual BinaryContent ToBinaryBody()
        {
            return BinaryContent.Create(this, new ModelReaderWriterOptions("W"));
        }
    }
}
