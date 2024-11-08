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
 * The RunStepDeltaStepDetailsMessageCreationObjectMessageCreation model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    implements JsonSerializable<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation> {
    /*
     * The ID of the message that was created by this run step.
     */
    @Metadata(generated = true)
    private String messageId;

    /**
     * Creates an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation class.
     */
    @Metadata(generated = true)
    private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation() {
    }

    /**
     * Get the messageId property: The ID of the message that was created by this run step.
     * 
     * @return the messageId value.
     */
    @Metadata(generated = true)
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("message_id", this.messageId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation if the JsonReader was pointing
     * to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
     */
    @Metadata(generated = true)
    public static RunStepDeltaStepDetailsMessageCreationObjectMessageCreation fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDeltaStepDetailsMessageCreationObjectMessageCreation deserializedRunStepDeltaStepDetailsMessageCreationObjectMessageCreation
                = new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("message_id".equals(fieldName)) {
                    deserializedRunStepDeltaStepDetailsMessageCreationObjectMessageCreation.messageId
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
        });
    }
}
