// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.AssistantsImpl;
import com.openai.models.AssistantObject;
import com.openai.models.CreateAssistantRequest;
import com.openai.models.DeleteAssistantResponse;
import com.openai.models.ListAssistantsRequestOrder;
import com.openai.models.ListAssistantsResponse;
import com.openai.models.ModifyAssistantRequest;
import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.ServiceClient;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the synchronous Assistants type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class AssistantsClient {
    @Metadata(generated = true)
    private final AssistantsImpl serviceClient;

    /**
     * Initializes an instance of AssistantsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    AssistantsClient(AssistantsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create an assistant with a model and instructions.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     model: String(gpt-4o/gpt-4o-2024-08-06/gpt-4o-2024-05-13/gpt-4o-mini/gpt-4o-mini-2024-07-18/gpt-4-turbo/gpt-4-turbo-2024-04-09/gpt-4-0125-preview/gpt-4-turbo-preview/gpt-4-1106-preview/gpt-4-vision-preview/gpt-4/gpt-4-0314/gpt-4-0613/gpt-4-32k/gpt-4-32k-0314/gpt-4-32k-0613/gpt-3.5-turbo/gpt-3.5-turbo-16k/gpt-3.5-turbo-0613/gpt-3.5-turbo-1106/gpt-3.5-turbo-0125/gpt-3.5-turbo-16k-0613) (Required)
     *     name: String (Optional)
     *     description: String (Optional)
     *     instructions: String (Optional)
     *     tools (Optional): [
     *          (Optional){
     *             type: String (Required)
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
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     response_format: BinaryData (Optional)
     * }
     * }
     * </pre>
     * 
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public Response<AssistantObject> createAssistantWithResponse(BinaryData requestBody,
        RequestOptions requestOptions) {
        return this.serviceClient.createAssistantWithResponse(requestBody, requestOptions);
    }

    /**
     * Returns a list of assistants.
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListAssistantsResponse> listAssistantsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.listAssistantsWithResponse(requestOptions);
    }

    /**
     * Retrieves an assistant.
     * 
     * @param assistantId The ID of the assistant to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public Response<AssistantObject> getAssistantWithResponse(String assistantId, RequestOptions requestOptions) {
        return this.serviceClient.getAssistantWithResponse(assistantId, requestOptions);
    }

    /**
     * Modifies an assistant.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     model: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     instructions: String (Optional)
     *     tools (Optional): [
     *          (Optional){
     *             type: String (Required)
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
     *         }
     *     }
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     response_format: BinaryData (Optional)
     * }
     * }
     * </pre>
     * 
     * @param assistantId The ID of the assistant to modify.
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public Response<AssistantObject> modifyAssistantWithResponse(String assistantId, BinaryData requestBody,
        RequestOptions requestOptions) {
        return this.serviceClient.modifyAssistantWithResponse(assistantId, requestBody, requestOptions);
    }

    /**
     * Delete an assistant.
     * 
     * @param assistantId The ID of the assistant to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<DeleteAssistantResponse> deleteAssistantWithResponse(String assistantId,
        RequestOptions requestOptions) {
        return this.serviceClient.deleteAssistantWithResponse(assistantId, requestOptions);
    }

    /**
     * Create an assistant with a model and instructions.
     * 
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public AssistantObject createAssistant(CreateAssistantRequest requestBody) {
        // Generated convenience method for createAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createAssistantWithResponse(BinaryData.fromObject(requestBody), requestOptions).getValue();
    }

    /**
     * Returns a list of assistants.
     * 
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 20.
     * @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and`desc`
     * for descending order.
     * @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include after=obj_foo in order to fetch the next page of the list.
     * @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include before=obj_foo in order to fetch the previous page of the list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListAssistantsResponse listAssistants(Integer limit, ListAssistantsRequestOrder order, String after,
        String before) {
        // Generated convenience method for listAssistantsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit));
        }
        if (order != null) {
            requestOptions.addQueryParam("order", order.toString());
        }
        if (after != null) {
            requestOptions.addQueryParam("after", after);
        }
        if (before != null) {
            requestOptions.addQueryParam("before", before);
        }
        return listAssistantsWithResponse(requestOptions).getValue();
    }

    /**
     * Returns a list of assistants.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListAssistantsResponse listAssistants() {
        // Generated convenience method for listAssistantsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listAssistantsWithResponse(requestOptions).getValue();
    }

    /**
     * Retrieves an assistant.
     * 
     * @param assistantId The ID of the assistant to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public AssistantObject getAssistant(String assistantId) {
        // Generated convenience method for getAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getAssistantWithResponse(assistantId, requestOptions).getValue();
    }

    /**
     * Modifies an assistant.
     * 
     * @param assistantId The ID of the assistant to modify.
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public AssistantObject modifyAssistant(String assistantId, ModifyAssistantRequest requestBody) {
        // Generated convenience method for modifyAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return modifyAssistantWithResponse(assistantId, BinaryData.fromObject(requestBody), requestOptions).getValue();
    }

    /**
     * Delete an assistant.
     * 
     * @param assistantId The ID of the assistant to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public DeleteAssistantResponse deleteAssistant(String assistantId) {
        // Generated convenience method for deleteAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteAssistantWithResponse(assistantId, requestOptions).getValue();
    }
}