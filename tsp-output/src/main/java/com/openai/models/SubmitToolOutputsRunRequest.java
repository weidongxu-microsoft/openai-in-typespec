// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The SubmitToolOutputsRunRequest model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class SubmitToolOutputsRunRequest implements JsonSerializable<SubmitToolOutputsRunRequest> {
    /*
     * A list of tools for which the outputs are being submitted.
     */
    @Metadata(generated = true)
    private final List<SubmitToolOutputsRunRequestToolOutputs> toolOutputs;

    /**
     * Creates an instance of SubmitToolOutputsRunRequest class.
     * 
     * @param toolOutputs the toolOutputs value to set.
     */
    @Metadata(generated = true)
    public SubmitToolOutputsRunRequest(List<SubmitToolOutputsRunRequestToolOutputs> toolOutputs) {
        this.toolOutputs = toolOutputs;
    }

    /**
     * Get the toolOutputs property: A list of tools for which the outputs are being submitted.
     * 
     * @return the toolOutputs value.
     */
    @Metadata(generated = true)
    public List<SubmitToolOutputsRunRequestToolOutputs> getToolOutputs() {
        return this.toolOutputs;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("tool_outputs", this.toolOutputs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubmitToolOutputsRunRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubmitToolOutputsRunRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SubmitToolOutputsRunRequest.
     */
    @Metadata(generated = true)
    public static SubmitToolOutputsRunRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<SubmitToolOutputsRunRequestToolOutputs> toolOutputs = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tool_outputs".equals(fieldName)) {
                    toolOutputs = reader.readArray(reader1 -> SubmitToolOutputsRunRequestToolOutputs.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new SubmitToolOutputsRunRequest(toolOutputs);
        });
    }
}