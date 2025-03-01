// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters for updating a factory resource. */
@Fluent
public final class FactoryUpdateParameters {
    /*
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Managed service identity of the factory.
     */
    @JsonProperty(value = "identity")
    private FactoryIdentity identity;

    /*
     * Properties of update the factory.
     */
    @JsonProperty(value = "properties")
    private FactoryUpdateProperties innerProperties;

    /**
     * Get the tags property: The resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     *
     * @param tags the tags value to set.
     * @return the FactoryUpdateParameters object itself.
     */
    public FactoryUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Managed service identity of the factory.
     *
     * @return the identity value.
     */
    public FactoryIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity of the factory.
     *
     * @param identity the identity value to set.
     * @return the FactoryUpdateParameters object itself.
     */
    public FactoryUpdateParameters withIdentity(FactoryIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of update the factory.
     *
     * @return the innerProperties value.
     */
    private FactoryUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for the data factory.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for the data factory.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the FactoryUpdateParameters object itself.
     */
    public FactoryUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FactoryUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
