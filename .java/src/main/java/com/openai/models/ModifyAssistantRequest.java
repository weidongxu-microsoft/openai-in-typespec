// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import io.clientcore.core.util.binarydata.BinaryData;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The ModifyAssistantRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class ModifyAssistantRequest implements JsonSerializable<ModifyAssistantRequest> {
    /*
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your
     * available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     */
    @Metadata(generated = true)
    private String model;

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
     * The system instructions that the assistant uses. The maximum length is 256,000 characters.
     */
    @Metadata(generated = true)
    private String instructions;

    /*
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types
     * `code_interpreter`, `file_search`, or `function`.
     */
    @Metadata(generated = true)
    private List<AssistantToolDefinition> tools;

    /*
     * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For
     * example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of
     * vector store IDs.
     */
    @Metadata(generated = true)
    private ModifyAssistantRequestToolResources toolResources;

    /*
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional
     * information about the object in a structured format. Keys can be a maximum of 64 characters long and values can
     * be a maximum of 512 characters long.
     */
    @Metadata(generated = true)
    private Map<String, String> metadata;

    /*
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while
     * lower values like 0.2 will make it more focused and deterministic.
     */
    @Metadata(generated = true)
    private Double temperature;

    /*
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of
     * the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are
     * considered.
     * 
     * We generally recommend altering this or temperature but not both.
     */
    @Metadata(generated = true)
    private Double topP;

    /*
     * The response_format property.
     */
    @Metadata(generated = true)
    private BinaryData responseFormat;

    /**
     * Creates an instance of ModifyAssistantRequest class.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest() {
    }

    /**
     * Get the model property: ID of the model to use. You can use the [List models](/docs/api-reference/models/list)
     * API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of
     * them.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: ID of the model to use. You can use the [List models](/docs/api-reference/models/list)
     * API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of
     * them.
     * 
     * @param model the model value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setModel(String model) {
        this.model = model;
        return this;
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
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setName(String name) {
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
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the instructions property: The system instructions that the assistant uses. The maximum length is 256,000
     * characters.
     * 
     * @return the instructions value.
     */
    @Metadata(generated = true)
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: The system instructions that the assistant uses. The maximum length is 256,000
     * characters.
     * 
     * @param instructions the instructions value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the tools property: A list of tool enabled on the assistant. There can be a maximum of 128 tools per
     * assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.
     * 
     * @return the tools value.
     */
    @Metadata(generated = true)
    public List<AssistantToolDefinition> getTools() {
        return this.tools;
    }

    /**
     * Set the tools property: A list of tool enabled on the assistant. There can be a maximum of 128 tools per
     * assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.
     * 
     * @param tools the tools value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setTools(List<AssistantToolDefinition> tools) {
        this.tools = tools;
        return this;
    }

    /**
     * Get the toolResources property: A set of resources that are used by the assistant's tools. The resources are
     * specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the
     * `file_search` tool requires a list of vector store IDs.
     * 
     * @return the toolResources value.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequestToolResources getToolResources() {
        return this.toolResources;
    }

    /**
     * Set the toolResources property: A set of resources that are used by the assistant's tools. The resources are
     * specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the
     * `file_search` tool requires a list of vector store IDs.
     * 
     * @param toolResources the toolResources value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setToolResources(ModifyAssistantRequestToolResources toolResources) {
        this.toolResources = toolResources;
        return this;
    }

    /**
     * Get the metadata property: Set of 16 key-value pairs that can be attached to an object. This can be useful for
     * storing additional information about the object in a structured format. Keys can be a maximum of 64 characters
     * long and values can be a maximum of 512 characters long.
     * 
     * @return the metadata value.
     */
    @Metadata(generated = true)
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Set of 16 key-value pairs that can be attached to an object. This can be useful for
     * storing additional information about the object in a structured format. Keys can be a maximum of 64 characters
     * long and values can be a maximum of 512 characters long.
     * 
     * @param metadata the metadata value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the temperature property: What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make
     * the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * 
     * @return the temperature value.
     */
    @Metadata(generated = true)
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make
     * the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * 
     * @param temperature the temperature value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the topP property: An alternative to sampling with temperature, called nucleus sampling, where the model
     * considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top
     * 10% probability mass are considered.
     * 
     * We generally recommend altering this or temperature but not both.
     * 
     * @return the topP value.
     */
    @Metadata(generated = true)
    public Double getTopP() {
        return this.topP;
    }

    /**
     * Set the topP property: An alternative to sampling with temperature, called nucleus sampling, where the model
     * considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top
     * 10% probability mass are considered.
     * 
     * We generally recommend altering this or temperature but not both.
     * 
     * @param topP the topP value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    /**
     * Get the responseFormat property: The response_format property.
     * 
     * @return the responseFormat value.
     */
    @Metadata(generated = true)
    public BinaryData getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Set the responseFormat property: The response_format property.
     * 
     * @param responseFormat the responseFormat value to set.
     * @return the ModifyAssistantRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyAssistantRequest setResponseFormat(BinaryData responseFormat) {
        this.responseFormat = responseFormat;
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
        jsonWriter.writeArrayField("tools", this.tools, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("tool_resources", this.toolResources);
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("temperature", this.temperature);
        jsonWriter.writeNumberField("top_p", this.topP);
        if (this.responseFormat != null) {
            jsonWriter.writeUntypedField("response_format", this.responseFormat.toObject(Object.class));
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModifyAssistantRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModifyAssistantRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModifyAssistantRequest.
     */
    @Metadata(generated = true)
    public static ModifyAssistantRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ModifyAssistantRequest deserializedModifyAssistantRequest = new ModifyAssistantRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("model".equals(fieldName)) {
                    deserializedModifyAssistantRequest.model = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedModifyAssistantRequest.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedModifyAssistantRequest.description = reader.getString();
                } else if ("instructions".equals(fieldName)) {
                    deserializedModifyAssistantRequest.instructions = reader.getString();
                } else if ("tools".equals(fieldName)) {
                    List<AssistantToolDefinition> tools
                        = reader.readArray(reader1 -> AssistantToolDefinition.fromJson(reader1));
                    deserializedModifyAssistantRequest.tools = tools;
                } else if ("tool_resources".equals(fieldName)) {
                    deserializedModifyAssistantRequest.toolResources
                        = ModifyAssistantRequestToolResources.fromJson(reader);
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedModifyAssistantRequest.metadata = metadata;
                } else if ("temperature".equals(fieldName)) {
                    deserializedModifyAssistantRequest.temperature = reader.getNullable(JsonReader::getDouble);
                } else if ("top_p".equals(fieldName)) {
                    deserializedModifyAssistantRequest.topP = reader.getNullable(JsonReader::getDouble);
                } else if ("response_format".equals(fieldName)) {
                    deserializedModifyAssistantRequest.responseFormat
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModifyAssistantRequest;
        });
    }
}