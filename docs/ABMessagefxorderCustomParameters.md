# ABMessagefxorderCustomParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**triggerShot** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**triggerShot2** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**triggerLimit2** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**lossType** | [**LossTypeEnum**](#LossTypeEnum) |  |  [optional]
**targetGain** | [**BoolFieldYT**](BoolFieldYT.md) |  |  [optional]
**targetLoss** | [**BoolFieldYT**](BoolFieldYT.md) |  |  [optional]
**closeOnAuction** | [**BoolFieldYT**](BoolFieldYT.md) |  |  [optional]
**triggerEntryType** | [**TriggerEntryTypeEnum**](#TriggerEntryTypeEnum) | * 1 &#x3D; Price * 2 &#x3D; Percent  |  [optional]
**refPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**priceLimit** | [**BigDecimal**](BigDecimal.md) |  |  [optional]

<a name="LossTypeEnum"></a>
## Enum: LossTypeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;

<a name="TriggerEntryTypeEnum"></a>
## Enum: TriggerEntryTypeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
