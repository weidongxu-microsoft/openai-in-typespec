// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * The upload Part represents a chunk of bytes we can add to an Upload object.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class UploadPart implements JsonSerializable<UploadPart> {
    /*
     * The upload Part unique identifier, which can be referenced in API endpoints.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The Unix timestamp (in seconds) for when the Part was created.
     */
    @Metadata(generated = true)
    private final long createdAt;

    /*
     * The ID of the Upload object that this Part was added to.
     */
    @Metadata(generated = true)
    private final String uploadId;

    /*
     * The object type, which is always `upload.part`.
     */
    @Metadata(generated = true)
    private final String object = "upload.part";

    /**
     * Creates an instance of UploadPart class.
     * 
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param uploadId the uploadId value to set.
     */
    @Metadata(generated = true)
    private UploadPart(String id, OffsetDateTime createdAt, String uploadId) {
        this.id = id;
        if (createdAt == null) {
            this.createdAt = 0L;
        } else {
            this.createdAt = createdAt.toEpochSecond();
        }
        this.uploadId = uploadId;
    }

    /**
     * Get the id property: The upload Part unique identifier, which can be referenced in API endpoints.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the createdAt property: The Unix timestamp (in seconds) for when the Part was created.
     * 
     * @return the createdAt value.
     */
    @Metadata(generated = true)
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the uploadId property: The ID of the Upload object that this Part was added to.
     * 
     * @return the uploadId value.
     */
    @Metadata(generated = true)
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * Get the object property: The object type, which is always `upload.part`.
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeLongField("created_at", this.createdAt);
        jsonWriter.writeStringField("upload_id", this.uploadId);
        jsonWriter.writeStringField("object", this.object);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UploadPart from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UploadPart if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UploadPart.
     */
    @Metadata(generated = true)
    public static UploadPart fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            String uploadId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created_at".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("upload_id".equals(fieldName)) {
                    uploadId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new UploadPart(id, createdAt, uploadId);
        });
    }
}