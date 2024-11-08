// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The FineTuningIntegrationWandb model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class FineTuningIntegrationWandb extends FineTuningIntegration {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private String type = "wandb";

    /*
     * The settings for your integration with Weights and Biases. This payload specifies the project that
     * metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags
     * to your run, and set a default entity (team, username, etc) to be associated with your run.
     */
    @Metadata(generated = true)
    private final FineTuningIntegrationWandbWandb wandb;

    /**
     * Creates an instance of FineTuningIntegrationWandb class.
     * 
     * @param wandb the wandb value to set.
     */
    @Metadata(generated = true)
    private FineTuningIntegrationWandb(FineTuningIntegrationWandbWandb wandb) {
        this.wandb = wandb;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the wandb property: The settings for your integration with Weights and Biases. This payload specifies the
     * project that
     * metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags
     * to your run, and set a default entity (team, username, etc) to be associated with your run.
     * 
     * @return the wandb value.
     */
    @Metadata(generated = true)
    public FineTuningIntegrationWandbWandb getWandb() {
        return this.wandb;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("wandb", this.wandb);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FineTuningIntegrationWandb from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FineTuningIntegrationWandb if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FineTuningIntegrationWandb.
     */
    @Metadata(generated = true)
    public static FineTuningIntegrationWandb fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FineTuningIntegrationWandbWandb wandb = null;
            String type = "wandb";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("wandb".equals(fieldName)) {
                    wandb = FineTuningIntegrationWandbWandb.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            FineTuningIntegrationWandb deserializedFineTuningIntegrationWandb = new FineTuningIntegrationWandb(wandb);
            deserializedFineTuningIntegrationWandb.type = type;

            return deserializedFineTuningIntegrationWandb;
        });
    }
}
