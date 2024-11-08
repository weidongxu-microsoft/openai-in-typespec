// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateModerationResponseResultCategoryScores model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateModerationResponseResultCategoryScores
    implements JsonSerializable<CreateModerationResponseResultCategoryScores> {
    /*
     * The score for the category 'hate'.
     */
    @Metadata(generated = true)
    private final double hate;

    /*
     * The score for the category 'hate/threatening'.
     */
    @Metadata(generated = true)
    private final double hateThreatening;

    /*
     * The score for the category 'harassment'.
     */
    @Metadata(generated = true)
    private final double harassment;

    /*
     * The score for the category 'harassment/threatening'.
     */
    @Metadata(generated = true)
    private final double harassmentThreatening;

    /*
     * The score for the category 'illicit'.
     */
    @Metadata(generated = true)
    private final double illicit;

    /*
     * The score for the category 'illicit/violent'.
     */
    @Metadata(generated = true)
    private final double illicitViolent;

    /*
     * The score for the category 'self-harm'.
     */
    @Metadata(generated = true)
    private final double selfHarm;

    /*
     * The score for the category 'self-harm/intent'.
     */
    @Metadata(generated = true)
    private final double selfHarmIntent;

    /*
     * The score for the category 'self-harm/instructions'.
     */
    @Metadata(generated = true)
    private final double selfHarmInstructions;

    /*
     * The score for the category 'sexual'.
     */
    @Metadata(generated = true)
    private final double sexual;

    /*
     * The score for the category 'sexual/minors'.
     */
    @Metadata(generated = true)
    private final double sexualMinors;

    /*
     * The score for the category 'violence'.
     */
    @Metadata(generated = true)
    private final double violence;

    /*
     * The score for the category 'violence/graphic'.
     */
    @Metadata(generated = true)
    private final double violenceGraphic;

    /**
     * Creates an instance of CreateModerationResponseResultCategoryScores class.
     * 
     * @param hate the hate value to set.
     * @param hateThreatening the hateThreatening value to set.
     * @param harassment the harassment value to set.
     * @param harassmentThreatening the harassmentThreatening value to set.
     * @param illicit the illicit value to set.
     * @param illicitViolent the illicitViolent value to set.
     * @param selfHarm the selfHarm value to set.
     * @param selfHarmIntent the selfHarmIntent value to set.
     * @param selfHarmInstructions the selfHarmInstructions value to set.
     * @param sexual the sexual value to set.
     * @param sexualMinors the sexualMinors value to set.
     * @param violence the violence value to set.
     * @param violenceGraphic the violenceGraphic value to set.
     */
    @Metadata(generated = true)
    private CreateModerationResponseResultCategoryScores(double hate, double hateThreatening, double harassment,
        double harassmentThreatening, double illicit, double illicitViolent, double selfHarm, double selfHarmIntent,
        double selfHarmInstructions, double sexual, double sexualMinors, double violence, double violenceGraphic) {
        this.hate = hate;
        this.hateThreatening = hateThreatening;
        this.harassment = harassment;
        this.harassmentThreatening = harassmentThreatening;
        this.illicit = illicit;
        this.illicitViolent = illicitViolent;
        this.selfHarm = selfHarm;
        this.selfHarmIntent = selfHarmIntent;
        this.selfHarmInstructions = selfHarmInstructions;
        this.sexual = sexual;
        this.sexualMinors = sexualMinors;
        this.violence = violence;
        this.violenceGraphic = violenceGraphic;
    }

    /**
     * Get the hate property: The score for the category 'hate'.
     * 
     * @return the hate value.
     */
    @Metadata(generated = true)
    public double getHate() {
        return this.hate;
    }

    /**
     * Get the hateThreatening property: The score for the category 'hate/threatening'.
     * 
     * @return the hateThreatening value.
     */
    @Metadata(generated = true)
    public double getHateThreatening() {
        return this.hateThreatening;
    }

    /**
     * Get the harassment property: The score for the category 'harassment'.
     * 
     * @return the harassment value.
     */
    @Metadata(generated = true)
    public double getHarassment() {
        return this.harassment;
    }

    /**
     * Get the harassmentThreatening property: The score for the category 'harassment/threatening'.
     * 
     * @return the harassmentThreatening value.
     */
    @Metadata(generated = true)
    public double getHarassmentThreatening() {
        return this.harassmentThreatening;
    }

    /**
     * Get the illicit property: The score for the category 'illicit'.
     * 
     * @return the illicit value.
     */
    @Metadata(generated = true)
    public double getIllicit() {
        return this.illicit;
    }

    /**
     * Get the illicitViolent property: The score for the category 'illicit/violent'.
     * 
     * @return the illicitViolent value.
     */
    @Metadata(generated = true)
    public double getIllicitViolent() {
        return this.illicitViolent;
    }

    /**
     * Get the selfHarm property: The score for the category 'self-harm'.
     * 
     * @return the selfHarm value.
     */
    @Metadata(generated = true)
    public double getSelfHarm() {
        return this.selfHarm;
    }

    /**
     * Get the selfHarmIntent property: The score for the category 'self-harm/intent'.
     * 
     * @return the selfHarmIntent value.
     */
    @Metadata(generated = true)
    public double getSelfHarmIntent() {
        return this.selfHarmIntent;
    }

    /**
     * Get the selfHarmInstructions property: The score for the category 'self-harm/instructions'.
     * 
     * @return the selfHarmInstructions value.
     */
    @Metadata(generated = true)
    public double getSelfHarmInstructions() {
        return this.selfHarmInstructions;
    }

    /**
     * Get the sexual property: The score for the category 'sexual'.
     * 
     * @return the sexual value.
     */
    @Metadata(generated = true)
    public double getSexual() {
        return this.sexual;
    }

    /**
     * Get the sexualMinors property: The score for the category 'sexual/minors'.
     * 
     * @return the sexualMinors value.
     */
    @Metadata(generated = true)
    public double getSexualMinors() {
        return this.sexualMinors;
    }

    /**
     * Get the violence property: The score for the category 'violence'.
     * 
     * @return the violence value.
     */
    @Metadata(generated = true)
    public double getViolence() {
        return this.violence;
    }

    /**
     * Get the violenceGraphic property: The score for the category 'violence/graphic'.
     * 
     * @return the violenceGraphic value.
     */
    @Metadata(generated = true)
    public double getViolenceGraphic() {
        return this.violenceGraphic;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("hate", this.hate);
        jsonWriter.writeDoubleField("hate/threatening", this.hateThreatening);
        jsonWriter.writeDoubleField("harassment", this.harassment);
        jsonWriter.writeDoubleField("harassment/threatening", this.harassmentThreatening);
        jsonWriter.writeDoubleField("illicit", this.illicit);
        jsonWriter.writeDoubleField("illicit/violent", this.illicitViolent);
        jsonWriter.writeDoubleField("self-harm", this.selfHarm);
        jsonWriter.writeDoubleField("self-harm/intent", this.selfHarmIntent);
        jsonWriter.writeDoubleField("self-harm/instructions", this.selfHarmInstructions);
        jsonWriter.writeDoubleField("sexual", this.sexual);
        jsonWriter.writeDoubleField("sexual/minors", this.sexualMinors);
        jsonWriter.writeDoubleField("violence", this.violence);
        jsonWriter.writeDoubleField("violence/graphic", this.violenceGraphic);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateModerationResponseResultCategoryScores from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateModerationResponseResultCategoryScores if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateModerationResponseResultCategoryScores.
     */
    @Metadata(generated = true)
    public static CreateModerationResponseResultCategoryScores fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            double hate = 0.0;
            double hateThreatening = 0.0;
            double harassment = 0.0;
            double harassmentThreatening = 0.0;
            double illicit = 0.0;
            double illicitViolent = 0.0;
            double selfHarm = 0.0;
            double selfHarmIntent = 0.0;
            double selfHarmInstructions = 0.0;
            double sexual = 0.0;
            double sexualMinors = 0.0;
            double violence = 0.0;
            double violenceGraphic = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hate".equals(fieldName)) {
                    hate = reader.getDouble();
                } else if ("hate/threatening".equals(fieldName)) {
                    hateThreatening = reader.getDouble();
                } else if ("harassment".equals(fieldName)) {
                    harassment = reader.getDouble();
                } else if ("harassment/threatening".equals(fieldName)) {
                    harassmentThreatening = reader.getDouble();
                } else if ("illicit".equals(fieldName)) {
                    illicit = reader.getDouble();
                } else if ("illicit/violent".equals(fieldName)) {
                    illicitViolent = reader.getDouble();
                } else if ("self-harm".equals(fieldName)) {
                    selfHarm = reader.getDouble();
                } else if ("self-harm/intent".equals(fieldName)) {
                    selfHarmIntent = reader.getDouble();
                } else if ("self-harm/instructions".equals(fieldName)) {
                    selfHarmInstructions = reader.getDouble();
                } else if ("sexual".equals(fieldName)) {
                    sexual = reader.getDouble();
                } else if ("sexual/minors".equals(fieldName)) {
                    sexualMinors = reader.getDouble();
                } else if ("violence".equals(fieldName)) {
                    violence = reader.getDouble();
                } else if ("violence/graphic".equals(fieldName)) {
                    violenceGraphic = reader.getDouble();
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateModerationResponseResultCategoryScores(hate, hateThreatening, harassment,
                harassmentThreatening, illicit, illicitViolent, selfHarm, selfHarmIntent, selfHarmInstructions, sexual,
                sexualMinors, violence, violenceGraphic);
        });
    }
}
