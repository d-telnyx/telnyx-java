# InboundMessageEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**payload** | [**InboundMessage**](InboundMessage.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
EVENT | &quot;event&quot;

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
RECEIVED | &quot;message.received&quot;
