// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.ChatImpl;
import com.openai.models.CreateChatCompletionRequest;
import com.openai.models.CreateChatCompletionResponse;
import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.ServiceClient;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the synchronous Chat type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class ChatClient {
    @Metadata(generated = true)
    private final ChatImpl serviceClient;

    /**
     * Initializes an instance of ChatClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    ChatClient(ChatImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a model response for the given chat conversation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     messages (Required): [
     *          (Required){
     *             role: String (Required)
     *         }
     *     ]
     *     model: String(o1-preview/o1-preview-2024-09-12/o1-mini/o1-mini-2024-09-12/gpt-4o/gpt-4o-2024-08-06/gpt-4o-2024-05-13/gpt-4o-realtime-preview/gpt-4o-realtime-preview-2024-10-01/chatgpt-4o-latest/gpt-4o-mini/gpt-4o-mini-2024-07-18/gpt-4-turbo/gpt-4-turbo-2024-04-09/gpt-4-0125-preview/gpt-4-turbo-preview/gpt-4-1106-preview/gpt-4-vision-preview/gpt-4/gpt-4-0314/gpt-4-0613/gpt-4-32k/gpt-4-32k-0314/gpt-4-32k-0613/gpt-3.5-turbo/gpt-3.5-turbo-16k/gpt-3.5-turbo-0301/gpt-3.5-turbo-0613/gpt-3.5-turbo-1106/gpt-3.5-turbo-0125/gpt-3.5-turbo-16k-0613) (Required)
     *     store: Boolean (Optional)
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     *     frequency_penalty: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Required)
     *     }
     *     logprobs: Boolean (Optional)
     *     top_logprobs: Integer (Optional)
     *     max_tokens: Integer (Optional)
     *     max_completion_tokens: Integer (Optional)
     *     n: Integer (Optional)
     *     presence_penalty: Double (Optional)
     *     response_format (Optional): {
     *         type: String (Required)
     *     }
     *     seed: Long (Optional)
     *     service_tier: String(auto/default) (Optional)
     *     stop: BinaryData (Optional)
     *     stream: Boolean (Optional)
     *     stream_options (Optional): {
     *         include_usage: Boolean (Optional)
     *     }
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     tools (Optional): [
     *          (Optional){
     *             type: String (Required)
     *             function (Required): {
     *                 description: String (Optional)
     *                 name: String (Required)
     *                 parameters (Optional): {
     *                      (Optional): {
     *                         String: BinaryData (Required)
     *                     }
     *                 }
     *                 strict: Boolean (Optional)
     *             }
     *         }
     *     ]
     *     tool_choice: BinaryData (Optional)
     *     parallel_tool_calls: Boolean (Optional)
     *     user: String (Optional)
     *     function_call: BinaryData (Optional)
     *     functions (Optional): [
     *          (Optional){
     *             description: String (Optional)
     *             name: String (Required)
     *             parameters (Optional): (recursive schema, see parameters above)
     *         }
     *     ]
     * }
     * }
     * </pre>
     * 
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a chat completion response returned by model, based on the provided input.
     */
    @Metadata(generated = true)
    public Response<CreateChatCompletionResponse> createChatCompletionWithResponse(BinaryData requestBody,
        RequestOptions requestOptions) {
        return this.serviceClient.createChatCompletionWithResponse(requestBody, requestOptions);
    }

    /**
     * Creates a model response for the given chat conversation.
     * 
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a chat completion response returned by model, based on the provided input.
     */
    @Metadata(generated = true)
    public CreateChatCompletionResponse createChatCompletion(CreateChatCompletionRequest requestBody) {
        // Generated convenience method for createChatCompletionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createChatCompletionWithResponse(BinaryData.fromObject(requestBody), requestOptions).getValue();
    }
}