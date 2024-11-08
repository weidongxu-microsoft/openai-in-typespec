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
 * The VectorStoreObjectFileCounts model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class VectorStoreObjectFileCounts implements JsonSerializable<VectorStoreObjectFileCounts> {
    /*
     * The number of files that are currently being processed.
     */
    @Metadata(generated = true)
    private final int inProgress;

    /*
     * The number of files that have been successfully processed.
     */
    @Metadata(generated = true)
    private final int completed;

    /*
     * The number of files that have failed to process.
     */
    @Metadata(generated = true)
    private final int failed;

    /*
     * The number of files that were cancelled.
     */
    @Metadata(generated = true)
    private final int cancelled;

    /*
     * The total number of files.
     */
    @Metadata(generated = true)
    private final int total;

    /**
     * Creates an instance of VectorStoreObjectFileCounts class.
     * 
     * @param inProgress the inProgress value to set.
     * @param completed the completed value to set.
     * @param failed the failed value to set.
     * @param cancelled the cancelled value to set.
     * @param total the total value to set.
     */
    @Metadata(generated = true)
    private VectorStoreObjectFileCounts(int inProgress, int completed, int failed, int cancelled, int total) {
        this.inProgress = inProgress;
        this.completed = completed;
        this.failed = failed;
        this.cancelled = cancelled;
        this.total = total;
    }

    /**
     * Get the inProgress property: The number of files that are currently being processed.
     * 
     * @return the inProgress value.
     */
    @Metadata(generated = true)
    public int getInProgress() {
        return this.inProgress;
    }

    /**
     * Get the completed property: The number of files that have been successfully processed.
     * 
     * @return the completed value.
     */
    @Metadata(generated = true)
    public int getCompleted() {
        return this.completed;
    }

    /**
     * Get the failed property: The number of files that have failed to process.
     * 
     * @return the failed value.
     */
    @Metadata(generated = true)
    public int getFailed() {
        return this.failed;
    }

    /**
     * Get the cancelled property: The number of files that were cancelled.
     * 
     * @return the cancelled value.
     */
    @Metadata(generated = true)
    public int getCancelled() {
        return this.cancelled;
    }

    /**
     * Get the total property: The total number of files.
     * 
     * @return the total value.
     */
    @Metadata(generated = true)
    public int getTotal() {
        return this.total;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("in_progress", this.inProgress);
        jsonWriter.writeIntField("completed", this.completed);
        jsonWriter.writeIntField("failed", this.failed);
        jsonWriter.writeIntField("cancelled", this.cancelled);
        jsonWriter.writeIntField("total", this.total);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorStoreObjectFileCounts from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorStoreObjectFileCounts if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VectorStoreObjectFileCounts.
     */
    @Metadata(generated = true)
    public static VectorStoreObjectFileCounts fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int inProgress = 0;
            int completed = 0;
            int failed = 0;
            int cancelled = 0;
            int total = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("in_progress".equals(fieldName)) {
                    inProgress = reader.getInt();
                } else if ("completed".equals(fieldName)) {
                    completed = reader.getInt();
                } else if ("failed".equals(fieldName)) {
                    failed = reader.getInt();
                } else if ("cancelled".equals(fieldName)) {
                    cancelled = reader.getInt();
                } else if ("total".equals(fieldName)) {
                    total = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new VectorStoreObjectFileCounts(inProgress, completed, failed, cancelled, total);
        });
    }
}