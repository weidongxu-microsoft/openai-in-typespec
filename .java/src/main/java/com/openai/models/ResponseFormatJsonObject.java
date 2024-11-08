// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The ResponseFormatJsonObject model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ResponseFormatJsonObject extends OmniTypedResponseFormat {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private String type = "json_object";

    /**
     * Creates an instance of ResponseFormatJsonObject class.
     */
    @Metadata(generated = true)
    public ResponseFormatJsonObject() {
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
     * Reads an instance of ResponseFormatJsonObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponseFormatJsonObject if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResponseFormatJsonObject.
     */
    @Metadata(generated = true)
    public static ResponseFormatJsonObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResponseFormatJsonObject deserializedResponseFormatJsonObject = new ResponseFormatJsonObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedResponseFormatJsonObject.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResponseFormatJsonObject;
        });
    }
}
