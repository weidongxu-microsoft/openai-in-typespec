// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateChatCompletionFunctionResponseChoiceFinishReason.
 */
public enum CreateChatCompletionFunctionResponseChoiceFinishReason {
    /**
     * Enum value stop.
     */
    STOP("stop"),

    /**
     * Enum value length.
     */
    LENGTH("length"),

    /**
     * Enum value function_call.
     */
    FUNCTION_CALL("function_call"),

    /**
     * Enum value content_filter.
     */
    CONTENT_FILTER("content_filter");

    /**
     * The actual serialized value for a CreateChatCompletionFunctionResponseChoiceFinishReason instance.
     */
    private final String value;

    CreateChatCompletionFunctionResponseChoiceFinishReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateChatCompletionFunctionResponseChoiceFinishReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateChatCompletionFunctionResponseChoiceFinishReason object, or null if unable to parse.
     */
    public static CreateChatCompletionFunctionResponseChoiceFinishReason fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateChatCompletionFunctionResponseChoiceFinishReason[] items
            = CreateChatCompletionFunctionResponseChoiceFinishReason.values();
        for (CreateChatCompletionFunctionResponseChoiceFinishReason item : items) {
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
