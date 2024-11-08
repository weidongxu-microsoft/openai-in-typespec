// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateEmbeddingResponseUsage model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateEmbeddingResponseUsage implements JsonSerializable<CreateEmbeddingResponseUsage> {
    /*
     * The number of tokens used by the prompt.
     */
    @Metadata(generated = true)
    private final int promptTokens;

    /*
     * The total number of tokens used by the request.
     */
    @Metadata(generated = true)
    private final int totalTokens;

    /**
     * Creates an instance of CreateEmbeddingResponseUsage class.
     * 
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Metadata(generated = true)
    private CreateEmbeddingResponseUsage(int promptTokens, int totalTokens) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the promptTokens property: The number of tokens used by the prompt.
     * 
     * @return the promptTokens value.
     */
    @Metadata(generated = true)
    public int getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: The total number of tokens used by the request.
     * 
     * @return the totalTokens value.
     */
    @Metadata(generated = true)
    public int getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("prompt_tokens", this.promptTokens);
        jsonWriter.writeIntField("total_tokens", this.totalTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateEmbeddingResponseUsage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateEmbeddingResponseUsage if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateEmbeddingResponseUsage.
     */
    @Metadata(generated = true)
    public static CreateEmbeddingResponseUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int promptTokens = 0;
            int totalTokens = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getInt();
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateEmbeddingResponseUsage(promptTokens, totalTokens);
        });
    }
}