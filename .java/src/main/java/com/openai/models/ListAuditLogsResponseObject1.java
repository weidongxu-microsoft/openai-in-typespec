// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for ListAuditLogsResponseObject1.
 */
public enum ListAuditLogsResponseObject1 {
    /**
     * Enum value list.
     */
    LIST("list");

    /**
     * The actual serialized value for a ListAuditLogsResponseObject1 instance.
     */
    private final String value;

    ListAuditLogsResponseObject1(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListAuditLogsResponseObject1 instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ListAuditLogsResponseObject1 object, or null if unable to parse.
     */
    public static ListAuditLogsResponseObject1 fromString(String value) {
        if (value == null) {
            return null;
        }
        ListAuditLogsResponseObject1[] items = ListAuditLogsResponseObject1.values();
        for (ListAuditLogsResponseObject1 item : items) {
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
