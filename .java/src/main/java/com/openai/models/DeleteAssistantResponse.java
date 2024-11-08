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
 * The DeleteAssistantResponse model.
 */
@Immutable
public final class DeleteAssistantResponse implements JsonSerializable<DeleteAssistantResponse> {
    /*
     * The id property.
     */
    @Generated
    private final String id;

    /*
     * The deleted property.
     */
    @Generated
    private final boolean deleted;

    /*
     * The object property.
     */
    @Generated
    private final String object = "assistant.deleted";

    /**
     * Creates an instance of DeleteAssistantResponse class.
     * 
     * @param id the id value to set.
     * @param deleted the deleted value to set.
     */
    @Generated
    private DeleteAssistantResponse(String id, boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the deleted property: The deleted property.
     * 
     * @return the deleted value.
     */
    @Generated
    public boolean isDeleted() {
        return this.deleted;
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
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeBooleanField("deleted", this.deleted);
        jsonWriter.writeStringField("object", this.object);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeleteAssistantResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeleteAssistantResponse if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeleteAssistantResponse.
     */
    @Generated
    public static DeleteAssistantResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            boolean deleted = false;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("deleted".equals(fieldName)) {
                    deleted = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }
            return new DeleteAssistantResponse(id, deleted);
        });
    }
}
