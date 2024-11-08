// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The SubmitToolOutputsRunRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class SubmitToolOutputsRunRequest implements JsonSerializable<SubmitToolOutputsRunRequest> {
    /*
     * A list of tools for which the outputs are being submitted.
     */
    @Metadata(generated = true)
    private final List<SubmitToolOutputsRunRequestToolOutput> toolOutputs;

    /*
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run
     * enters a terminal state with a `data: [DONE]` message.
     */
    @Metadata(generated = true)
    private Boolean stream;

    /**
     * Creates an instance of SubmitToolOutputsRunRequest class.
     * 
     * @param toolOutputs the toolOutputs value to set.
     */
    @Metadata(generated = true)
    public SubmitToolOutputsRunRequest(List<SubmitToolOutputsRunRequestToolOutput> toolOutputs) {
        this.toolOutputs = toolOutputs;
    }

    /**
     * Get the toolOutputs property: A list of tools for which the outputs are being submitted.
     * 
     * @return the toolOutputs value.
     */
    @Metadata(generated = true)
    public List<SubmitToolOutputsRunRequestToolOutput> getToolOutputs() {
        return this.toolOutputs;
    }

    /**
     * Get the stream property: If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     * 
     * @return the stream value.
     */
    @Metadata(generated = true)
    public Boolean isStream() {
        return this.stream;
    }

    /**
     * Set the stream property: If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     * 
     * @param stream the stream value to set.
     * @return the SubmitToolOutputsRunRequest object itself.
     */
    @Metadata(generated = true)
    public SubmitToolOutputsRunRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("tool_outputs", this.toolOutputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("stream", this.stream);
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
            List<SubmitToolOutputsRunRequestToolOutput> toolOutputs = null;
            Boolean stream = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tool_outputs".equals(fieldName)) {
                    toolOutputs = reader.readArray(reader1 -> SubmitToolOutputsRunRequestToolOutput.fromJson(reader1));
                } else if ("stream".equals(fieldName)) {
                    stream = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            SubmitToolOutputsRunRequest deserializedSubmitToolOutputsRunRequest
                = new SubmitToolOutputsRunRequest(toolOutputs);
            deserializedSubmitToolOutputsRunRequest.stream = stream;

            return deserializedSubmitToolOutputsRunRequest;
        });
    }
}