// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RealtimeResponseMessageItem model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeResponseMessageItem extends RealtimeResponseItem {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeItemType type = RealtimeItemType.MESSAGE;

    /*
     * The role property.
     */
    @Metadata(generated = true)
    private final RealtimeMessageRole role;

    /*
     * The content property.
     */
    @Metadata(generated = true)
    private final List<RealtimeContentPart> content;

    /*
     * The status property.
     */
    @Metadata(generated = true)
    private final RealtimeItemStatus status;

    /**
     * Creates an instance of RealtimeResponseMessageItem class.
     * 
     * @param id the id value to set.
     * @param role the role value to set.
     * @param content the content value to set.
     * @param status the status value to set.
     */
    @Metadata(generated = true)
    private RealtimeResponseMessageItem(String id, RealtimeMessageRole role, List<RealtimeContentPart> content,
        RealtimeItemStatus status) {
        super(id);
        this.role = role;
        this.content = content;
        this.status = status;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public RealtimeItemType getType() {
        return this.type;
    }

    /**
     * Get the role property: The role property.
     * 
     * @return the role value.
     */
    @Metadata(generated = true)
    public RealtimeMessageRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The content property.
     * 
     * @return the content value.
     */
    @Metadata(generated = true)
    public List<RealtimeContentPart> getContent() {
        return this.content;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    @Metadata(generated = true)
    public RealtimeItemStatus getStatus() {
        return this.status;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("object", getObject());
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeArrayField("content", this.content, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeResponseMessageItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeResponseMessageItem if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeResponseMessageItem.
     */
    @Metadata(generated = true)
    public static RealtimeResponseMessageItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RealtimeMessageRole role = null;
            List<RealtimeContentPart> content = null;
            RealtimeItemStatus status = null;
            RealtimeItemType type = RealtimeItemType.MESSAGE;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("role".equals(fieldName)) {
                    role = RealtimeMessageRole.fromString(reader.getString());
                } else if ("content".equals(fieldName)) {
                    content = reader.readArray(reader1 -> RealtimeContentPart.fromJson(reader1));
                } else if ("status".equals(fieldName)) {
                    status = RealtimeItemStatus.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    type = RealtimeItemType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeResponseMessageItem deserializedRealtimeResponseMessageItem
                = new RealtimeResponseMessageItem(id, role, content, status);
            deserializedRealtimeResponseMessageItem.type = type;

            return deserializedRealtimeResponseMessageItem;
        });
    }
}
