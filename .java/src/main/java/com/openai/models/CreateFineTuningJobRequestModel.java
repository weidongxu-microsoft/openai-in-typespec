// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.util.ExpandableEnum;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines values for CreateFineTuningJobRequestModel.
 */
public final class CreateFineTuningJobRequestModel implements ExpandableEnum<String> {
    private static final Map<String, CreateFineTuningJobRequestModel> VALUES = new ConcurrentHashMap<>();

    /**
     * Static value babbage-002 for CreateFineTuningJobRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateFineTuningJobRequestModel BABBAGE_002 = fromString("babbage-002");

    /**
     * Static value davinci-002 for CreateFineTuningJobRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateFineTuningJobRequestModel DAVINCI_002 = fromString("davinci-002");

    /**
     * Static value gpt-3.5-turbo for CreateFineTuningJobRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateFineTuningJobRequestModel GPT_3_5_TURBO = fromString("gpt-3.5-turbo");

    /**
     * Static value gpt-4o-mini for CreateFineTuningJobRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateFineTuningJobRequestModel GPT_4O_MINI = fromString("gpt-4o-mini");

    private final String name;

    private CreateFineTuningJobRequestModel(String name) {
        this.name = name;
    }

    /**
     * Creates or finds a CreateFineTuningJobRequestModel.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateFineTuningJobRequestModel.
     */
    @Metadata(generated = true)
    public static CreateFineTuningJobRequestModel fromString(String name) {
        if (name == null) {
            return null;
        }
        CreateFineTuningJobRequestModel value = VALUES.get(name);
        if (value != null) {
            return value;
        }
        return VALUES.computeIfAbsent(name, key -> new CreateFineTuningJobRequestModel(key));
    }

    /**
     * Gets the value of the CreateFineTuningJobRequestModel instance.
     * 
     * @return the value of the CreateFineTuningJobRequestModel instance.
     */
    @Metadata(generated = true)
    @Override
    public String getValue() {
        return this.name;
    }

    @Metadata(generated = true)
    @Override
    public String toString() {
        return name;
    }
}