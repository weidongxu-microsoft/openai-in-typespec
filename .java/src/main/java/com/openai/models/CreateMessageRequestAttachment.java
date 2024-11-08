// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The CreateMessageRequestAttachment model.
 */
@Immutable
public final class CreateMessageRequestAttachment implements JsonSerializable<CreateMessageRequestAttachment> {
    /*
     * The ID of the file to attach to the message.
     */
    @Generated
    private final String fileId;

    /*
     * The tools to add this file to.
     */
    @Generated
    private final List<BinaryData> tools;

    /**
     * Creates an instance of CreateMessageRequestAttachment class.
     * 
     * @param fileId the fileId value to set.
     * @param tools the tools value to set.
     */
    @Generated
    public CreateMessageRequestAttachment(String fileId, List<BinaryData> tools) {
        this.fileId = fileId;
        this.tools = tools;
    }

    /**
     * Get the fileId property: The ID of the file to attach to the message.
     * 
     * @return the fileId value.
     */
    @Generated
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Get the tools property: The tools to add this file to.
     * 
     * @return the tools value.
     */
    @Generated
    public List<BinaryData> getTools() {
        return this.tools;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("file_id", this.fileId);
        jsonWriter.writeArrayField("tools", this.tools,
            (writer, element) -> writer.writeUntyped(element == null ? null : element.toObject(Object.class)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateMessageRequestAttachment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateMessageRequestAttachment if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateMessageRequestAttachment.
     */
    @Generated
    public static CreateMessageRequestAttachment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String fileId = null;
            List<BinaryData> tools = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("file_id".equals(fieldName)) {
                    fileId = reader.getString();
                } else if ("tools".equals(fieldName)) {
                    tools = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateMessageRequestAttachment(fileId, tools);
        });
    }
}
