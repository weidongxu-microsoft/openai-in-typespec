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
 * The CreateAssistantRequestToolResources model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateAssistantRequestToolResources
    implements JsonSerializable<CreateAssistantRequestToolResources> {
    /*
     * The code_interpreter property.
     */
    @Metadata(generated = true)
    private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

    /*
     * The file_search property.
     */
    @Metadata(generated = true)
    private ToolResourcesFileSearch fileSearch;

    /**
     * Creates an instance of CreateAssistantRequestToolResources class.
     */
    @Metadata(generated = true)
    public CreateAssistantRequestToolResources() {
    }

    /**
     * Get the codeInterpreter property: The code_interpreter property.
     * 
     * @return the codeInterpreter value.
     */
    @Metadata(generated = true)
    public CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
        return this.codeInterpreter;
    }

    /**
     * Set the codeInterpreter property: The code_interpreter property.
     * 
     * @param codeInterpreter the codeInterpreter value to set.
     * @return the CreateAssistantRequestToolResources object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequestToolResources
        setCodeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
        return this;
    }

    /**
     * Get the fileSearch property: The file_search property.
     * 
     * @return the fileSearch value.
     */
    @Metadata(generated = true)
    public ToolResourcesFileSearch getFileSearch() {
        return this.fileSearch;
    }

    /**
     * Set the fileSearch property: The file_search property.
     * 
     * @param fileSearch the fileSearch value to set.
     * @return the CreateAssistantRequestToolResources object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequestToolResources setFileSearch(ToolResourcesFileSearch fileSearch) {
        this.fileSearch = fileSearch;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("code_interpreter", this.codeInterpreter);
        jsonWriter.writeJsonField("file_search", this.fileSearch);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateAssistantRequestToolResources from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateAssistantRequestToolResources if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateAssistantRequestToolResources.
     */
    @Metadata(generated = true)
    public static CreateAssistantRequestToolResources fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateAssistantRequestToolResources deserializedCreateAssistantRequestToolResources
                = new CreateAssistantRequestToolResources();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code_interpreter".equals(fieldName)) {
                    deserializedCreateAssistantRequestToolResources.codeInterpreter
                        = CreateAssistantRequestToolResourcesCodeInterpreter.fromJson(reader);
                } else if ("file_search".equals(fieldName)) {
                    deserializedCreateAssistantRequestToolResources.fileSearch
                        = ToolResourcesFileSearch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateAssistantRequestToolResources;
        });
    }
}
