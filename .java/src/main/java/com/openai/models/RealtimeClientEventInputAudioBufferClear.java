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
 * Send this event to clear the audio bytes in the buffer.
 */
@Fluent
public final class RealtimeClientEventInputAudioBufferClear extends RealtimeClientEvent {
    /*
     * The type property.
     */
    @Generated
    private RealtimeClientEventType type = RealtimeClientEventType.INPUT_AUDIO_BUFFER_CLEAR;

    /**
     * Creates an instance of RealtimeClientEventInputAudioBufferClear class.
     */
    @Generated
    public RealtimeClientEventInputAudioBufferClear() {
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
     * {@inheritDoc}
     */
    @Generated
    @Override
    public RealtimeClientEventInputAudioBufferClear setEventId(String eventId) {
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeClientEventInputAudioBufferClear from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeClientEventInputAudioBufferClear if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealtimeClientEventInputAudioBufferClear.
     */
    @Generated
    public static RealtimeClientEventInputAudioBufferClear fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeClientEventInputAudioBufferClear deserializedRealtimeClientEventInputAudioBufferClear
                = new RealtimeClientEventInputAudioBufferClear();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    deserializedRealtimeClientEventInputAudioBufferClear.setEventId(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedRealtimeClientEventInputAudioBufferClear.type
                        = RealtimeClientEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRealtimeClientEventInputAudioBufferClear;
        });
    }
}
