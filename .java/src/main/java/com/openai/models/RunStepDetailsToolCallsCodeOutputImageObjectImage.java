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
 * The RunStepDetailsToolCallsCodeOutputImageObjectImage model.
 */
@Immutable
public final class RunStepDetailsToolCallsCodeOutputImageObjectImage
    implements JsonSerializable<RunStepDetailsToolCallsCodeOutputImageObjectImage> {
    /*
     * The [file](/docs/api-reference/files) ID of the image.
     */
    @Generated
    private final String fileId;

    /**
     * Creates an instance of RunStepDetailsToolCallsCodeOutputImageObjectImage class.
     * 
     * @param fileId the fileId value to set.
     */
    @Generated
    private RunStepDetailsToolCallsCodeOutputImageObjectImage(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Get the fileId property: The [file](/docs/api-reference/files) ID of the image.
     * 
     * @return the fileId value.
     */
    @Generated
    public String getFileId() {
        return this.fileId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("file_id", this.fileId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsCodeOutputImageObjectImage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsCodeOutputImageObjectImage if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsCodeOutputImageObjectImage.
     */
    @Generated
    public static RunStepDetailsToolCallsCodeOutputImageObjectImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String fileId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("file_id".equals(fieldName)) {
                    fileId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDetailsToolCallsCodeOutputImageObjectImage(fileId);
        });
    }
}
