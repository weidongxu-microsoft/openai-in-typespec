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
 * The CreateFineTuningJobRequestWandbIntegrationWandb model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateFineTuningJobRequestWandbIntegrationWandb
    implements JsonSerializable<CreateFineTuningJobRequestWandbIntegrationWandb> {
    /*
     * The project property.
     */
    @Metadata(generated = true)
    private final String project;

    /*
     * The name property.
     */
    @Metadata(generated = true)
    private String name;

    /*
     * The entity property.
     */
    @Metadata(generated = true)
    private String entity;

    /*
     * The tags property.
     */
    @Metadata(generated = true)
    private List<String> tags;

    /**
     * Creates an instance of CreateFineTuningJobRequestWandbIntegrationWandb class.
     * 
     * @param project the project value to set.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequestWandbIntegrationWandb(String project) {
        this.project = project;
    }

    /**
     * Get the project property: The project property.
     * 
     * @return the project value.
     */
    @Metadata(generated = true)
    public String getProject() {
        return this.project;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Metadata(generated = true)
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the CreateFineTuningJobRequestWandbIntegrationWandb object itself.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequestWandbIntegrationWandb setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the entity property: The entity property.
     * 
     * @return the entity value.
     */
    @Metadata(generated = true)
    public String getEntity() {
        return this.entity;
    }

    /**
     * Set the entity property: The entity property.
     * 
     * @param entity the entity value to set.
     * @return the CreateFineTuningJobRequestWandbIntegrationWandb object itself.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequestWandbIntegrationWandb setEntity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get the tags property: The tags property.
     * 
     * @return the tags value.
     */
    @Metadata(generated = true)
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags property.
     * 
     * @param tags the tags value to set.
     * @return the CreateFineTuningJobRequestWandbIntegrationWandb object itself.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequestWandbIntegrationWandb setTags(List<String> tags) {
        this.tags = tags;
        return this;
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
     * Reads an instance of CreateFineTuningJobRequestWandbIntegrationWandb from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateFineTuningJobRequestWandbIntegrationWandb if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateFineTuningJobRequestWandbIntegrationWandb.
     */
    @Metadata(generated = true)
    public static CreateFineTuningJobRequestWandbIntegrationWandb fromJson(JsonReader jsonReader) throws IOException {
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
            CreateFineTuningJobRequestWandbIntegrationWandb deserializedCreateFineTuningJobRequestWandbIntegrationWandb
                = new CreateFineTuningJobRequestWandbIntegrationWandb(project);
            deserializedCreateFineTuningJobRequestWandbIntegrationWandb.name = name;
            deserializedCreateFineTuningJobRequestWandbIntegrationWandb.entity = entity;
            deserializedCreateFineTuningJobRequestWandbIntegrationWandb.tags = tags;

            return deserializedCreateFineTuningJobRequestWandbIntegrationWandb;
        });
    }
}
