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
import java.util.List;

/**
 * The ListThreadsResponse model.
 */
@Immutable
public final class ListThreadsResponse implements JsonSerializable<ListThreadsResponse> {
    /*
     * The object property.
     */
    @Generated
    private final String object = "list";

    /*
     * The data property.
     */
    @Generated
    private final List<ThreadObject> data;

    /*
     * The first_id property.
     */
    @Generated
    private final String firstId;

    /*
     * The last_id property.
     */
    @Generated
    private final String lastId;

    /*
     * The has_more property.
     */
    @Generated
    private final boolean hasMore;

    /**
     * Creates an instance of ListThreadsResponse class.
     * 
     * @param data the data value to set.
     * @param firstId the firstId value to set.
     * @param lastId the lastId value to set.
     * @param hasMore the hasMore value to set.
     */
    @Generated
    private ListThreadsResponse(List<ThreadObject> data, String firstId, String lastId, boolean hasMore) {
        this.data = data;
        this.firstId = firstId;
        this.lastId = lastId;
        this.hasMore = hasMore;
    }

    /**
     * Get the object property: The object property.
     * 
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Generated
    public List<ThreadObject> getData() {
        return this.data;
    }

    /**
     * Get the firstId property: The first_id property.
     * 
     * @return the firstId value.
     */
    @Generated
    public String getFirstId() {
        return this.firstId;
    }

    /**
     * Get the lastId property: The last_id property.
     * 
     * @return the lastId value.
     */
    @Generated
    public String getLastId() {
        return this.lastId;
    }

    /**
     * Get the hasMore property: The has_more property.
     * 
     * @return the hasMore value.
     */
    @Generated
    public boolean isHasMore() {
        return this.hasMore;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("first_id", this.firstId);
        jsonWriter.writeStringField("last_id", this.lastId);
        jsonWriter.writeBooleanField("has_more", this.hasMore);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListThreadsResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListThreadsResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ListThreadsResponse.
     */
    @Generated
    public static ListThreadsResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<ThreadObject> data = null;
            String firstId = null;
            String lastId = null;
            boolean hasMore = false;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("data".equals(fieldName)) {
                    data = reader.readArray(reader1 -> ThreadObject.fromJson(reader1));
                } else if ("first_id".equals(fieldName)) {
                    firstId = reader.getString();
                } else if ("last_id".equals(fieldName)) {
                    lastId = reader.getString();
                } else if ("has_more".equals(fieldName)) {
                    hasMore = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }
            return new ListThreadsResponse(data, firstId, lastId, hasMore);
        });
    }
}
