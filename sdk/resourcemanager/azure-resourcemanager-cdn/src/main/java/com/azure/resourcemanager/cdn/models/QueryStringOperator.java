// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes operator to be matched. */
public final class QueryStringOperator extends ExpandableStringEnum<QueryStringOperator> {
    /** Static value Any for QueryStringOperator. */
    public static final QueryStringOperator ANY = fromString("Any");

    /** Static value Equal for QueryStringOperator. */
    public static final QueryStringOperator EQUAL = fromString("Equal");

    /** Static value Contains for QueryStringOperator. */
    public static final QueryStringOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for QueryStringOperator. */
    public static final QueryStringOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for QueryStringOperator. */
    public static final QueryStringOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for QueryStringOperator. */
    public static final QueryStringOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for QueryStringOperator. */
    public static final QueryStringOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for QueryStringOperator. */
    public static final QueryStringOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for QueryStringOperator. */
    public static final QueryStringOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for QueryStringOperator. */
    public static final QueryStringOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a QueryStringOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryStringOperator.
     */
    @JsonCreator
    public static QueryStringOperator fromString(String name) {
        return fromString(name, QueryStringOperator.class);
    }

    /**
     * Gets known QueryStringOperator values.
     *
     * @return known QueryStringOperator values.
     */
    public static Collection<QueryStringOperator> values() {
        return values(QueryStringOperator.class);
    }
}
