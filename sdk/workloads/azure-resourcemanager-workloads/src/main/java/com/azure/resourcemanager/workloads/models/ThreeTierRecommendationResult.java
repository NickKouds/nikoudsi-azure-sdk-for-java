// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.fluent.models.SapSizingRecommendationResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The recommended configuration for a three tier SAP system. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "deploymentType")
@JsonTypeName("ThreeTier")
@Fluent
public final class ThreeTierRecommendationResult extends SapSizingRecommendationResultInner {
    /*
     * The database VM SKU.
     */
    @JsonProperty(value = "dbVmSku")
    private String dbVmSku;

    /*
     * The database server instance count.
     */
    @JsonProperty(value = "databaseInstanceCount")
    private Long databaseInstanceCount;

    /*
     * The central server VM SKU.
     */
    @JsonProperty(value = "centralServerVmSku")
    private String centralServerVmSku;

    /*
     * The central server instance count.
     */
    @JsonProperty(value = "centralServerInstanceCount")
    private Long centralServerInstanceCount;

    /*
     * The application server VM SKU.
     */
    @JsonProperty(value = "applicationServerVmSku")
    private String applicationServerVmSku;

    /*
     * The application server instance count.
     */
    @JsonProperty(value = "applicationServerInstanceCount")
    private Long applicationServerInstanceCount;

    /**
     * Get the dbVmSku property: The database VM SKU.
     *
     * @return the dbVmSku value.
     */
    public String dbVmSku() {
        return this.dbVmSku;
    }

    /**
     * Set the dbVmSku property: The database VM SKU.
     *
     * @param dbVmSku the dbVmSku value to set.
     * @return the ThreeTierRecommendationResult object itself.
     */
    public ThreeTierRecommendationResult withDbVmSku(String dbVmSku) {
        this.dbVmSku = dbVmSku;
        return this;
    }

    /**
     * Get the databaseInstanceCount property: The database server instance count.
     *
     * @return the databaseInstanceCount value.
     */
    public Long databaseInstanceCount() {
        return this.databaseInstanceCount;
    }

    /**
     * Set the databaseInstanceCount property: The database server instance count.
     *
     * @param databaseInstanceCount the databaseInstanceCount value to set.
     * @return the ThreeTierRecommendationResult object itself.
     */
    public ThreeTierRecommendationResult withDatabaseInstanceCount(Long databaseInstanceCount) {
        this.databaseInstanceCount = databaseInstanceCount;
        return this;
    }

    /**
     * Get the centralServerVmSku property: The central server VM SKU.
     *
     * @return the centralServerVmSku value.
     */
    public String centralServerVmSku() {
        return this.centralServerVmSku;
    }

    /**
     * Set the centralServerVmSku property: The central server VM SKU.
     *
     * @param centralServerVmSku the centralServerVmSku value to set.
     * @return the ThreeTierRecommendationResult object itself.
     */
    public ThreeTierRecommendationResult withCentralServerVmSku(String centralServerVmSku) {
        this.centralServerVmSku = centralServerVmSku;
        return this;
    }

    /**
     * Get the centralServerInstanceCount property: The central server instance count.
     *
     * @return the centralServerInstanceCount value.
     */
    public Long centralServerInstanceCount() {
        return this.centralServerInstanceCount;
    }

    /**
     * Set the centralServerInstanceCount property: The central server instance count.
     *
     * @param centralServerInstanceCount the centralServerInstanceCount value to set.
     * @return the ThreeTierRecommendationResult object itself.
     */
    public ThreeTierRecommendationResult withCentralServerInstanceCount(Long centralServerInstanceCount) {
        this.centralServerInstanceCount = centralServerInstanceCount;
        return this;
    }

    /**
     * Get the applicationServerVmSku property: The application server VM SKU.
     *
     * @return the applicationServerVmSku value.
     */
    public String applicationServerVmSku() {
        return this.applicationServerVmSku;
    }

    /**
     * Set the applicationServerVmSku property: The application server VM SKU.
     *
     * @param applicationServerVmSku the applicationServerVmSku value to set.
     * @return the ThreeTierRecommendationResult object itself.
     */
    public ThreeTierRecommendationResult withApplicationServerVmSku(String applicationServerVmSku) {
        this.applicationServerVmSku = applicationServerVmSku;
        return this;
    }

    /**
     * Get the applicationServerInstanceCount property: The application server instance count.
     *
     * @return the applicationServerInstanceCount value.
     */
    public Long applicationServerInstanceCount() {
        return this.applicationServerInstanceCount;
    }

    /**
     * Set the applicationServerInstanceCount property: The application server instance count.
     *
     * @param applicationServerInstanceCount the applicationServerInstanceCount value to set.
     * @return the ThreeTierRecommendationResult object itself.
     */
    public ThreeTierRecommendationResult withApplicationServerInstanceCount(Long applicationServerInstanceCount) {
        this.applicationServerInstanceCount = applicationServerInstanceCount;
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
