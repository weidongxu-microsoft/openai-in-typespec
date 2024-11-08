// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The ChatResponseFormatJsonSchema model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ChatResponseFormatJsonSchema extends ChatResponseFormat {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private String type = "json_schema";

    /*
     * The json_schema property.
     */
    @Metadata(generated = true)
    private final ResponseFormatJsonSchemaJsonSchema jsonSchema;

    /**
     * Creates an instance of ChatResponseFormatJsonSchema class.
     * 
     * @param jsonSchema the jsonSchema value to set.
     */
    @Metadata(generated = true)
    public ChatResponseFormatJsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the jsonSchema property: The json_schema property.
     * 
     * @return the jsonSchema value.
     */
    @Metadata(generated = true)
    public ResponseFormatJsonSchemaJsonSchema getJsonSchema() {
        return this.jsonSchema;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("json_schema", this.jsonSchema);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatResponseFormatJsonSchema from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatResponseFormatJsonSchema if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatResponseFormatJsonSchema.
     */
    @Metadata(generated = true)
    public static ChatResponseFormatJsonSchema fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResponseFormatJsonSchemaJsonSchema jsonSchema = null;
            String type = "json_schema";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("json_schema".equals(fieldName)) {
                    jsonSchema = ResponseFormatJsonSchemaJsonSchema.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ChatResponseFormatJsonSchema deserializedChatResponseFormatJsonSchema
                = new ChatResponseFormatJsonSchema(jsonSchema);
            deserializedChatResponseFormatJsonSchema.type = type;

            return deserializedChatResponseFormatJsonSchema;
        });
    }
}
