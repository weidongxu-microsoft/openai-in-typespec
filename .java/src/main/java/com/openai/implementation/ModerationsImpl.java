// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.CreateModerationResponse;
import io.clientcore.core.annotation.ServiceInterface;
import io.clientcore.core.http.RestProxy;
import io.clientcore.core.http.annotation.BodyParam;
import io.clientcore.core.http.annotation.HeaderParam;
import io.clientcore.core.http.annotation.HostParam;
import io.clientcore.core.http.annotation.HttpRequestInformation;
import io.clientcore.core.http.annotation.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the Moderations type.
 */
public final class ModerationsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ModerationsService service;

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
     * Initializes an instance of Moderations client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Service host.
     */
    public ModerationsImpl(HttpPipeline httpPipeline, String endpoint) {
        this.endpoint = "https://api.openai.com/v1";
        this.httpPipeline = httpPipeline;
        this.service = RestProxy.create(ModerationsService.class, this.httpPipeline);
    }

    /**
     * The interface defining all the services for Moderations to be used by the proxy service to perform REST calls.
     */
    @ServiceInterface(name = "Moderations", host = "{endpoint}")
    public interface ModerationsService {
        @HttpRequestInformation(method = HttpMethod.POST, path = "/moderations", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<CreateModerationResponse> createModerationSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") BinaryData requestBody, RequestOptions requestOptions);
    }

    /**
     * Classifies if text is potentially harmful.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     input: BinaryData (Required)
     *     model: String(omni-moderation-latest/omni-moderation-2024-09-26/text-moderation-latest/text-moderation-stable) (Optional)
     * }
     * }
     * </pre>
     * 
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents if a given text input is potentially harmful.
     */
    public Response<CreateModerationResponse> createModerationWithResponse(BinaryData requestBody,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        final String contentType = "application/json";
        return service.createModerationSync(this.getEndpoint(), accept, contentType, requestBody, requestOptions);
    }
}