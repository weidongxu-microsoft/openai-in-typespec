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
 * Details of the message creation by the run step.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDetailsMessageCreationObject
    implements JsonSerializable<RunStepDetailsMessageCreationObject> {
    /*
     * Details of the message creation by the run step.
     */
    @Metadata(generated = true)
    private final String type = "message_creation";

    /*
     * The message_creation property.
     */
    @Metadata(generated = true)
    private final RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

    /**
     * Creates an instance of RunStepDetailsMessageCreationObject class.
     * 
     * @param messageCreation the messageCreation value to set.
     */
    @Metadata(generated = true)
    private RunStepDetailsMessageCreationObject(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
    }

    /**
     * Get the type property: Details of the message creation by the run step.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the messageCreation property: The message_creation property.
     * 
     * @return the messageCreation value.
     */
    @Metadata(generated = true)
    public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return this.messageCreation;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("message_creation", this.messageCreation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsMessageCreationObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsMessageCreationObject if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsMessageCreationObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsMessageCreationObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDetailsMessageCreationObjectMessageCreation messageCreation = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("message_creation".equals(fieldName)) {
                    messageCreation = RunStepDetailsMessageCreationObjectMessageCreation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDetailsMessageCreationObject(messageCreation);
        });
    }
}
