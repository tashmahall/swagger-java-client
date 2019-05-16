# swagger-java-client

Investflex Algo Trading Platform API
- API version: 1.0.0
  - Build date: 2019-05-15T21:10:34.099Z[GMT]

**Investflex Algo Trading Platform API**. We describe here all available APIs to allow users the execution of trading algorithms in our Algorithmic Trading platform.   All APIs required authentication token to enable its access. Use the **login** API of the **AUTH** section and to generate an authentication token and Authorize the token using the **AUTHORIZE** button.  Use the **environment dropdown** to select the proper environment on which execute the strategies. _http://api.flexscan.com.br_ simulation environment is selected by default. 


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        AlgosApi apiInstance = new AlgosApi();
        try {
            StrategyRecords result = apiInstance.getCommands();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlgosApi#getCommands");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlgosApi;

import java.io.File;
import java.util.*;

public class AlgosApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://apisim.flexscan.com.br*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlgosApi* | [**editStrategy**](docs/AlgosApi.md#editStrategy) | **PUT** /v1/algos/{ClOrdID} | Send a Algo Edition for a running strategy to Execution Server
*AlgosApi* | [**executeStrategy**](docs/AlgosApi.md#executeStrategy) | **POST** /v1/algos | Send a new Algo to Execution Server
*AlgosApi* | [**executeStrategyCommand**](docs/AlgosApi.md#executeStrategyCommand) | **POST** /v1/algos/{ClOrdID}/commands | Send a Command for a running Algo
*AlgosApi* | [**getCommands**](docs/AlgosApi.md#getCommands) | **GET** /v1/commands | Return the list of all Commands sent
*AlgosApi* | [**getStrategies**](docs/AlgosApi.md#getStrategies) | **GET** /v1/algos | Return list of Strategies created during the current day
*AlgosApi* | [**getStrategy**](docs/AlgosApi.md#getStrategy) | **GET** /v1/algos/{ClOrdID} | Return the Algo with the ClOrdID specified
*AlgosApi* | [**v1CommandsPost**](docs/AlgosApi.md#v1CommandsPost) | **POST** /v1/commands | Post a command not related with specific strategies
*AuthApi* | [**getAuthToken**](docs/AuthApi.md#getAuthToken) | **POST** /v1/connect/login | Return auth token based on login credentials
*MarketdataApi* | [**getExchange**](docs/MarketdataApi.md#getExchange) | **GET** /v1/exchanges/{exchange_id} | Return the Exchange with the exchange_id specified
*MarketdataApi* | [**getExchangeHolidays**](docs/MarketdataApi.md#getExchangeHolidays) | **GET** /v1/exchanges/{exchange_id}/holidays | Return the list of holidays for the Exchange
*MarketdataApi* | [**getExchangeInstrument**](docs/MarketdataApi.md#getExchangeInstrument) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol} | Return an Instrument identified by symbol
*MarketdataApi* | [**getExchangeInstrumentDerivatives**](docs/MarketdataApi.md#getExchangeInstrumentDerivatives) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/derivatives | Return the list of derivatives Instruments for an Instrument defined by symbol
*MarketdataApi* | [**getExchangeInstrumentDerivativesSymbols**](docs/MarketdataApi.md#getExchangeInstrumentDerivativesSymbols) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/derivatives.symbols | Return the list of derivatives symbols for an Instrument defined by symbol
*MarketdataApi* | [**getExchangeInstrumentLastBook**](docs/MarketdataApi.md#getExchangeInstrumentLastBook) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/books/last | Return the last book for an Instrument defined by symbol
*MarketdataApi* | [**getExchangeInstrumentLastQuote**](docs/MarketdataApi.md#getExchangeInstrumentLastQuote) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/quotes/last | Return the last quote for an Instrument defined by symbol
*MarketdataApi* | [**getExchangeInstrumentSnapshot**](docs/MarketdataApi.md#getExchangeInstrumentSnapshot) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/snapshot | Return the last quote snapshot from an Instrument defined by symbol
*MarketdataApi* | [**getExchangeInstrumentTrades**](docs/MarketdataApi.md#getExchangeInstrumentTrades) | **GET** /v1/exchanges/{exchange_id}/instruments/{symbol}/trades | Return the trades for an Instrument defined by symbol
*MarketdataApi* | [**getExchangeInstruments**](docs/MarketdataApi.md#getExchangeInstruments) | **GET** /v1/exchanges/{exchange_id}/instruments | Return the list of Instrument definitions available in a given Exchange
*MarketdataApi* | [**getExchangeMaturityDates**](docs/MarketdataApi.md#getExchangeMaturityDates) | **GET** /v1/exchanges/{exchange_id}/maturitydates | Return the list of maturity dates of this Exchange for a type of instruments
*MarketdataApi* | [**getExchangeParams**](docs/MarketdataApi.md#getExchangeParams) | **GET** /v1/exchanges/{exchange_id}/params | Return the list of Exchange parameters
*MarketdataApi* | [**getExchangeSymbols**](docs/MarketdataApi.md#getExchangeSymbols) | **GET** /v1/exchanges/{exchange_id}/symbols | Return the list of symbols available in a given Exchange
*MarketdataApi* | [**getExchanges**](docs/MarketdataApi.md#getExchanges) | **GET** /v1/exchanges | Return list of Exchanges available
*WebhooksApi* | [**delWebhook**](docs/WebhooksApi.md#delWebhook) | **DELETE** /v1/webhooks/{webhook_id} | Delete the Webhook with the given webhook_id
*WebhooksApi* | [**delWebhooks**](docs/WebhooksApi.md#delWebhooks) | **DELETE** /v1/webhooks | Delete all Webhooks registered for this user
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /v1/webhooks/{webhook_id} | Return Webhooks registered with the given webhook_id
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /v1/webhooks | Return Webhooks registered for this user
*WebhooksApi* | [**registerWebhook**](docs/WebhooksApi.md#registerWebhook) | **POST** /v1/webhooks | Register a new Webhook for this user

## Documentation for Models

 - [ABMessageArbintf](docs/ABMessageArbintf.md)
 - [ABMessageBoffer](docs/ABMessageBoffer.md)
 - [ABMessageFinanc](docs/ABMessageFinanc.md)
 - [ABMessageFxorder](docs/ABMessageFxorder.md)
 - [ABMessageGrddin](docs/ABMessageGrddin.md)
 - [ABMessageGrdlin](docs/ABMessageGrdlin.md)
 - [ABMessageLgshort](docs/ABMessageLgshort.md)
 - [ABMessageMit](docs/ABMessageMit.md)
 - [ABMessageSniper](docs/ABMessageSniper.md)
 - [ABMessageSorder](docs/ABMessageSorder.md)
 - [ABMessageSpread](docs/ABMessageSpread.md)
 - [ABMessagearbintfCustomParameters](docs/ABMessagearbintfCustomParameters.md)
 - [ABMessagearbintfStrategyLegs](docs/ABMessagearbintfStrategyLegs.md)
 - [ABMessagebofferCustomParameters](docs/ABMessagebofferCustomParameters.md)
 - [ABMessagebofferStrategyLegs](docs/ABMessagebofferStrategyLegs.md)
 - [ABMessagefinancCustomParameters](docs/ABMessagefinancCustomParameters.md)
 - [ABMessagefxorderCustomParameters](docs/ABMessagefxorderCustomParameters.md)
 - [ABMessagefxorderStrategyLegs](docs/ABMessagefxorderStrategyLegs.md)
 - [ABMessagegrddinCustomParameters](docs/ABMessagegrddinCustomParameters.md)
 - [ABMessagegrddinStrategyLegs](docs/ABMessagegrddinStrategyLegs.md)
 - [ABMessagegrdlinCustomParameters](docs/ABMessagegrdlinCustomParameters.md)
 - [ABMessagelgshortCustomParameters](docs/ABMessagelgshortCustomParameters.md)
 - [ABMessagemitCustomParameters](docs/ABMessagemitCustomParameters.md)
 - [ABMessagemitStrategyLegs](docs/ABMessagemitStrategyLegs.md)
 - [ABMessagesniperStrategyLegs](docs/ABMessagesniperStrategyLegs.md)
 - [ABMessagesorderCustomParameters](docs/ABMessagesorderCustomParameters.md)
 - [ABMessagesorderStrategyLegs](docs/ABMessagesorderStrategyLegs.md)
 - [ABMessagespreadCustomParameters](docs/ABMessagespreadCustomParameters.md)
 - [ABMessagespreadStrategyLegs](docs/ABMessagespreadStrategyLegs.md)
 - [BoolFieldNT](docs/BoolFieldNT.md)
 - [BoolFieldYT](docs/BoolFieldYT.md)
 - [Command](docs/Command.md)
 - [DerivativesSecurityClassT](docs/DerivativesSecurityClassT.md)
 - [Error](docs/Error.md)
 - [ExchangeIDT](docs/ExchangeIDT.md)
 - [ExchangeT](docs/ExchangeT.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse202](docs/InlineResponse202.md)
 - [Leg](docs/Leg.md)
 - [Login](docs/Login.md)
 - [OptionTypeT](docs/OptionTypeT.md)
 - [SecurityClassT](docs/SecurityClassT.md)
 - [SideT](docs/SideT.md)
 - [Strategy](docs/Strategy.md)
 - [StrategyCodeT](docs/StrategyCodeT.md)
 - [StrategyParameters](docs/StrategyParameters.md)
 - [StrategyRecords](docs/StrategyRecords.md)
 - [Success](docs/Success.md)
 - [SystemCommand](docs/SystemCommand.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookRecords](docs/WebhookRecords.md)
 - [WebhookTarget](docs/WebhookTarget.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hernan@investflex.com.br