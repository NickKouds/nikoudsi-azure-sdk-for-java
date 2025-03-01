// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Workload SQL Auto Protection intent item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectionIntentItemType")
@JsonTypeName("AzureWorkloadSQLAutoProtectionIntent")
@Fluent
public final class AzureWorkloadSqlAutoProtectionIntent extends AzureWorkloadAutoProtectionIntent {
    /*
     * Workload item type of the item for which intent is to be set
     */
    @JsonProperty(value = "workloadItemType")
    private WorkloadItemType workloadItemType;

    /**
     * Get the workloadItemType property: Workload item type of the item for which intent is to be set.
     *
     * @return the workloadItemType value.
     */
    public WorkloadItemType workloadItemType() {
        return this.workloadItemType;
    }

    /**
     * Set the workloadItemType property: Workload item type of the item for which intent is to be set.
     *
     * @param workloadItemType the workloadItemType value to set.
     * @return the AzureWorkloadSqlAutoProtectionIntent object itself.
     */
    public AzureWorkloadSqlAutoProtectionIntent withWorkloadItemType(WorkloadItemType workloadItemType) {
        this.workloadItemType = workloadItemType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlAutoProtectionIntent withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlAutoProtectionIntent withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlAutoProtectionIntent withItemId(String itemId) {
        super.withItemId(itemId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlAutoProtectionIntent withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlAutoProtectionIntent withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
    }
}
