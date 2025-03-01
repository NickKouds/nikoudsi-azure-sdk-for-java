// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.authorization.fluent.RoleEligibilityScheduleInstancesClient;
import com.azure.resourcemanager.authorization.fluent.models.RoleEligibilityScheduleInstanceInner;
import com.azure.resourcemanager.authorization.models.RoleEligibilityScheduleInstanceListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in RoleEligibilityScheduleInstancesClient.
 */
public final class RoleEligibilityScheduleInstancesClientImpl implements RoleEligibilityScheduleInstancesClient {
    /** The proxy service used to perform REST calls. */
    private final RoleEligibilityScheduleInstancesService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of RoleEligibilityScheduleInstancesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RoleEligibilityScheduleInstancesClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RoleEligibilityScheduleInstancesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientRoleEligibilityScheduleInstances to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface RoleEligibilityScheduleInstancesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Authorization/roleEligibilityScheduleInstances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleEligibilityScheduleInstanceListResult>> listForScope(
            @HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/{scope}/providers/Microsoft.Authorization/roleEligibilityScheduleInstances"
                + "/{roleEligibilityScheduleInstanceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleEligibilityScheduleInstanceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("roleEligibilityScheduleInstanceName") String roleEligibilityScheduleInstanceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleEligibilityScheduleInstanceListResult>> listForScopeNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleEligibilityScheduleInstanceInner>> listForScopeSinglePageAsync(
        String scope, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listForScope(this.client.getEndpoint(), scope, filter, apiVersion, accept, context))
            .<PagedResponse<RoleEligibilityScheduleInstanceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleEligibilityScheduleInstanceInner>> listForScopeSinglePageAsync(
        String scope, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listForScope(this.client.getEndpoint(), scope, filter, apiVersion, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoleEligibilityScheduleInstanceInner> listForScopeAsync(String scope, String filter) {
        return new PagedFlux<>(
            () -> listForScopeSinglePageAsync(scope, filter), nextLink -> listForScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoleEligibilityScheduleInstanceInner> listForScopeAsync(String scope) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listForScopeSinglePageAsync(scope, filter), nextLink -> listForScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RoleEligibilityScheduleInstanceInner> listForScopeAsync(
        String scope, String filter, Context context) {
        return new PagedFlux<>(
            () -> listForScopeSinglePageAsync(scope, filter, context),
            nextLink -> listForScopeNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleEligibilityScheduleInstanceInner> listForScope(String scope) {
        final String filter = null;
        return new PagedIterable<>(listForScopeAsync(scope, filter));
    }

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleEligibilityScheduleInstanceInner> listForScope(
        String scope, String filter, Context context) {
        return new PagedIterable<>(listForScopeAsync(scope, filter, context));
    }

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleEligibilityScheduleInstanceInner>> getWithResponseAsync(
        String scope, String roleEligibilityScheduleInstanceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (roleEligibilityScheduleInstanceName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter roleEligibilityScheduleInstanceName is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            scope,
                            roleEligibilityScheduleInstanceName,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RoleEligibilityScheduleInstanceInner>> getWithResponseAsync(
        String scope, String roleEligibilityScheduleInstanceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (roleEligibilityScheduleInstanceName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter roleEligibilityScheduleInstanceName is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), scope, roleEligibilityScheduleInstanceName, apiVersion, accept, context);
    }

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleEligibilityScheduleInstanceInner> getAsync(
        String scope, String roleEligibilityScheduleInstanceName) {
        return getWithResponseAsync(scope, roleEligibilityScheduleInstanceName)
            .flatMap(
                (Response<RoleEligibilityScheduleInstanceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleEligibilityScheduleInstanceInner get(String scope, String roleEligibilityScheduleInstanceName) {
        return getAsync(scope, roleEligibilityScheduleInstanceName).block();
    }

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleEligibilityScheduleInstanceInner> getWithResponse(
        String scope, String roleEligibilityScheduleInstanceName, Context context) {
        return getWithResponseAsync(scope, roleEligibilityScheduleInstanceName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instance list operation result along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleEligibilityScheduleInstanceInner>> listForScopeNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listForScopeNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<RoleEligibilityScheduleInstanceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instance list operation result along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleEligibilityScheduleInstanceInner>> listForScopeNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listForScopeNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
