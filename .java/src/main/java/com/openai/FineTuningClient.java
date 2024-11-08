// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.FineTuningImpl;
import com.openai.models.CreateFineTuningJobRequest;
import com.openai.models.FineTuningJob;
import com.openai.models.ListFineTuningJobCheckpointsResponse;
import com.openai.models.ListFineTuningJobEventsResponse;
import com.openai.models.ListPaginatedFineTuningJobsResponse;
import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.ServiceClient;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the synchronous FineTuning type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class FineTuningClient {
    @Metadata(generated = true)
    private final FineTuningImpl serviceClient;

    /**
     * Initializes an instance of FineTuningClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    FineTuningClient(FineTuningImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.
     * 
     * Response includes details of the enqueued job including job status and the name of the fine-tuned models once
     * complete.
     * 
     * [Learn more about fine-tuning](/docs/guides/fine-tuning).
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     model: String(babbage-002/davinci-002/gpt-3.5-turbo/gpt-4o-mini) (Required)
     *     training_file: String (Required)
     *     hyperparameters (Optional): {
     *         n_epochs: BinaryData (Optional)
     *         batch_size: BinaryData (Optional)
     *         learning_rate_multiplier: BinaryData (Optional)
     *     }
     *     suffix: String (Optional)
     *     validation_file: String (Optional)
     *     integrations (Optional): [
     *          (Optional){
     *             type: String (Required)
     *         }
     *     ]
     *     seed: Integer (Optional)
     * }
     * }
     * </pre>
     * 
     * @param requestBody The requestBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
     */
    @Metadata(generated = true)
    public Response<FineTuningJob> createFineTuningJobWithResponse(BinaryData requestBody,
        RequestOptions requestOptions) {
        return this.serviceClient.createFineTuningJobWithResponse(requestBody, requestOptions);
    }

    /**
     * List your organization's fine-tuning jobs.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>Identifier for the last job from the previous pagination
     * request.</td></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>Number of fine-tuning jobs to retrieve.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListPaginatedFineTuningJobsResponse>
        listPaginatedFineTuningJobsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.listPaginatedFineTuningJobsWithResponse(requestOptions);
    }

    /**
     * Get info about a fine-tuning job.
     * 
     * [Learn more about fine-tuning](/docs/guides/fine-tuning).
     * 
     * @param fineTuningJobId The ID of the fine-tuning job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return info about a fine-tuning job.
     * 
     * [Learn more about fine-tuning](/docs/guides/fine-tuning).
     */
    @Metadata(generated = true)
    public Response<FineTuningJob> retrieveFineTuningJobWithResponse(String fineTuningJobId,
        RequestOptions requestOptions) {
        return this.serviceClient.retrieveFineTuningJobWithResponse(fineTuningJobId, requestOptions);
    }

    /**
     * Immediately cancel a fine-tune job.
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
     */
    @Metadata(generated = true)
    public Response<FineTuningJob> cancelFineTuningJobWithResponse(String fineTuningJobId,
        RequestOptions requestOptions) {
        return this.serviceClient.cancelFineTuningJobWithResponse(fineTuningJobId, requestOptions);
    }

    /**
     * List the checkpoints for a fine-tuning job.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>Identifier for the last checkpoint ID from the previous
     * pagination request.</td></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>Number of checkpoints to retrieve.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListFineTuningJobCheckpointsResponse>
        listFineTuningJobCheckpointsWithResponse(String fineTuningJobId, RequestOptions requestOptions) {
        return this.serviceClient.listFineTuningJobCheckpointsWithResponse(fineTuningJobId, requestOptions);
    }

    /**
     * Get status updates for a fine-tuning job.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>Identifier for the last event from the previous pagination
     * request.</td></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>Number of events to retrieve.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return status updates for a fine-tuning job.
     */
    @Metadata(generated = true)
    public Response<ListFineTuningJobEventsResponse> listFineTuningEventsWithResponse(String fineTuningJobId,
        RequestOptions requestOptions) {
        return this.serviceClient.listFineTuningEventsWithResponse(fineTuningJobId, requestOptions);
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.
     * 
     * Response includes details of the enqueued job including job status and the name of the fine-tuned models once
     * complete.
     * 
     * [Learn more about fine-tuning](/docs/guides/fine-tuning).
     * 
     * @param requestBody The requestBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
     */
    @Metadata(generated = true)
    public FineTuningJob createFineTuningJob(CreateFineTuningJobRequest requestBody) {
        // Generated convenience method for createFineTuningJobWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createFineTuningJobWithResponse(BinaryData.fromObject(requestBody), requestOptions).getValue();
    }

    /**
     * List your organization's fine-tuning jobs.
     * 
     * @param after Identifier for the last job from the previous pagination request.
     * @param limit Number of fine-tuning jobs to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(String after, Integer limit) {
        // Generated convenience method for listPaginatedFineTuningJobsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (after != null) {
            requestOptions.addQueryParam("after", after);
        }
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit));
        }
        return listPaginatedFineTuningJobsWithResponse(requestOptions).getValue();
    }

    /**
     * List your organization's fine-tuning jobs.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs() {
        // Generated convenience method for listPaginatedFineTuningJobsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listPaginatedFineTuningJobsWithResponse(requestOptions).getValue();
    }

    /**
     * Get info about a fine-tuning job.
     * 
     * [Learn more about fine-tuning](/docs/guides/fine-tuning).
     * 
     * @param fineTuningJobId The ID of the fine-tuning job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return info about a fine-tuning job.
     * 
     * [Learn more about fine-tuning](/docs/guides/fine-tuning).
     */
    @Metadata(generated = true)
    public FineTuningJob retrieveFineTuningJob(String fineTuningJobId) {
        // Generated convenience method for retrieveFineTuningJobWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return retrieveFineTuningJobWithResponse(fineTuningJobId, requestOptions).getValue();
    }

    /**
     * Immediately cancel a fine-tune job.
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
     */
    @Metadata(generated = true)
    public FineTuningJob cancelFineTuningJob(String fineTuningJobId) {
        // Generated convenience method for cancelFineTuningJobWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return cancelFineTuningJobWithResponse(fineTuningJobId, requestOptions).getValue();
    }

    /**
     * List the checkpoints for a fine-tuning job.
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.
     * @param after Identifier for the last checkpoint ID from the previous pagination request.
     * @param limit Number of checkpoints to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(String fineTuningJobId, String after,
        Integer limit) {
        // Generated convenience method for listFineTuningJobCheckpointsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (after != null) {
            requestOptions.addQueryParam("after", after);
        }
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit));
        }
        return listFineTuningJobCheckpointsWithResponse(fineTuningJobId, requestOptions).getValue();
    }

    /**
     * List the checkpoints for a fine-tuning job.
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(String fineTuningJobId) {
        // Generated convenience method for listFineTuningJobCheckpointsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listFineTuningJobCheckpointsWithResponse(fineTuningJobId, requestOptions).getValue();
    }

    /**
     * Get status updates for a fine-tuning job.
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.
     * @param after Identifier for the last event from the previous pagination request.
     * @param limit Number of events to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status updates for a fine-tuning job.
     */
    @Metadata(generated = true)
    public ListFineTuningJobEventsResponse listFineTuningEvents(String fineTuningJobId, String after, Integer limit) {
        // Generated convenience method for listFineTuningEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (after != null) {
            requestOptions.addQueryParam("after", after);
        }
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit));
        }
        return listFineTuningEventsWithResponse(fineTuningJobId, requestOptions).getValue();
    }

    /**
     * Get status updates for a fine-tuning job.
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status updates for a fine-tuning job.
     */
    @Metadata(generated = true)
    public ListFineTuningJobEventsResponse listFineTuningEvents(String fineTuningJobId) {
        // Generated convenience method for listFineTuningEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listFineTuningEventsWithResponse(fineTuningJobId, requestOptions).getValue();
    }
}
