// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The ToolResourcesFileSearchVectorStore model.
 */
@Fluent
public final class ToolResourcesFileSearchVectorStore implements JsonSerializable<ToolResourcesFileSearchVectorStore> {
    /*
     * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be
     * a maximum of 10000 files in a vector store.
     */
    @Generated
    private List<String> fileIds;

    /*
     * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if
     * `file_ids` is non-empty.
     */
    @Generated
    private BinaryData chunkingStrategy;

    /*
     * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for
     * storing additional information about the vector store in a structured format. Keys can
     * be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    @Generated
    private Map<String, String> metadata;

    /**
     * Creates an instance of ToolResourcesFileSearchVectorStore class.
     */
    @Generated
    public ToolResourcesFileSearchVectorStore() {
    }

    /**
     * Get the fileIds property: A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can
     * be
     * a maximum of 10000 files in a vector store.
     * 
     * @return the fileIds value.
     */
    @Generated
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Set the fileIds property: A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can
     * be
     * a maximum of 10000 files in a vector store.
     * 
     * @param fileIds the fileIds value to set.
     * @return the ToolResourcesFileSearchVectorStore object itself.
     */
    @Generated
    public ToolResourcesFileSearchVectorStore setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    /**
     * Get the chunkingStrategy property: The chunking strategy used to chunk the file(s). If not set, will use the
     * `auto` strategy. Only applicable if `file_ids` is non-empty.
     * 
     * @return the chunkingStrategy value.
     */
    @Generated
    public BinaryData getChunkingStrategy() {
        return this.chunkingStrategy;
    }

    /**
     * Set the chunkingStrategy property: The chunking strategy used to chunk the file(s). If not set, will use the
     * `auto` strategy. Only applicable if `file_ids` is non-empty.
     * 
     * @param chunkingStrategy the chunkingStrategy value to set.
     * @return the ToolResourcesFileSearchVectorStore object itself.
     */
    @Generated
    public ToolResourcesFileSearchVectorStore setChunkingStrategy(BinaryData chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
        return this;
    }

    /**
     * Get the metadata property: Set of 16 key-value pairs that can be attached to a vector store. This can be useful
     * for
     * storing additional information about the vector store in a structured format. Keys can
     * be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * 
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Set of 16 key-value pairs that can be attached to a vector store. This can be useful
     * for
     * storing additional information about the vector store in a structured format. Keys can
     * be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * 
     * @param metadata the metadata value to set.
     * @return the ToolResourcesFileSearchVectorStore object itself.
     */
    @Generated
    public ToolResourcesFileSearchVectorStore setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        if (this.chunkingStrategy != null) {
            jsonWriter.writeUntypedField("chunking_strategy", this.chunkingStrategy.toObject(Object.class));
        }
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ToolResourcesFileSearchVectorStore from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ToolResourcesFileSearchVectorStore if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ToolResourcesFileSearchVectorStore.
     */
    @Generated
    public static ToolResourcesFileSearchVectorStore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ToolResourcesFileSearchVectorStore deserializedToolResourcesFileSearchVectorStore
                = new ToolResourcesFileSearchVectorStore();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("file_ids".equals(fieldName)) {
                    List<String> fileIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedToolResourcesFileSearchVectorStore.fileIds = fileIds;
                } else if ("chunking_strategy".equals(fieldName)) {
                    deserializedToolResourcesFileSearchVectorStore.chunkingStrategy
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedToolResourcesFileSearchVectorStore.metadata = metadata;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedToolResourcesFileSearchVectorStore;
        });
    }
}
