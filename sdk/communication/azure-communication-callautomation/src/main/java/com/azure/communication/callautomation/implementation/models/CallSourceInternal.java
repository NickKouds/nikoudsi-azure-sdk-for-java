// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CallSourceInternal model. */
@Fluent
public final class CallSourceInternal {
    /*
     * The alternate identity of the source of the call if dialing out to a
     * pstn number
     */
    @JsonProperty(value = "callerId")
    private PhoneNumberIdentifierModel callerId;

    /*
     * The identifier of the source of the call
     */
    @JsonProperty(value = "identifier", required = true)
    private CommunicationIdentifierModel identifier;

    /**
     * Get the callerId property: The alternate identity of the source of the call if dialing out to a pstn number.
     *
     * @return the callerId value.
     */
    public PhoneNumberIdentifierModel getCallerId() {
        return this.callerId;
    }

    /**
     * Set the callerId property: The alternate identity of the source of the call if dialing out to a pstn number.
     *
     * @param callerId the callerId value to set.
     * @return the CallSourceInternal object itself.
     */
    public CallSourceInternal setCallerId(PhoneNumberIdentifierModel callerId) {
        this.callerId = callerId;
        return this;
    }

    /**
     * Get the identifier property: The identifier of the source of the call.
     *
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier of the source of the call.
     *
     * @param identifier the identifier value to set.
     * @return the CallSourceInternal object itself.
     */
    public CallSourceInternal setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }
}
