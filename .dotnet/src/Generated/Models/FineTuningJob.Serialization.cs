// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace OpenAI.Internal.Models
{
    internal partial class FineTuningJob : IJsonModel<FineTuningJob>
    {
        void IJsonModel<FineTuningJob>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<FineTuningJob>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(FineTuningJob)} does not support writing '{format}' format.");
            }

            writer.WriteStartObject();
            writer.WritePropertyName("id"u8);
            writer.WriteStringValue(Id);
            writer.WritePropertyName("created_at"u8);
            writer.WriteNumberValue(CreatedAt, "U");
            if (Error != null)
            {
                writer.WritePropertyName("error"u8);
                writer.WriteObjectValue<FineTuningJobError>(Error, options);
            }
            else
            {
                writer.WriteNull("error");
            }
            if (FineTunedModel != null)
            {
                writer.WritePropertyName("fine_tuned_model"u8);
                writer.WriteStringValue(FineTunedModel);
            }
            else
            {
                writer.WriteNull("fine_tuned_model");
            }
            if (FinishedAt != null)
            {
                writer.WritePropertyName("finished_at"u8);
                writer.WriteStringValue(FinishedAt.Value, "O");
            }
            else
            {
                writer.WriteNull("finished_at");
            }
            writer.WritePropertyName("hyperparameters"u8);
            writer.WriteObjectValue<FineTuningJobHyperparameters>(Hyperparameters, options);
            writer.WritePropertyName("model"u8);
            writer.WriteStringValue(Model);
            writer.WritePropertyName("object"u8);
            writer.WriteStringValue(Object.ToString());
            writer.WritePropertyName("organization_id"u8);
            writer.WriteStringValue(OrganizationId);
            writer.WritePropertyName("result_files"u8);
            writer.WriteStartArray();
            foreach (var item in ResultFiles)
            {
                writer.WriteStringValue(item);
            }
            writer.WriteEndArray();
            writer.WritePropertyName("status"u8);
            writer.WriteStringValue(Status.ToString());
            if (TrainedTokens != null)
            {
                writer.WritePropertyName("trained_tokens"u8);
                writer.WriteNumberValue(TrainedTokens.Value);
            }
            else
            {
                writer.WriteNull("trained_tokens");
            }
            writer.WritePropertyName("training_file"u8);
            writer.WriteStringValue(TrainingFile);
            if (ValidationFile != null)
            {
                writer.WritePropertyName("validation_file"u8);
                writer.WriteStringValue(ValidationFile);
            }
            else
            {
                writer.WriteNull("validation_file");
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

        FineTuningJob IJsonModel<FineTuningJob>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<FineTuningJob>)this).GetFormatFromOptions(options) : options.Format;
            if (format != "J")
            {
                throw new FormatException($"The model {nameof(FineTuningJob)} does not support reading '{format}' format.");
            }

            using JsonDocument document = JsonDocument.ParseValue(ref reader);
            return DeserializeFineTuningJob(document.RootElement, options);
        }

        internal static FineTuningJob DeserializeFineTuningJob(JsonElement element, ModelReaderWriterOptions options = null)
        {
            options ??= new ModelReaderWriterOptions("W");

            if (element.ValueKind == JsonValueKind.Null)
            {
                return null;
            }
            string id = default;
            DateTimeOffset createdAt = default;
            FineTuningJobError error = default;
            string fineTunedModel = default;
            DateTimeOffset? finishedAt = default;
            FineTuningJobHyperparameters hyperparameters = default;
            string model = default;
            FineTuningJobObject @object = default;
            string organizationId = default;
            IReadOnlyList<string> resultFiles = default;
            FineTuningJobStatus status = default;
            long? trainedTokens = default;
            string trainingFile = default;
            string validationFile = default;
            IDictionary<string, BinaryData> serializedAdditionalRawData = default;
            Dictionary<string, BinaryData> additionalPropertiesDictionary = new Dictionary<string, BinaryData>();
            foreach (var property in element.EnumerateObject())
            {
                if (property.NameEquals("id"u8))
                {
                    id = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("created_at"u8))
                {
                    createdAt = DateTimeOffset.FromUnixTimeSeconds(property.Value.GetInt64());
                    continue;
                }
                if (property.NameEquals("error"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        error = null;
                        continue;
                    }
                    error = FineTuningJobError.DeserializeFineTuningJobError(property.Value, options);
                    continue;
                }
                if (property.NameEquals("fine_tuned_model"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        fineTunedModel = null;
                        continue;
                    }
                    fineTunedModel = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("finished_at"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        finishedAt = null;
                        continue;
                    }
                    finishedAt = property.Value.GetDateTimeOffset("O");
                    continue;
                }
                if (property.NameEquals("hyperparameters"u8))
                {
                    hyperparameters = FineTuningJobHyperparameters.DeserializeFineTuningJobHyperparameters(property.Value, options);
                    continue;
                }
                if (property.NameEquals("model"u8))
                {
                    model = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("object"u8))
                {
                    @object = new FineTuningJobObject(property.Value.GetString());
                    continue;
                }
                if (property.NameEquals("organization_id"u8))
                {
                    organizationId = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("result_files"u8))
                {
                    List<string> array = new List<string>();
                    foreach (var item in property.Value.EnumerateArray())
                    {
                        array.Add(item.GetString());
                    }
                    resultFiles = array;
                    continue;
                }
                if (property.NameEquals("status"u8))
                {
                    status = new FineTuningJobStatus(property.Value.GetString());
                    continue;
                }
                if (property.NameEquals("trained_tokens"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        trainedTokens = null;
                        continue;
                    }
                    trainedTokens = property.Value.GetInt64();
                    continue;
                }
                if (property.NameEquals("training_file"u8))
                {
                    trainingFile = property.Value.GetString();
                    continue;
                }
                if (property.NameEquals("validation_file"u8))
                {
                    if (property.Value.ValueKind == JsonValueKind.Null)
                    {
                        validationFile = null;
                        continue;
                    }
                    validationFile = property.Value.GetString();
                    continue;
                }
                if (options.Format != "W")
                {
                    additionalPropertiesDictionary.Add(property.Name, BinaryData.FromString(property.Value.GetRawText()));
                }
            }
            serializedAdditionalRawData = additionalPropertiesDictionary;
            return new FineTuningJob(
                id,
                createdAt,
                error,
                fineTunedModel,
                finishedAt,
                hyperparameters,
                model,
                @object,
                organizationId,
                resultFiles,
                status,
                trainedTokens,
                trainingFile,
                validationFile,
                serializedAdditionalRawData);
        }

        BinaryData IPersistableModel<FineTuningJob>.Write(ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<FineTuningJob>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    return ModelReaderWriter.Write(this, options);
                default:
                    throw new FormatException($"The model {nameof(FineTuningJob)} does not support writing '{options.Format}' format.");
            }
        }

        FineTuningJob IPersistableModel<FineTuningJob>.Create(BinaryData data, ModelReaderWriterOptions options)
        {
            var format = options.Format == "W" ? ((IPersistableModel<FineTuningJob>)this).GetFormatFromOptions(options) : options.Format;

            switch (format)
            {
                case "J":
                    {
                        using JsonDocument document = JsonDocument.Parse(data);
                        return DeserializeFineTuningJob(document.RootElement, options);
                    }
                default:
                    throw new FormatException($"The model {nameof(FineTuningJob)} does not support reading '{options.Format}' format.");
            }
        }

        string IPersistableModel<FineTuningJob>.GetFormatFromOptions(ModelReaderWriterOptions options) => "J";

        /// <summary> Deserializes the model from a raw response. </summary>
        /// <param name="response"> The result to deserialize the model from. </param>
        internal static FineTuningJob FromResponse(PipelineResponse response)
        {
            using var document = JsonDocument.Parse(response.Content);
            return DeserializeFineTuningJob(document.RootElement);
        }

        /// <summary> Convert into a Utf8JsonRequestBody. </summary>
        internal virtual BinaryContent ToBinaryBody()
        {
            return BinaryContent.Create(this, new ModelReaderWriterOptions("W"));
        }
    }
}
