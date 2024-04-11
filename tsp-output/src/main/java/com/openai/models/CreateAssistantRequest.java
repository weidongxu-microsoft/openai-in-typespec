// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.core.models.BinaryData;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The CreateAssistantRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateAssistantRequest implements JsonSerializable<CreateAssistantRequest> {
    /*
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to
     * see all of your available models, or see our [Model overview](/docs/models/overview) for
     * descriptions of them.
     */
    @Metadata(generated = true)
    private final String model;

    /*
     * The name of the assistant. The maximum length is 256 characters.
     */
    @Metadata(generated = true)
    private String name;

    /*
     * The description of the assistant. The maximum length is 512 characters.
     */
    @Metadata(generated = true)
    private String description;

    /*
     * The system instructions that the assistant uses. The maximum length is 32768 characters.
     */
    @Metadata(generated = true)
    private String instructions;

    /*
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant.
     * Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     */
    @Metadata(generated = true)
    private List<BinaryData> tools;

    /*
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a
     * maximum of 20 files attached to the assistant. Files are ordered by their creation date in
     * ascending order.
     */
    @Metadata(generated = true)
    private List<String> fileIds;

    /*
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     */
    @Metadata(generated = true)
    private Map<String, String> metadata;

    /**
     * Creates an instance of CreateAssistantRequest class.
     * 
     * @param model the model value to set.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest(String model) {
        this.model = model;
    }

    /**
     * Get the model property: ID of the model to use. You can use the [List models](/docs/api-reference/models/list)
     * API to
     * see all of your available models, or see our [Model overview](/docs/models/overview) for
     * descriptions of them.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public String getModel() {
        return this.model;
    }

    /**
     * Get the name property: The name of the assistant. The maximum length is 256 characters.
     * 
     * @return the name value.
     */
    @Metadata(generated = true)
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the assistant. The maximum length is 256 characters.
     * 
     * @param name the name value to set.
     * @return the CreateAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The description of the assistant. The maximum length is 512 characters.
     * 
     * @return the description value.
     */
    @Metadata(generated = true)
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the assistant. The maximum length is 512 characters.
     * 
     * @param description the description value to set.
     * @return the CreateAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the instructions property: The system instructions that the assistant uses. The maximum length is 32768
     * characters.
     * 
     * @return the instructions value.
     */
    @Metadata(generated = true)
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: The system instructions that the assistant uses. The maximum length is 32768
     * characters.
     * 
     * @param instructions the instructions value to set.
     * @return the CreateAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the tools property: A list of tool enabled on the assistant. There can be a maximum of 128 tools per
     * assistant.
     * Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * 
     * @return the tools value.
     */
    @Metadata(generated = true)
    public List<BinaryData> getTools() {
        return this.tools;
    }

    /**
     * Set the tools property: A list of tool enabled on the assistant. There can be a maximum of 128 tools per
     * assistant.
     * Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * 
     * @param tools the tools value to set.
     * @return the CreateAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest setTools(List<BinaryData> tools) {
        this.tools = tools;
        return this;
    }

    /**
     * Get the fileIds property: A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can
     * be a
     * maximum of 20 files attached to the assistant. Files are ordered by their creation date in
     * ascending order.
     * 
     * @return the fileIds value.
     */
    @Metadata(generated = true)
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Set the fileIds property: A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can
     * be a
     * maximum of 20 files attached to the assistant. Files are ordered by their creation date in
     * ascending order.
     * 
     * @param fileIds the fileIds value to set.
     * @return the CreateAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    /**
     * Get the metadata property: Set of 16 key-value pairs that can be attached to an object. This can be useful for
     * storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     * 
     * @return the metadata value.
     */
    @Metadata(generated = true)
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Set of 16 key-value pairs that can be attached to an object. This can be useful for
     * storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     * 
     * @param metadata the metadata value to set.
     * @return the CreateAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public CreateAssistantRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("instructions", this.instructions);
        jsonWriter.writeArrayField("tools", this.tools, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateAssistantRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateAssistantRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateAssistantRequest.
     */
    @Metadata(generated = true)
    public static CreateAssistantRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String model = null;
            String name = null;
            String description = null;
            String instructions = null;
            List<BinaryData> tools = null;
            List<String> fileIds = null;
            Map<String, String> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("instructions".equals(fieldName)) {
                    instructions = reader.getString();
                } else if ("tools".equals(fieldName)) {
                    tools = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else if ("file_ids".equals(fieldName)) {
                    fileIds = reader.readArray(reader1 -> reader1.getString());
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            CreateAssistantRequest deserializedCreateAssistantRequest = new CreateAssistantRequest(model);
            deserializedCreateAssistantRequest.name = name;
            deserializedCreateAssistantRequest.description = description;
            deserializedCreateAssistantRequest.instructions = instructions;
            deserializedCreateAssistantRequest.tools = tools;
            deserializedCreateAssistantRequest.fileIds = fileIds;
            deserializedCreateAssistantRequest.metadata = metadata;

            return deserializedCreateAssistantRequest;
        });
    }
}
