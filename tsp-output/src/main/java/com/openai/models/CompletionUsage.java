// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;

/**
 * Usage statistics for the completion request.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CompletionUsage implements JsonSerializable<CompletionUsage> {
    /*
     * Number of tokens in the prompt.
     */
    @Metadata(generated = true)
    private final long promptTokens;

    /*
     * Number of tokens in the generated completion
     */
    @Metadata(generated = true)
    private final long completionTokens;

    /*
     * Total number of tokens used in the request (prompt + completion).
     */
    @Metadata(generated = true)
    private final long totalTokens;

    /**
     * Creates an instance of CompletionUsage class.
     * 
     * @param promptTokens the promptTokens value to set.
     * @param completionTokens the completionTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Metadata(generated = true)
    private CompletionUsage(long promptTokens, long completionTokens, long totalTokens) {
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the promptTokens property: Number of tokens in the prompt.
     * 
     * @return the promptTokens value.
     */
    @Metadata(generated = true)
    public long getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the completionTokens property: Number of tokens in the generated completion.
     * 
     * @return the completionTokens value.
     */
    @Metadata(generated = true)
    public long getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * Get the totalTokens property: Total number of tokens used in the request (prompt + completion).
     * 
     * @return the totalTokens value.
     */
    @Metadata(generated = true)
    public long getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeLongField("prompt_tokens", this.promptTokens);
        jsonWriter.writeLongField("completion_tokens", this.completionTokens);
        jsonWriter.writeLongField("total_tokens", this.totalTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompletionUsage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompletionUsage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CompletionUsage.
     */
    @Metadata(generated = true)
    public static CompletionUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            long promptTokens = 0L;
            long completionTokens = 0L;
            long totalTokens = 0L;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getLong();
                } else if ("completion_tokens".equals(fieldName)) {
                    completionTokens = reader.getLong();
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getLong();
                } else {
                    reader.skipChildren();
                }
            }
            return new CompletionUsage(promptTokens, completionTokens, totalTokens);
        });
    }
}
