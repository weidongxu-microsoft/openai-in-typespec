// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.openai.implementation.ThreadsImpl;
import com.openai.models.CreateThreadRequest;
import com.openai.models.DeleteThreadResponse;
import com.openai.models.ModifyThreadRequest;
import com.openai.models.ThreadObject;

/**
 * Initializes a new instance of the synchronous Threads type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class ThreadsClient {
    @Generated
    private final ThreadsImpl serviceClient;

    /**
     * Initializes an instance of ThreadsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
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
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     created_at: long (Required)
     *     tool_resources (Required): {
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
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents a thread that contains [messages](/docs/api-reference/messages) along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createThreadWithResponse(BinaryData requestBody, RequestOptions requestOptions) {
        return this.serviceClient.createThreadWithResponse(requestBody, requestOptions);
    }

    /**
     * Retrieves a thread.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     created_at: long (Required)
     *     tool_resources (Required): {
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
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param threadId The ID of the thread to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents a thread that contains [messages](/docs/api-reference/messages) along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getThreadWithResponse(String threadId, RequestOptions requestOptions) {
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
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     created_at: long (Required)
     *     tool_resources (Required): {
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
     *     metadata (Required): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param threadId The ID of the thread to modify. Only the `metadata` can be modified.
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents a thread that contains [messages](/docs/api-reference/messages) along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> modifyThreadWithResponse(String threadId, BinaryData requestBody,
        RequestOptions requestOptions) {
        return this.serviceClient.modifyThreadWithResponse(threadId, requestBody, requestOptions);
    }

    /**
     * Delete a thread.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Required)
     *     deleted: boolean (Required)
     *     object: String (Required)
     * }
     * }
     * </pre>
     * 
     * @param threadId The ID of the thread to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deleteThreadWithResponse(String threadId, RequestOptions requestOptions) {
        return this.serviceClient.deleteThreadWithResponse(threadId, requestOptions);
    }

    /**
     * Create a thread.
     * 
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ThreadObject createThread(CreateThreadRequest requestBody) {
        // Generated convenience method for createThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createThreadWithResponse(BinaryData.fromObject(requestBody), requestOptions).getValue()
            .toObject(ThreadObject.class);
    }

    /**
     * Retrieves a thread.
     * 
     * @param threadId The ID of the thread to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ThreadObject getThread(String threadId) {
        // Generated convenience method for getThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getThreadWithResponse(threadId, requestOptions).getValue().toObject(ThreadObject.class);
    }

    /**
     * Modifies a thread.
     * 
     * @param threadId The ID of the thread to modify. Only the `metadata` can be modified.
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a thread that contains [messages](/docs/api-reference/messages).
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ThreadObject modifyThread(String threadId, ModifyThreadRequest requestBody) {
        // Generated convenience method for modifyThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return modifyThreadWithResponse(threadId, BinaryData.fromObject(requestBody), requestOptions).getValue()
            .toObject(ThreadObject.class);
    }

    /**
     * Delete a thread.
     * 
     * @param threadId The ID of the thread to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeleteThreadResponse deleteThread(String threadId) {
        // Generated convenience method for deleteThreadWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteThreadWithResponse(threadId, requestOptions).getValue().toObject(DeleteThreadResponse.class);
    }
}
