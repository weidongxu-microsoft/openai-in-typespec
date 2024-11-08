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
 * The ChatCompletionFunctionChoice model.
 */
@Immutable
public final class ChatCompletionFunctionChoice implements JsonSerializable<ChatCompletionFunctionChoice> {
    /**
     * Creates an instance of ChatCompletionFunctionChoice class.
     */
    @Generated
    public ChatCompletionFunctionChoice() {
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionFunctionChoice from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionFunctionChoice if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChatCompletionFunctionChoice.
     */
    @Generated
    public static ChatCompletionFunctionChoice fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatCompletionFunctionChoice deserializedChatCompletionFunctionChoice = new ChatCompletionFunctionChoice();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                reader.skipChildren();
            }

            return deserializedChatCompletionFunctionChoice;
        });
    }
}
