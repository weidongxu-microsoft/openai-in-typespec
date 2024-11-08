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

/**
 * The ModifyAssistantRequestToolResources model.
 */
@Fluent
public final class ModifyAssistantRequestToolResources
    implements JsonSerializable<ModifyAssistantRequestToolResources> {
    /*
     * The code_interpreter property.
     */
    @Generated
    private ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

    /*
     * The file_search property.
     */
    @Generated
    private ToolResourcesFileSearchIdsOnly fileSearch;

    /**
     * Creates an instance of ModifyAssistantRequestToolResources class.
     */
    @Generated
    public ModifyAssistantRequestToolResources() {
    }

    /**
     * Get the codeInterpreter property: The code_interpreter property.
     * 
     * @return the codeInterpreter value.
     */
    @Generated
    public ModifyAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
        return this.codeInterpreter;
    }

    /**
     * Set the codeInterpreter property: The code_interpreter property.
     * 
     * @param codeInterpreter the codeInterpreter value to set.
     * @return the ModifyAssistantRequestToolResources object itself.
     */
    @Generated
    public ModifyAssistantRequestToolResources
        setCodeInterpreter(ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
        return this;
    }

    /**
     * Get the fileSearch property: The file_search property.
     * 
     * @return the fileSearch value.
     */
    @Generated
    public ToolResourcesFileSearchIdsOnly getFileSearch() {
        return this.fileSearch;
    }

    /**
     * Set the fileSearch property: The file_search property.
     * 
     * @param fileSearch the fileSearch value to set.
     * @return the ModifyAssistantRequestToolResources object itself.
     */
    @Generated
    public ModifyAssistantRequestToolResources setFileSearch(ToolResourcesFileSearchIdsOnly fileSearch) {
        this.fileSearch = fileSearch;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("code_interpreter", this.codeInterpreter);
        jsonWriter.writeJsonField("file_search", this.fileSearch);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModifyAssistantRequestToolResources from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModifyAssistantRequestToolResources if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModifyAssistantRequestToolResources.
     */
    @Generated
    public static ModifyAssistantRequestToolResources fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ModifyAssistantRequestToolResources deserializedModifyAssistantRequestToolResources
                = new ModifyAssistantRequestToolResources();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code_interpreter".equals(fieldName)) {
                    deserializedModifyAssistantRequestToolResources.codeInterpreter
                        = ModifyAssistantRequestToolResourcesCodeInterpreter.fromJson(reader);
                } else if ("file_search".equals(fieldName)) {
                    deserializedModifyAssistantRequestToolResources.fileSearch
                        = ToolResourcesFileSearchIdsOnly.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModifyAssistantRequestToolResources;
        });
    }
}
