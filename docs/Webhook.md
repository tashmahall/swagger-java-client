# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | [**WebhookTarget**](WebhookTarget.md) |  |  [optional]
**url** | **String** | The address that will be called back when an event for the trigger specified happens A POST request will be made with the appropriate object on this url Input parameter. Must be informed by requester  |  [optional]
**triggers** | [**List&lt;TriggersEnum&gt;**](#List&lt;TriggersEnum&gt;) |  |  [optional]
**removePrevious** | **Integer** | Forza a remoção de webhooks previos se existirem para este usuário  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Webhook creation datetime Output parameter. Will be generated internally  |  [optional]
**createdBy** | **String** | Username who created the webhook Output parameter. Will be generated internally  |  [optional]
**id** | [**UUID**](UUID.md) | Unique identifier of the webhook Output parameter. Will be generated internally         |  [optional]

<a name="List<TriggersEnum>"></a>
## Enum: List&lt;TriggersEnum&gt;
Name | Value
---- | -----
CHANGED | &quot;algo.changed&quot;
