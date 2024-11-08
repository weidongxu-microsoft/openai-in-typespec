// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The refusal content generated by the assistant.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageContentRefusalObject extends MessageContent {
    /*
     * Always `refusal`.
     */
    @Metadata(generated = true)
    private final String type = "refusal";

    /*
     * The refusal property.
     */
    @Metadata(generated = true)
    private final String refusal;

    /**
     * Creates an instance of MessageContentRefusalObject class.
     * 
     * @param refusal the refusal value to set.
     */
    @Metadata(generated = true)
    public MessageContentRefusalObject(String refusal) {
        this.refusal = refusal;
    }

    /**
     * Get the type property: Always `refusal`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the refusal property: The refusal property.
     * 
     * @return the refusal value.
     */
    @Metadata(generated = true)
    public String getRefusal() {
        return this.refusal;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("refusal", this.refusal);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageContentRefusalObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageContentRefusalObject if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageContentRefusalObject.
     */
    @Metadata(generated = true)
    public static MessageContentRefusalObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String refusal = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("refusal".equals(fieldName)) {
                    refusal = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageContentRefusalObject(refusal);
        });
    }
}
