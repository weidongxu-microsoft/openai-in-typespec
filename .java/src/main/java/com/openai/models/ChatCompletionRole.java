// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * The role of the author of a message.
 */
public enum ChatCompletionRole {
    /**
     * Enum value system.
     */
    SYSTEM("system"),

    /**
     * Enum value user.
     */
    USER("user"),

    /**
     * Enum value assistant.
     */
    ASSISTANT("assistant"),

    /**
     * Enum value tool.
     */
    TOOL("tool"),

    /**
     * Enum value function.
     */
    FUNCTION("function");

    /**
     * The actual serialized value for a ChatCompletionRole instance.
     */
    private final String value;

    ChatCompletionRole(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ChatCompletionRole instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ChatCompletionRole object, or null if unable to parse.
     */
    public static ChatCompletionRole fromString(String value) {
        if (value == null) {
            return null;
        }
        ChatCompletionRole[] items = ChatCompletionRole.values();
        for (ChatCompletionRole item : items) {
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