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
 * The ChatCompletionMessageToolCallChunk model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ChatCompletionMessageToolCallChunk implements JsonSerializable<ChatCompletionMessageToolCallChunk> {
    /*
     * The index property.
     */
    @Metadata(generated = true)
    private final int index;

    /*
     * The ID of the tool call.
     */
    @Metadata(generated = true)
    private String id;

    /*
     * The type of the tool. Currently, only `function` is supported.
     */
    @Metadata(generated = true)
    private AssistantToolsFunctionType4 type;

    /*
     * The function property.
     */
    @Metadata(generated = true)
    private ChatCompletionMessageToolCallChunkFunction function;

    /**
     * Creates an instance of ChatCompletionMessageToolCallChunk class.
     * 
     * @param index the index value to set.
     */
    @Metadata(generated = true)
    private ChatCompletionMessageToolCallChunk(int index) {
        this.index = index;
    }

    /**
     * Get the index property: The index property.
     * 
     * @return the index value.
     */
    @Metadata(generated = true)
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the id property: The ID of the tool call.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: The type of the tool. Currently, only `function` is supported.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public AssistantToolsFunctionType4 getType() {
        return this.type;
    }

    /**
     * Get the function property: The function property.
     * 
     * @return the function value.
     */
    @Metadata(generated = true)
    public ChatCompletionMessageToolCallChunkFunction getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionMessageToolCallChunk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionMessageToolCallChunk if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionMessageToolCallChunk.
     */
    @Metadata(generated = true)
    public static ChatCompletionMessageToolCallChunk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String id = null;
            AssistantToolsFunctionType4 type = null;
            ChatCompletionMessageToolCallChunkFunction function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = AssistantToolsFunctionType4.fromString(reader.getString());
                } else if ("function".equals(fieldName)) {
                    function = ChatCompletionMessageToolCallChunkFunction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            ChatCompletionMessageToolCallChunk deserializedChatCompletionMessageToolCallChunk
                = new ChatCompletionMessageToolCallChunk(index);
            deserializedChatCompletionMessageToolCallChunk.id = id;
            deserializedChatCompletionMessageToolCallChunk.type = type;
            deserializedChatCompletionMessageToolCallChunk.function = function;

            return deserializedChatCompletionMessageToolCallChunk;
        });
    }
}