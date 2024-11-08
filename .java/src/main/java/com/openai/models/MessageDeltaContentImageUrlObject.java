// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * References an image URL in the content of a message.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageDeltaContentImageUrlObject extends MessageDeltaContent {
    /*
     * The discriminated type identifier for the content item.
     */
    @Metadata(generated = true)
    private String type = "image_url";

    /*
     * The index of the content part in the message.
     */
    @Metadata(generated = true)
    private final int index;

    /*
     * The image_url property.
     */
    @Metadata(generated = true)
    private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

    /**
     * Creates an instance of MessageDeltaContentImageUrlObject class.
     * 
     * @param index the index value to set.
     */
    @Metadata(generated = true)
    private MessageDeltaContentImageUrlObject(int index) {
        this.index = index;
    }

    /**
     * Get the type property: The discriminated type identifier for the content item.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the index property: The index of the content part in the message.
     * 
     * @return the index value.
     */
    @Metadata(generated = true)
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the imageUrl property: The image_url property.
     * 
     * @return the imageUrl value.
     */
    @Metadata(generated = true)
    public MessageDeltaContentImageUrlObjectImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("image_url", this.imageUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDeltaContentImageUrlObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDeltaContentImageUrlObject if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageDeltaContentImageUrlObject.
     */
    @Metadata(generated = true)
    public static MessageDeltaContentImageUrlObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = "image_url";
            MessageDeltaContentImageUrlObjectImageUrl imageUrl = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("image_url".equals(fieldName)) {
                    imageUrl = MessageDeltaContentImageUrlObjectImageUrl.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            MessageDeltaContentImageUrlObject deserializedMessageDeltaContentImageUrlObject
                = new MessageDeltaContentImageUrlObject(index);
            deserializedMessageDeltaContentImageUrlObject.type = type;
            deserializedMessageDeltaContentImageUrlObject.imageUrl = imageUrl;

            return deserializedMessageDeltaContentImageUrlObject;
        });
    }
}
