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
 * The ChatCompletionFunctionChoice model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ChatCompletionFunctionChoice implements JsonSerializable<ChatCompletionFunctionChoice> {
    /**
     * Creates an instance of ChatCompletionFunctionChoice class.
     */
    @Metadata(generated = true)
    public ChatCompletionFunctionChoice() {
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
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
    @Metadata(generated = true)
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
