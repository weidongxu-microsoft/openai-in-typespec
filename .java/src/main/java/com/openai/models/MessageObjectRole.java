// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for MessageObjectRole.
 */
public enum MessageObjectRole {
    /**
     * Enum value user.
     */
    USER("user"),

    /**
     * Enum value assistant.
     */
    ASSISTANT("assistant");

    /**
     * The actual serialized value for a MessageObjectRole instance.
     */
    private final String value;

    MessageObjectRole(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MessageObjectRole instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed MessageObjectRole object, or null if unable to parse.
     */
    public static MessageObjectRole fromString(String value) {
        if (value == null) {
            return null;
        }
        MessageObjectRole[] items = MessageObjectRole.values();
        for (MessageObjectRole item : items) {
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
