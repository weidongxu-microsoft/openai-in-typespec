// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.ServiceClient;
import com.generic.core.http.Response;
import com.generic.core.http.exception.HttpResponseException;
import com.generic.core.http.models.RequestOptions;
import com.generic.core.models.BinaryData;
import com.openai.implementation.CompletionsImpl;
import com.openai.models.CreateCompletionRequest;
import com.openai.models.CreateCompletionResponse;

/**
 * Initializes a new instance of the synchronous OpenAIClient type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class CompletionsClient {
    @Metadata(generated = true)
    private final CompletionsImpl serviceClient;

    /**
     * Initializes an instance of CompletionsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    CompletionsClient(CompletionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model: String(gpt-3.5-turbo-instruct/davinci-002/babbage-002) (Required)
     *     prompt: BinaryData (Required)
     *     best_of: Long (Optional)
     *     echo: Boolean (Optional)
     *     frequency_penalty: Double (Optional)
     *     logit_bias (Optional): {
     *         String: long (Required)
     *     }
     *     logprobs: Long (Optional)
     *     max_tokens: Long (Optional)
     *     n: Long (Optional)
     *     presence_penalty: Double (Optional)
     *     seed: Long (Optional)
     *     stop: BinaryData (Optional)
     *     stream: Boolean (Optional)
     *     suffix: String (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     user: String (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     choices (Required): [
     *          (Required){
     *             index: long (Required)
     *             text: String (Required)
     *             logprobs (Required): {
     *                 tokens (Required): [
     *                     String (Required)
     *                 ]
     *                 token_logprobs (Required): [
     *                     double (Required)
     *                 ]
     *                 top_logprobs (Required): [
     *                      (Required){
     *                         String: long (Required)
     *                     }
     *                 ]
     *                 text_offset (Required): [
     *                     long (Required)
     *                 ]
     *             }
     *             finish_reason: String(stop/length/content_filter) (Required)
     *         }
     *     ]
     *     created: long (Required)
     *     model: String (Required)
     *     system_fingerprint: String (Optional)
     *     object: String (Required)
     *     usage (Optional): {
     *         prompt_tokens: long (Required)
     *         completion_tokens: long (Required)
     *         total_tokens: long (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param createCompletionRequest The createCompletionRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a completion response from the API.
     */
    @Metadata(generated = true)
    public Response<BinaryData> createCompletionWithResponse(BinaryData createCompletionRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.createCompletionWithResponse(createCompletionRequest, requestOptions);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * 
     * @param createCompletionRequest The createCompletionRequest parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a completion response from the API.
     */
    @Metadata(generated = true)
    public CreateCompletionResponse createCompletion(CreateCompletionRequest createCompletionRequest) {
        // Generated convenience method for createCompletionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createCompletionWithResponse(BinaryData.fromObject(createCompletionRequest), requestOptions).getValue()
            .toObject(CreateCompletionResponse.class);
    }
}