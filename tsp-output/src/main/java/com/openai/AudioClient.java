// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.ServiceClient;
import com.generic.core.http.Response;
import com.generic.core.http.exception.HttpResponseException;
import com.generic.core.http.models.RequestOptions;
import com.generic.core.models.BinaryData;
import com.openai.implementation.AudiosImpl;
import com.openai.implementation.MultipartFormDataHelper;
import com.openai.models.CreateSpeechRequest;
import com.openai.models.CreateTranscriptionRequest;
import com.openai.models.CreateTranscriptionResponseVerboseJson;
import com.openai.models.CreateTranslationRequest;
import com.openai.models.CreateTranslationResponseVerboseJson;
import java.util.Objects;

/**
 * Initializes a new instance of the synchronous OpenAIClient type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class AudioClient {
    @Metadata(generated = true)
    private final AudiosImpl serviceClient;

    /**
     * Initializes an instance of AudioClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    AudioClient(AudiosImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Generates audio from the input text.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model: String(tts-1/tts-1-hd) (Required)
     *     input: String (Required)
     *     voice: String(alloy/echo/fable/onyx/nova/shimmer) (Required)
     *     response_format: String(mp3/opus/aac/flac/wav/pcm) (Optional)
     *     speed: Double (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param speech The speech parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<BinaryData> createSpeechWithResponse(BinaryData speech, RequestOptions requestOptions) {
        return this.serviceClient.createSpeechWithResponse(speech, requestOptions);
    }

    /**
     * Transcribes audio into the input language.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     task: String (Required)
     *     language: String (Required)
     *     duration: double (Required)
     *     text: String (Required)
     *     words (Optional): [
     *          (Optional){
     *             word: String (Required)
     *             start: double (Required)
     *             end: double (Required)
     *         }
     *     ]
     *     segments (Optional): [
     *          (Optional){
     *             id: long (Required)
     *             seek: long (Required)
     *             start: double (Required)
     *             end: double (Required)
     *             text: String (Required)
     *             tokens (Required): [
     *                 long (Required)
     *             ]
     *             temperature: double (Required)
     *             avg_logprob: double (Required)
     *             compression_ratio: double (Required)
     *             no_speech_prob: double (Required)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param audio The audio parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a verbose json transcription response returned by model, based on the provided input.
     */
    @Metadata(generated = true)
    Response<BinaryData> createTranscriptionWithResponse(BinaryData audio, RequestOptions requestOptions) {
        // Protocol API requires serialization of parts with content-disposition and data, as operation 'createTranscription' is 'multipart/form-data'
        return this.serviceClient.createTranscriptionWithResponse(audio, requestOptions);
    }

    /**
     * Translates audio into English..
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     task: String (Required)
     *     language: String (Required)
     *     duration: double (Required)
     *     text: String (Required)
     *     segments (Optional): [
     *          (Optional){
     *             id: long (Required)
     *             seek: long (Required)
     *             start: double (Required)
     *             end: double (Required)
     *             text: String (Required)
     *             tokens (Required): [
     *                 long (Required)
     *             ]
     *             temperature: double (Required)
     *             avg_logprob: double (Required)
     *             compression_ratio: double (Required)
     *             no_speech_prob: double (Required)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param audio The audio parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<BinaryData> createTranslationWithResponse(BinaryData audio, RequestOptions requestOptions) {
        // Protocol API requires serialization of parts with content-disposition and data, as operation 'createTranslation' is 'multipart/form-data'
        return this.serviceClient.createTranslationWithResponse(audio, requestOptions);
    }

    /**
     * Generates audio from the input text.
     * 
     * @param speech The speech parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public BinaryData createSpeech(CreateSpeechRequest speech) {
        // Generated convenience method for createSpeechWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createSpeechWithResponse(BinaryData.fromObject(speech), requestOptions).getValue();
    }

    /**
     * Transcribes audio into the input language.
     * 
     * @param audio The audio parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a verbose json transcription response returned by model, based on the provided input.
     */
    @Metadata(generated = true)
    public CreateTranscriptionResponseVerboseJson createTranscription(CreateTranscriptionRequest audio) {
        // Generated convenience method for createTranscriptionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createTranscriptionWithResponse(new MultipartFormDataHelper(requestOptions)
            .serializeFileField("file", audio.getFile().getContent(), audio.getFile().getContentType(),
                audio.getFile().getFilename())
            .serializeTextField("model", Objects.toString(audio.getModel()))
            .serializeTextField("language", audio.getLanguage())
            .serializeTextField("prompt", audio.getPrompt())
            .serializeTextField("response_format", Objects.toString(audio.getResponseFormat()))
            .serializeTextField("temperature", Objects.toString(audio.getTemperature()))
            .serializeJsonField("timestamp_granularities", audio.getTimestampGranularities())
            .end()
            .getRequestBody(), requestOptions).getValue().toObject(CreateTranscriptionResponseVerboseJson.class);
    }

    /**
     * Translates audio into English..
     * 
     * @param audio The audio parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public CreateTranslationResponseVerboseJson createTranslation(CreateTranslationRequest audio) {
        // Generated convenience method for createTranslationWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createTranslationWithResponse(new MultipartFormDataHelper(requestOptions)
            .serializeFileField("file", audio.getFile().getContent(), audio.getFile().getContentType(),
                audio.getFile().getFilename())
            .serializeTextField("model", Objects.toString(audio.getModel()))
            .serializeTextField("prompt", audio.getPrompt())
            .serializeTextField("response_format", Objects.toString(audio.getResponseFormat()))
            .serializeTextField("temperature", Objects.toString(audio.getTemperature()))
            .end()
            .getRequestBody(), requestOptions).getValue().toObject(CreateTranslationResponseVerboseJson.class);
    }
}