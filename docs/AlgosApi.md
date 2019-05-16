# AlgosApi

All URIs are relative to *https://apisim.flexscan.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editStrategy**](AlgosApi.md#editStrategy) | **PUT** /v1/algos/{ClOrdID} | Send a Algo Edition for a running strategy to Execution Server
[**executeStrategy**](AlgosApi.md#executeStrategy) | **POST** /v1/algos | Send a new Algo to Execution Server
[**executeStrategyCommand**](AlgosApi.md#executeStrategyCommand) | **POST** /v1/algos/{ClOrdID}/commands | Send a Command for a running Algo
[**getCommands**](AlgosApi.md#getCommands) | **GET** /v1/commands | Return the list of all Commands sent
[**getStrategies**](AlgosApi.md#getStrategies) | **GET** /v1/algos | Return list of Strategies created during the current day
[**getStrategy**](AlgosApi.md#getStrategy) | **GET** /v1/algos/{ClOrdID} | Return the Algo with the ClOrdID specified
[**v1CommandsPost**](AlgosApi.md#v1CommandsPost) | **POST** /v1/commands | Post a command not related with specific strategies

<a name="editStrategy"></a>
# **editStrategy**
> Error editStrategy(clOrdID, body)

Send a Algo Edition for a running strategy to Execution Server

Send a Algo Edition for a running strategy to modify strategy execution parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
UUID clOrdID = new UUID(); // UUID | The ClOrdID identified the Algo to apply the edition to
ABMessageGrddin body = new ABMessageGrddin(); // ABMessageGrddin | Strategy to execute
try {
    Error result = apiInstance.editStrategy(clOrdID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#editStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clOrdID** | [**UUID**](.md)| The ClOrdID identified the Algo to apply the edition to |
 **body** | [**ABMessageGrddin**](ABMessageGrddin.md)| Strategy to execute | [optional]

### Return type

[**Error**](Error.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#grddin, application/json#grdlin
 - **Accept**: application/json

<a name="editStrategy"></a>
# **editStrategy**
> Error editStrategy(clOrdID, body)

Send a Algo Edition for a running strategy to Execution Server

Send a Algo Edition for a running strategy to modify strategy execution parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
UUID clOrdID = new UUID(); // UUID | The ClOrdID identified the Algo to apply the edition to
ABMessageGrdlin body = new ABMessageGrdlin(); // ABMessageGrdlin | Strategy to execute
try {
    Error result = apiInstance.editStrategy(clOrdID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#editStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clOrdID** | [**UUID**](.md)| The ClOrdID identified the Algo to apply the edition to |
 **body** | [**ABMessageGrdlin**](ABMessageGrdlin.md)| Strategy to execute | [optional]

### Return type

[**Error**](Error.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#grddin, application/json#grdlin
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageSorder body = new ABMessageSorder(); // ABMessageSorder | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageSorder**](ABMessageSorder.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageFxorder body = new ABMessageFxorder(); // ABMessageFxorder | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageFxorder**](ABMessageFxorder.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageBoffer body = new ABMessageBoffer(); // ABMessageBoffer | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageBoffer**](ABMessageBoffer.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageSniper body = new ABMessageSniper(); // ABMessageSniper | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageSniper**](ABMessageSniper.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageMit body = new ABMessageMit(); // ABMessageMit | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageMit**](ABMessageMit.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageSpread body = new ABMessageSpread(); // ABMessageSpread | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageSpread**](ABMessageSpread.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageLgshort body = new ABMessageLgshort(); // ABMessageLgshort | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageLgshort**](ABMessageLgshort.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageFinanc body = new ABMessageFinanc(); // ABMessageFinanc | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageFinanc**](ABMessageFinanc.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageGrddin body = new ABMessageGrddin(); // ABMessageGrddin | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageGrddin**](ABMessageGrddin.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageGrdlin body = new ABMessageGrdlin(); // ABMessageGrdlin | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageGrdlin**](ABMessageGrdlin.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategy"></a>
# **executeStrategy**
> InlineResponse202 executeStrategy(body)

Send a new Algo to Execution Server

Send a new Strategy to the Execution Engine for execution. The strategy parameters must be infromed the request body in JSON format. &lt;br&gt;&lt;br&gt;  Select the target strategy parameters on the **Request body** dropdown and fill in with the execution parameters in order to send the strategy to execution. &lt;br&gt;&lt;br&gt;  Some parameters are filled with default values, please chech the consistency of this default values before sending the strategy request. &lt;br&gt;&lt;br&gt;  The stragey codes (that appears after the # on the dropdown values) are &lt;br&gt;&lt;br&gt;  * sorder (Single Order) * grddin (Gradiente Linear) * grdlin (Gradiente Dinamico) * spread (Spreads 2-6 pontas) * lgshort (Long &amp; Short) * financ (Financiamento) * twap (Time Weighting Average Price) * pov (Participation of Volume) * iceberg (Iceberg Order) * boffer (Best Offer) * mit (Market If Touch Order) * skew (Skew) * cvvol (Compra e Venda de Vol) * fxorder (Flex Order) * sniper (Sniper Order) * arbintf (Arbitragem Inteiro Fracionario) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
ABMessageArbintf body = new ABMessageArbintf(); // ABMessageArbintf | Strategy to execute
try {
    InlineResponse202 result = apiInstance.executeStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ABMessageArbintf**](ABMessageArbintf.md)| Strategy to execute | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json#sorder, application/json#fxorder, application/json#boffer, application/json#sniper, application/json#mit, application/json#spread, application/json#lgshort, application/json#financ, application/json#grddin, application/json#grdlin, application/json#arbintf
 - **Accept**: application/json

<a name="executeStrategyCommand"></a>
# **executeStrategyCommand**
> Error executeStrategyCommand(clOrdID, action, mark)

Send a Command for a running Algo

Execute Command available for a given algo (cancel, suspend, resume)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
UUID clOrdID = new UUID(); // UUID | The ClOrdID identified the Algo to apply the command to
String action = "action_example"; // String | 
String mark = "mark_example"; // String | 
try {
    Error result = apiInstance.executeStrategyCommand(clOrdID, action, mark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#executeStrategyCommand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clOrdID** | [**UUID**](.md)| The ClOrdID identified the Algo to apply the command to |
 **action** | **String**|  | [optional] [enum: cancel, suspend, resume]
 **mark** | **String**|  | [optional]

### Return type

[**Error**](Error.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommands"></a>
# **getCommands**
> StrategyRecords getCommands()

Return the list of all Commands sent

Return the list all Commands sent for current user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
try {
    StrategyRecords result = apiInstance.getCommands();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#getCommands");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStrategies"></a>
# **getStrategies**
> StrategyRecords getStrategies(userName, sponsor, status, strategyCode, detailed, limit)

Return list of Strategies created during the current day

By passing in the appropriate options, you can search for available strategies in the system 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
String userName = "userName_example"; // String | Filter results by UserName (ignored for non Admin users)
String sponsor = "sponsor_example"; // String | Filter results by Sponsor (ignored for non Admin users)
Integer status = 56; // Integer | Filter results by status of the strategies.  0 = NEW, 1 = WAITING_APPROVAL, 2 = SCHEDULED, 3 = RUNNING, 4 = UNBALANCED, 5 = FINISHED, 6 = CANCELING, 7 = CANCELED, 8 = SUSPENDING, 9 = SUSPENDED, 10 = PENDINGNEW
StrategyCodeT strategyCode = new StrategyCodeT(); // StrategyCodeT | Filter results by Strategy type
Integer detailed = 56; // Integer | Retrieve detailed (1) or compact (0) data
Integer limit = 56; // Integer | maximum number of records to return
try {
    StrategyRecords result = apiInstance.getStrategies(userName, sponsor, status, strategyCode, detailed, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#getStrategies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| Filter results by UserName (ignored for non Admin users) | [optional]
 **sponsor** | **String**| Filter results by Sponsor (ignored for non Admin users) | [optional]
 **status** | **Integer**| Filter results by status of the strategies.  0 &#x3D; NEW, 1 &#x3D; WAITING_APPROVAL, 2 &#x3D; SCHEDULED, 3 &#x3D; RUNNING, 4 &#x3D; UNBALANCED, 5 &#x3D; FINISHED, 6 &#x3D; CANCELING, 7 &#x3D; CANCELED, 8 &#x3D; SUSPENDING, 9 &#x3D; SUSPENDED, 10 &#x3D; PENDINGNEW | [optional] [enum: ]
 **strategyCode** | [**StrategyCodeT**](.md)| Filter results by Strategy type | [optional]
 **detailed** | **Integer**| Retrieve detailed (1) or compact (0) data | [optional] [enum: ]
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStrategy"></a>
# **getStrategy**
> StrategyRecords getStrategy(clOrdID)

Return the Algo with the ClOrdID specified

Return the Algo with the ClOrdID specified

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
UUID clOrdID = new UUID(); // UUID | The ClOrdID identified the algo to apply the edition to
try {
    StrategyRecords result = apiInstance.getStrategy(clOrdID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#getStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clOrdID** | [**UUID**](.md)| The ClOrdID identified the algo to apply the edition to |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1CommandsPost"></a>
# **v1CommandsPost**
> Error v1CommandsPost(body)

Post a command not related with specific strategies

Execute Commands non related with the flow of execution fo an Algo 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlgosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AlgosApi apiInstance = new AlgosApi();
Command body = new Command(); // Command | 
try {
    Error result = apiInstance.v1CommandsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgosApi#v1CommandsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Command**](Command.md)|  | [optional]

### Return type

[**Error**](Error.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

