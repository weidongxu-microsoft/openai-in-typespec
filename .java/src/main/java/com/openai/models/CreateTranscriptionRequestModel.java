// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for CreateTranscriptionRequestModel.
 */
public final class CreateTranscriptionRequestModel extends ExpandableStringEnum<CreateTranscriptionRequestModel> {
    /**
     * Static value whisper-1 for CreateTranscriptionRequestModel.
     */
    @Generated
    public static final CreateTranscriptionRequestModel WHISPER_1 = fromString("whisper-1");

    /**
     * Creates a new instance of CreateTranscriptionRequestModel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CreateTranscriptionRequestModel() {
    }

    /**
     * Creates or finds a CreateTranscriptionRequestModel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateTranscriptionRequestModel.
     */
    @Generated
    public static CreateTranscriptionRequestModel fromString(String name) {
        return fromString(name, CreateTranscriptionRequestModel.class);
    }

    /**
     * Gets known CreateTranscriptionRequestModel values.
     * 
     * @return known CreateTranscriptionRequestModel values.
     */
    @Generated
    public static Collection<CreateTranscriptionRequestModel> values() {
        return values(CreateTranscriptionRequestModel.class);
    }
}
