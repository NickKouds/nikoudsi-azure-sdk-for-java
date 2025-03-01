// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for Windows VMs in the managed cluster. */
@Fluent
public final class ManagedClusterWindowsProfile {
    /*
     * Specifies the name of the administrator account. <br><br> **Restriction:** Cannot end in "." <br><br>
     * **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1",
     * "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner",
     * "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br>
     * **Minimum-length:** 1 character <br><br> **Max-length:** 20 characters
     */
    @JsonProperty(value = "adminUsername", required = true)
    private String adminUsername;

    /*
     * Specifies the password of the administrator account. <br><br> **Minimum-length:** 8 characters <br><br>
     * **Max-length:** 123 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be
     * fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character
     * (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123",
     * "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!"
     */
    @JsonProperty(value = "adminPassword")
    private String adminPassword;

    /*
     * The license type to use for Windows VMs. See [Azure Hybrid User
     * Benefits](https://azure.microsoft.com/pricing/hybrid-benefit/faq/) for more details.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /*
     * Whether to enable CSI proxy.
     *
     * For more details on CSI proxy, see the [CSI proxy GitHub repo](https://github.com/kubernetes-csi/csi-proxy).
     */
    @JsonProperty(value = "enableCSIProxy")
    private Boolean enableCsiProxy;

    /*
     * The Windows gMSA Profile in the Managed Cluster.
     */
    @JsonProperty(value = "gmsaProfile")
    private WindowsGmsaProfile gmsaProfile;

    /**
     * Get the adminUsername property: Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator", "admin", "user",
     * "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet",
     * "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0",
     * "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length:** 1 character
     * &lt;br&gt;&lt;br&gt; **Max-length:** 20 characters.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator", "admin", "user",
     * "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet",
     * "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0",
     * "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length:** 1 character
     * &lt;br&gt;&lt;br&gt; **Max-length:** 20 characters.
     *
     * @param adminUsername the adminUsername value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the adminPassword property: Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Minimum-length:** 8 characters &lt;br&gt;&lt;br&gt; **Max-length:** 123 characters &lt;br&gt;&lt;br&gt;
     * **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters
     * &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_])
     * &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word",
     * "pass@word1", "Password!", "Password1", "Password22", "iloveyou!".
     *
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword property: Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Minimum-length:** 8 characters &lt;br&gt;&lt;br&gt; **Max-length:** 123 characters &lt;br&gt;&lt;br&gt;
     * **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters
     * &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_])
     * &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word",
     * "pass@word1", "Password!", "Password1", "Password22", "iloveyou!".
     *
     * @param adminPassword the adminPassword value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Get the licenseType property: The license type to use for Windows VMs. See [Azure Hybrid User
     * Benefits](https://azure.microsoft.com/pricing/hybrid-benefit/faq/) for more details.
     *
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type to use for Windows VMs. See [Azure Hybrid User
     * Benefits](https://azure.microsoft.com/pricing/hybrid-benefit/faq/) for more details.
     *
     * @param licenseType the licenseType value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the enableCsiProxy property: Whether to enable CSI proxy.
     *
     * <p>For more details on CSI proxy, see the [CSI proxy GitHub repo](https://github.com/kubernetes-csi/csi-proxy).
     *
     * @return the enableCsiProxy value.
     */
    public Boolean enableCsiProxy() {
        return this.enableCsiProxy;
    }

    /**
     * Set the enableCsiProxy property: Whether to enable CSI proxy.
     *
     * <p>For more details on CSI proxy, see the [CSI proxy GitHub repo](https://github.com/kubernetes-csi/csi-proxy).
     *
     * @param enableCsiProxy the enableCsiProxy value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withEnableCsiProxy(Boolean enableCsiProxy) {
        this.enableCsiProxy = enableCsiProxy;
        return this;
    }

    /**
     * Get the gmsaProfile property: The Windows gMSA Profile in the Managed Cluster.
     *
     * @return the gmsaProfile value.
     */
    public WindowsGmsaProfile gmsaProfile() {
        return this.gmsaProfile;
    }

    /**
     * Set the gmsaProfile property: The Windows gMSA Profile in the Managed Cluster.
     *
     * @param gmsaProfile the gmsaProfile value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withGmsaProfile(WindowsGmsaProfile gmsaProfile) {
        this.gmsaProfile = gmsaProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property adminUsername in model ManagedClusterWindowsProfile"));
        }
        if (gmsaProfile() != null) {
            gmsaProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedClusterWindowsProfile.class);
}
