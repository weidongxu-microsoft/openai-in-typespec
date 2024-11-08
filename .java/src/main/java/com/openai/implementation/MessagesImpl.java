// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.DeleteMessageResponse;
import com.openai.models.ListMessagesResponse;
import com.openai.models.MessageObject;
import io.clientcore.core.annotation.ServiceInterface;
import io.clientcore.core.http.RestProxy;
import io.clientcore.core.http.annotation.BodyParam;
import io.clientcore.core.http.annotation.HeaderParam;
import io.clientcore.core.http.annotation.HostParam;
import io.clientcore.core.http.annotation.HttpRequestInformation;
import io.clientcore.core.http.annotation.PathParam;
import io.clientcore.core.http.annotation.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the Messages type.
 */
public final class MessagesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MessagesService service;

    /**
     * Service host.
     */
    private final String endpoint;

    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * Initializes an instance of Messages client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Service host.
     */
    public MessagesImpl(HttpPipeline httpPipeline, String endpoint) {
        this.endpoint = "https://api.openai.com/v1";
        this.httpPipeline = httpPipeline;
        this.service = RestProxy.create(MessagesService.class, this.httpPipeline);
    }

    /**
     * The interface defining all the services for Messages to be used by the proxy service to perform REST calls.
     */
    @ServiceInterface(name = "Messages", host = "{endpoint}")
    public interface MessagesService {
        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/threads/{thread_id}/messages",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<MessageObject> createMessageSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, @PathParam("thread_id") String threadId,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/json") BinaryData requestBody,
            RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/threads/{thread_id}/messages",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<ListMessagesResponse> listMessagesSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, @PathParam("thread_id") String threadId,
            RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/threads/{thread_id}/messages/{message_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<MessageObject> getMessageSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, @PathParam("thread_id") String threadId,
            @PathParam("message_id") String messageId, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/threads/{thread_id}/messages/{message_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<MessageObject> modifyMessageSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, @PathParam("thread_id") String threadId,
            @PathParam("message_id") String messageId, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") BinaryData requestBody, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.DELETE,
            path = "/threads/{thread_id}/messages/{message_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<DeleteMessageResponse> deleteMessageSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, @PathParam("thread_id") String threadId,
            @PathParam("message_id") String messageId, RequestOptions requestOptions);
    }

    /**
     * Create a message.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     role: String(user/assistant) (Required)
     *     content (Required): [
     *          (Required){
     *         }
     *     ]
     *     attachments (Optional): [
     *          (Optional){
     *             file_id: String (Required)
     *             tools (Required): [
     *                 BinaryData (Required)
     *             ]
     *         }
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a message within a [thread](/docs/api-reference/threads).
     */
    public Response<MessageObject> createMessageWithResponse(String threadId, BinaryData requestBody,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        final String contentType = "application/json";
        return service.createMessageSync(this.getEndpoint(), accept, threadId, contentType, requestBody,
            requestOptions);
    }

    /**
     * Returns a list of messages for a given thread.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the
     * default is 20.</td></tr>
     * <tr><td>order</td><td>String</td><td>No</td><td>Sort order by the `created_at` timestamp of the objects. `asc`
     * for ascending order and`desc`
     * for descending order. Allowed values: "asc", "desc".</td></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>A cursor for use in pagination. `after` is an object ID that
     * defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include after=obj_foo in order to fetch the next page of the list.</td></tr>
     * <tr><td>before</td><td>String</td><td>No</td><td>A cursor for use in pagination. `before` is an object ID that
     * defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include before=obj_foo in order to fetch the previous page of the list.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<ListMessagesResponse> listMessagesWithResponse(String threadId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listMessagesSync(this.getEndpoint(), accept, threadId, requestOptions);
    }

    /**
     * Retrieve a message.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a message within a [thread](/docs/api-reference/threads).
     */
    public Response<MessageObject> getMessageWithResponse(String threadId, String messageId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getMessageSync(this.getEndpoint(), accept, threadId, messageId, requestOptions);
    }

    /**
     * Modifies a message.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a message within a [thread](/docs/api-reference/threads).
     */
    public Response<MessageObject> modifyMessageWithResponse(String threadId, String messageId, BinaryData requestBody,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        final String contentType = "application/json";
        return service.modifyMessageSync(this.getEndpoint(), accept, threadId, messageId, contentType, requestBody,
            requestOptions);
    }

    /**
     * Deletes a message.
     * 
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<DeleteMessageResponse> deleteMessageWithResponse(String threadId, String messageId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteMessageSync(this.getEndpoint(), accept, threadId, messageId, requestOptions);
    }
}
