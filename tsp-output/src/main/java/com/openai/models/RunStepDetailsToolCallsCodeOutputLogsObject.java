// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDetailsToolCallsCodeOutputLogsObject
    implements JsonSerializable<RunStepDetailsToolCallsCodeOutputLogsObject> {
    /*
     * Always `logs`.
     */
    @Metadata(generated = true)
    private final String type = "logs";

    /*
     * The text output from the Code Interpreter tool call.
     */
    @Metadata(generated = true)
    private final String logs;

    /**
     * Creates an instance of RunStepDetailsToolCallsCodeOutputLogsObject class.
     * 
     * @param logs the logs value to set.
     */
    @Metadata(generated = true)
    private RunStepDetailsToolCallsCodeOutputLogsObject(String logs) {
        this.logs = logs;
    }

    /**
     * Get the type property: Always `logs`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the logs property: The text output from the Code Interpreter tool call.
     * 
     * @return the logs value.
     */
    @Metadata(generated = true)
    public String getLogs() {
        return this.logs;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("logs", this.logs);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsCodeOutputLogsObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsCodeOutputLogsObject if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsCodeOutputLogsObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsToolCallsCodeOutputLogsObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String logs = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("logs".equals(fieldName)) {
                    logs = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDetailsToolCallsCodeOutputLogsObject(logs);
        });
    }
}