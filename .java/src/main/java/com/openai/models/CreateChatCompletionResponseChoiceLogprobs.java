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
 * The CreateChatCompletionResponseChoiceLogprobs model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateChatCompletionResponseChoiceLogprobs
    implements JsonSerializable<CreateChatCompletionResponseChoiceLogprobs> {
    /*
     * A list of message content tokens with log probability information.
     */
    @Metadata(generated = true)
    private List<ChatCompletionTokenLogprob> content;

    /*
     * A list of message refusal tokens with log probability information.
     */
    @Metadata(generated = true)
    private List<ChatCompletionTokenLogprob> refusal;

    /**
     * Creates an instance of CreateChatCompletionResponseChoiceLogprobs class.
     */
    @Metadata(generated = true)
    private CreateChatCompletionResponseChoiceLogprobs() {
    }

    /**
     * Get the content property: A list of message content tokens with log probability information.
     * 
     * @return the content value.
     */
    @Metadata(generated = true)
    public List<ChatCompletionTokenLogprob> getContent() {
        return this.content;
    }

    /**
     * Get the refusal property: A list of message refusal tokens with log probability information.
     * 
     * @return the refusal value.
     */
    @Metadata(generated = true)
    public List<ChatCompletionTokenLogprob> getRefusal() {
        return this.refusal;
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
     * Reads an instance of CreateChatCompletionResponseChoiceLogprobs from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateChatCompletionResponseChoiceLogprobs if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateChatCompletionResponseChoiceLogprobs.
     */
    @Metadata(generated = true)
    public static CreateChatCompletionResponseChoiceLogprobs fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateChatCompletionResponseChoiceLogprobs deserializedCreateChatCompletionResponseChoiceLogprobs
                = new CreateChatCompletionResponseChoiceLogprobs();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    List<ChatCompletionTokenLogprob> content
                        = reader.readArray(reader1 -> ChatCompletionTokenLogprob.fromJson(reader1));
                    deserializedCreateChatCompletionResponseChoiceLogprobs.content = content;
                } else if ("refusal".equals(fieldName)) {
                    List<ChatCompletionTokenLogprob> refusal
                        = reader.readArray(reader1 -> ChatCompletionTokenLogprob.fromJson(reader1));
                    deserializedCreateChatCompletionResponseChoiceLogprobs.refusal = refusal;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateChatCompletionResponseChoiceLogprobs;
        });
    }
}