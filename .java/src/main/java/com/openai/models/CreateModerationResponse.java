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
 * Represents if a given text input is potentially harmful.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateModerationResponse implements JsonSerializable<CreateModerationResponse> {
    /*
     * The unique identifier for the moderation request.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The model used to generate the moderation results.
     */
    @Metadata(generated = true)
    private final String model;

    /*
     * A list of moderation objects.
     */
    @Metadata(generated = true)
    private final List<CreateModerationResponseResult> results;

    /**
     * Creates an instance of CreateModerationResponse class.
     * 
     * @param id the id value to set.
     * @param model the model value to set.
     * @param results the results value to set.
     */
    @Metadata(generated = true)
    private CreateModerationResponse(String id, String model, List<CreateModerationResponseResult> results) {
        this.id = id;
        this.model = model;
        this.results = results;
    }

    /**
     * Get the id property: The unique identifier for the moderation request.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the model property: The model used to generate the moderation results.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public String getModel() {
        return this.model;
    }

    /**
     * Get the results property: A list of moderation objects.
     * 
     * @return the results value.
     */
    @Metadata(generated = true)
    public List<CreateModerationResponseResult> getResults() {
        return this.results;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeArrayField("results", this.results, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateModerationResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateModerationResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateModerationResponse.
     */
    @Metadata(generated = true)
    public static CreateModerationResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            String model = null;
            List<CreateModerationResponseResult> results = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("results".equals(fieldName)) {
                    results = reader.readArray(reader1 -> CreateModerationResponseResult.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateModerationResponse(id, model, results);
        });
    }
}
