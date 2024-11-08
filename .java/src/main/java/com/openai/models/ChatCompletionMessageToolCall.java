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
 * The ChatCompletionMessageToolCall model.
 */
@Immutable
public final class ChatCompletionMessageToolCall implements JsonSerializable<ChatCompletionMessageToolCall> {
    /*
     * The ID of the tool call.
     */
    @Generated
    private final String id;

    /*
     * The type of the tool. Currently, only `function` is supported.
     */
    @Generated
    private final String type = "function";

    /*
     * The function that the model called.
     */
    @Generated
    private final ChatCompletionMessageToolCallFunction function;

    /**
     * Creates an instance of ChatCompletionMessageToolCall class.
     * 
     * @param id the id value to set.
     * @param function the function value to set.
     */
    @Generated
    public ChatCompletionMessageToolCall(String id, ChatCompletionMessageToolCallFunction function) {
        this.id = id;
        this.function = function;
    }

    /**
     * Get the id property: The ID of the tool call.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: The type of the tool. Currently, only `function` is supported.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the function property: The function that the model called.
     * 
     * @return the function value.
     */
    @Generated
    public ChatCompletionMessageToolCallFunction getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionMessageToolCall from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionMessageToolCall if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionMessageToolCall.
     */
    @Generated
    public static ChatCompletionMessageToolCall fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            ChatCompletionMessageToolCallFunction function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("function".equals(fieldName)) {
                    function = ChatCompletionMessageToolCallFunction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ChatCompletionMessageToolCall(id, function);
        });
    }
}
