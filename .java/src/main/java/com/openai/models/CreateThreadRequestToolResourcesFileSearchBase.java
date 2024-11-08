// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateThreadRequestToolResourcesFileSearchBase model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateThreadRequestToolResourcesFileSearchBase
    implements JsonSerializable<CreateThreadRequestToolResourcesFileSearchBase> {
    /**
     * Creates an instance of CreateThreadRequestToolResourcesFileSearchBase class.
     */
    @Metadata(generated = true)
    public CreateThreadRequestToolResourcesFileSearchBase() {
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateThreadRequestToolResourcesFileSearchBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateThreadRequestToolResourcesFileSearchBase if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateThreadRequestToolResourcesFileSearchBase.
     */
    @Metadata(generated = true)
    public static CreateThreadRequestToolResourcesFileSearchBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateThreadRequestToolResourcesFileSearchBase deserializedCreateThreadRequestToolResourcesFileSearchBase
                = new CreateThreadRequestToolResourcesFileSearchBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                reader.skipChildren();
            }

            return deserializedCreateThreadRequestToolResourcesFileSearchBase;
        });
    }
}
