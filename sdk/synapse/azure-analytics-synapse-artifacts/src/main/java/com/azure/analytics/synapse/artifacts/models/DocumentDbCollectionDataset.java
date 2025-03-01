// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Microsoft Azure Document Database Collection dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DocumentDbCollection")
@JsonFlatten
@Fluent
public class DocumentDbCollectionDataset extends Dataset {
    /*
     * Document Database collection name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.collectionName", required = true)
    private Object collectionName;

    /**
     * Get the collectionName property: Document Database collection name. Type: string (or Expression with resultType
     * string).
     *
     * @return the collectionName value.
     */
    public Object getCollectionName() {
        return this.collectionName;
    }

    /**
     * Set the collectionName property: Document Database collection name. Type: string (or Expression with resultType
     * string).
     *
     * @param collectionName the collectionName value to set.
     * @return the DocumentDbCollectionDataset object itself.
     */
    public DocumentDbCollectionDataset setCollectionName(Object collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
