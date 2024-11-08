// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The ResponseFormatText model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ResponseFormatText extends OmniTypedResponseFormat {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private String type = "text";

    /**
     * Creates an instance of ResponseFormatText class.
     */
    @Metadata(generated = true)
    public ResponseFormatText() {
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
     * Reads an instance of ResponseFormatText from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponseFormatText if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResponseFormatText.
     */
    @Metadata(generated = true)
    public static ResponseFormatText fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResponseFormatText deserializedResponseFormatText = new ResponseFormatText();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedResponseFormatText.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResponseFormatText;
        });
    }
}
