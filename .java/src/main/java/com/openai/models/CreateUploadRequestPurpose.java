// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateUploadRequestPurpose.
 */
public enum CreateUploadRequestPurpose {
    /**
     * Enum value assistants.
     */
    ASSISTANTS("assistants"),

    /**
     * Enum value batch.
     */
    BATCH("batch"),

    /**
     * Enum value fine-tune.
     */
    FINE_TUNE("fine-tune"),

    /**
     * Enum value vision.
     */
    VISION("vision");

    /**
     * The actual serialized value for a CreateUploadRequestPurpose instance.
     */
    private final String value;

    CreateUploadRequestPurpose(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateUploadRequestPurpose instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateUploadRequestPurpose object, or null if unable to parse.
     */
    public static CreateUploadRequestPurpose fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateUploadRequestPurpose[] items = CreateUploadRequestPurpose.values();
        for (CreateUploadRequestPurpose item : items) {
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