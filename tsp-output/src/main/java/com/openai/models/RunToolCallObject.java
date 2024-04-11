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
 * Tool call objects.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunToolCallObject implements JsonSerializable<RunToolCallObject> {
    /*
     * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using
     * the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The type of tool call the output is required for. For now, this is always `function`.
     */
    @Metadata(generated = true)
    private final String type = "function";

    /*
     * The function definition.
     */
    @Metadata(generated = true)
    private final RunToolCallObjectFunction function;

    /**
     * Creates an instance of RunToolCallObject class.
     * 
     * @param id the id value to set.
     * @param function the function value to set.
     */
    @Metadata(generated = true)
    private RunToolCallObject(String id, RunToolCallObjectFunction function) {
        this.id = id;
        this.function = function;
    }

    /**
     * Get the id property: The ID of the tool call. This ID must be referenced when you submit the tool outputs in
     * using
     * the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: The type of tool call the output is required for. For now, this is always `function`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the function property: The function definition.
     * 
     * @return the function value.
     */
    @Metadata(generated = true)
    public RunToolCallObjectFunction getFunction() {
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
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunToolCallObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunToolCallObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunToolCallObject.
     */
    @Metadata(generated = true)
    public static RunToolCallObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RunToolCallObjectFunction function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("function".equals(fieldName)) {
                    function = RunToolCallObjectFunction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new RunToolCallObject(id, function);
        });
    }
}
