// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when the input audio buffer is cleared by the client.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventInputAudioBufferCleared extends RealtimeServerEvent {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeServerEventType type = RealtimeServerEventType.INPUT_AUDIO_BUFFER_CLEARED;

    /**
     * Creates an instance of RealtimeServerEventInputAudioBufferCleared class.
     * 
     * @param eventId the eventId value to set.
     */
    @Metadata(generated = true)
    private RealtimeServerEventInputAudioBufferCleared(String eventId) {
        super(eventId);
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
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventInputAudioBufferCleared from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventInputAudioBufferCleared if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeServerEventInputAudioBufferCleared.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventInputAudioBufferCleared fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            RealtimeServerEventType type = RealtimeServerEventType.INPUT_AUDIO_BUFFER_CLEARED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeServerEventInputAudioBufferCleared deserializedRealtimeServerEventInputAudioBufferCleared
                = new RealtimeServerEventInputAudioBufferCleared(eventId);
            deserializedRealtimeServerEventInputAudioBufferCleared.type = type;

            return deserializedRealtimeServerEventInputAudioBufferCleared;
        });
    }
}
