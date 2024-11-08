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

/**
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 */
@Immutable
public final class RunStepCompletionUsage implements JsonSerializable<RunStepCompletionUsage> {
    /*
     * Number of completion tokens used over the course of the run step.
     */
    @Generated
    private final int completionTokens;

    /*
     * Number of prompt tokens used over the course of the run step.
     */
    @Generated
    private final int promptTokens;

    /*
     * Total number of tokens used (prompt + completion).
     */
    @Generated
    private final int totalTokens;

    /**
     * Creates an instance of RunStepCompletionUsage class.
     * 
     * @param completionTokens the completionTokens value to set.
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    private RunStepCompletionUsage(int completionTokens, int promptTokens, int totalTokens) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the completionTokens property: Number of completion tokens used over the course of the run step.
     * 
     * @return the completionTokens value.
     */
    @Generated
    public int getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * Get the promptTokens property: Number of prompt tokens used over the course of the run step.
     * 
     * @return the promptTokens value.
     */
    @Generated
    public int getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: Total number of tokens used (prompt + completion).
     * 
     * @return the totalTokens value.
     */
    @Generated
    public int getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("completion_tokens", this.completionTokens);
        jsonWriter.writeIntField("prompt_tokens", this.promptTokens);
        jsonWriter.writeIntField("total_tokens", this.totalTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepCompletionUsage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepCompletionUsage if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepCompletionUsage.
     */
    @Generated
    public static RunStepCompletionUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int completionTokens = 0;
            int promptTokens = 0;
            int totalTokens = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("completion_tokens".equals(fieldName)) {
                    completionTokens = reader.getInt();
                } else if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getInt();
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepCompletionUsage(completionTokens, promptTokens, totalTokens);
        });
    }
}
