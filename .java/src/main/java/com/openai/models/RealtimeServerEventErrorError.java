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
 * The RealtimeServerEventErrorError model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventErrorError implements JsonSerializable<RealtimeServerEventErrorError> {
    /*
     * The type of error (e.g., "invalid_request_error", "server_error").
     */
    @Metadata(generated = true)
    private String type;

    /*
     * Error code, if any.
     */
    @Metadata(generated = true)
    private String code;

    /*
     * A human-readable error message.
     */
    @Metadata(generated = true)
    private String message;

    /*
     * Parameter related to the error, if any.
     */
    @Metadata(generated = true)
    private String param;

    /*
     * The event_id of the client event that caused the error, if applicable.
     */
    @Metadata(generated = true)
    private String eventId;

    /**
     * Creates an instance of RealtimeServerEventErrorError class.
     */
    @Metadata(generated = true)
    private RealtimeServerEventErrorError() {
    }

    /**
     * Get the type property: The type of error (e.g., "invalid_request_error", "server_error").
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the code property: Error code, if any.
     * 
     * @return the code value.
     */
    @Metadata(generated = true)
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable error message.
     * 
     * @return the message value.
     */
    @Metadata(generated = true)
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the param property: Parameter related to the error, if any.
     * 
     * @return the param value.
     */
    @Metadata(generated = true)
    public String getParam() {
        return this.param;
    }

    /**
     * Get the eventId property: The event_id of the client event that caused the error, if applicable.
     * 
     * @return the eventId value.
     */
    @Metadata(generated = true)
    public String getEventId() {
        return this.eventId;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("param", this.param);
        jsonWriter.writeStringField("event_id", this.eventId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventErrorError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventErrorError if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealtimeServerEventErrorError.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventErrorError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeServerEventErrorError deserializedRealtimeServerEventErrorError
                = new RealtimeServerEventErrorError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedRealtimeServerEventErrorError.type = reader.getString();
                } else if ("code".equals(fieldName)) {
                    deserializedRealtimeServerEventErrorError.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedRealtimeServerEventErrorError.message = reader.getString();
                } else if ("param".equals(fieldName)) {
                    deserializedRealtimeServerEventErrorError.param = reader.getString();
                } else if ("event_id".equals(fieldName)) {
                    deserializedRealtimeServerEventErrorError.eventId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRealtimeServerEventErrorError;
        });
    }
}