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
 * Represents a run step delta i.e. any changed fields on a run step during streaming.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDeltaObject implements JsonSerializable<RunStepDeltaObject> {
    /*
     * The identifier of the run step, which can be referenced in API endpoints.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The object type, which is always `thread.run.step.delta`.
     */
    @Metadata(generated = true)
    private final String object = "thread.run.step.delta";

    /*
     * The delta containing the fields that have changed on the run step.
     */
    @Metadata(generated = true)
    private final RunStepDeltaObjectDelta delta;

    /**
     * Creates an instance of RunStepDeltaObject class.
     * 
     * @param id the id value to set.
     * @param delta the delta value to set.
     */
    @Metadata(generated = true)
    private RunStepDeltaObject(String id, RunStepDeltaObjectDelta delta) {
        this.id = id;
        this.delta = delta;
    }

    /**
     * Get the id property: The identifier of the run step, which can be referenced in API endpoints.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the object property: The object type, which is always `thread.run.step.delta`.
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * Get the delta property: The delta containing the fields that have changed on the run step.
     * 
     * @return the delta value.
     */
    @Metadata(generated = true)
    public RunStepDeltaObjectDelta getDelta() {
        return this.delta;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeJsonField("delta", this.delta);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDeltaObject.
     */
    @Metadata(generated = true)
    public static RunStepDeltaObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RunStepDeltaObjectDelta delta = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("delta".equals(fieldName)) {
                    delta = RunStepDeltaObjectDelta.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDeltaObject(id, delta);
        });
    }
}