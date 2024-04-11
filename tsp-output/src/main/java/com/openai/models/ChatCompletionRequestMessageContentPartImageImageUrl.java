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
 * The ChatCompletionRequestMessageContentPartImageImageUrl model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class ChatCompletionRequestMessageContentPartImageImageUrl
    implements JsonSerializable<ChatCompletionRequestMessageContentPartImageImageUrl> {
    /*
     * Either a URL of the image or the base64 encoded image data.
     */
    @Metadata(generated = true)
    private final BinaryData url;

    /*
     * Specifies the detail level of the image. Learn more in the
     * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     */
    @Metadata(generated = true)
    private ChatCompletionRequestMessageContentPartImageImageUrlDetail detail;

    /**
     * Creates an instance of ChatCompletionRequestMessageContentPartImageImageUrl class.
     * 
     * @param url the url value to set.
     */
    @Metadata(generated = true)
    public ChatCompletionRequestMessageContentPartImageImageUrl(BinaryData url) {
        this.url = url;
    }

    /**
     * Get the url property: Either a URL of the image or the base64 encoded image data.
     * 
     * @return the url value.
     */
    @Metadata(generated = true)
    public BinaryData getUrl() {
        return this.url;
    }

    /**
     * Get the detail property: Specifies the detail level of the image. Learn more in the
     * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     * 
     * @return the detail value.
     */
    @Metadata(generated = true)
    public ChatCompletionRequestMessageContentPartImageImageUrlDetail getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: Specifies the detail level of the image. Learn more in the
     * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     * 
     * @param detail the detail value to set.
     * @return the ChatCompletionRequestMessageContentPartImageImageUrl object itself.
     */
    @Metadata(generated = true)
    public ChatCompletionRequestMessageContentPartImageImageUrl
        setDetail(ChatCompletionRequestMessageContentPartImageImageUrlDetail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("url", this.url.toObject(Object.class));
        jsonWriter.writeStringField("detail", this.detail == null ? null : this.detail.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionRequestMessageContentPartImageImageUrl from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionRequestMessageContentPartImageImageUrl if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionRequestMessageContentPartImageImageUrl.
     */
    @Metadata(generated = true)
    public static ChatCompletionRequestMessageContentPartImageImageUrl fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            BinaryData url = null;
            ChatCompletionRequestMessageContentPartImageImageUrlDetail detail = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("url".equals(fieldName)) {
                    url = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("detail".equals(fieldName)) {
                    detail = ChatCompletionRequestMessageContentPartImageImageUrlDetail.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            ChatCompletionRequestMessageContentPartImageImageUrl deserializedChatCompletionRequestMessageContentPartImageImageUrl
                = new ChatCompletionRequestMessageContentPartImageImageUrl(url);
            deserializedChatCompletionRequestMessageContentPartImageImageUrl.detail = detail;

            return deserializedChatCompletionRequestMessageContentPartImageImageUrl;
        });
    }
}
