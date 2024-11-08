// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ToolResourcesFileSearchIdsOnly model.
 */
@Fluent
public final class ToolResourcesFileSearchIdsOnly implements JsonSerializable<ToolResourcesFileSearchIdsOnly> {
    /*
     * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant.
     * There can be a maximum of 1 vector store attached to the assistant.
     */
    @Generated
    private List<String> vectorStoreIds;

    /**
     * Creates an instance of ToolResourcesFileSearchIdsOnly class.
     */
    @Generated
    public ToolResourcesFileSearchIdsOnly() {
    }

    /**
     * Get the vectorStoreIds property: The [vector store](/docs/api-reference/vector-stores/object) attached to this
     * assistant.
     * There can be a maximum of 1 vector store attached to the assistant.
     * 
     * @return the vectorStoreIds value.
     */
    @Generated
    public List<String> getVectorStoreIds() {
        return this.vectorStoreIds;
    }

    /**
     * Set the vectorStoreIds property: The [vector store](/docs/api-reference/vector-stores/object) attached to this
     * assistant.
     * There can be a maximum of 1 vector store attached to the assistant.
     * 
     * @param vectorStoreIds the vectorStoreIds value to set.
     * @return the ToolResourcesFileSearchIdsOnly object itself.
     */
    @Generated
    public ToolResourcesFileSearchIdsOnly setVectorStoreIds(List<String> vectorStoreIds) {
        this.vectorStoreIds = vectorStoreIds;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("vector_store_ids", this.vectorStoreIds,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ToolResourcesFileSearchIdsOnly from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ToolResourcesFileSearchIdsOnly if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ToolResourcesFileSearchIdsOnly.
     */
    @Generated
    public static ToolResourcesFileSearchIdsOnly fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ToolResourcesFileSearchIdsOnly deserializedToolResourcesFileSearchIdsOnly
                = new ToolResourcesFileSearchIdsOnly();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vector_store_ids".equals(fieldName)) {
                    List<String> vectorStoreIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedToolResourcesFileSearchIdsOnly.vectorStoreIds = vectorStoreIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedToolResourcesFileSearchIdsOnly;
        });
    }
}
