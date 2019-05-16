# AuthApi

All URIs are relative to *https://apisim.flexscan.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthToken**](AuthApi.md#getAuthToken) | **POST** /v1/connect/login | Return auth token based on login credentials

<a name="getAuthToken"></a>
# **getAuthToken**
> InlineResponse200 getAuthToken(body)

Return auth token based on login credentials

Return auth token based on login credentials. Username and password must be informed as params.  The authentication token will be returned on the response body. Copy this token and paste into the token text input of the **AUTHORIZE** button. Once enable all other APIs will use this token to access services. Token has a limited duration, so if you receive an authorization error afetar a while, repeat this procedure to authenticate with a new token 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthApi apiInstance = new AuthApi();
Login body = new Login(); // Login | 
try {
    InlineResponse200 result = apiInstance.getAuthToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Login**](Login.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

