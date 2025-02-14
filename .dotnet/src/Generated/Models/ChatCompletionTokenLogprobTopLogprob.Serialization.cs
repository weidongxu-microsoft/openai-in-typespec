// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.Internal.Models
{
    internal partial class ChatCompletionTokenLogprobTopLogprob : IJsonModel<ChatCompletionTokenLogprobTopLogprob>
    {
        void IJsonModel<ChatCompletionTokenLogprobTopLogprob>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ChatCompletionTokenLogprobTopLogprob>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(ChatCompletionTokenLogprobTopLogprob)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("token"u8);
            writer.WriteStringValue(Token);
            writer.WritePropertyName("logprob"u8);
            writer.WriteNumberValue(Logprob);
            if (Bytes != null && Optional.IsCollectionDefined(Bytes))
            {
                writer.WritePropertyName("bytes"u8);
                writer.WriteStartArray();
                foreach (var item in Bytes)
                {
                    writer.WriteNumberValue(item);
                }
                writer.WriteEndArray();
            }
            else
            {
                writer.WriteNull("bytes");
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

        ChatCompletionTokenLogprobTopLogprob IJsonModel<ChatCompletionTokenLogprobTopLogprob>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ChatCompletionTokenLogprobTopLogprob>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(ChatCompletionTokenLogprobTopLogprob)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeChatCompletionTokenLogprobTopLogprob(document.RootElement, options);
        }

        internal static ChatCompletionTokenLogprobTopLogprob DeserializeChatCompletionTokenLogprobTopLogprob(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= new ModelReaderWriterOptions("W");

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            string token = default;
            double logprob = default;
            IReadOnlyList<long> bytes = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> additionalPropertiesDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("token"u8))
                {
                    token = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("logprob"u8))
                {
                    logprob = property.Value.GetDouble();
                    continue;
                }
                if (property.NameEquals("bytes"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        bytes = new ChangeTrackingList<long>();
                        continue;
                    }
                    List<long> array = new List<long>();
                    foreach (var item in property.Value.EnumerateArray())
                    {
                        array.Add(item.GetInt64());
                    }
                    bytes = array;
                    continue;
                }
                if (options.Format != "W")
                {
                    additionalPropertiesDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = additionalPropertiesDictionary;
            return new ChatCompletionTokenLogprobTopLogprob(token, logprob, bytes, serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<ChatCompletionTokenLogprobTopLogprob>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ChatCompletionTokenLogprobTopLogprob>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(ChatCompletionTokenLogprobTopLogprob)} does not support writing '{options.Format}' format.");
            }
        }

        ChatCompletionTokenLogprobTopLogprob IPersistableModel<ChatCompletionTokenLogprobTopLogprob>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<ChatCompletionTokenLogprobTopLogprob>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeChatCompletionTokenLogprobTopLogprob(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(ChatCompletionTokenLogprobTopLogprob)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<ChatCompletionTokenLogprobTopLogprob>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static ChatCompletionTokenLogprobTopLogprob FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeChatCompletionTokenLogprobTopLogprob(document.RootElement);
        }

        /// <summary> Convert into a Utf8JsonRequestBody. </summary>
        internal virtual BinaryContent ToBinaryBody()
        {
            return BinaryContent.Create(this, new ModelReaderWriterOptions("W"));
        }
    }
}
