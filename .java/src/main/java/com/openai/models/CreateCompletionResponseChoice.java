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
 * The CreateCompletionResponseChoice model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateCompletionResponseChoice implements JsonSerializable<CreateCompletionResponseChoice> {
    /*
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a
     * provided stop sequence,
     * `length` if the maximum number of tokens specified in the request was reached,
     * or `content_filter` if content was omitted due to a flag from our content filters.
     */
    @Metadata(generated = true)
    private final CreateCompletionResponseChoiceFinishReason finishReason;

    /*
     * The index property.
     */
    @Metadata(generated = true)
    private final int index;

    /*
     * The logprobs property.
     */
    @Metadata(generated = true)
    private final CreateCompletionResponseChoiceLogprobs logprobs;

    /*
     * The text property.
     */
    @Metadata(generated = true)
    private final String text;

    /**
     * Creates an instance of CreateCompletionResponseChoice class.
     * 
     * @param finishReason the finishReason value to set.
     * @param index the index value to set.
     * @param logprobs the logprobs value to set.
     * @param text the text value to set.
     */
    @Metadata(generated = true)
    private CreateCompletionResponseChoice(CreateCompletionResponseChoiceFinishReason finishReason, int index,
        CreateCompletionResponseChoiceLogprobs logprobs, String text) {
        this.finishReason = finishReason;
        this.index = index;
        this.logprobs = logprobs;
        this.text = text;
    }

    /**
     * Get the finishReason property: The reason the model stopped generating tokens. This will be `stop` if the model
     * hit a natural stop point or a provided stop sequence,
     * `length` if the maximum number of tokens specified in the request was reached,
     * or `content_filter` if content was omitted due to a flag from our content filters.
     * 
     * @return the finishReason value.
     */
    @Metadata(generated = true)
    public CreateCompletionResponseChoiceFinishReason getFinishReason() {
        return this.finishReason;
    }

    /**
     * Get the index property: The index property.
     * 
     * @return the index value.
     */
    @Metadata(generated = true)
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the logprobs property: The logprobs property.
     * 
     * @return the logprobs value.
     */
    @Metadata(generated = true)
    public CreateCompletionResponseChoiceLogprobs getLogprobs() {
        return this.logprobs;
    }

    /**
     * Get the text property: The text property.
     * 
     * @return the text value.
     */
    @Metadata(generated = true)
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("finish_reason", this.finishReason == null ? null : this.finishReason.toString());
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeJsonField("logprobs", this.logprobs);
        jsonWriter.writeStringField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateCompletionResponseChoice from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateCompletionResponseChoice if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateCompletionResponseChoice.
     */
    @Metadata(generated = true)
    public static CreateCompletionResponseChoice fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateCompletionResponseChoiceFinishReason finishReason = null;
            int index = 0;
            CreateCompletionResponseChoiceLogprobs logprobs = null;
            String text = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("finish_reason".equals(fieldName)) {
                    finishReason = CreateCompletionResponseChoiceFinishReason.fromString(reader.getString());
                } else if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("logprobs".equals(fieldName)) {
                    logprobs = CreateCompletionResponseChoiceLogprobs.fromJson(reader);
                } else if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateCompletionResponseChoice(finishReason, index, logprobs, text);
        });
    }
}
