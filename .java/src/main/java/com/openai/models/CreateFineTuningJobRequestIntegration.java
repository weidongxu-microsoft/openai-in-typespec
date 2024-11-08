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
 * The CreateFineTuningJobRequestIntegration model.
 */
@Immutable
public class CreateFineTuningJobRequestIntegration implements JsonSerializable<CreateFineTuningJobRequestIntegration> {
    /*
     * The type property.
     */
    @Generated
    private String type = "CreateFineTuningJobRequestIntegration";

    /**
     * Creates an instance of CreateFineTuningJobRequestIntegration class.
     */
    @Generated
    public CreateFineTuningJobRequestIntegration() {
    }

    /**
     * Get the type property: The type property.
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
     * Reads an instance of CreateFineTuningJobRequestIntegration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateFineTuningJobRequestIntegration if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateFineTuningJobRequestIntegration.
     */
    @Generated
    public static CreateFineTuningJobRequestIntegration fromJson(JsonReader jsonReader) throws IOException {
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
                if ("wandb".equals(discriminatorValue)) {
                    return CreateFineTuningJobRequestWandbIntegration.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static CreateFineTuningJobRequestIntegration fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateFineTuningJobRequestIntegration deserializedCreateFineTuningJobRequestIntegration
                = new CreateFineTuningJobRequestIntegration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCreateFineTuningJobRequestIntegration.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateFineTuningJobRequestIntegration;
        });
    }
}
