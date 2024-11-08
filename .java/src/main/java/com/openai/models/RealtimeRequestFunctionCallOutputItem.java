// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The RealtimeRequestFunctionCallOutputItem model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class RealtimeRequestFunctionCallOutputItem extends RealtimeRequestItem {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeItemType type = RealtimeItemType.FUNCTION_CALL_OUTPUT;

    /*
     * The call_id property.
     */
    @Metadata(generated = true)
    private final String callId;

    /*
     * The output property.
     */
    @Metadata(generated = true)
    private final String output;

    /**
     * Creates an instance of RealtimeRequestFunctionCallOutputItem class.
     * 
     * @param callId the callId value to set.
     * @param output the output value to set.
     */
    @Metadata(generated = true)
    public RealtimeRequestFunctionCallOutputItem(String callId, String output) {
        this.callId = callId;
        this.output = output;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public RealtimeItemType getType() {
        return this.type;
    }

    /**
     * Get the callId property: The call_id property.
     * 
     * @return the callId value.
     */
    @Metadata(generated = true)
    public String getCallId() {
        return this.callId;
    }

    /**
     * Get the output property: The output property.
     * 
     * @return the output value.
     */
    @Metadata(generated = true)
    public String getOutput() {
        return this.output;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public RealtimeRequestFunctionCallOutputItem setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeStringField("call_id", this.callId);
        jsonWriter.writeStringField("output", this.output);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeRequestFunctionCallOutputItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeRequestFunctionCallOutputItem if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeRequestFunctionCallOutputItem.
     */
    @Metadata(generated = true)
    public static RealtimeRequestFunctionCallOutputItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            String callId = null;
            String output = null;
            RealtimeItemType type = RealtimeItemType.FUNCTION_CALL_OUTPUT;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("call_id".equals(fieldName)) {
                    callId = reader.getString();
                } else if ("output".equals(fieldName)) {
                    output = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeItemType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeRequestFunctionCallOutputItem deserializedRealtimeRequestFunctionCallOutputItem
                = new RealtimeRequestFunctionCallOutputItem(callId, output);
            deserializedRealtimeRequestFunctionCallOutputItem.setId(id);
            deserializedRealtimeRequestFunctionCallOutputItem.type = type;

            return deserializedRealtimeRequestFunctionCallOutputItem;
        });
    }
}