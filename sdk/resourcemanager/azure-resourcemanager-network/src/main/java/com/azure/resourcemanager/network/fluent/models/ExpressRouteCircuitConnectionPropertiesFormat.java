// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.models.Ipv6CircuitConnectionConfig;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the express route circuit connection. */
@Fluent
public final class ExpressRouteCircuitConnectionPropertiesFormat {
    /*
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     */
    @JsonProperty(value = "expressRouteCircuitPeering")
    private SubResource expressRouteCircuitPeering;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     */
    @JsonProperty(value = "peerExpressRouteCircuitPeering")
    private SubResource peerExpressRouteCircuitPeering;

    /*
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * The authorization key.
     */
    @JsonProperty(value = "authorizationKey")
    private String authorizationKey;

    /*
     * IPv6 Address PrefixProperties of the express route circuit connection.
     */
    @JsonProperty(value = "ipv6CircuitConnectionConfig")
    private Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig;

    /*
     * Express Route Circuit connection state.
     */
    @JsonProperty(value = "circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CircuitConnectionStatus circuitConnectionStatus;

    /*
     * The provisioning state of the express route circuit connection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withExpressRouteCircuitPeering(
        SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorization key.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     *
     * @return the ipv6CircuitConnectionConfig value.
     */
    public Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig;
    }

    /**
     * Set the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     *
     * @param ipv6CircuitConnectionConfig the ipv6CircuitConnectionConfig value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withIpv6CircuitConnectionConfig(
        Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig) {
        this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route circuit connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipv6CircuitConnectionConfig() != null) {
            ipv6CircuitConnectionConfig().validate();
        }
    }
}
