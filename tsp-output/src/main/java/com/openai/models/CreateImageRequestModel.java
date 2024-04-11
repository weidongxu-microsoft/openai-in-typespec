// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.models.ExpandableStringEnum;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines values for CreateImageRequestModel.
 */
public final class CreateImageRequestModel implements ExpandableStringEnum<CreateImageRequestModel> {
    public static final Map<String, CreateImageRequestModel> VALUES = new ConcurrentHashMap<>();

    /**
     * Static value dall-e-2 for CreateImageRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateImageRequestModel DALL_E_2 = fromString("dall-e-2");

    /**
     * Static value dall-e-3 for CreateImageRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateImageRequestModel DALL_E_3 = fromString("dall-e-3");

    private final String name;

    private CreateImageRequestModel(String name) {
        this.name = name;
    }

    /**
     * Creates or finds a CreateImageRequestModel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateImageRequestModel.
     */
    @Metadata(generated = true)
    public static CreateImageRequestModel fromString(String name) {
        if (name == null) {
            return null;
        }
        CreateImageRequestModel value = VALUES.get(name);
        if (value != null) {
            return value;
        }
        return VALUES.computeIfAbsent(name, key -> new CreateImageRequestModel(key));
    }

    /**
     * Gets known CreateImageRequestModel values.
     * 
     * @return known CreateImageRequestModel values.
     */
    @Metadata(generated = true)
    public static Collection<CreateImageRequestModel> values() {
        return VALUES.values();
    }

    @Override
    public String toString() {
        return name;
    }
}