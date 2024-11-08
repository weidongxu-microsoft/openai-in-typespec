// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Send this event when you want to truncate a previous assistant message’s audio.
 */
@Fluent
public final class RealtimeClientEventConversationItemTruncate extends RealtimeClientEvent {
    /*
     * The type property.
     */
    @Generated
    private RealtimeClientEventType type = RealtimeClientEventType.CONVERSATION_ITEM_TRUNCATE;

    /*
     * The ID of the assistant message item to truncate.
     */
    @Generated
    private final String itemId;

    /*
     * The index of the content part to truncate.
     */
    @Generated
    private final int contentIndex;

    /*
     * Inclusive duration up to which audio is truncated, in milliseconds.
     */
    @Generated
    private final int audioEndMs;

    /**
     * Creates an instance of RealtimeClientEventConversationItemTruncate class.
     * 
     * @param itemId the itemId value to set.
     * @param contentIndex the contentIndex value to set.
     * @param audioEndMs the audioEndMs value to set.
     */
    @Generated
    public RealtimeClientEventConversationItemTruncate(String itemId, int contentIndex, int audioEndMs) {
        this.itemId = itemId;
        this.contentIndex = contentIndex;
        this.audioEndMs = audioEndMs;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeClientEventType getType() {
        return this.type;
    }

    /**
     * Get the itemId property: The ID of the assistant message item to truncate.
     * 
     * @return the itemId value.
     */
    @Generated
    public String getItemId() {
        return this.itemId;
    }

    /**
     * Get the contentIndex property: The index of the content part to truncate.
     * 
     * @return the contentIndex value.
     */
    @Generated
    public int getContentIndex() {
        return this.contentIndex;
    }

    /**
     * Get the audioEndMs property: Inclusive duration up to which audio is truncated, in milliseconds.
     * 
     * @return the audioEndMs value.
     */
    @Generated
    public int getAudioEndMs() {
        return this.audioEndMs;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public RealtimeClientEventConversationItemTruncate setEventId(String eventId) {
        super.setEventId(eventId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeIntField("content_index", this.contentIndex);
        jsonWriter.writeIntField("audio_end_ms", this.audioEndMs);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeClientEventConversationItemTruncate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeClientEventConversationItemTruncate if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeClientEventConversationItemTruncate.
     */
    @Generated
    public static RealtimeClientEventConversationItemTruncate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            String itemId = null;
            int contentIndex = 0;
            int audioEndMs = 0;
            RealtimeClientEventType type = RealtimeClientEventType.CONVERSATION_ITEM_TRUNCATE;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("content_index".equals(fieldName)) {
                    contentIndex = reader.getInt();
                } else if ("audio_end_ms".equals(fieldName)) {
                    audioEndMs = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeClientEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeClientEventConversationItemTruncate deserializedRealtimeClientEventConversationItemTruncate
                = new RealtimeClientEventConversationItemTruncate(itemId, contentIndex, audioEndMs);
            deserializedRealtimeClientEventConversationItemTruncate.setEventId(eventId);
            deserializedRealtimeClientEventConversationItemTruncate.type = type;

            return deserializedRealtimeClientEventConversationItemTruncate;
        });
    }
}
