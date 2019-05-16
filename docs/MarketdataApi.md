# MarketdataApi

All URIs are relative to *https://apisim.flexscan.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchange**](MarketdataApi.md#getExchange) | **GET** /v1/exchanges/{exchange_id} | Return the Exchange with the exchange_id specified
[**getExchangeHolidays**](MarketdataApi.md#getExchangeHolidays) | **GET** /v1/exchanges/{exchange_id}/holidays | Return the list of holidays for the Exchange
[**getExchangeInstrument**](MarketdataApi.md#getExchangeInstrument) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol} | Return an Instrument identified by symbol
[**getExchangeInstrumentDerivatives**](MarketdataApi.md#getExchangeInstrumentDerivatives) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/derivatives | Return the list of derivatives Instruments for an Instrument defined by symbol
[**getExchangeInstrumentDerivativesSymbols**](MarketdataApi.md#getExchangeInstrumentDerivativesSymbols) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/derivatives.symbols | Return the list of derivatives symbols for an Instrument defined by symbol
[**getExchangeInstrumentLastBook**](MarketdataApi.md#getExchangeInstrumentLastBook) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/books/last | Return the last book for an Instrument defined by symbol
[**getExchangeInstrumentLastQuote**](MarketdataApi.md#getExchangeInstrumentLastQuote) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/quotes/last | Return the last quote for an Instrument defined by symbol
[**getExchangeInstrumentSnapshot**](MarketdataApi.md#getExchangeInstrumentSnapshot) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/snapshot | Return the last quote snapshot from an Instrument defined by symbol
[**getExchangeInstrumentTrades**](MarketdataApi.md#getExchangeInstrumentTrades) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/trades | Return the trades for an Instrument defined by symbol
[**getExchangeInstruments**](MarketdataApi.md#getExchangeInstruments) | **GET** /v1/exchanges/{exchange_id}/instruments | Return the list of Instrument definitions available in a given Exchange
[**getExchangeMaturityDates**](MarketdataApi.md#getExchangeMaturityDates) | **GET** /v1/exchanges/{exchange_id}/maturitydates | Return the list of maturity dates of this Exchange for a type of instruments
[**getExchangeParams**](MarketdataApi.md#getExchangeParams) | **GET** /v1/exchanges/{exchange_id}/params | Return the list of Exchange parameters
[**getExchangeSymbols**](MarketdataApi.md#getExchangeSymbols) | **GET** /v1/exchanges/{exchange_id}/symbols | Return the list of symbols available in a given Exchange
[**getExchanges**](MarketdataApi.md#getExchanges) | **GET** /v1/exchanges | Return list of Exchanges available

<a name="getExchange"></a>
# **getExchange**
> StrategyRecords getExchange(exchangeId)

Return the Exchange with the exchange_id specified

Return the Exchange with the exchange_id specified

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
try {
    StrategyRecords result = apiInstance.getExchange(exchangeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeHolidays"></a>
# **getExchangeHolidays**
> StrategyRecords getExchangeHolidays(exchangeId)

Return the list of holidays for the Exchange

Return the list of holidays for the Exchange

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
try {
    StrategyRecords result = apiInstance.getExchangeHolidays(exchangeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeHolidays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrument"></a>
# **getExchangeInstrument**
> StrategyRecords getExchangeInstrument(exchangeId, symbol)

Return an Instrument identified by symbol

Return the Instrument identified by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
try {
    StrategyRecords result = apiInstance.getExchangeInstrument(exchangeId, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrumentDerivatives"></a>
# **getExchangeInstrumentDerivatives**
> StrategyRecords getExchangeInstrumentDerivatives(exchangeId, symbol, maturityDate, initStrike, endStrike, securityType, optionType, detailed)

Return the list of derivatives Instruments for an Instrument defined by symbol

Return the list of derivatives Instruments trades for an Instrument defined by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
LocalDate maturityDate = new LocalDate(); // LocalDate | 
BigDecimal initStrike = new BigDecimal(); // BigDecimal | Strike init interval to filter
BigDecimal endStrike = new BigDecimal(); // BigDecimal | Strike end interval to filter
DerivativesSecurityClassT securityType = new DerivativesSecurityClassT(); // DerivativesSecurityClassT | The type of derivatives to filter
OptionTypeT optionType = new OptionTypeT(); // OptionTypeT | ption Type parameter
Integer detailed = 56; // Integer | Retrieve detailed (1) or compact (0) data
try {
    StrategyRecords result = apiInstance.getExchangeInstrumentDerivatives(exchangeId, symbol, maturityDate, initStrike, endStrike, securityType, optionType, detailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrumentDerivatives");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |
 **maturityDate** | [**LocalDate**](.md)|  | [optional]
 **initStrike** | **BigDecimal**| Strike init interval to filter | [optional]
 **endStrike** | **BigDecimal**| Strike end interval to filter | [optional]
 **securityType** | [**DerivativesSecurityClassT**](.md)| The type of derivatives to filter | [optional]
 **optionType** | [**OptionTypeT**](.md)| ption Type parameter | [optional]
 **detailed** | **Integer**| Retrieve detailed (1) or compact (0) data | [optional] [enum: ]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrumentDerivativesSymbols"></a>
# **getExchangeInstrumentDerivativesSymbols**
> StrategyRecords getExchangeInstrumentDerivativesSymbols(exchangeId, symbol, maturityDate, initStrike, endStrike, securityType, optionType, detailed)

Return the list of derivatives symbols for an Instrument defined by symbol

Return the list of derivatives symbols for an Instrument defined by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
LocalDate maturityDate = new LocalDate(); // LocalDate | 
BigDecimal initStrike = new BigDecimal(); // BigDecimal | Strike init interval to filter
BigDecimal endStrike = new BigDecimal(); // BigDecimal | Strike end interval to filter
DerivativesSecurityClassT securityType = new DerivativesSecurityClassT(); // DerivativesSecurityClassT | The type of derivatives to filter
OptionTypeT optionType = new OptionTypeT(); // OptionTypeT | ption Type parameter
Integer detailed = 56; // Integer | Retrieve detailed (1) or compact (0) data
try {
    StrategyRecords result = apiInstance.getExchangeInstrumentDerivativesSymbols(exchangeId, symbol, maturityDate, initStrike, endStrike, securityType, optionType, detailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrumentDerivativesSymbols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |
 **maturityDate** | [**LocalDate**](.md)|  | [optional]
 **initStrike** | **BigDecimal**| Strike init interval to filter | [optional]
 **endStrike** | **BigDecimal**| Strike end interval to filter | [optional]
 **securityType** | [**DerivativesSecurityClassT**](.md)| The type of derivatives to filter | [optional]
 **optionType** | [**OptionTypeT**](.md)| ption Type parameter | [optional]
 **detailed** | **Integer**| Retrieve detailed (1) or compact (0) data | [optional] [enum: ]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrumentLastBook"></a>
# **getExchangeInstrumentLastBook**
> StrategyRecords getExchangeInstrumentLastBook(exchangeId, symbol)

Return the last book for an Instrument defined by symbol

Return the last book for an Instrument defined by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
try {
    StrategyRecords result = apiInstance.getExchangeInstrumentLastBook(exchangeId, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrumentLastBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrumentLastQuote"></a>
# **getExchangeInstrumentLastQuote**
> StrategyRecords getExchangeInstrumentLastQuote(exchangeId, symbol, detailed)

Return the last quote for an Instrument defined by symbol

Return the last quote for an Instrument defined by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
Integer detailed = 56; // Integer | Retrieve detailed (1) or compact (0) data
try {
    StrategyRecords result = apiInstance.getExchangeInstrumentLastQuote(exchangeId, symbol, detailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrumentLastQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |
 **detailed** | **Integer**| Retrieve detailed (1) or compact (0) data | [optional] [enum: ]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrumentSnapshot"></a>
# **getExchangeInstrumentSnapshot**
> StrategyRecords getExchangeInstrumentSnapshot(exchangeId, symbol, detailed)

Return the last quote snapshot from an Instrument defined by symbol

Return the last quote snapshot from an Instrument defined by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
Integer detailed = 56; // Integer | Retrieve detailed (1) or compact (0) data
try {
    StrategyRecords result = apiInstance.getExchangeInstrumentSnapshot(exchangeId, symbol, detailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrumentSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |
 **detailed** | **Integer**| Retrieve detailed (1) or compact (0) data | [optional] [enum: ]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstrumentTrades"></a>
# **getExchangeInstrumentTrades**
> StrategyRecords getExchangeInstrumentTrades(exchangeId, symbol, limit)

Return the trades for an Instrument defined by symbol

Return the trades for an Instrument defined by symbol

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
String symbol = "symbol_example"; // String | 
Integer limit = 56; // Integer | maximum number of records to return
try {
    StrategyRecords result = apiInstance.getExchangeInstrumentTrades(exchangeId, symbol, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstrumentTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **symbol** | [**String**](.md)|  |
 **limit** | **Integer**| maximum number of records to return | [optional] [enum: ]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeInstruments"></a>
# **getExchangeInstruments**
> StrategyRecords getExchangeInstruments(exchangeId, securityClass)

Return the list of Instrument definitions available in a given Exchange

Return the list of Instrument definitions available in a given Exchange

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
SecurityClassT securityClass = new SecurityClassT(); // SecurityClassT | Filter results by securityClass
try {
    StrategyRecords result = apiInstance.getExchangeInstruments(exchangeId, securityClass);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **securityClass** | [**SecurityClassT**](.md)| Filter results by securityClass | [optional]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeMaturityDates"></a>
# **getExchangeMaturityDates**
> StrategyRecords getExchangeMaturityDates(exchangeId, securityClass)

Return the list of maturity dates of this Exchange for a type of instruments

Return the list of maturity dates of this Exchange for a type of instruments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
SecurityClassT securityClass = new SecurityClassT(); // SecurityClassT | The type of securities to filter
try {
    StrategyRecords result = apiInstance.getExchangeMaturityDates(exchangeId, securityClass);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeMaturityDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **securityClass** | [**SecurityClassT**](.md)| The type of securities to filter |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeParams"></a>
# **getExchangeParams**
> StrategyRecords getExchangeParams(exchangeId)

Return the list of Exchange parameters

Return the list of Exchange parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
try {
    StrategyRecords result = apiInstance.getExchangeParams(exchangeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeParams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeSymbols"></a>
# **getExchangeSymbols**
> StrategyRecords getExchangeSymbols(exchangeId, securityClass)

Return the list of symbols available in a given Exchange

Return the list of symbols available in a given Exchange. Can be filtered by SecurityClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
ExchangeIDT exchangeId = new ExchangeIDT(); // ExchangeIDT | 
SecurityClassT securityClass = new SecurityClassT(); // SecurityClassT | Filter results by securityClass
try {
    StrategyRecords result = apiInstance.getExchangeSymbols(exchangeId, securityClass);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchangeSymbols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeId** | [**ExchangeIDT**](.md)|  |
 **securityClass** | [**SecurityClassT**](.md)| Filter results by securityClass | [optional]

### Return type

[**StrategyRecords**](StrategyRecords.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchanges"></a>
# **getExchanges**
> StrategyRecords getExchanges()

Return list of Exchanges available

Return list of Exchanges available for querying 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MarketdataApi apiInstance = new MarketdataApi();
try {
    StrategyRecords result = apiInstance.getExchanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketdataApi#getExchanges");
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

