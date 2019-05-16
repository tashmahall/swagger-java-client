# ABMessagefinancCustomParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**triggerValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | Type of trigger.  * 16&#x3D;taxa de financiamento  |  [optional]
**bookDepth** | **Integer** |  |  [optional]
**compensateExec** | [**CompensateExecEnum**](#CompensateExecEnum) | Type of compensation when unbalanced - 0&#x3D;No comp, 1&#x3D;next clip, 2&#x3D;gradual  |  [optional]
**initSuspended** | [**BoolFieldNT**](BoolFieldNT.md) |  |  [optional]

<a name="TriggerEnum"></a>
## Enum: TriggerEnum
Name | Value
---- | -----
_16 | &quot;16&quot;

<a name="CompensateExecEnum"></a>
## Enum: CompensateExecEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
