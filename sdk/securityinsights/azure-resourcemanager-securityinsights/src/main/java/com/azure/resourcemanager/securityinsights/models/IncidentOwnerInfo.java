// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Information on the user an incident is assigned to. */
@Fluent
public final class IncidentOwnerInfo {
    /*
     * The email of the user the incident is assigned to.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * The name of the user the incident is assigned to.
     */
    @JsonProperty(value = "assignedTo")
    private String assignedTo;

    /*
     * The object id of the user the incident is assigned to.
     */
    @JsonProperty(value = "objectId")
    private UUID objectId;

    /*
     * The user principal name of the user the incident is assigned to.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /*
     * The type of the owner the incident is assigned to.
     */
    @JsonProperty(value = "ownerType", access = JsonProperty.Access.WRITE_ONLY)
    private OwnerType ownerType;

    /**
     * Get the email property: The email of the user the incident is assigned to.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: The email of the user the incident is assigned to.
     *
     * @param email the email value to set.
     * @return the IncidentOwnerInfo object itself.
     */
    public IncidentOwnerInfo withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the assignedTo property: The name of the user the incident is assigned to.
     *
     * @return the assignedTo value.
     */
    public String assignedTo() {
        return this.assignedTo;
    }

    /**
     * Set the assignedTo property: The name of the user the incident is assigned to.
     *
     * @param assignedTo the assignedTo value to set.
     * @return the IncidentOwnerInfo object itself.
     */
    public IncidentOwnerInfo withAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    /**
     * Get the objectId property: The object id of the user the incident is assigned to.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The object id of the user the incident is assigned to.
     *
     * @param objectId the objectId value to set.
     * @return the IncidentOwnerInfo object itself.
     */
    public IncidentOwnerInfo withObjectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the userPrincipalName property: The user principal name of the user the incident is assigned to.
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName property: The user principal name of the user the incident is assigned to.
     *
     * @param userPrincipalName the userPrincipalName value to set.
     * @return the IncidentOwnerInfo object itself.
     */
    public IncidentOwnerInfo withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the ownerType property: The type of the owner the incident is assigned to.
     *
     * @return the ownerType value.
     */
    public OwnerType ownerType() {
        return this.ownerType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
