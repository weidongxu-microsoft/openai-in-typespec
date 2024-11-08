// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RunStepDetailsToolCallsCodeObjectCodeInterpreter model.
 */
@Immutable
public final class RunStepDetailsToolCallsCodeObjectCodeInterpreter
    implements JsonSerializable<RunStepDetailsToolCallsCodeObjectCodeInterpreter> {
    /*
     * The input to the Code Interpreter tool call.
     */
    @Generated
    private final String input;

    /*
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text
     * (`logs`) or images (`image`). Each of these are represented by a different object type.
     */
    @Generated
    private List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsObject> outputs;

    /**
     * Creates an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter class.
     * 
     * @param input the input value to set.
     */
    @Generated
    private RunStepDetailsToolCallsCodeObjectCodeInterpreter(String input) {
        this.input = input;
    }

    /**
     * Get the input property: The input to the Code Interpreter tool call.
     * 
     * @return the input value.
     */
    @Generated
    public String getInput() {
        return this.input;
    }

    /**
     * Get the outputs property: The outputs from the Code Interpreter tool call. Code Interpreter can output one or
     * more items, including text (`logs`) or images (`image`). Each of these are represented by a different object
     * type.
     * 
     * @return the outputs value.
     */
    @Generated
    public List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsObject> getOutputs() {
        return this.outputs;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("input", this.input);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsCodeObjectCodeInterpreter.
     */
    @Generated
    public static RunStepDetailsToolCallsCodeObjectCodeInterpreter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String input = null;
            List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsObject> outputs = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("input".equals(fieldName)) {
                    input = reader.getString();
                } else if ("outputs".equals(fieldName)) {
                    outputs = reader.readArray(
                        reader1 -> RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsObject.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDetailsToolCallsCodeObjectCodeInterpreter deserializedRunStepDetailsToolCallsCodeObjectCodeInterpreter
                = new RunStepDetailsToolCallsCodeObjectCodeInterpreter(input);
            deserializedRunStepDetailsToolCallsCodeObjectCodeInterpreter.outputs = outputs;

            return deserializedRunStepDetailsToolCallsCodeObjectCodeInterpreter;
        });
    }
}
