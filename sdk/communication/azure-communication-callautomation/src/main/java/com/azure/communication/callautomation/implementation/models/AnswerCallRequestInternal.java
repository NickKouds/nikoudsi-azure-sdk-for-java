// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for answering the call. */
@Fluent
public final class AnswerCallRequestInternal {
    /*
     * The context associated with the call.
     */
    @JsonProperty(value = "incomingCallContext", required = true)
    private String incomingCallContext;

    /*
     * The callback uri.
     */
    @JsonProperty(value = "callbackUri")
    private String callbackUri;

    /*
     * Media Streaming Configuration.
     */
    @JsonProperty(value = "mediaStreamingConfiguration")
    private MediaStreamingConfigurationInternal mediaStreamingConfiguration;

    /**
     * Get the incomingCallContext property: The context associated with the call.
     *
     * @return the incomingCallContext value.
     */
    public String getIncomingCallContext() {
        return this.incomingCallContext;
    }

    /**
     * Set the incomingCallContext property: The context associated with the call.
     *
     * @param incomingCallContext the incomingCallContext value to set.
     * @return the AnswerCallRequestInternal object itself.
     */
    public AnswerCallRequestInternal setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
        return this;
    }

    /**
     * Get the callbackUri property: The callback uri.
     *
     * @return the callbackUri value.
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * Set the callbackUri property: The callback uri.
     *
     * @param callbackUri the callbackUri value to set.
     * @return the AnswerCallRequestInternal object itself.
     */
    public AnswerCallRequestInternal setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

    /**
     * Get the mediaStreamingConfiguration property: Media Streaming Configuration.
     *
     * @return the mediaStreamingConfiguration value.
     */
    public MediaStreamingConfigurationInternal getMediaStreamingConfiguration() {
        return this.mediaStreamingConfiguration;
    }

    /**
     * Set the mediaStreamingConfiguration property: Media Streaming Configuration.
     *
     * @param mediaStreamingConfiguration the mediaStreamingConfiguration value to set.
     * @return the AnswerCallRequestInternal object itself.
     */
    public AnswerCallRequestInternal setMediaStreamingConfiguration(
            MediaStreamingConfigurationInternal mediaStreamingConfiguration) {
        this.mediaStreamingConfiguration = mediaStreamingConfiguration;
        return this;
    }
}
