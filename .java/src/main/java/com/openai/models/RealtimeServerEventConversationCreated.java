// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when a conversation is created. Emitted right after session creation.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventConversationCreated extends RealtimeServerEvent {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeServerEventType type = RealtimeServerEventType.CONVERSATION_CREATED;

    /*
     * The conversation resource.
     */
    @Metadata(generated = true)
    private final RealtimeServerEventConversationCreatedConversation conversation;

    /**
     * Creates an instance of RealtimeServerEventConversationCreated class.
     * 
     * @param eventId the eventId value to set.
     * @param conversation the conversation value to set.
     */
    @Metadata(generated = true)
    private RealtimeServerEventConversationCreated(String eventId,
        RealtimeServerEventConversationCreatedConversation conversation) {
        super(eventId);
        this.conversation = conversation;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public RealtimeServerEventType getType() {
        return this.type;
    }

    /**
     * Get the conversation property: The conversation resource.
     * 
     * @return the conversation value.
     */
    @Metadata(generated = true)
    public RealtimeServerEventConversationCreatedConversation getConversation() {
        return this.conversation;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeJsonField("conversation", this.conversation);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventConversationCreated from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventConversationCreated if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeServerEventConversationCreated.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventConversationCreated fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            RealtimeServerEventConversationCreatedConversation conversation = null;
            RealtimeServerEventType type = RealtimeServerEventType.CONVERSATION_CREATED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("conversation".equals(fieldName)) {
                    conversation = RealtimeServerEventConversationCreatedConversation.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeServerEventConversationCreated deserializedRealtimeServerEventConversationCreated
                = new RealtimeServerEventConversationCreated(eventId, conversation);
            deserializedRealtimeServerEventConversationCreated.type = type;

            return deserializedRealtimeServerEventConversationCreated;
        });
    }
}