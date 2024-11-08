// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
 */
@Immutable
public final class FineTuningJob implements JsonSerializable<FineTuningJob> {
    /*
     * The descriptive suffix applied to the job, as specified in the job creation request.
     */
    @Generated
    private String userProvidedSuffix;

    /*
     * The object identifier, which can be referenced in the API endpoints.
     */
    @Generated
    private final String id;

    /*
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     */
    @Generated
    private final long createdAt;

    /*
     * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
     */
    @Generated
    private final FineTuningJobError error;

    /*
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still
     * running.
     */
    @Generated
    private final String fineTunedModel;

    /*
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the
     * fine-tuning job is still running.
     */
    @Generated
    private final Long finishedAt;

    /*
     * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more
     * details.
     */
    @Generated
    private final FineTuningJobHyperparameters hyperparameters;

    /*
     * The base model that is being fine-tuned.
     */
    @Generated
    private final String model;

    /*
     * The object type, which is always "fine_tuning.job".
     */
    @Generated
    private final String object = "fine_tuning.job";

    /*
     * The organization that owns the fine-tuning job.
     */
    @Generated
    private final String organizationId;

    /*
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files
     * API](/docs/api-reference/files/retrieve-contents).
     */
    @Generated
    private final List<String> resultFiles;

    /*
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`,
     * `succeeded`, `failed`, or `cancelled`.
     */
    @Generated
    private final FineTuningJobStatus status;

    /*
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning
     * job is still running.
     */
    @Generated
    private final Integer trainedTokens;

    /*
     * The file ID used for training. You can retrieve the training data with the [Files
     * API](/docs/api-reference/files/retrieve-contents).
     */
    @Generated
    private final String trainingFile;

    /*
     * The file ID used for validation. You can retrieve the validation results with the [Files
     * API](/docs/api-reference/files/retrieve-contents).
     */
    @Generated
    private final String validationFile;

    /*
     * A list of integrations to enable for this fine-tuning job.
     */
    @Generated
    private List<FineTuningIntegration> integrations;

    /*
     * The seed used for the fine-tuning job.
     */
    @Generated
    private final int seed;

    /*
     * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if
     * the fine-tuning job is not running.
     */
    @Generated
    private Long estimatedFinish;

    /**
     * Creates an instance of FineTuningJob class.
     * 
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param error the error value to set.
     * @param fineTunedModel the fineTunedModel value to set.
     * @param finishedAt the finishedAt value to set.
     * @param hyperparameters the hyperparameters value to set.
     * @param model the model value to set.
     * @param organizationId the organizationId value to set.
     * @param resultFiles the resultFiles value to set.
     * @param status the status value to set.
     * @param trainedTokens the trainedTokens value to set.
     * @param trainingFile the trainingFile value to set.
     * @param validationFile the validationFile value to set.
     * @param seed the seed value to set.
     */
    @Generated
    private FineTuningJob(String id, OffsetDateTime createdAt, FineTuningJobError error, String fineTunedModel,
        OffsetDateTime finishedAt, FineTuningJobHyperparameters hyperparameters, String model, String organizationId,
        List<String> resultFiles, FineTuningJobStatus status, Integer trainedTokens, String trainingFile,
        String validationFile, int seed) {
        this.id = id;
        if (createdAt == null) {
            this.createdAt = 0L;
        } else {
            this.createdAt = createdAt.toEpochSecond();
        }
        this.error = error;
        this.fineTunedModel = fineTunedModel;
        if (finishedAt == null) {
            this.finishedAt = null;
        } else {
            this.finishedAt = finishedAt.toEpochSecond();
        }
        this.hyperparameters = hyperparameters;
        this.model = model;
        this.organizationId = organizationId;
        this.resultFiles = resultFiles;
        this.status = status;
        this.trainedTokens = trainedTokens;
        this.trainingFile = trainingFile;
        this.validationFile = validationFile;
        this.seed = seed;
    }

