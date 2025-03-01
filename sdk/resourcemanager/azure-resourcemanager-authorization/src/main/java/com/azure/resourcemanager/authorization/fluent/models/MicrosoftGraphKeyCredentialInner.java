// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** keyCredential. */
@Fluent
public final class MicrosoftGraphKeyCredentialInner {
    /*
     * Custom key identifier
     */
    @JsonProperty(value = "customKeyIdentifier")
    private Base64Url customKeyIdentifier;

    /*
     * Friendly name for the key. Optional.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The date and time at which the credential expires.The Timestamp type
     * represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
     * this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endDateTime;

    /*
     * The certificate's raw data in byte array converted to Base64 string; for
     * example, [System.Convert]::ToBase64String($Cert.GetRawCertData()).
     */
    @JsonProperty(value = "key")
    private Base64Url key;

    /*
     * The unique identifier (GUID) for the key.
     */
    @JsonProperty(value = "keyId")
    private UUID keyId;

    /*
     * The date and time at which the credential becomes valid.The Timestamp
     * type represents date and time information using ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * The type of key credential; for example, 'Symmetric'.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * A string that describes the purpose for which the key can be used; for
     * example, 'Verify'.
     */
    @JsonProperty(value = "usage")
    private String usage;

    /*
     * keyCredential
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the customKeyIdentifier property: Custom key identifier.
     *
     * @return the customKeyIdentifier value.
     */
    public byte[] customKeyIdentifier() {
        if (this.customKeyIdentifier == null) {
            return new byte[0];
        }
        return this.customKeyIdentifier.decodedBytes();
    }

    /**
     * Set the customKeyIdentifier property: Custom key identifier.
     *
     * @param customKeyIdentifier the customKeyIdentifier value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withCustomKeyIdentifier(byte[] customKeyIdentifier) {
        if (customKeyIdentifier == null) {
            this.customKeyIdentifier = null;
        } else {
            this.customKeyIdentifier = Base64Url.encode(CoreUtils.clone(customKeyIdentifier));
        }
        return this;
    }

    /**
     * Get the displayName property: Friendly name for the key. Optional.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Friendly name for the key. Optional.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the endDateTime property: The date and time at which the credential expires.The Timestamp type represents
     * date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: The date and time at which the credential expires.The Timestamp type represents
     * date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get the key property: The certificate's raw data in byte array converted to Base64 string; for example,
     * [System.Convert]::ToBase64String($Cert.GetRawCertData()).
     *
     * @return the key value.
     */
    public byte[] key() {
        if (this.key == null) {
            return new byte[0];
        }
        return this.key.decodedBytes();
    }

    /**
     * Set the key property: The certificate's raw data in byte array converted to Base64 string; for example,
     * [System.Convert]::ToBase64String($Cert.GetRawCertData()).
     *
     * @param key the key value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withKey(byte[] key) {
        if (key == null) {
            this.key = null;
        } else {
            this.key = Base64Url.encode(CoreUtils.clone(key));
        }
        return this;
    }

    /**
     * Get the keyId property: The unique identifier (GUID) for the key.
     *
     * @return the keyId value.
     */
    public UUID keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: The unique identifier (GUID) for the key.
     *
     * @param keyId the keyId value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withKeyId(UUID keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the startDateTime property: The date and time at which the credential becomes valid.The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The date and time at which the credential becomes valid.The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the type property: The type of key credential; for example, 'Symmetric'.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of key credential; for example, 'Symmetric'.
     *
     * @param type the type value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the usage property: A string that describes the purpose for which the key can be used; for example, 'Verify'.
     *
     * @return the usage value.
     */
    public String usage() {
        return this.usage;
    }

    /**
     * Set the usage property: A string that describes the purpose for which the key can be used; for example, 'Verify'.
     *
     * @param usage the usage value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the additionalProperties property: keyCredential.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: keyCredential.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphKeyCredentialInner object itself.
     */
    public MicrosoftGraphKeyCredentialInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
