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
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */
@Immutable
public final class CreateChatCompletionStreamResponse implements JsonSerializable<CreateChatCompletionStreamResponse> {
    /*
     * A unique identifier for the chat completion. Each chunk has the same ID.
     */
    @Generated
    private final String id;

    /*
     * A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty
     * for the
     * last chunk if you set `stream_options: {"include_usage": true}`.
     */
    @Generated
    private final List<CreateChatCompletionStreamResponseChoice> choices;

    /*
     * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     */
    @Generated
    private final long created;

    /*
     * The model to generate the completion.
     */
    @Generated
    private final String model;

    /*
     * The service tier used for processing the request. This field is only included if the `service_tier` parameter is
     * specified in the request.
     */
    @Generated
    private CreateChatCompletionStreamResponseServiceTier serviceTier;

    /*
     * This fingerprint represents the backend configuration that the model runs with.
     * Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made
     * that might impact determinism.
     */
    @Generated
    private String systemFingerprint;

    /*
     * The object type, which is always `chat.completion.chunk`.
     */
    @Generated
    private final String object = "chat.completion.chunk";

    /*
     * An optional field that will only be present when you set `stream_options: {"include_usage": true}` in your
     * request.
     * When present, it contains a null value except for the last chunk which contains the token usage statistics for
     * the entire request.
     */
    @Generated
    private CreateChatCompletionStreamResponseUsage usage;

    /**
     * Creates an instance of CreateChatCompletionStreamResponse class.
     * 
     * @param id the id value to set.
     * @param choices the choices value to set.
     * @param created the created value to set.
     * @param model the model value to set.
     */
    @Generated
    private CreateChatCompletionStreamResponse(String id, List<CreateChatCompletionStreamResponseChoice> choices,
        OffsetDateTime created, String model) {
        this.id = id;
        this.choices = choices;
        if (created == null) {
            this.created = 0L;
        } else {
            this.created = created.toEpochSecond();
        }
        this.model = model;
    }

    /**
     * Get the id property: A unique identifier for the chat completion. Each chunk has the same ID.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the choices property: A list of chat completion choices. Can contain more than one elements if `n` is greater
     * than 1. Can also be empty for the
     * last chunk if you set `stream_options: {"include_usage": true}`.
     * 
     * @return the choices value.
     */
    @Generated
    public List<CreateChatCompletionStreamResponseChoice> getChoices() {
        return this.choices;
    }

    /**
     * Get the created property: The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has
     * the same timestamp.
     * 
     * @return the created value.
     */
    @Generated
    public OffsetDateTime getCreated() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.created), ZoneOffset.UTC);
    }

    /**
     * Get the model property: The model to generate the completion.
     * 
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Get the serviceTier property: The service tier used for processing the request. This field is only included if
     * the `service_tier` parameter is specified in the request.
     * 
     * @return the serviceTier value.
     */
    @Generated
    public CreateChatCompletionStreamResponseServiceTier getServiceTier() {
        return this.serviceTier;
    }

    /**
     * Get the systemFingerprint property: This fingerprint represents the backend configuration that the model runs
     * with.
     * Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made
     * that might impact determinism.
     * 
     * @return the systemFingerprint value.
     */
    @Generated
    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }

    /**
     * Get the object property: The object type, which is always `chat.completion.chunk`.
     * 
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }

    /**
     * Get the usage property: An optional field that will only be present when you set `stream_options:
     * {"include_usage": true}` in your request.
     * When present, it contains a null value except for the last chunk which contains the token usage statistics for
     * the entire request.
     * 
     * @return the usage value.
     */
    @Generated
    public CreateChatCompletionStreamResponseUsage getUsage() {
        return this.usage;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeArrayField("choices", this.choices, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeLongField("created", this.created);
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeStringField("service_tier", this.serviceTier == null ? null : this.serviceTier.toString());
        jsonWriter.writeStringField("system_fingerprint", this.systemFingerprint);
        jsonWriter.writeJsonField("usage", this.usage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateChatCompletionStreamResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateChatCompletionStreamResponse if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateChatCompletionStreamResponse.
     */
    @Generated
    public static CreateChatCompletionStreamResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            List<CreateChatCompletionStreamResponseChoice> choices = null;
            OffsetDateTime created = null;
            String model = null;
            CreateChatCompletionStreamResponseServiceTier serviceTier = null;
            String systemFingerprint = null;
            CreateChatCompletionStreamResponseUsage usage = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("choices".equals(fieldName)) {
                    choices = reader.readArray(reader1 -> CreateChatCompletionStreamResponseChoice.fromJson(reader1));
                } else if ("created".equals(fieldName)) {
                    created = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("service_tier".equals(fieldName)) {
                    serviceTier = CreateChatCompletionStreamResponseServiceTier.fromString(reader.getString());
                } else if ("system_fingerprint".equals(fieldName)) {
                    systemFingerprint = reader.getString();
                } else if ("usage".equals(fieldName)) {
                    usage = CreateChatCompletionStreamResponseUsage.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            CreateChatCompletionStreamResponse deserializedCreateChatCompletionStreamResponse
                = new CreateChatCompletionStreamResponse(id, choices, created, model);
            deserializedCreateChatCompletionStreamResponse.serviceTier = serviceTier;
            deserializedCreateChatCompletionStreamResponse.systemFingerprint = systemFingerprint;
            deserializedCreateChatCompletionStreamResponse.usage = usage;

            return deserializedCreateChatCompletionStreamResponse;
        });
    }
}
