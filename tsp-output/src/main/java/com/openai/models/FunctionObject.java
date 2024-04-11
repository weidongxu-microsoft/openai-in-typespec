// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The FunctionObject model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class FunctionObject implements JsonSerializable<FunctionObject> {
    /*
     * A description of what the function does, used by the model to choose when and how to call the
     * function.
     */
    @Metadata(generated = true)
    private String description;

    /*
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
     * dashes, with a maximum length of 64.
     */
    @Metadata(generated = true)
    private final String name;

    /*
     * The parameters property.
     */
    @Metadata(generated = true)
    private Map<String, Object> parameters;

    /**
     * Creates an instance of FunctionObject class.
     * 
     * @param name the name value to set.
     */
    @Metadata(generated = true)
    public FunctionObject(String name) {
        this.name = name;
    }

    /**
     * Get the description property: A description of what the function does, used by the model to choose when and how
     * to call the
     * function.
     * 
     * @return the description value.
     */
    @Metadata(generated = true)
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A description of what the function does, used by the model to choose when and how
     * to call the
     * function.
     * 
     * @param description the description value to set.
     * @return the FunctionObject object itself.
     */
    @Metadata(generated = true)
    public FunctionObject setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the name property: The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
     * dashes, with a maximum length of 64.
     * 
     * @return the name value.
     */
    @Metadata(generated = true)
    public String getName() {
        return this.name;
    }

    /**
     * Get the parameters property: The parameters property.
     * 
     * @return the parameters value.
     */
    @Metadata(generated = true)
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     * 
     * @param parameters the parameters value to set.
     * @return the FunctionObject object itself.
     */
    @Metadata(generated = true)
    public FunctionObject setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeMapField("parameters", this.parameters, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FunctionObject.
     */
    @Metadata(generated = true)
    public static FunctionObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            String description = null;
            Map<String, Object> parameters = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    parameters = reader.readMap(reader1 -> reader1.readUntyped());
                } else {
                    reader.skipChildren();
                }
            }
            FunctionObject deserializedFunctionObject = new FunctionObject(name);
            deserializedFunctionObject.description = description;
            deserializedFunctionObject.parameters = parameters;

            return deserializedFunctionObject;
        });
    }
}
