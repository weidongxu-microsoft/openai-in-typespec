// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when a new content part is added to an assistant message item during response generation.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventResponseContentPartAdded extends RealtimeServerEvent {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeServerEventType type = RealtimeServerEventType.RESPONSE_CONTENT_PART_ADDED;

    /*
     * The ID of the response.
     */
    @Metadata(generated = true)
    private final String responseId;

    /*
     * The ID of the item to which the content part was added.
     */
    @Metadata(generated = true)
    private final String itemId;

    /*
     * The index of the output item in the response.
     */
    @Metadata(generated = true)
    private final int outputIndex;

    /*
     * The index of the content part in the item's content array.
     */
    @Metadata(generated = true)
    private final int contentIndex;

    /*
     * The content part that was added.
     */
    @Metadata(generated = true)
    private final RealtimeContentPart part;

    /**
     * Creates an instance of RealtimeServerEventResponseContentPartAdded class.
     * 
     * @param eventId the eventId value to set.
     * @param responseId the responseId value to set.
     * @param itemId the itemId value to set.
     * @param outputIndex the outputIndex value to set.
     * @param contentIndex the contentIndex value to set.
     * @param part the part value to set.
     */
    @Metadata(generated = true)
    private RealtimeServerEventResponseContentPartAdded(String eventId, String responseId, String itemId,
        int outputIndex, int contentIndex, RealtimeContentPart part) {
        super(eventId);
        this.responseId = responseId;
        this.itemId = itemId;
        this.outputIndex = outputIndex;
        this.contentIndex = contentIndex;
        this.part = part;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    @Override
    public RealtimeServerEventType getType() {
        return this.type;
    }

    /**
     * Get the responseId property: The ID of the response.
     * 
     * @return the responseId value.
     */
    @Metadata(generated = true)
    public String getResponseId() {
        return this.responseId;
    }

    /**
     * Get the itemId property: The ID of the item to which the content part was added.
     * 
     * @return the itemId value.
     */
    @Metadata(generated = true)
    public String getItemId() {
        return this.itemId;
    }

    /**
     * Get the outputIndex property: The index of the output item in the response.
     * 
     * @return the outputIndex value.
     */
    @Metadata(generated = true)
    public int getOutputIndex() {
        return this.outputIndex;
    }

    /**
     * Get the contentIndex property: The index of the content part in the item's content array.
     * 
     * @return the contentIndex value.
     */
    @Metadata(generated = true)
    public int getContentIndex() {
        return this.contentIndex;
    }

    /**
     * Get the part property: The content part that was added.
     * 
     * @return the part value.
     */
    @Metadata(generated = true)
    public RealtimeContentPart getPart() {
        return this.part;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeStringField("response_id", this.responseId);
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeIntField("output_index", this.outputIndex);
        jsonWriter.writeIntField("content_index", this.contentIndex);
        jsonWriter.writeJsonField("part", this.part);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventResponseContentPartAdded from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventResponseContentPartAdded if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeServerEventResponseContentPartAdded.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventResponseContentPartAdded fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            String responseId = null;
            String itemId = null;
            int outputIndex = 0;
            int contentIndex = 0;
            RealtimeContentPart part = null;
            RealtimeServerEventType type = RealtimeServerEventType.RESPONSE_CONTENT_PART_ADDED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("response_id".equals(fieldName)) {
                    responseId = reader.getString();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("output_index".equals(fieldName)) {
                    outputIndex = reader.getInt();
                } else if ("content_index".equals(fieldName)) {
                    contentIndex = reader.getInt();
                } else if ("part".equals(fieldName)) {
                    part = RealtimeContentPart.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeServerEventResponseContentPartAdded deserializedRealtimeServerEventResponseContentPartAdded
                = new RealtimeServerEventResponseContentPartAdded(eventId, responseId, itemId, outputIndex,
                    contentIndex, part);
            deserializedRealtimeServerEventResponseContentPartAdded.type = type;

            return deserializedRealtimeServerEventResponseContentPartAdded;
        });
    }
}
