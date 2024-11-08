// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * The RealtimeServerEventRateLimitsUpdatedRateLimitsItem model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RealtimeServerEventRateLimitsUpdatedRateLimitsItem
    implements JsonSerializable<RealtimeServerEventRateLimitsUpdatedRateLimitsItem> {
    /*
     * The rate limit property name that this item includes information about.
     */
    @Metadata(generated = true)
    private final String name;

    /*
     * The maximum configured limit for this rate limit property.
     */
    @Metadata(generated = true)
    private final int limit;

    /*
     * The remaining quota available against the configured limit for this rate limit property.
     */
    @Metadata(generated = true)
    private final int remaining;

    /*
     * The remaining time, in seconds, until this rate limit property is reset.
     */
    @Metadata(generated = true)
    private final double resetSeconds;

    /**
     * Creates an instance of RealtimeServerEventRateLimitsUpdatedRateLimitsItem class.
     * 
     * @param name the name value to set.
     * @param limit the limit value to set.
     * @param remaining the remaining value to set.
     * @param resetSeconds the resetSeconds value to set.
     */
    @Metadata(generated = true)
    private RealtimeServerEventRateLimitsUpdatedRateLimitsItem(String name, int limit, int remaining,
        Duration resetSeconds) {
        this.name = name;
        this.limit = limit;
        this.remaining = remaining;
        if (resetSeconds == null) {
            this.resetSeconds = 0.0;
        } else {
            this.resetSeconds = (double) resetSeconds.toNanos() / 1000_000_000L;
        }
    }

    /**
     * Get the name property: The rate limit property name that this item includes information about.
     * 
     * @return the name value.
     */
    @Metadata(generated = true)
    public String getName() {
        return this.name;
    }

    /**
     * Get the limit property: The maximum configured limit for this rate limit property.
     * 
     * @return the limit value.
     */
    @Metadata(generated = true)
    public int getLimit() {
        return this.limit;
    }

    /**
     * Get the remaining property: The remaining quota available against the configured limit for this rate limit
     * property.
     * 
     * @return the remaining value.
     */
    @Metadata(generated = true)
    public int getRemaining() {
        return this.remaining;
    }

    /**
     * Get the resetSeconds property: The remaining time, in seconds, until this rate limit property is reset.
     * 
     * @return the resetSeconds value.
     */
    @Metadata(generated = true)
    public Duration getResetSeconds() {
        return Duration.ofNanos((long) (this.resetSeconds * 1000_000_000L));
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeIntField("limit", this.limit);
        jsonWriter.writeIntField("remaining", this.remaining);
        jsonWriter.writeDoubleField("reset_seconds", this.resetSeconds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeServerEventRateLimitsUpdatedRateLimitsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeServerEventRateLimitsUpdatedRateLimitsItem if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeServerEventRateLimitsUpdatedRateLimitsItem.
     */
    @Metadata(generated = true)
    public static RealtimeServerEventRateLimitsUpdatedRateLimitsItem fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            int limit = 0;
            int remaining = 0;
            Duration resetSeconds = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("limit".equals(fieldName)) {
                    limit = reader.getInt();
                } else if ("remaining".equals(fieldName)) {
                    remaining = reader.getInt();
                } else if ("reset_seconds".equals(fieldName)) {
                    resetSeconds = Duration.ofNanos((long) (reader.getDouble() * 1000_000_000L));
                } else {
                    reader.skipChildren();
                }
            }
            return new RealtimeServerEventRateLimitsUpdatedRateLimitsItem(name, limit, remaining, resetSeconds);
        });
    }
}