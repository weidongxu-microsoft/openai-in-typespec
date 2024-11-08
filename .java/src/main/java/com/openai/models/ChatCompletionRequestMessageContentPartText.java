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
 * The ChatCompletionRequestMessageContentPartText model.
 */
@Immutable
public final class ChatCompletionRequestMessageContentPartText
    implements JsonSerializable<ChatCompletionRequestMessageContentPartText> {
    /*
     * The type of the content part.
     */
    @Generated
    private final String type = "text";

    /*
     * The text content.
     */
    @Generated
    private final String text;

    /**
     * Creates an instance of ChatCompletionRequestMessageContentPartText class.
     * 
     * @param text the text value to set.
     */
    @Generated
    public ChatCompletionRequestMessageContentPartText(String text) {
        this.text = text;
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
     * Get the text property: The text content.
     * 
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionRequestMessageContentPartText from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionRequestMessageContentPartText if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionRequestMessageContentPartText.
     */
    @Generated
    public static ChatCompletionRequestMessageContentPartText fromJson(JsonReader jsonReader) throws IOException {
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
            return new ChatCompletionRequestMessageContentPartText(text);
        });
    }
}
