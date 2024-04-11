// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateCompletionResponseChoicesFinishReason.
 */
public enum CreateCompletionResponseChoicesFinishReason {
    /**
     * Enum value stop.
     */
    STOP("stop"),

    /**
     * Enum value length.
     */
    LENGTH("length"),

    /**
     * Enum value content_filter.
     */
    CONTENT_FILTER("content_filter");

    /**
     * The actual serialized value for a CreateCompletionResponseChoicesFinishReason instance.
     */
    private final String value;

    CreateCompletionResponseChoicesFinishReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateCompletionResponseChoicesFinishReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateCompletionResponseChoicesFinishReason object, or null if unable to parse.
     */
    public static CreateCompletionResponseChoicesFinishReason fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateCompletionResponseChoicesFinishReason[] items = CreateCompletionResponseChoicesFinishReason.values();
        for (CreateCompletionResponseChoicesFinishReason item : items) {
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
