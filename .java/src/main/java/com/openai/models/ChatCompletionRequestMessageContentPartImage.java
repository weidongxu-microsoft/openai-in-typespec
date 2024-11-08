// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ChatCompletionRequestMessageContentPartImage model.
 */
@Immutable
public final class ChatCompletionRequestMessageContentPartImage
    implements JsonSerializable<ChatCompletionRequestMessageContentPartImage> {
    /*
     * The type of the content part.
     */
    @Generated
    private final String type = "image_url";

    /*
     * The image_url property.
     */
    @Generated
    private final ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

    /**
     * Creates an instance of ChatCompletionRequestMessageContentPartImage class.
     * 
     * @param imageUrl the imageUrl value to set.
     */
    @Generated
    public ChatCompletionRequestMessageContentPartImage(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Get the type property: The type of the content part.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the imageUrl property: The image_url property.
     * 
     * @return the imageUrl value.
     */
    @Generated
    public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("image_url", this.imageUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionRequestMessageContentPartImage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionRequestMessageContentPartImage if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionRequestMessageContentPartImage.
     */
    @Generated
    public static ChatCompletionRequestMessageContentPartImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatCompletionRequestMessageContentPartImageImageUrl imageUrl = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("image_url".equals(fieldName)) {
                    imageUrl = ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ChatCompletionRequestMessageContentPartImage(imageUrl);
        });
    }
}
