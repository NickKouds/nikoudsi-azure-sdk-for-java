// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIntegrationRuntimeTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Managed integration runtime, including managed elastic and managed dedicated integration runtimes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Managed")
@Fluent
public final class ManagedIntegrationRuntime extends IntegrationRuntime {
    /*
     * Integration runtime state, only valid for managed dedicated integration
     * runtime.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeState state;

    /*
     * Managed integration runtime properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ManagedIntegrationRuntimeTypeProperties innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();

    /*
     * Managed Virtual Network reference.
     */
    @JsonProperty(value = "managedVirtualNetwork")
    private ManagedVirtualNetworkReference managedVirtualNetwork;

    /**
     * Get the state property: Integration runtime state, only valid for managed dedicated integration runtime.
     *
     * @return the state value.
     */
    public IntegrationRuntimeState state() {
        return this.state;
    }

    /**
     * Get the innerTypeProperties property: Managed integration runtime properties.
     *
     * @return the innerTypeProperties value.
     */
    private ManagedIntegrationRuntimeTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the managedVirtualNetwork property: Managed Virtual Network reference.
     *
     * @return the managedVirtualNetwork value.
     */
    public ManagedVirtualNetworkReference managedVirtualNetwork() {
        return this.managedVirtualNetwork;
    }

    /**
     * Set the managedVirtualNetwork property: Managed Virtual Network reference.
     *
     * @param managedVirtualNetwork the managedVirtualNetwork value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withManagedVirtualNetwork(ManagedVirtualNetworkReference managedVirtualNetwork) {
        this.managedVirtualNetwork = managedVirtualNetwork;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedIntegrationRuntime withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Get the computeProperties property: The compute resource for managed integration runtime.
     *
     * @return the computeProperties value.
     */
    public IntegrationRuntimeComputeProperties computeProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().computeProperties();
    }

    /**
     * Set the computeProperties property: The compute resource for managed integration runtime.
     *
     * @param computeProperties the computeProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withComputeProperties(IntegrationRuntimeComputeProperties computeProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withComputeProperties(computeProperties);
        return this;
    }

    /**
     * Get the ssisProperties property: SSIS properties for managed integration runtime.
     *
     * @return the ssisProperties value.
     */
    public IntegrationRuntimeSsisProperties ssisProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().ssisProperties();
    }

    /**
     * Set the ssisProperties property: SSIS properties for managed integration runtime.
     *
     * @param ssisProperties the ssisProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withSsisProperties(IntegrationRuntimeSsisProperties ssisProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withSsisProperties(ssisProperties);
        return this;
    }

    /**
     * Get the customerVirtualNetwork property: The name of virtual network to which Azure-SSIS integration runtime will
     * join.
     *
     * @return the customerVirtualNetwork value.
     */
    public IntegrationRuntimeCustomerVirtualNetwork customerVirtualNetwork() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().customerVirtualNetwork();
    }

    /**
     * Set the customerVirtualNetwork property: The name of virtual network to which Azure-SSIS integration runtime will
     * join.
     *
     * @param customerVirtualNetwork the customerVirtualNetwork value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withCustomerVirtualNetwork(
        IntegrationRuntimeCustomerVirtualNetwork customerVirtualNetwork) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withCustomerVirtualNetwork(customerVirtualNetwork);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model ManagedIntegrationRuntime"));
        } else {
            innerTypeProperties().validate();
        }
        if (managedVirtualNetwork() != null) {
            managedVirtualNetwork().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedIntegrationRuntime.class);
}
