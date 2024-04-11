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
import java.util.List;

/**
 * The MessageContentTextObjectText model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageContentTextObjectText implements JsonSerializable<MessageContentTextObjectText> {
    /*
     * The data that makes up the text.
     */
    @Metadata(generated = true)
    private final String value;

    /*
     * The annotations property.
     */
    @Metadata(generated = true)
    private final List<BinaryData> annotations;

    /**
     * Creates an instance of MessageContentTextObjectText class.
     * 
     * @param value the value value to set.
     * @param annotations the annotations value to set.
     */
    @Metadata(generated = true)
    private MessageContentTextObjectText(String value, List<BinaryData> annotations) {
        this.value = value;
        this.annotations = annotations;
    }

    /**
     * Get the value property: The data that makes up the text.
     * 
     * @return the value value.
     */
    @Metadata(generated = true)
    public String getValue() {
        return this.value;
    }

    /**
     * Get the annotations property: The annotations property.
     * 
     * @return the annotations value.
     */
    @Metadata(generated = true)
    public List<BinaryData> getAnnotations() {
        return this.annotations;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeArrayField("annotations", this.annotations, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageContentTextObjectText from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageContentTextObjectText if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageContentTextObjectText.
     */
    @Metadata(generated = true)
    public static MessageContentTextObjectText fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String value = null;
            List<BinaryData> annotations = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader.getString();
                } else if ("annotations".equals(fieldName)) {
                    annotations = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageContentTextObjectText(value, annotations);
        });
    }
}
