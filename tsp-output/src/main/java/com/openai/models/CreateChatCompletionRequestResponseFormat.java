// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateChatCompletionRequestResponseFormat model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateChatCompletionRequestResponseFormat
    implements JsonSerializable<CreateChatCompletionRequestResponseFormat> {
    /*
     * Must be one of `text` or `json_object`.
     */
    @Metadata(generated = true)
    private CreateChatCompletionRequestResponseFormatType type;

    /**
     * Creates an instance of CreateChatCompletionRequestResponseFormat class.
     */
    @Metadata(generated = true)
    public CreateChatCompletionRequestResponseFormat() {
    }

    /**
     * Get the type property: Must be one of `text` or `json_object`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public CreateChatCompletionRequestResponseFormatType getType() {
        return this.type;
    }

    /**
     * Set the type property: Must be one of `text` or `json_object`.
     * 
     * @param type the type value to set.
     * @return the CreateChatCompletionRequestResponseFormat object itself.
     */
    @Metadata(generated = true)
    public CreateChatCompletionRequestResponseFormat setType(CreateChatCompletionRequestResponseFormatType type) {
        this.type = type;
        return this;
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
     * Reads an instance of CreateChatCompletionRequestResponseFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateChatCompletionRequestResponseFormat if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateChatCompletionRequestResponseFormat.
     */
    @Metadata(generated = true)
    public static CreateChatCompletionRequestResponseFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateChatCompletionRequestResponseFormat deserializedCreateChatCompletionRequestResponseFormat
                = new CreateChatCompletionRequestResponseFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCreateChatCompletionRequestResponseFormat.type
                        = CreateChatCompletionRequestResponseFormatType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateChatCompletionRequestResponseFormat;
        });
    }
}