// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The BatchErrors model.
 */
@Immutable
public final class BatchErrors implements JsonSerializable<BatchErrors> {
    /*
     * The object type, which is always `list`.
     */
    @Generated
    private ListAuditLogsResponseObject1 object;

    /*
     * The data property.
     */
    @Generated
    private List<BatchErrorsDatum> data;

    /**
     * Creates an instance of BatchErrors class.
     */
    @Generated
    private BatchErrors() {
    }

    /**
     * Get the object property: The object type, which is always `list`.
     * 
     * @return the object value.
     */
    @Generated
    public ListAuditLogsResponseObject1 getObject() {
        return this.object;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Generated
    public List<BatchErrorsDatum> getData() {
        return this.data;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("object", this.object == null ? null : this.object.toString());
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchErrors from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchErrors if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchErrors.
     */
    @Generated
    public static BatchErrors fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchErrors deserializedBatchErrors = new BatchErrors();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("object".equals(fieldName)) {
                    deserializedBatchErrors.object = ListAuditLogsResponseObject1.fromString(reader.getString());
                } else if ("data".equals(fieldName)) {
                    List<BatchErrorsDatum> data = reader.readArray(reader1 -> BatchErrorsDatum.fromJson(reader1));
                    deserializedBatchErrors.data = data;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchErrors;
        });
    }
}
