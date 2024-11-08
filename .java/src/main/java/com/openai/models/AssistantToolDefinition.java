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
 * The AssistantToolDefinition model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public class AssistantToolDefinition implements JsonSerializable<AssistantToolDefinition> {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private String type = "AssistantToolDefinition";

    /**
     * Creates an instance of AssistantToolDefinition class.
     */
    @Metadata(generated = true)
    public AssistantToolDefinition() {
    }

    /**
     * Get the type property: The type property.
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
     * Reads an instance of AssistantToolDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssistantToolDefinition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssistantToolDefinition.
     */
    @Metadata(generated = true)
    public static AssistantToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("code_interpreter".equals(discriminatorValue)) {
                    return AssistantToolsCode.fromJson(readerToUse.reset());
                } else if ("file_search".equals(discriminatorValue)) {
                    return AssistantToolsFileSearch.fromJson(readerToUse.reset());
                } else if ("function".equals(discriminatorValue)) {
                    return AssistantToolsFunction.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Metadata(generated = true)
    static AssistantToolDefinition fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssistantToolDefinition deserializedAssistantToolDefinition = new AssistantToolDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedAssistantToolDefinition.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssistantToolDefinition;
        });
    }
}
