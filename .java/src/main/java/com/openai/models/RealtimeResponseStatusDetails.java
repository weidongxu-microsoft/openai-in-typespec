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

/**
 * The RealtimeResponseStatusDetails model.
 */
@Immutable
public final class RealtimeResponseStatusDetails implements JsonSerializable<RealtimeResponseStatusDetails> {
    /**
     * Creates an instance of RealtimeResponseStatusDetails class.
     */
    @Generated
    private RealtimeResponseStatusDetails() {
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeResponseStatusDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeResponseStatusDetails if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealtimeResponseStatusDetails.
     */
    @Generated
    public static RealtimeResponseStatusDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeResponseStatusDetails deserializedRealtimeResponseStatusDetails
                = new RealtimeResponseStatusDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                reader.skipChildren();
            }

            return deserializedRealtimeResponseStatusDetails;
        });
    }
}
