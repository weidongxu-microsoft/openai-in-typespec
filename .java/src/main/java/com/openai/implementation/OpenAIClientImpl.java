// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;

/**
 * Initializes a new instance of the OpenAIClient type.
 */
public final class OpenAIClientImpl {
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
     * Initializes an instance of OpenAIClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Service host.
     */
    public OpenAIClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this.endpoint = "https://api.openai.com/v1";
        this.httpPipeline = httpPipeline;
    }

    /**
     * Gets an instance of AudioImpl class.
     * 
     * @return an instance of AudioImplclass.
     */
    public AudioImpl getAudio() {
        return new AudioImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of AssistantsImpl class.
     * 
     * @return an instance of AssistantsImplclass.
     */
    public AssistantsImpl getAssistants() {
        return new AssistantsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of BatchesImpl class.
     * 
     * @return an instance of BatchesImplclass.
     */
    public BatchesImpl getBatches() {
        return new BatchesImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of ChatImpl class.
     * 
     * @return an instance of ChatImplclass.
     */
    public ChatImpl getChat() {
        return new ChatImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of CompletionsImpl class.
     * 
     * @return an instance of CompletionsImplclass.
     */
    public CompletionsImpl getCompletions() {
        return new CompletionsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of EmbeddingsImpl class.
     * 
     * @return an instance of EmbeddingsImplclass.
     */
    public EmbeddingsImpl getEmbeddings() {
        return new EmbeddingsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of FilesImpl class.
     * 
     * @return an instance of FilesImplclass.
     */
    public FilesImpl getFiles() {
        return new FilesImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of FineTuningImpl class.
     * 
     * @return an instance of FineTuningImplclass.
     */
    public FineTuningImpl getFineTuning() {
        return new FineTuningImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of ImagesImpl class.
     * 
     * @return an instance of ImagesImplclass.
     */
    public ImagesImpl getImages() {
        return new ImagesImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of MessagesImpl class.
     * 
     * @return an instance of MessagesImplclass.
     */
    public MessagesImpl getMessages() {
        return new MessagesImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of ModelsImpl class.
     * 
     * @return an instance of ModelsImplclass.
     */
    public ModelsImpl getModels() {
        return new ModelsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of ModerationsImpl class.
     * 
     * @return an instance of ModerationsImplclass.
     */
    public ModerationsImpl getModerations() {
        return new ModerationsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of RealtimeImpl class.
     * 
     * @return an instance of RealtimeImplclass.
     */
    public RealtimeImpl getRealtime() {
        return new RealtimeImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of ThreadsImpl class.
     * 
     * @return an instance of ThreadsImplclass.
     */
    public ThreadsImpl getThreads() {
        return new ThreadsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of RunsImpl class.
     * 
     * @return an instance of RunsImplclass.
     */
    public RunsImpl getRuns() {
        return new RunsImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of VectorStoresImpl class.
     * 
     * @return an instance of VectorStoresImplclass.
     */
    public VectorStoresImpl getVectorStores() {
        return new VectorStoresImpl(this.httpPipeline, this.endpoint);
    }

    /**
     * Gets an instance of UploadsImpl class.
     * 
     * @return an instance of UploadsImplclass.
     */
    public UploadsImpl getUploads() {
        return new UploadsImpl(this.httpPipeline, this.endpoint);
    }
}
