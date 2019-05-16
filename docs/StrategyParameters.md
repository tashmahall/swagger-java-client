# StrategyParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basketId** | **String** | If this strategy is part of a Basket, put the string that identifies the basket on this field |  [optional]
**expireDate** | [**LocalDate**](LocalDate.md) | Not used on this version. All strategy will have expiration date equal to currente day on this version (any value on this field will be ignored) |  [optional]
**name** | **String** | The name of the strategy defined by the user | 
**initTime** | **String** | Time the Strategy will start. Strategy will be waiting in SCHEDULED status if InitTIme is ahead of current time or will start imediately if InitTime is behinf current time  | 
**endTime** | **String** | The time this strategy will be stopped. Must be greater then InitTime   | 
**text** | **String** |  |  [optional]
