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
 * The ThreadObjectToolResources model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ThreadObjectToolResources implements JsonSerializable<ThreadObjectToolResources> {
    /*
     * The code_interpreter property.
     */
    @Metadata(generated = true)
    private ThreadObjectToolResourcesCodeInterpreter codeInterpreter;

    /*
     * The file_search property.
     */
    @Metadata(generated = true)
    private ThreadObjectToolResourcesFileSearch fileSearch;

    /**
     * Creates an instance of ThreadObjectToolResources class.
     */
    @Metadata(generated = true)
    private ThreadObjectToolResources() {
    }

    /**
     * Get the codeInterpreter property: The code_interpreter property.
     * 
     * @return the codeInterpreter value.
     */
    @Metadata(generated = true)
    public ThreadObjectToolResourcesCodeInterpreter getCodeInterpreter() {
        return this.codeInterpreter;
    }

    /**
     * Get the fileSearch property: The file_search property.
     * 
     * @return the fileSearch value.
     */
    @Metadata(generated = true)
    public ThreadObjectToolResourcesFileSearch getFileSearch() {
        return this.fileSearch;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("code_interpreter", this.codeInterpreter);
        jsonWriter.writeJsonField("file_search", this.fileSearch);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThreadObjectToolResources from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThreadObjectToolResources if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ThreadObjectToolResources.
     */
    @Metadata(generated = true)
    public static ThreadObjectToolResources fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ThreadObjectToolResources deserializedThreadObjectToolResources = new ThreadObjectToolResources();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code_interpreter".equals(fieldName)) {
                    deserializedThreadObjectToolResources.codeInterpreter
                        = ThreadObjectToolResourcesCodeInterpreter.fromJson(reader);
                } else if ("file_search".equals(fieldName)) {
                    deserializedThreadObjectToolResources.fileSearch
                        = ThreadObjectToolResourcesFileSearch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedThreadObjectToolResources;
        });
    }
}
