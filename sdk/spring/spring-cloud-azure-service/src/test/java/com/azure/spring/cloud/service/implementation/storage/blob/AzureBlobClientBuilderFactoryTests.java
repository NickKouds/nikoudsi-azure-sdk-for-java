// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.service.implementation.storage.blob;

import com.azure.core.credential.AzureSasCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.HttpClientOptions;
import com.azure.spring.cloud.service.implementation.AzureHttpClientBuilderFactoryBaseTests;
import com.azure.spring.cloud.service.implementation.core.http.TestHttpClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.BlobServiceVersion;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.policy.RequestRetryOptions;
import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationMode;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 *
 */
class AzureBlobClientBuilderFactoryTests
    extends AzureHttpClientBuilderFactoryBaseTests<BlobServiceClientBuilder,
    AzureStorageBlobTestProperties,
    AzureBlobClientBuilderFactoryTests.BlobServiceClientBuilderFactoryExt> {

    private static final String ENDPOINT = "https://abc.blob.core.windows.net/";
    private static final String CUSTOMER_PROVIDED_KEY = "JdppJP5eH1w/CQ0cx4RGYWoC7NmQ0nmDbYR2PYWSDTXojV9bI1ck0Eh0sUIg8xj4KYj7tv+ZPLICu3BgLt6mMz==";
    private static final String CONNECTION_STRING = "BlobEndpoint=https://test.blob.core.windows.net/;"
        + "QueueEndpoint=https://test.queue.core.windows.net/;FileEndpoint=https://test.file.core.windows.net/;"
        + "TableEndpoint=https://test.table.core.windows.net/;SharedAccessSignature=sv=2020-08-04"
        + "&ss=bfqt&srt=sco&sp=rwdlacupitfx&se=2023-06-08T15:17:21Z&st=2021-12-27T07:17:21Z&sip=192.168.0.1"
        + "&spr=https,http&sig=test";

    @Test
    void storageSharedKeyCredentialConfigured() {
        AzureStorageBlobTestProperties properties = createMinimalServiceProperties();

        properties.setAccountKey("test-account-key");
        properties.setAccountName("test-account-name");
        final BlobServiceClientBuilder builder = new BlobServiceClientBuilderFactoryExt(properties).build();
        final BlobServiceClient client = builder.buildClient();

        verify(builder, times(1)).credential(any(StorageSharedKeyCredential.class));
    }

    @Test
    void azureSasCredentialConfigured() {
        AzureStorageBlobTestProperties properties = createMinimalServiceProperties();
        properties.setSasToken("sas-token");
        final BlobServiceClientBuilder builder = new BlobServiceClientBuilderFactoryExt(properties).build();
        final BlobServiceClient client = builder.buildClient();
        verify(builder, times(1)).credential(any(AzureSasCredential.class));
    }

    @Test
    void connectionStringConfigured() {
        AzureStorageBlobTestProperties properties = createMinimalServiceProperties();
        properties.setConnectionString(CONNECTION_STRING);
        final BlobServiceClientBuilder builder = new BlobServiceClientBuilderFactoryExt(properties).build();
        final BlobServiceClient client = builder.buildClient();
        verify(builder, times(1)).connectionString(anyString());
    }

    @Override
    protected AzureStorageBlobTestProperties createMinimalServiceProperties() {
        AzureStorageBlobTestProperties properties = new AzureStorageBlobTestProperties();
        properties.setEndpoint(ENDPOINT);
        return properties;
    }

    @Override
    protected BlobServiceClientBuilderFactoryExt createClientBuilderFactoryWithMockBuilder(AzureStorageBlobTestProperties properties) {
        return new BlobServiceClientBuilderFactoryExt(properties);
    }

    @Override
    protected void buildClient(BlobServiceClientBuilder builder) {
        builder.buildClient();
    }

    @Override
    protected void verifyServicePropertiesConfigured() {
        AzureStorageBlobTestProperties properties = new AzureStorageBlobTestProperties();
        properties.setEndpoint(ENDPOINT);
        properties.setCustomerProvidedKey(CUSTOMER_PROVIDED_KEY);
        properties.setEncryptionScope("test-scope");
        properties.setServiceVersion(BlobServiceVersion.V2019_07_07);

        final BlobServiceClientBuilder builder = new BlobServiceClientBuilderFactoryExt(properties).build();
        final BlobServiceClient client = builder.buildClient();

        verify(builder, times(1)).endpoint(ENDPOINT);
        verify(builder, times(1)).customerProvidedKey(any());
        verify(builder, times(1)).encryptionScope("test-scope");
        verify(builder, times(1)).serviceVersion(BlobServiceVersion.V2019_07_07);
    }

    @Override
    protected void verifyCredentialCalled(BlobServiceClientBuilder builder,
                                          Class<? extends TokenCredential> tokenCredentialClass,
                                          VerificationMode mode) {
        verify(builder, mode).credential(any(tokenCredentialClass));
    }

    @Override
    protected void verifyRetryOptionsCalled(BlobServiceClientBuilder builder, AzureStorageBlobTestProperties properties, VerificationMode mode) {
        verify(builder, mode).retryOptions(any(RequestRetryOptions.class));
    }

    @Override
    protected void verifyHttpClientCalled(BlobServiceClientBuilder builder, VerificationMode mode) {
        verify(builder, mode).httpClient(any(TestHttpClient.class));
    }

    @Override
    protected HttpClientOptions getHttpClientOptions(BlobServiceClientBuilderFactoryExt builderFactory) {
        return builderFactory.getHttpClientOptions();
    }

    @Override
    protected List<HttpPipelinePolicy> getHttpPipelinePolicies(BlobServiceClientBuilderFactoryExt builderFactory) {
        return builderFactory.getHttpPipelinePolicies();
    }

    static class BlobServiceClientBuilderFactoryExt extends BlobServiceClientBuilderFactory {

        BlobServiceClientBuilderFactoryExt(AzureStorageBlobTestProperties blobProperties) {
            super(blobProperties);
        }

        @Override
        public BlobServiceClientBuilder createBuilderInstance() {
            return mock(BlobServiceClientBuilder.class);
        }

        @Override
        public HttpClientOptions getHttpClientOptions() {
            return super.getHttpClientOptions();
        }

        @Override
        public List<HttpPipelinePolicy> getHttpPipelinePolicies() {
            return super.getHttpPipelinePolicies();
        }
    }

}

