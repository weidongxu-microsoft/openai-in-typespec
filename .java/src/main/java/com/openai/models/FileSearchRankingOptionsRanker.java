// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for FileSearchRankingOptionsRanker.
 */
public enum FileSearchRankingOptionsRanker {
    /**
     * Enum value auto.
     */
    AUTO("auto"),

    /**
     * Enum value default_2024_08_21.
     */
    DEFAULT_2024_08_21("default_2024_08_21");

    /**
     * The actual serialized value for a FileSearchRankingOptionsRanker instance.
     */
    private final String value;

    FileSearchRankingOptionsRanker(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FileSearchRankingOptionsRanker instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed FileSearchRankingOptionsRanker object, or null if unable to parse.
     */
    public static FileSearchRankingOptionsRanker fromString(String value) {
        if (value == null) {
            return null;
        }
        FileSearchRankingOptionsRanker[] items = FileSearchRankingOptionsRanker.values();
        for (FileSearchRankingOptionsRanker item : items) {
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
