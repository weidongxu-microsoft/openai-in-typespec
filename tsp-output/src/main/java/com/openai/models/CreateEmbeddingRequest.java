// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.core.models.BinaryData;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateEmbeddingRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateEmbeddingRequest implements JsonSerializable<CreateEmbeddingRequest> {
    /*
     * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a
     * single request, pass an array of strings or array of token arrays. Each input must not exceed
     * the max input tokens for the model (8191 tokens for `text-embedding-ada-002`) and cannot be an
     * empty string.
     * [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb)
     * for counting tokens.
     */
    @Metadata(generated = true)
    private final BinaryData input;

    /*
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to
     * see all of your available models, or see our [Model overview](/docs/models/overview) for
     * descriptions of them.
     */
    @Metadata(generated = true)
    private final CreateEmbeddingRequestModel model;

    /*
     * The format to return the embeddings in. Can be either `float` or
     * [`base64`](https://pypi.org/project/pybase64/).
     */
    @Metadata(generated = true)
    private CreateEmbeddingRequestEncodingFormat encodingFormat;

    /*
     * The number of dimensions the resulting output embeddings should have. Only supported in
     * `text-embedding-3` and later models.
     */
    @Metadata(generated = true)
    private Long dimensions;

    /*
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect
     * abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     */
    @Metadata(generated = true)
    private String user;

    /**
     * Creates an instance of CreateEmbeddingRequest class.
     * 
     * @param input the input value to set.
     * @param model the model value to set.
     */
    @Metadata(generated = true)
    public CreateEmbeddingRequest(BinaryData input, CreateEmbeddingRequestModel model) {
        this.input = input;
        this.model = model;
    }

    /**
     * Get the input property: Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in
     * a
     * single request, pass an array of strings or array of token arrays. Each input must not exceed
     * the max input tokens for the model (8191 tokens for `text-embedding-ada-002`) and cannot be an
     * empty string.
     * [Example Python
     * code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb)
     * for counting tokens.
     * 
     * @return the input value.
     */
    @Metadata(generated = true)
    public BinaryData getInput() {
        return this.input;
    }

    /**
     * Get the model property: ID of the model to use. You can use the [List models](/docs/api-reference/models/list)
     * API to
     * see all of your available models, or see our [Model overview](/docs/models/overview) for
     * descriptions of them.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public CreateEmbeddingRequestModel getModel() {
        return this.model;
    }

    /**
     * Get the encodingFormat property: The format to return the embeddings in. Can be either `float` or
     * [`base64`](https://pypi.org/project/pybase64/).
     * 
     * @return the encodingFormat value.
     */
    @Metadata(generated = true)
    public CreateEmbeddingRequestEncodingFormat getEncodingFormat() {
        return this.encodingFormat;
    }

    /**
     * Set the encodingFormat property: The format to return the embeddings in. Can be either `float` or
     * [`base64`](https://pypi.org/project/pybase64/).
     * 
     * @param encodingFormat the encodingFormat value to set.
     * @return the CreateEmbeddingRequest object itself.
     */
    @Metadata(generated = true)
    public CreateEmbeddingRequest setEncodingFormat(CreateEmbeddingRequestEncodingFormat encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    /**
     * Get the dimensions property: The number of dimensions the resulting output embeddings should have. Only supported
     * in
     * `text-embedding-3` and later models.
     * 
     * @return the dimensions value.
     */
    @Metadata(generated = true)
    public Long getDimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The number of dimensions the resulting output embeddings should have. Only supported
     * in
     * `text-embedding-3` and later models.
     * 
     * @param dimensions the dimensions value to set.
     * @return the CreateEmbeddingRequest object itself.
     */
    @Metadata(generated = true)
    public CreateEmbeddingRequest setDimensions(Long dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the user property: A unique identifier representing your end-user, which can help OpenAI to monitor and
     * detect
     * abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * 
     * @return the user value.
     */
    @Metadata(generated = true)
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: A unique identifier representing your end-user, which can help OpenAI to monitor and
     * detect
     * abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * 
     * @param user the user value to set.
     * @return the CreateEmbeddingRequest object itself.
     */
    @Metadata(generated = true)
    public CreateEmbeddingRequest setUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("input", this.input.toObject(Object.class));
        jsonWriter.writeStringField("model", this.model == null ? null : this.model.toString());
        jsonWriter.writeStringField("encoding_format",
            this.encodingFormat == null ? null : this.encodingFormat.toString());
        jsonWriter.writeNumberField("dimensions", this.dimensions);
        jsonWriter.writeStringField("user", this.user);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateEmbeddingRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateEmbeddingRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateEmbeddingRequest.
     */
    @Metadata(generated = true)
    public static CreateEmbeddingRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BinaryData input = null;
            CreateEmbeddingRequestModel model = null;
            CreateEmbeddingRequestEncodingFormat encodingFormat = null;
            Long dimensions = null;
            String user = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("input".equals(fieldName)) {
                    input = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("model".equals(fieldName)) {
                    model = CreateEmbeddingRequestModel.fromString(reader.getString());
                } else if ("encoding_format".equals(fieldName)) {
                    encodingFormat = CreateEmbeddingRequestEncodingFormat.fromString(reader.getString());
                } else if ("dimensions".equals(fieldName)) {
                    dimensions = reader.getNullable(JsonReader::getLong);
                } else if ("user".equals(fieldName)) {
                    user = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            CreateEmbeddingRequest deserializedCreateEmbeddingRequest = new CreateEmbeddingRequest(input, model);
            deserializedCreateEmbeddingRequest.encodingFormat = encodingFormat;
            deserializedCreateEmbeddingRequest.dimensions = dimensions;
            deserializedCreateEmbeddingRequest.user = user;

            return deserializedCreateEmbeddingRequest;
        });
    }
}
