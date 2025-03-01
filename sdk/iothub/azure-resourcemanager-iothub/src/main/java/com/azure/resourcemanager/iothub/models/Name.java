// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name of Iot Hub type. */
@Fluent
public final class Name {
    /*
     * IotHub type
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Localized value of name
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: IotHub type.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: IotHub type.
     *
     * @param value the value value to set.
     * @return the Name object itself.
     */
    public Name withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized value of name.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized value of name.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the Name object itself.
     */
    public Name withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
