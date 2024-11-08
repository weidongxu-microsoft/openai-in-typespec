// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import io.clientcore.core.util.binarydata.BinaryData;
import java.io.IOException;

/**
 * The ChatCompletionRequestToolMessage model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ChatCompletionRequestToolMessage extends ChatCompletionRequestMessage {
    /*
     * The role of the author of this message.
     */
    @Metadata(generated = true)
    private String role = "tool";

    /*
     * The contents of the tool message.
     */
    @Metadata(generated = true)
    private final BinaryData content;

    /*
     * Tool call that this message is responding to.
     */
    @Metadata(generated = true)
    private final String toolCallId;

    /**
     * Creates an instance of ChatCompletionRequestToolMessage class.
     * 
     * @param content the content value to set.
     * @param toolCallId the toolCallId value to set.
     */
    @Metadata(generated = true)
    public ChatCompletionRequestToolMessage(BinaryData content, String toolCallId) {
        this.content = content;
        this.toolCallId = toolCallId;
    }

    /**
     * Get the role property: The role of the author of this message.
     * 
     * @return the role value.
     */
    @Metadata(generated = true)
    @Override
    public String getRole() {
        return this.role;
    }

    /**
     * Get the content property: The contents of the tool message.
     * 
     * @return the content value.
     */
    @Metadata(generated = true)
    public BinaryData getContent() {
        return this.content;
    }

    /**
     * Get the toolCallId property: Tool call that this message is responding to.
     * 
     * @return the toolCallId value.
     */
    @Metadata(generated = true)
    public String getToolCallId() {
        return this.toolCallId;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("content", this.content.toObject(Object.class));
        jsonWriter.writeStringField("tool_call_id", this.toolCallId);
        jsonWriter.writeStringField("role", this.role);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionRequestToolMessage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionRequestToolMessage if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionRequestToolMessage.
     */
    @Metadata(generated = true)
    public static ChatCompletionRequestToolMessage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BinaryData content = null;
            String toolCallId = null;
            String role = "tool";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    content = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("tool_call_id".equals(fieldName)) {
                    toolCallId = reader.getString();
                } else if ("role".equals(fieldName)) {
                    role = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ChatCompletionRequestToolMessage deserializedChatCompletionRequestToolMessage
                = new ChatCompletionRequestToolMessage(content, toolCallId);
            deserializedChatCompletionRequestToolMessage.role = role;

            return deserializedChatCompletionRequestToolMessage;
        });
    }
}
