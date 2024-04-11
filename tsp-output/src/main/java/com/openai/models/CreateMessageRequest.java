// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The CreateMessageRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateMessageRequest implements JsonSerializable<CreateMessageRequest> {
    /*
     * The role of the entity that is creating the message. Currently only `user` is supported.
     */
    @Metadata(generated = true)
    private final String role = "user";

    /*
     * The content of the message.
     */
    @Metadata(generated = true)
    private final String content;

    /*
     * A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a
     * maximum of 10 files attached to a message. Useful for tools like `retrieval` and
     * `code_interpreter` that can access and use files.
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
     * Creates an instance of CreateMessageRequest class.
     * 
     * @param content the content value to set.
     */
    @Metadata(generated = true)
    public CreateMessageRequest(String content) {
        this.content = content;
    }

    /**
     * Get the role property: The role of the entity that is creating the message. Currently only `user` is supported.
     * 
     * @return the role value.
     */
    @Metadata(generated = true)
    public String getRole() {
        return this.role;
    }

    /**
     * Get the content property: The content of the message.
     * 
     * @return the content value.
     */
    @Metadata(generated = true)
    public String getContent() {
        return this.content;
    }

    /**
     * Get the fileIds property: A list of [File](/docs/api-reference/files) IDs that the message should use. There can
     * be a
     * maximum of 10 files attached to a message. Useful for tools like `retrieval` and
     * `code_interpreter` that can access and use files.
     * 
     * @return the fileIds value.
     */
    @Metadata(generated = true)
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Set the fileIds property: A list of [File](/docs/api-reference/files) IDs that the message should use. There can
     * be a
     * maximum of 10 files attached to a message. Useful for tools like `retrieval` and
     * `code_interpreter` that can access and use files.
     * 
     * @param fileIds the fileIds value to set.
     * @return the CreateMessageRequest object itself.
     */
    @Metadata(generated = true)
    public CreateMessageRequest setFileIds(List<String> fileIds) {
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
     * @return the CreateMessageRequest object itself.
     */
    @Metadata(generated = true)
    public CreateMessageRequest setMetadata(Map<String, String> metadata) {
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
        jsonWriter.writeStringField("role", this.role);
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateMessageRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateMessageRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateMessageRequest.
     */
    @Metadata(generated = true)
    public static CreateMessageRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String content = null;
            List<String> fileIds = null;
            Map<String, String> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("file_ids".equals(fieldName)) {
                    fileIds = reader.readArray(reader1 -> reader1.getString());
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            CreateMessageRequest deserializedCreateMessageRequest = new CreateMessageRequest(content);
            deserializedCreateMessageRequest.fileIds = fileIds;
            deserializedCreateMessageRequest.metadata = metadata;

            return deserializedCreateMessageRequest;
        });
    }
}