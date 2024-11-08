// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The RunStepDetailsToolCallsFileSearchObject model.
 */
@Immutable
public final class RunStepDetailsToolCallsFileSearchObject extends RunStepDetailsToolCallsObjectToolCallsObject {
    /*
     * The discriminated type identifier for the details object.
     */
    @Generated
    private String type = "file_search";

    /*
     * The ID of the tool call object.
     */
    @Generated
    private final String id;

    /*
     * For now, this is always going to be an empty object.
     */
    @Generated
    private final RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

    /**
     * Creates an instance of RunStepDetailsToolCallsFileSearchObject class.
     * 
     * @param id the id value to set.
     * @param fileSearch the fileSearch value to set.
     */
    @Generated
    private RunStepDetailsToolCallsFileSearchObject(String id,
        RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
        this.id = id;
        this.fileSearch = fileSearch;
    }

    /**
     * Get the type property: The discriminated type identifier for the details object.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the id property: The ID of the tool call object.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the fileSearch property: For now, this is always going to be an empty object.
     * 
     * @return the fileSearch value.
     */
    @Generated
    public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
        return this.fileSearch;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("file_search", this.fileSearch);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsFileSearchObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsFileSearchObject if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsFileSearchObject.
     */
    @Generated
    public static RunStepDetailsToolCallsFileSearchObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch = null;
            String type = "file_search";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("file_search".equals(fieldName)) {
                    fileSearch = RunStepDetailsToolCallsFileSearchObjectFileSearch.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDetailsToolCallsFileSearchObject deserializedRunStepDetailsToolCallsFileSearchObject
                = new RunStepDetailsToolCallsFileSearchObject(id, fileSearch);
            deserializedRunStepDetailsToolCallsFileSearchObject.type = type;

            return deserializedRunStepDetailsToolCallsFileSearchObject;
        });
    }
}
