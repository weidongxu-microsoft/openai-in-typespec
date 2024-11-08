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
 * The RunObjectLastError model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunObjectLastError implements JsonSerializable<RunObjectLastError> {
    /*
     * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
     */
    @Metadata(generated = true)
    private final RunObjectLastErrorCode code;

    /*
     * A human-readable description of the error.
     */
    @Metadata(generated = true)
    private final String message;

    /**
     * Creates an instance of RunObjectLastError class.
     * 
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Metadata(generated = true)
    private RunObjectLastError(RunObjectLastErrorCode code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
     * 
     * @return the code value.
     */
    @Metadata(generated = true)
    public RunObjectLastErrorCode getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable description of the error.
     * 
     * @return the message value.
     */
    @Metadata(generated = true)
    public String getMessage() {
        return this.message;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code == null ? null : this.code.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunObjectLastError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunObjectLastError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunObjectLastError.
     */
    @Metadata(generated = true)
    public static RunObjectLastError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunObjectLastErrorCode code = null;
            String message = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    code = RunObjectLastErrorCode.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new RunObjectLastError(code, message);
        });
    }
}
