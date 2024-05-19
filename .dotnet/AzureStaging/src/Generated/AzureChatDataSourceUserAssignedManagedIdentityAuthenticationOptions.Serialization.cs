// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace Azure.AI.OpenAI.Chat
{
    public partial class AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions : IJsonModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>
    {
        void IJsonModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("managed_identity_resource_id"u8);
            writer.WriteStringValue(ManagedIdentityResourceId);
            writer.WritePropertyName("type"u8);
            writer.WriteStringValue(Type);
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

        AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions IJsonModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeAzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions(document.RootElement, options);
        }

        internal static AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions DeserializeAzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= ModelSerializationExtensions.WireOptions;

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            string managedIdentityResourceId = default;
            string type = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> rawDataDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("managed_identity_resource_id"u8))
                {
                    managedIdentityResourceId = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("type"u8))
                {
                    type = property.Value.GetString();
                    continue;
                }
                if (options.Format != "W")
                {
                    rawDataDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = rawDataDictionary;
            return new AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions(type, serializedAdditionalRawData, managedIdentityResourceId);
        }

        BinaryData IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions)} does not support writing '{options.Format}' format.");
            }
        }

        AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeAzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static new AzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeAzureChatDataSourceUserAssignedManagedIdentityAuthenticationOptions(document.RootElement);
        }

        /// <summary> Convert into a <see cref="BinaryContent"/>. </summary>
        internal override BinaryContent ToBinaryContent()
        {
            return BinaryContent.Create(this, ModelSerializationExtensions.WireOptions);
        }
    }
}
