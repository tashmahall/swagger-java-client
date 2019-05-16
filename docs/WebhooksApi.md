# WebhooksApi

All URIs are relative to *https://apisim.flexscan.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delWebhook**](WebhooksApi.md#delWebhook) | **DELETE** /v1/webhooks/{webhook_id} | Delete the Webhook with the given webhook_id
[**delWebhooks**](WebhooksApi.md#delWebhooks) | **DELETE** /v1/webhooks | Delete all Webhooks registered for this user
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /v1/webhooks/{webhook_id} | Return Webhooks registered with the given webhook_id
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /v1/webhooks | Return Webhooks registered for this user
[**registerWebhook**](WebhooksApi.md#registerWebhook) | **POST** /v1/webhooks | Register a new Webhook for this user

<a name="delWebhook"></a>
# **delWebhook**
> Success delWebhook(webhookId)

Delete the Webhook with the given webhook_id

Delete the Webhook with the given webhook_id registered for this user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WebhooksApi apiInstance = new WebhooksApi();
UUID webhookId = new UUID(); // UUID | The webhook identifier
try {
    Success result = apiInstance.delWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#delWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| The webhook identifier |

### Return type

[**Success**](Success.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delWebhooks"></a>
# **delWebhooks**
> Success delWebhooks()

Delete all Webhooks registered for this user

Delete all Webhooks registered for this user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WebhooksApi apiInstance = new WebhooksApi();
try {
    Success result = apiInstance.delWebhooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#delWebhooks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Success**](Success.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> getWebhook(webhookId)

Return Webhooks registered with the given webhook_id

Return Webhooks registered with the given webhook_id for the current user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WebhooksApi apiInstance = new WebhooksApi();
UUID webhookId = new UUID(); // UUID | The webhook identifier
try {
    apiInstance.getWebhook(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| The webhook identifier |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> getWebhooks()

Return Webhooks registered for this user

Return all webhooks currently registered for this user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WebhooksApi apiInstance = new WebhooksApi();
try {
    apiInstance.getWebhooks();
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerWebhook"></a>
# **registerWebhook**
> registerWebhook(body)

Register a new Webhook for this user

Register a new webhook for this User. Each user can register up to 100 webhooks.  Restriction; only one webhook is allowed for target type and target id, even if the triggers are different 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WebhooksApi apiInstance = new WebhooksApi();
Webhook body = new Webhook(); // Webhook | 
try {
    apiInstance.registerWebhook(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#registerWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Webhook**](Webhook.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

