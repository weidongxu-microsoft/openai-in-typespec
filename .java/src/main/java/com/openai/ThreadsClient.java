// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.ThreadsImpl;
import com.openai.models.CreateThreadRequest;
import com.openai.models.DeleteThreadResponse;
import com.openai.models.ModifyThreadRequest;
import com.openai.models.ThreadObject;
import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.ServiceClient;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the synchronous Threads type.
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
     * <pre>
     * {@code
     * {
     *     messages (Optional): [
     *          (Optional){
     *             role: String(user/assistant) (Required)
     *             content (Required): [
     *                  (Required){
     *                 }
     *             ]
     *             attachments (Optional): [
     *                  (Optional){
     *                     file_id: String (Required)
     *                     tools (Required): [
     *                         BinaryData (Required)
     *                     ]
     *                 }
     *             ]
     *             metadata (Optional): {
     *                 String: String (Required)
     *             }
     *         }
     *     ]
     *     tool_resources (Optional): {
     *         code_interpreter (Optional): {
     *             file_ids (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *         file_search (Optional): {
     *             vector_store_ids (Optional): [
     *                 String (Optional)
     *             ]
     *             vector_stores (Optional): [
     *                  (Optional){
     *                     file_ids (Optional): [
     *                         String (Optional)
     *                     ]
     *                     chunking_strategy: BinaryData (Optional)
     *                     metadata (Optional): {
     *                         String: String (Required)
     *                     }
     *                 }
     *             ]
     *         }
     *     }
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public Response<ThreadObject> createThreadWithResponse(BinaryData requestBody, RequestOptions requestOptions) {
        return this.serviceClient.createThreadWithResponse(requestBody, requestOptions);
    }

    /**
     * Retrieves a thread.
     * 
     * @param threadId The ID of the thread to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public Response<ThreadObject> getThreadWithResponse(String threadId, RequestOptions requestOptions) {
        return this.serviceClient.getThreadWithResponse(threadId, requestOptions);
    }

    /**
     * Modifies a thread.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     tool_resources (Optional): {
     *         code_interpreter (Optional): {
     *             file_ids (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *         file_search (Optional): {
     *             vector_store_ids (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     }
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param threadId The ID of the thread to modify. Only the `metadata` can be modified.
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public Response<ThreadObject> modifyThreadWithResponse(String threadId, BinaryData requestBody,
        RequestOptions requestOptions) {
        return this.serviceClient.modifyThreadWithResponse(threadId, requestBody, requestOptions);
    }

    /**
     * Delete a thread.
     * 
     * @param threadId The ID of the thread to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<DeleteThreadResponse> deleteThreadWithResponse(String threadId, RequestOptions requestOptions) {
        return this.serviceClient.deleteThreadWithResponse(threadId, requestOptions);
    }

    /**
     * Create a thread.
     * 
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public ThreadObject createThread(CreateThreadRequest requestBody) {
        // Generated convenience method for createThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createThreadWithResponse(BinaryData.fromObject(requestBody), requestOptions).getValue();
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
        return getThreadWithResponse(threadId, requestOptions).getValue();
    }

    /**
     * Modifies a thread.
     * 
     * @param threadId The ID of the thread to modify. Only the `metadata` can be modified.
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Metadata(generated = true)
    public ThreadObject modifyThread(String threadId, ModifyThreadRequest requestBody) {
        // Generated convenience method for modifyThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return modifyThreadWithResponse(threadId, BinaryData.fromObject(requestBody), requestOptions).getValue();
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
        return deleteThreadWithResponse(threadId, requestOptions).getValue();
    }
}