    /**
     * Get the userProvidedSuffix property: The descriptive suffix applied to the job, as specified in the job creation
     * request.
     * 
     * @return the userProvidedSuffix value.
     */
    @Generated
    public String getUserProvidedSuffix() {
        return this.userProvidedSuffix;
    }

    /**
     * Get the id property: The object identifier, which can be referenced in the API endpoints.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the createdAt property: The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * 
     * @return the createdAt value.
     */
    @Generated
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the error property: For fine-tuning jobs that have `failed`, this will contain more information on the cause
     * of the failure.
     * 
     * @return the error value.
     */
    @Generated
    public FineTuningJobError getError() {
        return this.error;
    }

    /**
     * Get the fineTunedModel property: The name of the fine-tuned model that is being created. The value will be null
     * if the fine-tuning job is still running.
     * 
     * @return the fineTunedModel value.
     */
    @Generated
    public String getFineTunedModel() {
        return this.fineTunedModel;
    }

    /**
     * Get the finishedAt property: The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value
     * will be null if the fine-tuning job is still running.
     * 
     * @return the finishedAt value.
     */
    @Generated
    public OffsetDateTime getFinishedAt() {
        if (this.finishedAt == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.finishedAt), ZoneOffset.UTC);
    }

    /**
     * Get the hyperparameters property: The hyperparameters used for the fine-tuning job. See the [fine-tuning
     * guide](/docs/guides/fine-tuning) for more details.
     * 
     * @return the hyperparameters value.
     */
    @Generated
    public FineTuningJobHyperparameters getHyperparameters() {
        return this.hyperparameters;
    }

    /**
     * Get the model property: The base model that is being fine-tuned.
     * 
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Get the object property: The object type, which is always "fine_tuning.job".
     * 
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }

    /**
     * Get the organizationId property: The organization that owns the fine-tuning job.
     * 
     * @return the organizationId value.
     */
    @Generated
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Get the resultFiles property: The compiled results file ID(s) for the fine-tuning job. You can retrieve the
     * results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * 
     * @return the resultFiles value.
     */
    @Generated
    public List<String> getResultFiles() {
        return this.resultFiles;
    }

    /**
     * Get the status property: The current status of the fine-tuning job, which can be either `validating_files`,
     * `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * 
     * @return the status value.
     */
    @Generated
    public FineTuningJobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the trainedTokens property: The total number of billable tokens processed by this fine-tuning job. The value
     * will be null if the fine-tuning job is still running.
     * 
     * @return the trainedTokens value.
     */
    @Generated
    public Integer getTrainedTokens() {
        return this.trainedTokens;
    }

    /**
     * Get the trainingFile property: The file ID used for training. You can retrieve the training data with the [Files
     * API](/docs/api-reference/files/retrieve-contents).
     * 
     * @return the trainingFile value.
     */
    @Generated
    public String getTrainingFile() {
        return this.trainingFile;
    }

    /**
     * Get the validationFile property: The file ID used for validation. You can retrieve the validation results with
     * the [Files API](/docs/api-reference/files/retrieve-contents).
     * 
     * @return the validationFile value.
     */
    @Generated
    public String getValidationFile() {
        return this.validationFile;
    }

    /**
     * Get the integrations property: A list of integrations to enable for this fine-tuning job.
     * 
     * @return the integrations value.
     */
    @Generated
    public List<FineTuningIntegration> getIntegrations() {
        return this.integrations;
    }

    /**
     * Get the seed property: The seed used for the fine-tuning job.
     * 
     * @return the seed value.
     */
    @Generated
    public int getSeed() {
        return this.seed;
    }

    /**
     * Get the estimatedFinish property: The Unix timestamp (in seconds) for when the fine-tuning job is estimated to
     * finish. The value will be null if the fine-tuning job is not running.
     * 
     * @return the estimatedFinish value.
     */
    @Generated
    public OffsetDateTime getEstimatedFinish() {
        if (this.estimatedFinish == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.estimatedFinish), ZoneOffset.UTC);
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeLongField("created_at", this.createdAt);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeStringField("fine_tuned_model", this.fineTunedModel);
        jsonWriter.writeNumberField("finished_at", this.finishedAt);
        jsonWriter.writeJsonField("hyperparameters", this.hyperparameters);
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeStringField("organization_id", this.organizationId);
        jsonWriter.writeArrayField("result_files", this.resultFiles, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeNumberField("trained_tokens", this.trainedTokens);
        jsonWriter.writeStringField("training_file", this.trainingFile);
        jsonWriter.writeStringField("validation_file", this.validationFile);
        jsonWriter.writeIntField("seed", this.seed);
        jsonWriter.writeStringField("user_provided_suffix", this.userProvidedSuffix);
        jsonWriter.writeArrayField("integrations", this.integrations, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("estimated_finish", this.estimatedFinish);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FineTuningJob from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FineTuningJob if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FineTuningJob.
     */
    @Generated
    public static FineTuningJob fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            FineTuningJobError error = null;
            String fineTunedModel = null;
            OffsetDateTime finishedAt = null;
            FineTuningJobHyperparameters hyperparameters = null;
            String model = null;
            String organizationId = null;
            List<String> resultFiles = null;
            FineTuningJobStatus status = null;
            Integer trainedTokens = null;
            String trainingFile = null;
            String validationFile = null;
            int seed = 0;
            String userProvidedSuffix = null;
            List<FineTuningIntegration> integrations = null;
            Long estimatedFinish = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created_at".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("error".equals(fieldName)) {
                    error = FineTuningJobError.fromJson(reader);
                } else if ("fine_tuned_model".equals(fieldName)) {
                    fineTunedModel = reader.getString();
                } else if ("finished_at".equals(fieldName)) {
                    Long finishedAtHolder = reader.getNullable(JsonReader::getLong);
                    if (finishedAtHolder != null) {
                        finishedAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(finishedAtHolder), ZoneOffset.UTC);
                    }
                } else if ("hyperparameters".equals(fieldName)) {
                    hyperparameters = FineTuningJobHyperparameters.fromJson(reader);
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("organization_id".equals(fieldName)) {
                    organizationId = reader.getString();
                } else if ("result_files".equals(fieldName)) {
                    resultFiles = reader.readArray(reader1 -> reader1.getString());
                } else if ("status".equals(fieldName)) {
                    status = FineTuningJobStatus.fromString(reader.getString());
                } else if ("trained_tokens".equals(fieldName)) {
                    trainedTokens = reader.getNullable(JsonReader::getInt);
                } else if ("training_file".equals(fieldName)) {
                    trainingFile = reader.getString();
                } else if ("validation_file".equals(fieldName)) {
                    validationFile = reader.getString();
                } else if ("seed".equals(fieldName)) {
                    seed = reader.getInt();
                } else if ("user_provided_suffix".equals(fieldName)) {
                    userProvidedSuffix = reader.getString();
                } else if ("integrations".equals(fieldName)) {
                    integrations = reader.readArray(reader1 -> FineTuningIntegration.fromJson(reader1));
                } else if ("estimated_finish".equals(fieldName)) {
                    estimatedFinish = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }
            FineTuningJob deserializedFineTuningJob
                = new FineTuningJob(id, createdAt, error, fineTunedModel, finishedAt, hyperparameters, model,
                    organizationId, resultFiles, status, trainedTokens, trainingFile, validationFile, seed);
            deserializedFineTuningJob.userProvidedSuffix = userProvidedSuffix;
            deserializedFineTuningJob.integrations = integrations;
            deserializedFineTuningJob.estimatedFinish = estimatedFinish;

            return deserializedFineTuningJob;
        });
    }
}
