// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for RunObjectStatus.
 */
public enum RunObjectStatus {
    /**
     * Enum value queued.
     */
    QUEUED("queued"),

    /**
     * Enum value in_progress.
     */
    IN_PROGRESS("in_progress"),

    /**
     * Enum value requires_action.
     */
    REQUIRES_ACTION("requires_action"),

    /**
     * Enum value cancelling.
     */
    CANCELLING("cancelling"),

    /**
     * Enum value cancelled.
     */
    CANCELLED("cancelled"),

    /**
     * Enum value failed.
     */
    FAILED("failed"),

    /**
     * Enum value completed.
     */
    COMPLETED("completed"),

    /**
     * Enum value incomplete.
     */
    INCOMPLETE("incomplete"),

    /**
     * Enum value expired.
     */
    EXPIRED("expired");

    /**
     * The actual serialized value for a RunObjectStatus instance.
     */
    private final String value;

    RunObjectStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RunObjectStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RunObjectStatus object, or null if unable to parse.
     */
    public static RunObjectStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        RunObjectStatus[] items = RunObjectStatus.values();
        for (RunObjectStatus item : items) {
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
