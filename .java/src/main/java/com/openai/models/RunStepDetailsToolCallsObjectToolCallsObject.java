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
 * Abstractly represents a run step tool call details inner object.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public class RunStepDetailsToolCallsObjectToolCallsObject
    implements JsonSerializable<RunStepDetailsToolCallsObjectToolCallsObject> {
    /*
     * The discriminated type identifier for the details object.
     */
    @Metadata(generated = true)
    private String type = "RunStepDetailsToolCallsObjectToolCallsObject";

    /**
     * Creates an instance of RunStepDetailsToolCallsObjectToolCallsObject class.
     */
    @Metadata(generated = true)
    protected RunStepDetailsToolCallsObjectToolCallsObject() {
    }

    /**
     * Get the type property: The discriminated type identifier for the details object.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsObjectToolCallsObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsObjectToolCallsObject if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsObjectToolCallsObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsToolCallsObjectToolCallsObject fromJson(JsonReader jsonReader) throws IOException {
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
                if ("code_interpreter".equals(discriminatorValue)) {
                    return RunStepDetailsToolCallsCodeObject.fromJson(readerToUse.reset());
                } else if ("file_search".equals(discriminatorValue)) {
                    return RunStepDetailsToolCallsFileSearchObject.fromJson(readerToUse.reset());
                } else if ("function".equals(discriminatorValue)) {
                    return RunStepDetailsToolCallsFunctionObject.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Metadata(generated = true)
    static RunStepDetailsToolCallsObjectToolCallsObject fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDetailsToolCallsObjectToolCallsObject deserializedRunStepDetailsToolCallsObjectToolCallsObject
                = new RunStepDetailsToolCallsObjectToolCallsObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedRunStepDetailsToolCallsObjectToolCallsObject.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunStepDetailsToolCallsObjectToolCallsObject;
        });
    }
}
