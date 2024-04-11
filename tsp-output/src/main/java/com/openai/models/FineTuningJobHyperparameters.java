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
 * The FineTuningJobHyperparameters model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class FineTuningJobHyperparameters implements JsonSerializable<FineTuningJobHyperparameters> {
    /*
     * The number of epochs to train the model for. An epoch refers to one full cycle through the
     * training dataset.
     * 
     * "auto" decides the optimal number of epochs based on the size of the dataset. If setting the
     * number manually, we support any number between 1 and 50 epochs.
     */
    @Metadata(generated = true)
    private final BinaryData nEpochs;

    /**
     * Creates an instance of FineTuningJobHyperparameters class.
     * 
     * @param nEpochs the nEpochs value to set.
     */
    @Metadata(generated = true)
    private FineTuningJobHyperparameters(BinaryData nEpochs) {
        this.nEpochs = nEpochs;
    }

    /**
     * Get the nEpochs property: The number of epochs to train the model for. An epoch refers to one full cycle through
     * the
     * training dataset.
     * 
     * "auto" decides the optimal number of epochs based on the size of the dataset. If setting the
     * number manually, we support any number between 1 and 50 epochs.
     * 
     * @return the nEpochs value.
     */
    @Metadata(generated = true)
    public BinaryData getNEpochs() {
        return this.nEpochs;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("n_epochs", this.nEpochs.toObject(Object.class));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FineTuningJobHyperparameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FineTuningJobHyperparameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FineTuningJobHyperparameters.
     */
    @Metadata(generated = true)
    public static FineTuningJobHyperparameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BinaryData nEpochs = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("n_epochs".equals(fieldName)) {
                    nEpochs = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    reader.skipChildren();
                }
            }
            return new FineTuningJobHyperparameters(nEpochs);
        });
    }
}
