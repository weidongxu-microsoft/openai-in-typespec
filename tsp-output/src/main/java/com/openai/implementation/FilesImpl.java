// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.generic.core.annotation.ServiceInterface;
import com.generic.core.http.Response;
import com.generic.core.http.RestProxy;
import com.generic.core.http.annotation.BodyParam;
import com.generic.core.http.annotation.HeaderParam;
import com.generic.core.http.annotation.HttpRequestInformation;
import com.generic.core.http.annotation.PathParam;
import com.generic.core.http.annotation.UnexpectedResponseExceptionInformation;
import com.generic.core.http.exception.HttpResponseException;
import com.generic.core.http.models.HttpMethod;
import com.generic.core.http.models.RequestOptions;
import com.generic.core.models.BinaryData;
import com.generic.core.models.Context;

/**
 * An instance of this class provides access to all the operations defined in Files.
 */
public final class FilesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FilesService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of FilesImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FilesImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(FilesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientFiles to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "OpenAIClientFiles", host = "https://api.openai.com/v1")
    public interface FilesService {
        // @Multipart not supported by RestProxy
        @HttpRequestInformation(method = HttpMethod.POST, path = "/files", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionInformation
        Response<BinaryData> createFileSync(@HeaderParam("content-type") String contentType,
            @HeaderParam("accept") String accept, @BodyParam("multipart/form-data") BinaryData file,
            RequestOptions requestOptions, Context context);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/files", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionInformation
        Response<BinaryData> listFilesSync(@HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/files/{file_id}", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionInformation
        Response<BinaryData> retrieveFileSync(@PathParam("file_id") String fileId, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @HttpRequestInformation(method = HttpMethod.DELETE, path = "/files/{file_id}", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionInformation
        Response<BinaryData> deleteFileSync(@PathParam("file_id") String fileId, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/files/{file_id}/content",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionInformation(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionInformation
        Response<BinaryData> downloadFileSync(@PathParam("file_id") String fileId, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by
     * one organization can be up to 100 GB.
     * 
     * The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See
     * the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files
     * supported. The Fine-tuning API only supports `.jsonl` files.
     * 
     * Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     bytes: Long (Required)
     *     created_at: long (Required)
     *     filename: String (Required)
     *     object: String (Required)
     *     purpose: String(fine-tune/fine-tune-results/assistants/assistants_output) (Required)
     *     status: String(uploaded/processed/error) (Required)
     *     status_details: String (Optional)
     * }
     * }</pre>
     * 
     * @param file The file parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the `File` object represents a document that has been uploaded to OpenAI.
     */
    public Response<BinaryData> createFileWithResponse(BinaryData file, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        final String accept = "application/json";
        return service.createFileSync(contentType, accept, file, requestOptions, Context.NONE);
    }

    /**
     * Returns a list of files that belong to the user's organization.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>purpose</td><td>String</td><td>No</td><td>Only return files with the given purpose.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     data (Required): [
     *          (Required){
     *             id: String (Required)
     *             bytes: Long (Required)
     *             created_at: long (Required)
     *             filename: String (Required)
     *             object: String (Required)
     *             purpose: String(fine-tune/fine-tune-results/assistants/assistants_output) (Required)
     *             status: String(uploaded/processed/error) (Required)
     *             status_details: String (Optional)
     *         }
     *     ]
     *     object: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<BinaryData> listFilesWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listFilesSync(accept, requestOptions, Context.NONE);
    }

    /**
     * Returns information about a specific file.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     bytes: Long (Required)
     *     created_at: long (Required)
     *     filename: String (Required)
     *     object: String (Required)
     *     purpose: String(fine-tune/fine-tune-results/assistants/assistants_output) (Required)
     *     status: String(uploaded/processed/error) (Required)
     *     status_details: String (Optional)
     * }
     * }</pre>
     * 
     * @param fileId The ID of the file to use for this request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the `File` object represents a document that has been uploaded to OpenAI.
     */
    public Response<BinaryData> retrieveFileWithResponse(String fileId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.retrieveFileSync(fileId, accept, requestOptions, Context.NONE);
    }

    /**
     * Delete a file.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     object: String (Required)
     *     deleted: boolean (Required)
     * }
     * }</pre>
     * 
     * @param fileId The ID of the file to use for this request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<BinaryData> deleteFileWithResponse(String fileId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteFileSync(fileId, accept, requestOptions, Context.NONE);
    }

    /**
     * Returns the contents of the specified file.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param fileId The ID of the file to use for this request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return a sequence of textual characters.
     */
    public Response<BinaryData> downloadFileWithResponse(String fileId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.downloadFileSync(fileId, accept, requestOptions, Context.NONE);
    }
}