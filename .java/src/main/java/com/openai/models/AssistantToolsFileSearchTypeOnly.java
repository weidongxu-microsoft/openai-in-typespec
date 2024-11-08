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
 * The AssistantToolsFileSearchTypeOnly model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class AssistantToolsFileSearchTypeOnly implements JsonSerializable<AssistantToolsFileSearchTypeOnly> {
    /*
     * The type of tool being defined: `file_search`
     */
    @Metadata(generated = true)
    private final String type = "file_search";

    /**
     * Creates an instance of AssistantToolsFileSearchTypeOnly class.
     */
    @Metadata(generated = true)
    public AssistantToolsFileSearchTypeOnly() {
    }

    /**
     * Get the type property: The type of tool being defined: `file_search`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssistantToolsFileSearchTypeOnly from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssistantToolsFileSearchTypeOnly if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssistantToolsFileSearchTypeOnly.
     */
    @Metadata(generated = true)
    public static AssistantToolsFileSearchTypeOnly fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssistantToolsFileSearchTypeOnly deserializedAssistantToolsFileSearchTypeOnly
                = new AssistantToolsFileSearchTypeOnly();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                reader.skipChildren();
            }

            return deserializedAssistantToolsFileSearchTypeOnly;
        });
    }
}