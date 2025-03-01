// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayRoutingRulePropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Routing rule of an application gateway. */
@Fluent
public final class ApplicationGatewayRoutingRule extends SubResource {
    /*
     * Properties of the application gateway routing rule.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayRoutingRulePropertiesFormat innerProperties;

    /*
     * Name of the routing rule that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the application gateway routing rule.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayRoutingRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the routing rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the routing rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRoutingRule object itself.
     */
    public ApplicationGatewayRoutingRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayRoutingRule withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the ruleType property: Rule type.
     *
     * @return the ruleType value.
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleType();
    }

    /**
     * Set the ruleType property: Rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the ApplicationGatewayRoutingRule object itself.
     */
    public ApplicationGatewayRoutingRule withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRoutingRulePropertiesFormat();
        }
        this.innerProperties().withRuleType(ruleType);
        return this;
    }

    /**
     * Get the priority property: Priority of the routing rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of the routing rule.
     *
     * @param priority the priority value to set.
     * @return the ApplicationGatewayRoutingRule object itself.
     */
    public ApplicationGatewayRoutingRule withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRoutingRulePropertiesFormat();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPool();
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayRoutingRule object itself.
     */
    public ApplicationGatewayRoutingRule withBackendAddressPool(SubResource backendAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRoutingRulePropertiesFormat();
        }
        this.innerProperties().withBackendAddressPool(backendAddressPool);
        return this;
    }

    /**
     * Get the backendSettings property: Backend settings resource of the application gateway.
     *
     * @return the backendSettings value.
     */
    public SubResource backendSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().backendSettings();
    }

    /**
     * Set the backendSettings property: Backend settings resource of the application gateway.
     *
     * @param backendSettings the backendSettings value to set.
     * @return the ApplicationGatewayRoutingRule object itself.
     */
    public ApplicationGatewayRoutingRule withBackendSettings(SubResource backendSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRoutingRulePropertiesFormat();
        }
        this.innerProperties().withBackendSettings(backendSettings);
        return this;
    }

    /**
     * Get the listener property: Listener resource of the application gateway.
     *
     * @return the listener value.
     */
    public SubResource listener() {
        return this.innerProperties() == null ? null : this.innerProperties().listener();
    }

    /**
     * Set the listener property: Listener resource of the application gateway.
     *
     * @param listener the listener value to set.
     * @return the ApplicationGatewayRoutingRule object itself.
     */
    public ApplicationGatewayRoutingRule withListener(SubResource listener) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRoutingRulePropertiesFormat();
        }
        this.innerProperties().withListener(listener);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the request routing rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
