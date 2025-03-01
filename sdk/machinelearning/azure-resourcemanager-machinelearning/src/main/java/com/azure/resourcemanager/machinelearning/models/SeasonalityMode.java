// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SeasonalityMode. */
public final class SeasonalityMode extends ExpandableStringEnum<SeasonalityMode> {
    /** Static value Auto for SeasonalityMode. */
    public static final SeasonalityMode AUTO = fromString("Auto");

    /** Static value Custom for SeasonalityMode. */
    public static final SeasonalityMode CUSTOM = fromString("Custom");

    /**
     * Creates or finds a SeasonalityMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SeasonalityMode.
     */
    @JsonCreator
    public static SeasonalityMode fromString(String name) {
        return fromString(name, SeasonalityMode.class);
    }

    /**
     * Gets known SeasonalityMode values.
     *
     * @return known SeasonalityMode values.
     */
    public static Collection<SeasonalityMode> values() {
        return values(SeasonalityMode.class);
    }
}
