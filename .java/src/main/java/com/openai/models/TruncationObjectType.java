// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for TruncationObjectType.
 */
public enum TruncationObjectType {
    /**
     * Enum value auto.
     */
    AUTO("auto"),

    /**
     * Enum value last_messages.
     */
    LAST_MESSAGES("last_messages");

    /**
     * The actual serialized value for a TruncationObjectType instance.
     */
    private final String value;

    TruncationObjectType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TruncationObjectType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed TruncationObjectType object, or null if unable to parse.
     */
    public static TruncationObjectType fromString(String value) {
        if (value == null) {
            return null;
        }
        TruncationObjectType[] items = TruncationObjectType.values();
        for (TruncationObjectType item : items) {
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
