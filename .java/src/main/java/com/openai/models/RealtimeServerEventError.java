// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when an error occurs.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventError extends RealtimeServerEvent {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeServerEventType type = RealtimeServerEventType.ERROR;

    /*
     * Details of the error.
     */
    @Metadata(generated = true)
    private final RealtimeServerEventErrorError error;

    /**
     * Creates an instance of RealtimeServerEventError class.
     * 
     * @param eventId the eventId value to set.
     * @param error the error value to set.
     */
    @Metadata(generated = true)
    private RealtimeServerEventError(String eventId, RealtimeServerEventErrorError error) {
        super(eventId);
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
     * Get the error property: Details of the error.
     * 
     * @return the error value.
     */
    @Metadata(generated = true)
    public RealtimeServerEventErrorError getError() {
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
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventError if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeServerEventError.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            RealtimeServerEventErrorError error = null;
            RealtimeServerEventType type = RealtimeServerEventType.ERROR;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("error".equals(fieldName)) {
                    error = RealtimeServerEventErrorError.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeServerEventError deserializedRealtimeServerEventError
                = new RealtimeServerEventError(eventId, error);
            deserializedRealtimeServerEventError.type = type;

            return deserializedRealtimeServerEventError;
        });
    }
}