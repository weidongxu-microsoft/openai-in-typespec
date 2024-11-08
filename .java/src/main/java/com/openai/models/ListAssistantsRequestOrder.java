// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for ListAssistantsRequestOrder.
 */
public enum ListAssistantsRequestOrder {
    /**
     * Enum value asc.
     */
    ASC("asc"),

    /**
     * Enum value desc.
     */
    DESC("desc");

    /**
     * The actual serialized value for a ListAssistantsRequestOrder instance.
     */
    private final String value;

    ListAssistantsRequestOrder(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListAssistantsRequestOrder instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ListAssistantsRequestOrder object, or null if unable to parse.
     */
    public static ListAssistantsRequestOrder fromString(String value) {
        if (value == null) {
            return null;
        }
        ListAssistantsRequestOrder[] items = ListAssistantsRequestOrder.values();
        for (ListAssistantsRequestOrder item : items) {
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