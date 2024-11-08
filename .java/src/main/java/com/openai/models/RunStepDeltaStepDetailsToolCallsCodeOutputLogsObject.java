// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
@Immutable
public final class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    extends RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsObject {
    /*
     * The discriminated type identifier for the details object.
     */
    @Generated
    private String type = "logs";

    /*
     * The index of the output in the outputs array.
     */
    @Generated
    private final int index;

    /*
     * The text output from the Code Interpreter tool call.
     */
    @Generated
    private String logs;

    /**
     * Creates an instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject class.
     * 
     * @param index the index value to set.
     */
    @Generated
    private RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(int index) {
        this.index = index;
    }

    /**
     * Get the type property: The discriminated type identifier for the details object.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the index property: The index of the output in the outputs array.
     * 
     * @return the index value.
     */
    @Generated
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the logs property: The text output from the Code Interpreter tool call.
     * 
     * @return the logs value.
     */
    @Generated
    public String getLogs() {
        return this.logs;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("logs", this.logs);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
     */
    @Generated
    public static RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = "logs";
            String logs = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("logs".equals(fieldName)) {
                    logs = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject deserializedRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
                = new RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(index);
            deserializedRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.type = type;
            deserializedRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.logs = logs;

            return deserializedRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
        });
    }
}
