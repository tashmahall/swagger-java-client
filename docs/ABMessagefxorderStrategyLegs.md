# ABMessagefxorderStrategyLegs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ilegAllocAccount** | **String** |  |  [optional]
**legQuantity** | **Integer** |  |  [optional]
**legSecurityExchange** | [**ExchangeT**](ExchangeT.md) |  |  [optional]
**legSide** | [**SideT**](SideT.md) |  |  [optional]
**legSymbol** | **String** |  |  [optional]
**legOrdType** | [**LegOrdTypeEnum**](#LegOrdTypeEnum) | * 1 &#x3D; Market * 2 &#x3D; Limit * 3 &#x3D; Stop * 4 &#x3D; Scheduled  |  [optional]

<a name="LegOrdTypeEnum"></a>
## Enum: LegOrdTypeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
S | &quot;S&quot;
