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
 * The per-line object of the batch output and error files.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class BatchRequestOutput implements JsonSerializable<BatchRequestOutput> {
    /*
     * The id property.
     */
    @Metadata(generated = true)
    private String id;

    /*
     * A developer-provided per-request id that will be used to match outputs to inputs.
     */
    @Metadata(generated = true)
    private String customId;

    /*
     * The response property.
     */
    @Metadata(generated = true)
    private BatchRequestOutputResponse response;

    /*
     * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
     */
    @Metadata(generated = true)
    private BatchRequestOutputError error;

    /**
     * Creates an instance of BatchRequestOutput class.
     */
    @Metadata(generated = true)
    private BatchRequestOutput() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the customId property: A developer-provided per-request id that will be used to match outputs to inputs.
     * 
     * @return the customId value.
     */
    @Metadata(generated = true)
    public String getCustomId() {
        return this.customId;
    }

    /**
     * Get the response property: The response property.
     * 
     * @return the response value.
     */
    @Metadata(generated = true)
    public BatchRequestOutputResponse getResponse() {
        return this.response;
    }

    /**
     * Get the error property: For requests that failed with a non-HTTP error, this will contain more information on the
     * cause of the failure.
     * 
     * @return the error value.
     */
    @Metadata(generated = true)
    public BatchRequestOutputError getError() {
        return this.error;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("custom_id", this.customId);
        jsonWriter.writeJsonField("response", this.response);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchRequestOutput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchRequestOutput if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchRequestOutput.
     */
    @Metadata(generated = true)
    public static BatchRequestOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchRequestOutput deserializedBatchRequestOutput = new BatchRequestOutput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBatchRequestOutput.id = reader.getString();
                } else if ("custom_id".equals(fieldName)) {
                    deserializedBatchRequestOutput.customId = reader.getString();
                } else if ("response".equals(fieldName)) {
                    deserializedBatchRequestOutput.response = BatchRequestOutputResponse.fromJson(reader);
                } else if ("error".equals(fieldName)) {
                    deserializedBatchRequestOutput.error = BatchRequestOutputError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchRequestOutput;
        });
    }
}