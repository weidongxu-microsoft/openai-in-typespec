// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.core.models.BinaryData;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Details of the tool call.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDetailsToolCallsObject implements JsonSerializable<RunStepDetailsToolCallsObject> {
    /*
     * Always `tool_calls`.
     */
    @Metadata(generated = true)
    private final String type = "tool_calls";

    /*
     * An array of tool calls the run step was involved in. These can be associated with one of three
     * types of tools: `code_interpreter`, `retrieval`, or `function`.
     */
    @Metadata(generated = true)
    private final List<BinaryData> toolCalls;

    /**
     * Creates an instance of RunStepDetailsToolCallsObject class.
     * 
     * @param toolCalls the toolCalls value to set.
     */
    @Metadata(generated = true)
    private RunStepDetailsToolCallsObject(List<BinaryData> toolCalls) {
        this.toolCalls = toolCalls;
    }

    /**
     * Get the type property: Always `tool_calls`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the toolCalls property: An array of tool calls the run step was involved in. These can be associated with one
     * of three
     * types of tools: `code_interpreter`, `retrieval`, or `function`.
     * 
     * @return the toolCalls value.
     */
    @Metadata(generated = true)
    public List<BinaryData> getToolCalls() {
        return this.toolCalls;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeArrayField("tool_calls", this.toolCalls, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsObject if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsToolCallsObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<BinaryData> toolCalls = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tool_calls".equals(fieldName)) {
                    toolCalls = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDetailsToolCallsObject(toolCalls);
        });
    }
}
