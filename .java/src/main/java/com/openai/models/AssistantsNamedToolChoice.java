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
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class AssistantsNamedToolChoice implements JsonSerializable<AssistantsNamedToolChoice> {
    /*
     * The type of the tool. If type is `function`, the function name must be set
     */
    @Metadata(generated = true)
    private final AssistantsNamedToolChoiceType type;

    /*
     * The function property.
     */
    @Metadata(generated = true)
    private AssistantsNamedToolChoiceFunction function;

    /**
     * Creates an instance of AssistantsNamedToolChoice class.
     * 
     * @param type the type value to set.
     */
    @Metadata(generated = true)
    public AssistantsNamedToolChoice(AssistantsNamedToolChoiceType type) {
        this.type = type;
    }

    /**
     * Get the type property: The type of the tool. If type is `function`, the function name must be set.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public AssistantsNamedToolChoiceType getType() {
        return this.type;
    }

    /**
     * Get the function property: The function property.
     * 
     * @return the function value.
     */
    @Metadata(generated = true)
    public AssistantsNamedToolChoiceFunction getFunction() {
        return this.function;
    }

    /**
     * Set the function property: The function property.
     * 
     * @param function the function value to set.
     * @return the AssistantsNamedToolChoice object itself.
     */
    @Metadata(generated = true)
    public AssistantsNamedToolChoice setFunction(AssistantsNamedToolChoiceFunction function) {
        this.function = function;
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
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssistantsNamedToolChoice from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssistantsNamedToolChoice if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssistantsNamedToolChoice.
     */
    @Metadata(generated = true)
    public static AssistantsNamedToolChoice fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssistantsNamedToolChoiceType type = null;
            AssistantsNamedToolChoiceFunction function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    type = AssistantsNamedToolChoiceType.fromString(reader.getString());
                } else if ("function".equals(fieldName)) {
                    function = AssistantsNamedToolChoiceFunction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            AssistantsNamedToolChoice deserializedAssistantsNamedToolChoice = new AssistantsNamedToolChoice(type);
            deserializedAssistantsNamedToolChoice.function = function;

            return deserializedAssistantsNamedToolChoice;
        });
    }
}
