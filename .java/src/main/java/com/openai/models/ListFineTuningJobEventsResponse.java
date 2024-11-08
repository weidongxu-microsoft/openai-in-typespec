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
 * The ListFineTuningJobEventsResponse model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ListFineTuningJobEventsResponse implements JsonSerializable<ListFineTuningJobEventsResponse> {
    /*
     * The has_more property.
     */
    @Metadata(generated = true)
    private final boolean hasMore;

    /*
     * The data property.
     */
    @Metadata(generated = true)
    private final List<FineTuningJobEvent> data;

    /*
     * The object property.
     */
    @Metadata(generated = true)
    private final String object = "list";

    /**
     * Creates an instance of ListFineTuningJobEventsResponse class.
     * 
     * @param hasMore the hasMore value to set.
     * @param data the data value to set.
     */
    @Metadata(generated = true)
    private ListFineTuningJobEventsResponse(boolean hasMore, List<FineTuningJobEvent> data) {
        this.hasMore = hasMore;
        this.data = data;
    }

    /**
     * Get the hasMore property: The has_more property.
     * 
     * @return the hasMore value.
     */
    @Metadata(generated = true)
    public boolean isHasMore() {
        return this.hasMore;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Metadata(generated = true)
    public List<FineTuningJobEvent> getData() {
        return this.data;
    }

    /**
     * Get the object property: The object property.
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("has_more", this.hasMore);
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("object", this.object);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListFineTuningJobEventsResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListFineTuningJobEventsResponse if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ListFineTuningJobEventsResponse.
     */
    @Metadata(generated = true)
    public static ListFineTuningJobEventsResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean hasMore = false;
            List<FineTuningJobEvent> data = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("has_more".equals(fieldName)) {
                    hasMore = reader.getBoolean();
                } else if ("data".equals(fieldName)) {
                    data = reader.readArray(reader1 -> FineTuningJobEvent.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new ListFineTuningJobEventsResponse(hasMore, data);
        });
    }
}