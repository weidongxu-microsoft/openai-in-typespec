// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The text content that is part of a message.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageRequestContentTextObject extends MessageContent {
    /*
     * Always `text`.
     */
    @Metadata(generated = true)
    private final String type = "text";

    /*
     * Text content to be sent to the model
     */
    @Metadata(generated = true)
    private final String text;

    /**
     * Creates an instance of MessageRequestContentTextObject class.
     * 
     * @param text the text value to set.
     */
    @Metadata(generated = true)
    public MessageRequestContentTextObject(String text) {
        this.text = text;
    }

    /**
     * Get the type property: Always `text`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the text property: Text content to be sent to the model.
     * 
     * @return the text value.
     */
    @Metadata(generated = true)
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageRequestContentTextObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageRequestContentTextObject if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageRequestContentTextObject.
     */
    @Metadata(generated = true)
    public static MessageRequestContentTextObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String text = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageRequestContentTextObject(text);
        });
    }
}
