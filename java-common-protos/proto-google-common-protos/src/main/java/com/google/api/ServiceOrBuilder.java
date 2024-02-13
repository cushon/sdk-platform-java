/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/service.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The service name, which is a DNS-like logical identifier for the
   * service, such as `calendar.googleapis.com`. The service name
   * typically goes through DNS verification to make sure the owner
   * of the service also owns the DNS name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The service name, which is a DNS-like logical identifier for the
   * service, such as `calendar.googleapis.com`. The service name
   * typically goes through DNS verification to make sure the owner
   * of the service also owns the DNS name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The product title for this service, it is the name displayed in Google
   * Cloud Console.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * The product title for this service, it is the name displayed in Google
   * Cloud Console.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The Google project that owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 22;</code>
   *
   * @return The producerProjectId.
   */
  java.lang.String getProducerProjectId();
  /**
   *
   *
   * <pre>
   * The Google project that owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 22;</code>
   *
   * @return The bytes for producerProjectId.
   */
  com.google.protobuf.ByteString getProducerProjectIdBytes();

  /**
   *
   *
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. Must be no longer than 63 characters
   * and only lower case letters, digits, '.', '_' and '-' are allowed. If
   * empty, the server may choose to generate one instead.
   * </pre>
   *
   * <code>string id = 33;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. Must be no longer than 63 characters
   * and only lower case letters, digits, '.', '_' and '-' are allowed. If
   * empty, the server may choose to generate one instead.
   * </pre>
   *
   * <code>string id = 33;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by
   * the configuration author, as the remaining fields will be derived from the
   * IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  java.util.List<com.google.protobuf.Api> getApisList();
  /**
   *
   *
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by
   * the configuration author, as the remaining fields will be derived from the
   * IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  com.google.protobuf.Api getApis(int index);
  /**
   *
   *
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by
   * the configuration author, as the remaining fields will be derived from the
   * IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  int getApisCount();
  /**
   *
   *
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by
   * the configuration author, as the remaining fields will be derived from the
   * IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.ApiOrBuilder> getApisOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by
   * the configuration author, as the remaining fields will be derived from the
   * IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  com.google.protobuf.ApiOrBuilder getApisOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are automatically
   * included.  Messages which are not referenced but shall be included, such as
   * types used by the `google.protobuf.Any` type, should be listed here by
   * name by the configuration author. Example:
   *
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  java.util.List<com.google.protobuf.Type> getTypesList();
  /**
   *
   *
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are automatically
   * included.  Messages which are not referenced but shall be included, such as
   * types used by the `google.protobuf.Any` type, should be listed here by
   * name by the configuration author. Example:
   *
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  com.google.protobuf.Type getTypes(int index);
  /**
   *
   *
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are automatically
   * included.  Messages which are not referenced but shall be included, such as
   * types used by the `google.protobuf.Any` type, should be listed here by
   * name by the configuration author. Example:
   *
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  int getTypesCount();
  /**
   *
   *
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are automatically
   * included.  Messages which are not referenced but shall be included, such as
   * types used by the `google.protobuf.Any` type, should be listed here by
   * name by the configuration author. Example:
   *
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.TypeOrBuilder> getTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are automatically
   * included.  Messages which are not referenced but shall be included, such as
   * types used by the `google.protobuf.Any` type, should be listed here by
   * name by the configuration author. Example:
   *
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  com.google.protobuf.TypeOrBuilder getTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of all enum types included in this API service.  Enums referenced
   * directly or indirectly by the `apis` are automatically included.  Enums
   * which are not referenced but shall be included should be listed here by
   * name by the configuration author. Example:
   *
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  java.util.List<com.google.protobuf.Enum> getEnumsList();
  /**
   *
   *
   * <pre>
   * A list of all enum types included in this API service.  Enums referenced
   * directly or indirectly by the `apis` are automatically included.  Enums
   * which are not referenced but shall be included should be listed here by
   * name by the configuration author. Example:
   *
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  com.google.protobuf.Enum getEnums(int index);
  /**
   *
   *
   * <pre>
   * A list of all enum types included in this API service.  Enums referenced
   * directly or indirectly by the `apis` are automatically included.  Enums
   * which are not referenced but shall be included should be listed here by
   * name by the configuration author. Example:
   *
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  int getEnumsCount();
  /**
   *
   *
   * <pre>
   * A list of all enum types included in this API service.  Enums referenced
   * directly or indirectly by the `apis` are automatically included.  Enums
   * which are not referenced but shall be included should be listed here by
   * name by the configuration author. Example:
   *
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.EnumOrBuilder> getEnumsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of all enum types included in this API service.  Enums referenced
   * directly or indirectly by the `apis` are automatically included.  Enums
   * which are not referenced but shall be included should be listed here by
   * name by the configuration author. Example:
   *
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  com.google.protobuf.EnumOrBuilder getEnumsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   *
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   *
   *
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   *
   * @return The documentation.
   */
  com.google.api.Documentation getDocumentation();
  /**
   *
   *
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   */
  com.google.api.DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   *
   *
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8;</code>
   *
   * @return Whether the backend field is set.
   */
  boolean hasBackend();
  /**
   *
   *
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8;</code>
   *
   * @return The backend.
   */
  com.google.api.Backend getBackend();
  /**
   *
   *
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8;</code>
   */
  com.google.api.BackendOrBuilder getBackendOrBuilder();

  /**
   *
   *
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9;</code>
   *
   * @return Whether the http field is set.
   */
  boolean hasHttp();
  /**
   *
   *
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9;</code>
   *
   * @return The http.
   */
  com.google.api.Http getHttp();
  /**
   *
   *
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9;</code>
   */
  com.google.api.HttpOrBuilder getHttpOrBuilder();

  /**
   *
   *
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   *
   * @return Whether the quota field is set.
   */
  boolean hasQuota();
  /**
   *
   *
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   *
   * @return The quota.
   */
  com.google.api.Quota getQuota();
  /**
   *
   *
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   */
  com.google.api.QuotaOrBuilder getQuotaOrBuilder();

  /**
   *
   *
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   *
   * @return Whether the authentication field is set.
   */
  boolean hasAuthentication();
  /**
   *
   *
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   *
   * @return The authentication.
   */
  com.google.api.Authentication getAuthentication();
  /**
   *
   *
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   */
  com.google.api.AuthenticationOrBuilder getAuthenticationOrBuilder();

  /**
   *
   *
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12;</code>
   *
   * @return The context.
   */
  com.google.api.Context getContext();
  /**
   *
   *
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12;</code>
   */
  com.google.api.ContextOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   *
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   *
   *
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   *
   * @return The usage.
   */
  com.google.api.Usage getUsage();
  /**
   *
   *
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   */
  com.google.api.UsageOrBuilder getUsageOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  java.util.List<com.google.api.Endpoint> getEndpointsList();
  /**
   *
   *
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  com.google.api.Endpoint getEndpoints(int index);
  /**
   *
   *
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  int getEndpointsCount();
  /**
   *
   *
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  java.util.List<? extends com.google.api.EndpointOrBuilder> getEndpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  com.google.api.EndpointOrBuilder getEndpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21;</code>
   *
   * @return Whether the control field is set.
   */
  boolean hasControl();
  /**
   *
   *
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21;</code>
   *
   * @return The control.
   */
  com.google.api.Control getControl();
  /**
   *
   *
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21;</code>
   */
  com.google.api.ControlOrBuilder getControlOrBuilder();

  /**
   *
   *
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  java.util.List<com.google.api.LogDescriptor> getLogsList();
  /**
   *
   *
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  com.google.api.LogDescriptor getLogs(int index);
  /**
   *
   *
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  int getLogsCount();
  /**
   *
   *
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  java.util.List<? extends com.google.api.LogDescriptorOrBuilder> getLogsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  com.google.api.LogDescriptorOrBuilder getLogsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  java.util.List<com.google.api.MetricDescriptor> getMetricsList();
  /**
   *
   *
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  com.google.api.MetricDescriptor getMetrics(int index);
  /**
   *
   *
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  java.util.List<? extends com.google.api.MetricDescriptorOrBuilder> getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  com.google.api.MetricDescriptorOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and
   * [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  java.util.List<com.google.api.MonitoredResourceDescriptor> getMonitoredResourcesList();
  /**
   *
   *
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and
   * [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  com.google.api.MonitoredResourceDescriptor getMonitoredResources(int index);
  /**
   *
   *
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and
   * [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  int getMonitoredResourcesCount();
  /**
   *
   *
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and
   * [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder>
      getMonitoredResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and
   * [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  com.google.api.MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26;</code>
   *
   * @return Whether the billing field is set.
   */
  boolean hasBilling();
  /**
   *
   *
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26;</code>
   *
   * @return The billing.
   */
  com.google.api.Billing getBilling();
  /**
   *
   *
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26;</code>
   */
  com.google.api.BillingOrBuilder getBillingOrBuilder();

  /**
   *
   *
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27;</code>
   *
   * @return Whether the logging field is set.
   */
  boolean hasLogging();
  /**
   *
   *
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27;</code>
   *
   * @return The logging.
   */
  com.google.api.Logging getLogging();
  /**
   *
   *
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27;</code>
   */
  com.google.api.LoggingOrBuilder getLoggingOrBuilder();

  /**
   *
   *
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   *
   * @return Whether the monitoring field is set.
   */
  boolean hasMonitoring();
  /**
   *
   *
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   *
   * @return The monitoring.
   */
  com.google.api.Monitoring getMonitoring();
  /**
   *
   *
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   */
  com.google.api.MonitoringOrBuilder getMonitoringOrBuilder();

  /**
   *
   *
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29;</code>
   *
   * @return Whether the systemParameters field is set.
   */
  boolean hasSystemParameters();
  /**
   *
   *
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29;</code>
   *
   * @return The systemParameters.
   */
  com.google.api.SystemParameters getSystemParameters();
  /**
   *
   *
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29;</code>
   */
  com.google.api.SystemParametersOrBuilder getSystemParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37;</code>
   *
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   *
   *
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37;</code>
   *
   * @return The sourceInfo.
   */
  com.google.api.SourceInfo getSourceInfo();
  /**
   *
   *
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37;</code>
   */
  com.google.api.SourceInfoOrBuilder getSourceInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings for [Google Cloud Client
   * libraries](https://cloud.google.com/apis/docs/cloud-client-libraries)
   * generated from APIs defined as protocol buffers.
   * </pre>
   *
   * <code>.google.api.Publishing publishing = 45;</code>
   *
   * @return Whether the publishing field is set.
   */
  boolean hasPublishing();
  /**
   *
   *
   * <pre>
   * Settings for [Google Cloud Client
   * libraries](https://cloud.google.com/apis/docs/cloud-client-libraries)
   * generated from APIs defined as protocol buffers.
   * </pre>
   *
   * <code>.google.api.Publishing publishing = 45;</code>
   *
   * @return The publishing.
   */
  com.google.api.Publishing getPublishing();
  /**
   *
   *
   * <pre>
   * Settings for [Google Cloud Client
   * libraries](https://cloud.google.com/apis/docs/cloud-client-libraries)
   * generated from APIs defined as protocol buffers.
   * </pre>
   *
   * <code>.google.api.Publishing publishing = 45;</code>
   */
  com.google.api.PublishingOrBuilder getPublishingOrBuilder();

  /**
   *
   *
   * <pre>
   * Obsolete. Do not use.
   *
   * This field has no semantic meaning. The service config compiler always
   * sets this field to `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20;</code>
   *
   * @return Whether the configVersion field is set.
   */
  boolean hasConfigVersion();
  /**
   *
   *
   * <pre>
   * Obsolete. Do not use.
   *
   * This field has no semantic meaning. The service config compiler always
   * sets this field to `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20;</code>
   *
   * @return The configVersion.
   */
  com.google.protobuf.UInt32Value getConfigVersion();
  /**
   *
   *
   * <pre>
   * Obsolete. Do not use.
   *
   * This field has no semantic meaning. The service config compiler always
   * sets this field to `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConfigVersionOrBuilder();
}
