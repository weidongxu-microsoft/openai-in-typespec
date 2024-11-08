// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The parameters the functions accepts, described as a JSON Schema object. See the
 * [guide](/docs/guides/function-calling) for examples, and the [JSON Schema
 * reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
 * 
 * Omitting `parameters` defines a function with an empty parameter list.
 */
@Fluent
public final class FunctionParameters implements JsonSerializable<FunctionParameters> {
    /*
     * The parameters the functions accepts, described as a JSON Schema object. See the
     * [guide](/docs/guides/function-calling) for examples, and the [JSON Schema
     * reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
     * 
     * Omitting `parameters` defines a function with an empty parameter list.
     */
    @Generated
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of FunctionParameters class.
     */
    @Generated
    public FunctionParameters() {
    }

    /**
     * Get the additionalProperties property: The parameters the functions accepts, described as a JSON Schema object.
     * See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema
     * reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
     * 
     * Omitting `parameters` defines a function with an empty parameter list.
     * 
     * @return the additionalProperties value.
     */
    @Generated
    public Map<String, BinaryData> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The parameters the functions accepts, described as a JSON Schema object.
     * See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema
     * reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
     * 
     * Omitting `parameters` defines a function with an empty parameter list.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the FunctionParameters object itself.
     */
    @Generated
    public FunctionParameters setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (additionalProperties != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(),
                    additionalProperty.getValue() == null
                        ? null
                        : additionalProperty.getValue().toObject(Object.class));
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionParameters if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionParameters.
     */
    @Generated
    public static FunctionParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionParameters deserializedFunctionParameters = new FunctionParameters();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (additionalProperties == null) {
                    additionalProperties = new LinkedHashMap<>();
                }

                additionalProperties.put(fieldName,
                    reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
            }
            deserializedFunctionParameters.additionalProperties = additionalProperties;

            return deserializedFunctionParameters;
        });
    }
}
