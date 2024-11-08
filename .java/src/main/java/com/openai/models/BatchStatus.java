// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for BatchStatus.
 */
public enum BatchStatus {
    /**
     * Enum value validating.
     */
    VALIDATING("validating"),

    /**
     * Enum value failed.
     */
    FAILED("failed"),

    /**
     * Enum value in_progress.
     */
    IN_PROGRESS("in_progress"),

    /**
     * Enum value finalizing.
     */
    FINALIZING("finalizing"),

    /**
     * Enum value completed.
     */
    COMPLETED("completed"),

    /**
     * Enum value expired.
     */
    EXPIRED("expired"),

    /**
     * Enum value cancelling.
     */
    CANCELLING("cancelling"),

    /**
     * Enum value cancelled.
     */
    CANCELLED("cancelled");

    /**
     * The actual serialized value for a BatchStatus instance.
     */
    private final String value;

    BatchStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BatchStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed BatchStatus object, or null if unable to parse.
     */
    public static BatchStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        BatchStatus[] items = BatchStatus.values();
        for (BatchStatus item : items) {
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
