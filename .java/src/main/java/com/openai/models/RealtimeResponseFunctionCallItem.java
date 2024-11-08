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
 * The RealtimeResponseFunctionCallItem model.
 */
@Immutable
public final class RealtimeResponseFunctionCallItem extends RealtimeResponseItem {
    /*
     * The type property.
     */
    @Generated
    private RealtimeItemType type = RealtimeItemType.FUNCTION_CALL;

    /*
     * The name property.
     */
    @Generated
    private final String name;

    /*
     * The call_id property.
     */
    @Generated
    private final String callId;

    /*
     * The arguments property.
     */
    @Generated
    private final String arguments;

    /*
     * The status property.
     */
    @Generated
    private final RealtimeItemStatus status;

    /**
     * Creates an instance of RealtimeResponseFunctionCallItem class.
     * 
     * @param id the id value to set.
     * @param name the name value to set.
     * @param callId the callId value to set.
     * @param arguments the arguments value to set.
     * @param status the status value to set.
     */
    @Generated
    private RealtimeResponseFunctionCallItem(String id, String name, String callId, String arguments,
        RealtimeItemStatus status) {
        super(id);
        this.name = name;
        this.callId = callId;
        this.arguments = arguments;
        this.status = status;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeItemType getType() {
        return this.type;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the callId property: The call_id property.
     * 
     * @return the callId value.
     */
    @Generated
    public String getCallId() {
        return this.callId;
    }

    /**
     * Get the arguments property: The arguments property.
     * 
     * @return the arguments value.
     */
    @Generated
    public String getArguments() {
        return this.arguments;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    @Generated
    public RealtimeItemStatus getStatus() {
        return this.status;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("object", getObject());
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("call_id", this.callId);
        jsonWriter.writeStringField("arguments", this.arguments);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeResponseFunctionCallItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeResponseFunctionCallItem if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeResponseFunctionCallItem.
     */
    @Generated
    public static RealtimeResponseFunctionCallItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            String name = null;
            String callId = null;
            String arguments = null;
            RealtimeItemStatus status = null;
            RealtimeItemType type = RealtimeItemType.FUNCTION_CALL;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("call_id".equals(fieldName)) {
                    callId = reader.getString();
                } else if ("arguments".equals(fieldName)) {
                    arguments = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = RealtimeItemStatus.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    type = RealtimeItemType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeResponseFunctionCallItem deserializedRealtimeResponseFunctionCallItem
                = new RealtimeResponseFunctionCallItem(id, name, callId, arguments, status);
            deserializedRealtimeResponseFunctionCallItem.type = type;

            return deserializedRealtimeResponseFunctionCallItem;
        });
    }
}
