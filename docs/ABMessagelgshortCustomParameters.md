# ABMessagelgshortCustomParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**triggerValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | Type of trigger.  * 2&#x3D;ratio,buy/sell,  * 3&#x3D;ratio sell/buy, * 4&#x3D;price diff buy/sell, * 5&#x3D;price diff sell/buy, * 11&#x3D;financeiro  |  [optional]
**bookDepth** | **Integer** |  |  [optional]
**ignoreOffersLT** | **Integer** |  |  [optional]
**compensateExec** | [**CompensateExecEnum**](#CompensateExecEnum) | Type of compensation when unbalanced - 0&#x3D;No comp, 1&#x3D;next clip, 2&#x3D;gradual  |  [optional]
**initSuspended** | [**BoolFieldNT**](BoolFieldNT.md) |  |  [optional]

<a name="TriggerEnum"></a>
## Enum: TriggerEnum
Name | Value
---- | -----
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;
_11 | &quot;11&quot;

<a name="CompensateExecEnum"></a>
## Enum: CompensateExecEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
