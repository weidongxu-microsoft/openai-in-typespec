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
 * The ChatCompletionRequestMessage model.
 */
@Immutable
public class ChatCompletionRequestMessage implements JsonSerializable<ChatCompletionRequestMessage> {
    /*
     * The role of the author of this message.
     */
    @Generated
    private String role = "ChatCompletionRequestMessage";

    /**
     * Creates an instance of ChatCompletionRequestMessage class.
     */
    @Generated
    public ChatCompletionRequestMessage() {
    }

    /**
     * Get the role property: The role of the author of this message.
     * 
     * @return the role value.
     */
    @Generated
    public String getRole() {
        return this.role;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("role", this.role);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionRequestMessage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionRequestMessage if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChatCompletionRequestMessage.
     */
    @Generated
    public static ChatCompletionRequestMessage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("role".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("system".equals(discriminatorValue)) {
                    return ChatCompletionRequestSystemMessage.fromJson(readerToUse.reset());
                } else if ("user".equals(discriminatorValue)) {
                    return ChatCompletionRequestUserMessage.fromJson(readerToUse.reset());
                } else if ("assistant".equals(discriminatorValue)) {
                    return ChatCompletionRequestAssistantMessage.fromJsonKnownDiscriminator(readerToUse.reset());
                } else if ("tool".equals(discriminatorValue)) {
                    return ChatCompletionRequestToolMessage.fromJson(readerToUse.reset());
                } else if ("function".equals(discriminatorValue)) {
                    return ChatCompletionRequestFunctionMessage.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static ChatCompletionRequestMessage fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatCompletionRequestMessage deserializedChatCompletionRequestMessage = new ChatCompletionRequestMessage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("role".equals(fieldName)) {
                    deserializedChatCompletionRequestMessage.role = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChatCompletionRequestMessage;
        });
    }
}
