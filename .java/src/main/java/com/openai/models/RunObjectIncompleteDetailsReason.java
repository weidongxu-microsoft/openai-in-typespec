// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for RunObjectIncompleteDetailsReason.
 */
public enum RunObjectIncompleteDetailsReason {
    /**
     * Enum value max_completion_tokens.
     */
    MAX_COMPLETION_TOKENS("max_completion_tokens"),

    /**
     * Enum value max_prompt_tokens.
     */
    MAX_PROMPT_TOKENS("max_prompt_tokens");

    /**
     * The actual serialized value for a RunObjectIncompleteDetailsReason instance.
     */
    private final String value;

    RunObjectIncompleteDetailsReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RunObjectIncompleteDetailsReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RunObjectIncompleteDetailsReason object, or null if unable to parse.
     */
    public static RunObjectIncompleteDetailsReason fromString(String value) {
        if (value == null) {
            return null;
        }
        RunObjectIncompleteDetailsReason[] items = RunObjectIncompleteDetailsReason.values();
        for (RunObjectIncompleteDetailsReason item : items) {
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
