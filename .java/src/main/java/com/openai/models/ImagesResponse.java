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
import java.util.List;

/**
 * The ImagesResponse model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ImagesResponse implements JsonSerializable<ImagesResponse> {
    /*
     * The created property.
     */
    @Metadata(generated = true)
    private final long created;

    /*
     * The data property.
     */
    @Metadata(generated = true)
    private final List<Image> data;

    /**
     * Creates an instance of ImagesResponse class.
     * 
     * @param created the created value to set.
     * @param data the data value to set.
     */
    @Metadata(generated = true)
    private ImagesResponse(OffsetDateTime created, List<Image> data) {
        if (created == null) {
            this.created = 0L;
        } else {
            this.created = created.toEpochSecond();
        }
        this.data = data;
    }

    /**
     * Get the created property: The created property.
     * 
     * @return the created value.
     */
    @Metadata(generated = true)
    public OffsetDateTime getCreated() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.created), ZoneOffset.UTC);
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Metadata(generated = true)
    public List<Image> getData() {
        return this.data;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeLongField("created", this.created);
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImagesResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImagesResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImagesResponse.
     */
    @Metadata(generated = true)
    public static ImagesResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime created = null;
            List<Image> data = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("created".equals(fieldName)) {
                    created = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("data".equals(fieldName)) {
                    data = reader.readArray(reader1 -> Image.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new ImagesResponse(created, data);
        });
    }
}
