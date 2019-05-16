# ABMessagespreadCustomParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**triggerValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | Type of trigger. 1&#x3D;spread, 11&#x3D;financeiro  |  [optional]
**bookDepth** | **Integer** |  |  [optional]
**bandPriceRef** | [**BoolFieldNT**](BoolFieldNT.md) |  |  [optional]
**bandPriceSymbol** | **String** |  |  [optional]
**bandPriceExchange** | [**ExchangeT**](ExchangeT.md) |  |  [optional]
**bandPriceHigh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**bandPriceLow** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**ignoreOffersLT** | **Integer** |  |  [optional]
**compensateExec** | [**CompensateExecEnum**](#CompensateExecEnum) | Type of compensation when unbalanced - 0&#x3D;No comp, 1&#x3D;next clip, 2&#x3D;gradual  |  [optional]
**simulateSniperOnResting** | [**BoolFieldNT**](BoolFieldNT.md) |  |  [optional]
**initSuspended** | [**BoolFieldNT**](BoolFieldNT.md) |  |  [optional]

<a name="TriggerEnum"></a>
## Enum: TriggerEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_11 | &quot;11&quot;

<a name="CompensateExecEnum"></a>
## Enum: CompensateExecEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
