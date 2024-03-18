

# HelcimPayInitializeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentType** | **String** | Payment Type. Valid payment types are purchase | preauth | verify |  |
|**amount** | **Double** | The amount of the transaction to be processed |  |
|**currency** | **String** | Currency abbreviation. CAD | USD |  |
|**customerCode** | **String** | This is the code of an existing customer in Helcim associated with this checkout |  [optional] |
|**invoiceNumber** | **String** | This is the number of an existing invoice in Helcim associated with this checkout |  [optional] |
|**paymentMethod** | **String** | This is the payment method (credit card, ACH) that customer can use to pay the amount. cc | ach | cc-ach |  [optional] |
|**allowPartial** | **Double** | This is used to determine whether the partial payment UI will be displayed to the customer |  [optional] |
|**hasConvenienceFee** | **Double** | This is used to apply the convenience fee rate to credit card transaction should customer chooses this payment method |  [optional] |
|**taxAmount** | **Double** | This is used to enable level 2 processing lower rates. The value should be the dollar amount of the tax to 2 decimal places. |  [optional] |



