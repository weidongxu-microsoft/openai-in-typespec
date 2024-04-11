// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.TypeConditions;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateSpeechRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateSpeechRequest implements JsonSerializable<CreateSpeechRequest> {
    /*
     * One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd`
     */
    @Metadata(generated = true)
    private final CreateSpeechRequestModel model;

    /*
     * The text to generate audio for. The maximum length is 4096 characters.
     */
    @Metadata(generated = true)
    private final String input;

    /*
     * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`,
     * `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the
     * [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     */
    @Metadata(generated = true)
    private final CreateSpeechRequestVoice voice;

    /*
     * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
     */
    @Metadata(generated = true)
    private CreateSpeechRequestResponseFormat responseFormat;

    /*
     * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
     */
    @Metadata(generated = true)
    private Double speed;

    /**
     * Creates an instance of CreateSpeechRequest class.
     * 
     * @param model the model value to set.
     * @param input the input value to set.
     * @param voice the voice value to set.
     */
    @Metadata(generated = true)
    public CreateSpeechRequest(CreateSpeechRequestModel model, String input, CreateSpeechRequestVoice voice) {
        this.model = model;
        this.input = input;
        this.voice = voice;
    }

    /**
     * Get the model property: One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd`.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public CreateSpeechRequestModel getModel() {
        return this.model;
    }

    /**
     * Get the input property: The text to generate audio for. The maximum length is 4096 characters.
     * 
     * @return the input value.
     */
    @Metadata(generated = true)
    public String getInput() {
        return this.input;
    }

    /**
     * Get the voice property: The voice to use when generating the audio. Supported voices are `alloy`, `echo`,
     * `fable`,
     * `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the
     * [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     * 
     * @return the voice value.
     */
    @Metadata(generated = true)
    public CreateSpeechRequestVoice getVoice() {
        return this.voice;
    }

    /**
     * Get the responseFormat property: The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`,
     * `wav`, and `pcm`.
     * 
     * @return the responseFormat value.
     */
    @Metadata(generated = true)
    public CreateSpeechRequestResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Set the responseFormat property: The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`,
     * `wav`, and `pcm`.
     * 
     * @param responseFormat the responseFormat value to set.
     * @return the CreateSpeechRequest object itself.
     */
    @Metadata(generated = true)
    public CreateSpeechRequest setResponseFormat(CreateSpeechRequestResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }

    /**
     * Get the speed property: The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the
     * default.
     * 
     * @return the speed value.
     */
    @Metadata(generated = true)
    public Double getSpeed() {
        return this.speed;
    }

    /**
     * Set the speed property: The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the
     * default.
     * 
     * @param speed the speed value to set.
     * @return the CreateSpeechRequest object itself.
     */
    @Metadata(generated = true)
    public CreateSpeechRequest setSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("model", this.model == null ? null : this.model.toString());
        jsonWriter.writeStringField("input", this.input);
        jsonWriter.writeStringField("voice", this.voice == null ? null : this.voice.toString());
        jsonWriter.writeStringField("response_format",
            this.responseFormat == null ? null : this.responseFormat.toString());
        jsonWriter.writeNumberField("speed", this.speed);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateSpeechRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateSpeechRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateSpeechRequest.
     */
    @Metadata(generated = true)
    public static CreateSpeechRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateSpeechRequestModel model = null;
            String input = null;
            CreateSpeechRequestVoice voice = null;
            CreateSpeechRequestResponseFormat responseFormat = null;
            Double speed = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("model".equals(fieldName)) {
                    model = CreateSpeechRequestModel.fromString(reader.getString());
                } else if ("input".equals(fieldName)) {
                    input = reader.getString();
                } else if ("voice".equals(fieldName)) {
                    voice = CreateSpeechRequestVoice.fromString(reader.getString());
                } else if ("response_format".equals(fieldName)) {
                    responseFormat = CreateSpeechRequestResponseFormat.fromString(reader.getString());
                } else if ("speed".equals(fieldName)) {
                    speed = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }
            CreateSpeechRequest deserializedCreateSpeechRequest = new CreateSpeechRequest(model, input, voice);
            deserializedCreateSpeechRequest.responseFormat = responseFormat;
            deserializedCreateSpeechRequest.speed = speed;

            return deserializedCreateSpeechRequest;
        });
    }
}
