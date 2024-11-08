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
 * The representation of a realtime tool_choice selecting a named function tool.
 */
@Immutable
public final class RealtimeToolChoiceFunctionObject extends RealtimeToolChoiceObject {
    /*
     * The type property.
     */
    @Generated
    private RealtimeToolType type = RealtimeToolType.FUNCTION;

    /*
     * The function property.
     */
    @Generated
    private final RealtimeToolChoiceFunctionObjectFunction function;

    /**
     * Creates an instance of RealtimeToolChoiceFunctionObject class.
     * 
     * @param function the function value to set.
     */
    @Generated
    public RealtimeToolChoiceFunctionObject(RealtimeToolChoiceFunctionObjectFunction function) {
        this.function = function;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeToolType getType() {
        return this.type;
    }

    /**
     * Get the function property: The function property.
     * 
     * @return the function value.
     */
    @Generated
    public RealtimeToolChoiceFunctionObjectFunction getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("function", this.function);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeToolChoiceFunctionObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeToolChoiceFunctionObject if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeToolChoiceFunctionObject.
     */
    @Generated
    public static RealtimeToolChoiceFunctionObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeToolChoiceFunctionObjectFunction function = null;
            RealtimeToolType type = RealtimeToolType.FUNCTION;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("function".equals(fieldName)) {
                    function = RealtimeToolChoiceFunctionObjectFunction.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RealtimeToolType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeToolChoiceFunctionObject deserializedRealtimeToolChoiceFunctionObject
                = new RealtimeToolChoiceFunctionObject(function);
            deserializedRealtimeToolChoiceFunctionObject.type = type;

            return deserializedRealtimeToolChoiceFunctionObject;
        });
    }
}
