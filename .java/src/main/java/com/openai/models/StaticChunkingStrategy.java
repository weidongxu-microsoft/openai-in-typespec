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
 * The StaticChunkingStrategy model.
 */
@Immutable
public final class StaticChunkingStrategy implements JsonSerializable<StaticChunkingStrategy> {
    /*
     * The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the
     * maximum value is `4096`.
     */
    @Generated
    private final int maxChunkSizeTokens;

    /*
     * The number of tokens that overlap between chunks. The default value is `400`.
     * 
     * Note that the overlap must not exceed half of `max_chunk_size_tokens`.
     */
    @Generated
    private final int chunkOverlapTokens;

    /**
     * Creates an instance of StaticChunkingStrategy class.
     * 
     * @param maxChunkSizeTokens the maxChunkSizeTokens value to set.
     * @param chunkOverlapTokens the chunkOverlapTokens value to set.
     */
    @Generated
    public StaticChunkingStrategy(int maxChunkSizeTokens, int chunkOverlapTokens) {
        this.maxChunkSizeTokens = maxChunkSizeTokens;
        this.chunkOverlapTokens = chunkOverlapTokens;
    }

    /**
     * Get the maxChunkSizeTokens property: The maximum number of tokens in each chunk. The default value is `800`. The
     * minimum value is `100` and the maximum value is `4096`.
     * 
     * @return the maxChunkSizeTokens value.
     */
    @Generated
    public int getMaxChunkSizeTokens() {
        return this.maxChunkSizeTokens;
    }

    /**
     * Get the chunkOverlapTokens property: The number of tokens that overlap between chunks. The default value is
     * `400`.
     * 
     * Note that the overlap must not exceed half of `max_chunk_size_tokens`.
     * 
     * @return the chunkOverlapTokens value.
     */
    @Generated
    public int getChunkOverlapTokens() {
        return this.chunkOverlapTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("max_chunk_size_tokens", this.maxChunkSizeTokens);
        jsonWriter.writeIntField("chunk_overlap_tokens", this.chunkOverlapTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticChunkingStrategy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticChunkingStrategy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticChunkingStrategy.
     */
    @Generated
    public static StaticChunkingStrategy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int maxChunkSizeTokens = 0;
            int chunkOverlapTokens = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("max_chunk_size_tokens".equals(fieldName)) {
                    maxChunkSizeTokens = reader.getInt();
                } else if ("chunk_overlap_tokens".equals(fieldName)) {
                    chunkOverlapTokens = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new StaticChunkingStrategy(maxChunkSizeTokens, chunkOverlapTokens);
        });
    }
}
