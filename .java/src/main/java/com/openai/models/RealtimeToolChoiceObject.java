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
 * A base representation for a realtime tool_choice selecting a named tool.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public class RealtimeToolChoiceObject implements JsonSerializable<RealtimeToolChoiceObject> {
    /*
     * The type property.
     */
    @Metadata(generated = true)
    private RealtimeToolType type = RealtimeToolType.fromString("RealtimeToolChoiceObject");

    /**
     * Creates an instance of RealtimeToolChoiceObject class.
     */
    @Metadata(generated = true)
    public RealtimeToolChoiceObject() {
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public RealtimeToolType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeToolChoiceObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeToolChoiceObject if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealtimeToolChoiceObject.
     */
    @Metadata(generated = true)
    public static RealtimeToolChoiceObject fromJson(JsonReader jsonReader) throws IOException {
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
                if ("function".equals(discriminatorValue)) {
                    return RealtimeToolChoiceFunctionObject.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Metadata(generated = true)
    static RealtimeToolChoiceObject fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeToolChoiceObject deserializedRealtimeToolChoiceObject = new RealtimeToolChoiceObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedRealtimeToolChoiceObject.type = RealtimeToolType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRealtimeToolChoiceObject;
        });
    }
}