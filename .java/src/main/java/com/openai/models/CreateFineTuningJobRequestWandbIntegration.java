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
 * The CreateFineTuningJobRequestWandbIntegration model.
 */
@Immutable
public final class CreateFineTuningJobRequestWandbIntegration extends CreateFineTuningJobRequestIntegration {
    /*
     * The type property.
     */
    @Generated
    private String type = "wandb";

    /*
     * The wandb property.
     */
    @Generated
    private final CreateFineTuningJobRequestWandbIntegrationWandb wandb;

    /**
     * Creates an instance of CreateFineTuningJobRequestWandbIntegration class.
     * 
     * @param wandb the wandb value to set.
     */
    @Generated
    public CreateFineTuningJobRequestWandbIntegration(CreateFineTuningJobRequestWandbIntegrationWandb wandb) {
        this.wandb = wandb;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the wandb property: The wandb property.
     * 
     * @return the wandb value.
     */
    @Generated
    public CreateFineTuningJobRequestWandbIntegrationWandb getWandb() {
        return this.wandb;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("wandb", this.wandb);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateFineTuningJobRequestWandbIntegration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateFineTuningJobRequestWandbIntegration if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateFineTuningJobRequestWandbIntegration.
     */
    @Generated
    public static CreateFineTuningJobRequestWandbIntegration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateFineTuningJobRequestWandbIntegrationWandb wandb = null;
            String type = "wandb";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("wandb".equals(fieldName)) {
                    wandb = CreateFineTuningJobRequestWandbIntegrationWandb.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            CreateFineTuningJobRequestWandbIntegration deserializedCreateFineTuningJobRequestWandbIntegration
                = new CreateFineTuningJobRequestWandbIntegration(wandb);
            deserializedCreateFineTuningJobRequestWandbIntegration.type = type;

            return deserializedCreateFineTuningJobRequestWandbIntegration;
        });
    }
}
