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

/**
 * The OmniTypedResponseFormat model.
 */
@Immutable
public class OmniTypedResponseFormat implements JsonSerializable<OmniTypedResponseFormat> {
    /*
     * The type property.
     */
    @Generated
    private String type = "OmniTypedResponseFormat";

    /**
     * Creates an instance of OmniTypedResponseFormat class.
     */
    @Generated
    public OmniTypedResponseFormat() {
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OmniTypedResponseFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OmniTypedResponseFormat if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OmniTypedResponseFormat.
     */
    @Generated
    public static OmniTypedResponseFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("json_object".equals(discriminatorValue)) {
                    return ResponseFormatJsonObject.fromJson(readerToUse.reset());
                } else if ("json_schema".equals(discriminatorValue)) {
                    return ResponseFormatJsonSchema.fromJson(readerToUse.reset());
                } else if ("text".equals(discriminatorValue)) {
                    return ResponseFormatText.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static OmniTypedResponseFormat fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OmniTypedResponseFormat deserializedOmniTypedResponseFormat = new OmniTypedResponseFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedOmniTypedResponseFormat.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOmniTypedResponseFormat;
        });
    }
}
