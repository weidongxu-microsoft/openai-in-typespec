// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for RealtimeContentPartType.
 */
public final class RealtimeContentPartType extends ExpandableStringEnum<RealtimeContentPartType> {
    /**
     * Static value input_text for RealtimeContentPartType.
     */
    @Generated
    public static final RealtimeContentPartType INPUT_TEXT = fromString("input_text");

    /**
     * Static value input_audio for RealtimeContentPartType.
     */
    @Generated
    public static final RealtimeContentPartType INPUT_AUDIO = fromString("input_audio");

    /**
     * Static value text for RealtimeContentPartType.
     */
    @Generated
    public static final RealtimeContentPartType TEXT = fromString("text");

    /**
     * Static value audio for RealtimeContentPartType.
     */
    @Generated
    public static final RealtimeContentPartType AUDIO = fromString("audio");

    /**
     * Creates a new instance of RealtimeContentPartType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RealtimeContentPartType() {
    }

    /**
     * Creates or finds a RealtimeContentPartType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RealtimeContentPartType.
     */
    @Generated
    public static RealtimeContentPartType fromString(String name) {
        return fromString(name, RealtimeContentPartType.class);
    }

    /**
     * Gets known RealtimeContentPartType values.
     * 
     * @return known RealtimeContentPartType values.
     */
    @Generated
    public static Collection<RealtimeContentPartType> values() {
        return values(RealtimeContentPartType.class);
    }
}
