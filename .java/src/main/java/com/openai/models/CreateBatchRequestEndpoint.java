// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateBatchRequestEndpoint.
 */
public enum CreateBatchRequestEndpoint {
    /**
     * Enum value /v1/chat/completions.
     */
    V1_CHAT_COMPLETIONS("/v1/chat/completions"),

    /**
     * Enum value /v1/embeddings.
     */
    V1_EMBEDDINGS("/v1/embeddings");

    /**
     * The actual serialized value for a CreateBatchRequestEndpoint instance.
     */
    private final String value;

    CreateBatchRequestEndpoint(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateBatchRequestEndpoint instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateBatchRequestEndpoint object, or null if unable to parse.
     */
    public static CreateBatchRequestEndpoint fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateBatchRequestEndpoint[] items = CreateBatchRequestEndpoint.values();
        for (CreateBatchRequestEndpoint item : items) {
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
