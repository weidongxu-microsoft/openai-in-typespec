// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Send this event to commit audio bytes to a user message.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class RealtimeClientEventInputAudioBufferCommit extends RealtimeClientEvent {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeClientEventType type = RealtimeClientEventType.INPUT_AUDIO_BUFFER_COMMIT;

    /**
     * Creates an instance of RealtimeClientEventInputAudioBufferCommit class.
     */
    @Metadata(generated = true)
    public RealtimeClientEventInputAudioBufferCommit() {
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public RealtimeClientEventType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public RealtimeClientEventInputAudioBufferCommit setEventId(String eventId) {
        super.setEventId(eventId);
        return this;
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
     * Reads an instance of RealtimeClientEventInputAudioBufferCommit from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeClientEventInputAudioBufferCommit if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealtimeClientEventInputAudioBufferCommit.
     */
    @Metadata(generated = true)
    public static RealtimeClientEventInputAudioBufferCommit fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeClientEventInputAudioBufferCommit deserializedRealtimeClientEventInputAudioBufferCommit
                = new RealtimeClientEventInputAudioBufferCommit();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    deserializedRealtimeClientEventInputAudioBufferCommit.setEventId(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedRealtimeClientEventInputAudioBufferCommit.type
                        = RealtimeClientEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRealtimeClientEventInputAudioBufferCommit;
        });
    }
}
