// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The AssistantObjectToolResourcesCodeInterpreter model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class AssistantObjectToolResourcesCodeInterpreter
    implements JsonSerializable<AssistantObjectToolResourcesCodeInterpreter> {
    /*
     * A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a
     * maximum of 20 files associated with the tool.
     */
    @Metadata(generated = true)
    private List<String> fileIds;

    /**
     * Creates an instance of AssistantObjectToolResourcesCodeInterpreter class.
     */
    @Metadata(generated = true)
    private AssistantObjectToolResourcesCodeInterpreter() {
    }

    /**
     * Get the fileIds property: A list of [file](/docs/api-reference/files) IDs made available to the
     * `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool.
     * 
     * @return the fileIds value.
     */
    @Metadata(generated = true)
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssistantObjectToolResourcesCodeInterpreter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssistantObjectToolResourcesCodeInterpreter if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssistantObjectToolResourcesCodeInterpreter.
     */
    @Metadata(generated = true)
    public static AssistantObjectToolResourcesCodeInterpreter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssistantObjectToolResourcesCodeInterpreter deserializedAssistantObjectToolResourcesCodeInterpreter
                = new AssistantObjectToolResourcesCodeInterpreter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("file_ids".equals(fieldName)) {
                    List<String> fileIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedAssistantObjectToolResourcesCodeInterpreter.fileIds = fileIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssistantObjectToolResourcesCodeInterpreter;
        });
    }
}