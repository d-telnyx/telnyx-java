# ReplacedLinkClickEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**url** | **String** | The original link that was sent in the message. |  [optional]
**to** | **String** | Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code). |  [optional]
**messageId** | [**UUID**](UUID.md) | The message ID associated with the clicked link. |  [optional]
**timeClicked** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the message request was received. |  [optional]
