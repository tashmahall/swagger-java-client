# WebhookTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the webhook target of the webhook Input parameter. Must be informed by requester  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The target of the webhook (sponsor, user, account, algo) It indicates on which dimension the webhook will be notified Input parameter. Must be informed by requester  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SPONSOR | &quot;sponsor&quot;
USER | &quot;user&quot;
ACCOUNT | &quot;account&quot;
ALGO | &quot;algo&quot;
