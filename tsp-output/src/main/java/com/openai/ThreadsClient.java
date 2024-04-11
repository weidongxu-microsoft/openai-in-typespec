// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.generic.core.annotation.Metadata;
import com.generic.core.annotation.ServiceClient;
import com.generic.core.http.Response;
import com.generic.core.http.exception.HttpResponseException;
import com.generic.core.http.models.RequestOptions;
import com.generic.core.models.BinaryData;
import com.openai.implementation.ThreadsImpl;
import com.openai.models.CreateThreadRequest;
import com.openai.models.DeleteThreadResponse;
import com.openai.models.ModifyThreadRequest;
import com.openai.models.ThreadObject;

/**
 * Initializes a new instance of the synchronous OpenAIClient type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class ThreadsClient {
    @Metadata(generated = true)
    private final ThreadsImpl serviceClient;

    /**
     * Initializes an instance of ThreadsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    ThreadsClient(ThreadsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create a thread.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     messages (Optional): [
     *          (Optional){
     *             role: String (Required)
     *             content: String (Required)
     *             file_ids (Optional): [
     *                 String (Optional)
     *             ]
     *             metadata (Optional): {
     *                 String: String (Required)
     *             }
     *         }
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     created_at: long (Required)
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param thread The thread parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public Response<BinaryData> createThreadWithResponse(BinaryData thread, RequestOptions requestOptions) {
        return this.serviceClient.createThreadWithResponse(thread, requestOptions);
    }

    /**
     * Retrieves a thread.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     created_at: long (Required)
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadId The ID of the thread to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public Response<BinaryData> getThreadWithResponse(String threadId, RequestOptions requestOptions) {
        return this.serviceClient.getThreadWithResponse(threadId, requestOptions);
    }

    /**
     * Modifies a thread.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     created_at: long (Required)
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadId The ID of the thread to modify. Only the `metadata` can be modified.
     * @param thread The thread parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public Response<BinaryData> modifyThreadWithResponse(String threadId, BinaryData thread,
        RequestOptions requestOptions) {
        return this.serviceClient.modifyThreadWithResponse(threadId, thread, requestOptions);
    }

    /**
     * Delete a thread.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     deleted: boolean (Required)
     *     object: String (Required)
     * }
     * }</pre>
     * 
     * @param threadId The ID of the thread to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<BinaryData> deleteThreadWithResponse(String threadId, RequestOptions requestOptions) {
        return this.serviceClient.deleteThreadWithResponse(threadId, requestOptions);
    }

    /**
     * Create a thread.
     * 
     * @param thread The thread parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public ThreadObject createThread(CreateThreadRequest thread) {
        // Generated convenience method for createThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createThreadWithResponse(BinaryData.fromObject(thread), requestOptions).getValue()
            .toObject(ThreadObject.class);
    }

    /**
     * Retrieves a thread.
     * 
     * @param threadId The ID of the thread to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public ThreadObject getThread(String threadId) {
        // Generated convenience method for getThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getThreadWithResponse(threadId, requestOptions).getValue().toObject(ThreadObject.class);
    }

    /**
     * Modifies a thread.
     * 
     * @param threadId The ID of the thread to modify. Only the `metadata` can be modified.
     * @param thread The thread parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public ThreadObject modifyThread(String threadId, ModifyThreadRequest thread) {
        // Generated convenience method for modifyThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return modifyThreadWithResponse(threadId, BinaryData.fromObject(thread), requestOptions).getValue()
            .toObject(ThreadObject.class);
    }

    /**
     * Delete a thread.
     * 
     * @param threadId The ID of the thread to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public DeleteThreadResponse deleteThread(String threadId) {
        // Generated convenience method for deleteThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteThreadWithResponse(threadId, requestOptions).getValue().toObject(DeleteThreadResponse.class);
    }
}
