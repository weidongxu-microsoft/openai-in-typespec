// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when input audio transcription is configured, and a transcription request for a user message failed.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventConversationItemInputAudioTranscriptionFailed extends RealtimeServerEvent {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeServerEventType type = RealtimeServerEventType.CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED;

    /*
     * The ID of the user message item.
     */
    @Metadata(generated = true)
    private final String itemId;

    /*
     * The index of the content part containing the audio.
     */
    @Metadata(generated = true)
    private final int contentIndex;

    /*
     * Details of the transcription error.
     */
    @Metadata(generated = true)
    private final RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

    /**
     * Creates an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed class.
     * 
     * @param eventId the eventId value to set.
     * @param itemId the itemId value to set.
     * @param contentIndex the contentIndex value to set.
     * @param error the error value to set.
     */
    @Metadata(generated = true)
    private RealtimeServerEventConversationItemInputAudioTranscriptionFailed(String eventId, String itemId,
        int contentIndex, RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
        super(eventId);
        this.itemId = itemId;
        this.contentIndex = contentIndex;
        this.error = error;
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
     * Get the itemId property: The ID of the user message item.
     * 
     * @return the itemId value.
     */
    @Metadata(generated = true)
    public String getItemId() {
        return this.itemId;
    }

    /**
     * Get the contentIndex property: The index of the content part containing the audio.
     * 
     * @return the contentIndex value.
     */
    @Metadata(generated = true)
    public int getContentIndex() {
        return this.contentIndex;
    }

    /**
     * Get the error property: Details of the transcription error.
     * 
     * @return the error value.
     */
    @Metadata(generated = true)
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError getError() {
        return this.error;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeIntField("content_index", this.contentIndex);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the
     * RealtimeServerEventConversationItemInputAudioTranscriptionFailed.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventConversationItemInputAudioTranscriptionFailed fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            String itemId = null;
            int contentIndex = 0;
            RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error = null;
            RealtimeServerEventType type = RealtimeServerEventType.CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("content_index".equals(fieldName)) {
                    contentIndex = reader.getInt();
                } else if ("error".equals(fieldName)) {
                    error = RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeServerEventConversationItemInputAudioTranscriptionFailed deserializedRealtimeServerEventConversationItemInputAudioTranscriptionFailed
                = new RealtimeServerEventConversationItemInputAudioTranscriptionFailed(eventId, itemId, contentIndex,
                    error);
            deserializedRealtimeServerEventConversationItemInputAudioTranscriptionFailed.type = type;

            return deserializedRealtimeServerEventConversationItemInputAudioTranscriptionFailed;
        });
    }
}