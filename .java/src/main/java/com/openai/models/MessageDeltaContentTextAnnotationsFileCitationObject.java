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
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or
 * the message. Generated when the assistant uses the "file_search" tool to search files.
 */
@Immutable
public final class MessageDeltaContentTextAnnotationsFileCitationObject extends MessageDeltaTextContentAnnotation {
    /*
     * The discriminated type identifier for the content item.
     */
    @Generated
    private String type = "file_citation";

    /*
     * The index of the annotation in the text content part.
     */
    @Generated
    private final int index;

    /*
     * The text in the message content that needs to be replaced.
     */
    @Generated
    private String text;

    /*
     * The file_citation property.
     */
    @Generated
    private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

    /*
     * The start_index property.
     */
    @Generated
    private Integer startIndex;

    /*
     * The end_index property.
     */
    @Generated
    private Integer endIndex;

    /**
     * Creates an instance of MessageDeltaContentTextAnnotationsFileCitationObject class.
     * 
     * @param index the index value to set.
     */
    @Generated
    private MessageDeltaContentTextAnnotationsFileCitationObject(int index) {
        this.index = index;
    }

    /**
     * Get the type property: The discriminated type identifier for the content item.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the index property: The index of the annotation in the text content part.
     * 
     * @return the index value.
     */
    @Generated
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the text property: The text in the message content that needs to be replaced.
     * 
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * Get the fileCitation property: The file_citation property.
     * 
     * @return the fileCitation value.
     */
    @Generated
    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
        return this.fileCitation;
    }

    /**
     * Get the startIndex property: The start_index property.
     * 
     * @return the startIndex value.
     */
    @Generated
    public Integer getStartIndex() {
        return this.startIndex;
    }

    /**
     * Get the endIndex property: The end_index property.
     * 
     * @return the endIndex value.
     */
    @Generated
    public Integer getEndIndex() {
        return this.endIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeJsonField("file_citation", this.fileCitation);
        jsonWriter.writeNumberField("start_index", this.startIndex);
        jsonWriter.writeNumberField("end_index", this.endIndex);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDeltaContentTextAnnotationsFileCitationObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDeltaContentTextAnnotationsFileCitationObject if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageDeltaContentTextAnnotationsFileCitationObject.
     */
    @Generated
    public static MessageDeltaContentTextAnnotationsFileCitationObject fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = "file_citation";
            String text = null;
            MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation = null;
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
                } else if ("file_citation".equals(fieldName)) {
                    fileCitation = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fromJson(reader);
                } else if ("start_index".equals(fieldName)) {
                    startIndex = reader.getNullable(JsonReader::getInt);
                } else if ("end_index".equals(fieldName)) {
                    endIndex = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            MessageDeltaContentTextAnnotationsFileCitationObject deserializedMessageDeltaContentTextAnnotationsFileCitationObject
                = new MessageDeltaContentTextAnnotationsFileCitationObject(index);
            deserializedMessageDeltaContentTextAnnotationsFileCitationObject.type = type;
            deserializedMessageDeltaContentTextAnnotationsFileCitationObject.text = text;
            deserializedMessageDeltaContentTextAnnotationsFileCitationObject.fileCitation = fileCitation;
            deserializedMessageDeltaContentTextAnnotationsFileCitationObject.startIndex = startIndex;
            deserializedMessageDeltaContentTextAnnotationsFileCitationObject.endIndex = endIndex;

            return deserializedMessageDeltaContentTextAnnotationsFileCitationObject;
        });
    }
}
