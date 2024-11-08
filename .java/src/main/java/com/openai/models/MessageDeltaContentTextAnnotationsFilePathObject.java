// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageDeltaContentTextAnnotationsFilePathObject extends MessageDeltaTextContentAnnotation {
    /*
     * The discriminated type identifier for the content item.
     */
    @Metadata(generated = true)
    private String type = "file_path";

    /*
     * The index of the annotation in the text content part.
     */
    @Metadata(generated = true)
    private final int index;

    /*
     * The text in the message content that needs to be replaced.
     */
    @Metadata(generated = true)
    private String text;

    /*
     * The file_path property.
     */
    @Metadata(generated = true)
    private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

    /*
     * The start_index property.
     */
    @Metadata(generated = true)
    private Integer startIndex;

    /*
     * The end_index property.
     */
    @Metadata(generated = true)
    private Integer endIndex;

    /**
     * Creates an instance of MessageDeltaContentTextAnnotationsFilePathObject class.
     * 
     * @param index the index value to set.
     */
    @Metadata(generated = true)
    private MessageDeltaContentTextAnnotationsFilePathObject(int index) {
        this.index = index;
    }

    /**
     * Get the type property: The discriminated type identifier for the content item.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the index property: The index of the annotation in the text content part.
     * 
     * @return the index value.
     */
    @Metadata(generated = true)
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the text property: The text in the message content that needs to be replaced.
     * 
     * @return the text value.
     */
    @Metadata(generated = true)
    public String getText() {
        return this.text;
    }

    /**
     * Get the filePath property: The file_path property.
     * 
     * @return the filePath value.
     */
    @Metadata(generated = true)
    public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
        return this.filePath;
    }

    /**
     * Get the startIndex property: The start_index property.
     * 
     * @return the startIndex value.
     */
    @Metadata(generated = true)
    public Integer getStartIndex() {
        return this.startIndex;
    }

    /**
     * Get the endIndex property: The end_index property.
     * 
     * @return the endIndex value.
     */
    @Metadata(generated = true)
    public Integer getEndIndex() {
        return this.endIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeJsonField("file_path", this.filePath);
        jsonWriter.writeNumberField("start_index", this.startIndex);
        jsonWriter.writeNumberField("end_index", this.endIndex);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDeltaContentTextAnnotationsFilePathObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDeltaContentTextAnnotationsFilePathObject if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageDeltaContentTextAnnotationsFilePathObject.
     */
    @Metadata(generated = true)
    public static MessageDeltaContentTextAnnotationsFilePathObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = "file_path";
            String text = null;
            MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath = null;
            Integer startIndex = null;
            Integer endIndex = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("file_path".equals(fieldName)) {
                    filePath = MessageDeltaContentTextAnnotationsFilePathObjectFilePath.fromJson(reader);
                } else if ("start_index".equals(fieldName)) {
                    startIndex = reader.getNullable(JsonReader::getInt);
                } else if ("end_index".equals(fieldName)) {
                    endIndex = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            MessageDeltaContentTextAnnotationsFilePathObject deserializedMessageDeltaContentTextAnnotationsFilePathObject
                = new MessageDeltaContentTextAnnotationsFilePathObject(index);
            deserializedMessageDeltaContentTextAnnotationsFilePathObject.type = type;
            deserializedMessageDeltaContentTextAnnotationsFilePathObject.text = text;
            deserializedMessageDeltaContentTextAnnotationsFilePathObject.filePath = filePath;
            deserializedMessageDeltaContentTextAnnotationsFilePathObject.startIndex = startIndex;
            deserializedMessageDeltaContentTextAnnotationsFilePathObject.endIndex = endIndex;

            return deserializedMessageDeltaContentTextAnnotationsFilePathObject;
        });
    }
}
