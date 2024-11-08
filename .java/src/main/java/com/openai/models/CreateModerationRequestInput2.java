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
 * The CreateModerationRequestInput2 model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateModerationRequestInput2 implements JsonSerializable<CreateModerationRequestInput2> {
    /*
     * Always `image_url`.
     */
    @Metadata(generated = true)
    private final String type = "image_url";

    /*
     * Contains either an image URL or a data URL for a base64 encoded image.
     */
    @Metadata(generated = true)
    private final CreateModerationRequestInputImageUrl imageUrl;

    /**
     * Creates an instance of CreateModerationRequestInput2 class.
     * 
     * @param imageUrl the imageUrl value to set.
     */
    @Metadata(generated = true)
    public CreateModerationRequestInput2(CreateModerationRequestInputImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Get the type property: Always `image_url`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the imageUrl property: Contains either an image URL or a data URL for a base64 encoded image.
     * 
     * @return the imageUrl value.
     */
    @Metadata(generated = true)
    public CreateModerationRequestInputImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("image_url", this.imageUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateModerationRequestInput2 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateModerationRequestInput2 if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateModerationRequestInput2.
     */
    @Metadata(generated = true)
    public static CreateModerationRequestInput2 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateModerationRequestInputImageUrl imageUrl = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("image_url".equals(fieldName)) {
                    imageUrl = CreateModerationRequestInputImageUrl.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateModerationRequestInput2(imageUrl);
        });
    }
}
