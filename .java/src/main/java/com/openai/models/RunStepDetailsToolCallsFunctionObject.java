// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The RunStepDetailsToolCallsFunctionObject model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDetailsToolCallsFunctionObject extends RunStepDetailsToolCallsObjectToolCallsObject {
    /*
     * The discriminated type identifier for the details object.
     */
    @Metadata(generated = true)
    private String type = "function";

    /*
     * The ID of the tool call object.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The definition of the function that was called.
     */
    @Metadata(generated = true)
    private final RunStepDetailsToolCallsFunctionObjectFunction function;

    /**
     * Creates an instance of RunStepDetailsToolCallsFunctionObject class.
     * 
     * @param id the id value to set.
     * @param function the function value to set.
     */
    @Metadata(generated = true)
    private RunStepDetailsToolCallsFunctionObject(String id, RunStepDetailsToolCallsFunctionObjectFunction function) {
        this.id = id;
        this.function = function;
    }

    /**
     * Get the type property: The discriminated type identifier for the details object.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the id property: The ID of the tool call object.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the function property: The definition of the function that was called.
     * 
     * @return the function value.
     */
    @Metadata(generated = true)
    public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("function", this.function);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsFunctionObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsFunctionObject if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsFunctionObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsToolCallsFunctionObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RunStepDetailsToolCallsFunctionObjectFunction function = null;
            String type = "function";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("function".equals(fieldName)) {
                    function = RunStepDetailsToolCallsFunctionObjectFunction.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDetailsToolCallsFunctionObject deserializedRunStepDetailsToolCallsFunctionObject
                = new RunStepDetailsToolCallsFunctionObject(id, function);
            deserializedRunStepDetailsToolCallsFunctionObject.type = type;

            return deserializedRunStepDetailsToolCallsFunctionObject;
        });
    }
}
