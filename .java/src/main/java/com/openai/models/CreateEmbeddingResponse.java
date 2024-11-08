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
 * The CreateEmbeddingResponse model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateEmbeddingResponse implements JsonSerializable<CreateEmbeddingResponse> {
    /*
     * The list of embeddings generated by the model.
     */
    @Metadata(generated = true)
    private final List<Embedding> data;

    /*
     * The name of the model used to generate the embedding.
     */
    @Metadata(generated = true)
    private final String model;

    /*
     * The object type, which is always "list".
     */
    @Metadata(generated = true)
    private final String object = "list";

    /*
     * The usage information for the request.
     */
    @Metadata(generated = true)
    private final CreateEmbeddingResponseUsage usage;

    /**
     * Creates an instance of CreateEmbeddingResponse class.
     * 
     * @param data the data value to set.
     * @param model the model value to set.
     * @param usage the usage value to set.
     */
    @Metadata(generated = true)
    private CreateEmbeddingResponse(List<Embedding> data, String model, CreateEmbeddingResponseUsage usage) {
        this.data = data;
        this.model = model;
        this.usage = usage;
    }

    /**
     * Get the data property: The list of embeddings generated by the model.
     * 
     * @return the data value.
     */
    @Metadata(generated = true)
    public List<Embedding> getData() {
        return this.data;
    }

    /**
     * Get the model property: The name of the model used to generate the embedding.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public String getModel() {
        return this.model;
    }

    /**
     * Get the object property: The object type, which is always "list".
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * Get the usage property: The usage information for the request.
     * 
     * @return the usage value.
     */
    @Metadata(generated = true)
    public CreateEmbeddingResponseUsage getUsage() {
        return this.usage;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeJsonField("usage", this.usage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateEmbeddingResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateEmbeddingResponse if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateEmbeddingResponse.
     */
    @Metadata(generated = true)
    public static CreateEmbeddingResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<Embedding> data = null;
            String model = null;
            CreateEmbeddingResponseUsage usage = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("data".equals(fieldName)) {
                    data = reader.readArray(reader1 -> Embedding.fromJson(reader1));
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("usage".equals(fieldName)) {
                    usage = CreateEmbeddingResponseUsage.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateEmbeddingResponse(data, model, usage);
        });
    }
}
