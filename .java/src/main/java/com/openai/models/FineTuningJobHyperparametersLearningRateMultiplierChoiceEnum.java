// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum.
 */
public enum FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum {
    /**
     * Enum value auto.
     */
    AUTO("auto");

    /**
     * The actual serialized value for a FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum instance.
     */
    private final String value;

    FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum object, or null if unable to
     * parse.
     */
    public static FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum fromString(String value) {
        if (value == null) {
            return null;
        }
        FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum[] items
            = FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum.values();
        for (FineTuningJobHyperparametersLearningRateMultiplierChoiceEnum item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
