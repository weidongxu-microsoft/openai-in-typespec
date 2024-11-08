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
 * The RunStepDeltaStepDetails model.
 */
@Immutable
public class RunStepDeltaStepDetails implements JsonSerializable<RunStepDeltaStepDetails> {
    /*
     * The discriminated type identifier for the details object.
     */
    @Generated
    private String type = "RunStepDeltaStepDetails";

    /**
     * Creates an instance of RunStepDeltaStepDetails class.
     */
    @Generated
    protected RunStepDeltaStepDetails() {
    }

    /**
     * Get the type property: The discriminated type identifier for the details object.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaStepDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaStepDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunStepDeltaStepDetails.
     */
    @Generated
    public static RunStepDeltaStepDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("tool_calls".equals(discriminatorValue)) {
                    return RunStepDeltaStepDetailsToolCallsObject.fromJson(readerToUse.reset());
                } else if ("message_creation".equals(discriminatorValue)) {
                    return RunStepDeltaStepDetailsMessageCreationObject.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static RunStepDeltaStepDetails fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDeltaStepDetails deserializedRunStepDeltaStepDetails = new RunStepDeltaStepDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedRunStepDeltaStepDetails.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunStepDeltaStepDetails;
        });
    }
}
