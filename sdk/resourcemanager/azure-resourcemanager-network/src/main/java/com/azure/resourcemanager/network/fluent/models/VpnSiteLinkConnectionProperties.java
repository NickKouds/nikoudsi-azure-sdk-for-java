// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.GatewayCustomBgpIpAddressIpConfiguration;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VpnConnectionStatus;
import com.azure.resourcemanager.network.models.VpnLinkConnectionMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for VpnConnection. */
@Fluent
public final class VpnSiteLinkConnectionProperties {
    /*
     * Id of the connected vpn site link.
     */
    @JsonProperty(value = "vpnSiteLink")
    private SubResource vpnSiteLink;

    /*
     * Routing weight for vpn connection.
     */
    @JsonProperty(value = "routingWeight")
    private Integer routingWeight;

    /*
     * Vpn link connection mode.
     */
    @JsonProperty(value = "vpnLinkConnectionMode")
    private VpnLinkConnectionMode vpnLinkConnectionMode;

    /*
     * The connection status.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VpnConnectionStatus connectionStatus;

    /*
     * Connection protocol used for this connection.
     */
    @JsonProperty(value = "vpnConnectionProtocolType")
    private VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType;

    /*
     * Ingress bytes transferred.
     */
    @JsonProperty(value = "ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * Egress bytes transferred.
     */
    @JsonProperty(value = "egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * Expected bandwidth in MBPS.
     */
    @JsonProperty(value = "connectionBandwidth")
    private Integer connectionBandwidth;

    /*
     * SharedKey for the vpn connection.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "enableBgp")
    private Boolean enableBgp;

    /*
     * vpnGatewayCustomBgpAddresses used by this connection.
     */
    @JsonProperty(value = "vpnGatewayCustomBgpAddresses")
    private List<GatewayCustomBgpIpAddressIpConfiguration> vpnGatewayCustomBgpAddresses;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "enableRateLimiting")
    private Boolean enableRateLimiting;

    /*
     * Use local azure ip to initiate connection.
     */
    @JsonProperty(value = "useLocalAzureIpAddress")
    private Boolean useLocalAzureIpAddress;

    /*
     * The provisioning state of the VPN site link connection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * List of ingress NatRules.
     */
    @JsonProperty(value = "ingressNatRules")
    private List<SubResource> ingressNatRules;

    /*
     * List of egress NatRules.
     */
    @JsonProperty(value = "egressNatRules")
    private List<SubResource> egressNatRules;

    /**
     * Get the vpnSiteLink property: Id of the connected vpn site link.
     *
     * @return the vpnSiteLink value.
     */
    public SubResource vpnSiteLink() {
        return this.vpnSiteLink;
    }

    /**
     * Set the vpnSiteLink property: Id of the connected vpn site link.
     *
     * @param vpnSiteLink the vpnSiteLink value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withVpnSiteLink(SubResource vpnSiteLink) {
        this.vpnSiteLink = vpnSiteLink;
        return this;
    }

    /**
     * Get the routingWeight property: Routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: Routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the vpnLinkConnectionMode property: Vpn link connection mode.
     *
     * @return the vpnLinkConnectionMode value.
     */
    public VpnLinkConnectionMode vpnLinkConnectionMode() {
        return this.vpnLinkConnectionMode;
    }

    /**
     * Set the vpnLinkConnectionMode property: Vpn link connection mode.
     *
     * @param vpnLinkConnectionMode the vpnLinkConnectionMode value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withVpnLinkConnectionMode(VpnLinkConnectionMode vpnLinkConnectionMode) {
        this.vpnLinkConnectionMode = vpnLinkConnectionMode;
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType;
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withVpnConnectionProtocolType(
        VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.connectionBandwidth;
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withConnectionBandwidth(Integer connectionBandwidth) {
        this.connectionBandwidth = connectionBandwidth;
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the vpnGatewayCustomBgpAddresses property: vpnGatewayCustomBgpAddresses used by this connection.
     *
     * @return the vpnGatewayCustomBgpAddresses value.
     */
    public List<GatewayCustomBgpIpAddressIpConfiguration> vpnGatewayCustomBgpAddresses() {
        return this.vpnGatewayCustomBgpAddresses;
    }

    /**
     * Set the vpnGatewayCustomBgpAddresses property: vpnGatewayCustomBgpAddresses used by this connection.
     *
     * @param vpnGatewayCustomBgpAddresses the vpnGatewayCustomBgpAddresses value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withVpnGatewayCustomBgpAddresses(
        List<GatewayCustomBgpIpAddressIpConfiguration> vpnGatewayCustomBgpAddresses) {
        this.vpnGatewayCustomBgpAddresses = vpnGatewayCustomBgpAddresses;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.enableRateLimiting;
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withEnableRateLimiting(Boolean enableRateLimiting) {
        this.enableRateLimiting = enableRateLimiting;
        return this;
    }

    /**
     * Get the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @return the useLocalAzureIpAddress value.
     */
    public Boolean useLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress;
    }

    /**
     * Set the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @param useLocalAzureIpAddress the useLocalAzureIpAddress value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site link connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ingressNatRules property: List of ingress NatRules.
     *
     * @return the ingressNatRules value.
     */
    public List<SubResource> ingressNatRules() {
        return this.ingressNatRules;
    }

    /**
     * Set the ingressNatRules property: List of ingress NatRules.
     *
     * @param ingressNatRules the ingressNatRules value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withIngressNatRules(List<SubResource> ingressNatRules) {
        this.ingressNatRules = ingressNatRules;
        return this;
    }

    /**
     * Get the egressNatRules property: List of egress NatRules.
     *
     * @return the egressNatRules value.
     */
    public List<SubResource> egressNatRules() {
        return this.egressNatRules;
    }

    /**
     * Set the egressNatRules property: List of egress NatRules.
     *
     * @param egressNatRules the egressNatRules value to set.
     * @return the VpnSiteLinkConnectionProperties object itself.
     */
    public VpnSiteLinkConnectionProperties withEgressNatRules(List<SubResource> egressNatRules) {
        this.egressNatRules = egressNatRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vpnGatewayCustomBgpAddresses() != null) {
            vpnGatewayCustomBgpAddresses().forEach(e -> e.validate());
        }
        if (ipsecPolicies() != null) {
            ipsecPolicies().forEach(e -> e.validate());
        }
    }
}
