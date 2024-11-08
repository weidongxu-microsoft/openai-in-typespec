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
 * The FineTuningIntegrationWandbWandb model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class FineTuningIntegrationWandbWandb implements JsonSerializable<FineTuningIntegrationWandbWandb> {
    /*
     * The name of the project that the new run will be created under.
     */
    @Metadata(generated = true)
    private final String project;

    /*
     * A display name to set for the run. If not set, we will use the Job ID as the name.
     */
    @Metadata(generated = true)
    private String name;

    /*
     * The entity to use for the run. This allows you to set the team or username of the WandB user that you would
     * like associated with the run. If not set, the default entity for the registered WandB API key is used.
     */
    @Metadata(generated = true)
    private String entity;

    /*
     * A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some
     * default tags are generated by OpenAI: "openai/finetune", "openai/{base-model}", "openai/{ftjob-abcdef}".
     */
    @Metadata(generated = true)
    private List<String> tags;

    /**
     * Creates an instance of FineTuningIntegrationWandbWandb class.
     * 
     * @param project the project value to set.
     */
    @Metadata(generated = true)
    private FineTuningIntegrationWandbWandb(String project) {
        this.project = project;
    }

    /**
     * Get the project property: The name of the project that the new run will be created under.
     * 
     * @return the project value.
     */
    @Metadata(generated = true)
    public String getProject() {
        return this.project;
    }

    /**
     * Get the name property: A display name to set for the run. If not set, we will use the Job ID as the name.
     * 
     * @return the name value.
     */
    @Metadata(generated = true)
    public String getName() {
        return this.name;
    }

    /**
     * Get the entity property: The entity to use for the run. This allows you to set the team or username of the WandB
     * user that you would
     * like associated with the run. If not set, the default entity for the registered WandB API key is used.
     * 
     * @return the entity value.
     */
    @Metadata(generated = true)
    public String getEntity() {
        return this.entity;
    }

    /**
     * Get the tags property: A list of tags to be attached to the newly created run. These tags are passed through
     * directly to WandB. Some
     * default tags are generated by OpenAI: "openai/finetune", "openai/{base-model}", "openai/{ftjob-abcdef}".
     * 
     * @return the tags value.
     */
    @Metadata(generated = true)
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("project", this.project);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("entity", this.entity);
        jsonWriter.writeArrayField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FineTuningIntegrationWandbWandb from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FineTuningIntegrationWandbWandb if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FineTuningIntegrationWandbWandb.
     */
    @Metadata(generated = true)
    public static FineTuningIntegrationWandbWandb fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String project = null;
            String name = null;
            String entity = null;
            List<String> tags = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("project".equals(fieldName)) {
                    project = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("entity".equals(fieldName)) {
                    entity = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            FineTuningIntegrationWandbWandb deserializedFineTuningIntegrationWandbWandb
                = new FineTuningIntegrationWandbWandb(project);
            deserializedFineTuningIntegrationWandbWandb.name = name;
            deserializedFineTuningIntegrationWandbWandb.entity = entity;
            deserializedFineTuningIntegrationWandbWandb.tags = tags;

            return deserializedFineTuningIntegrationWandbWandb;
        });
    }
}
