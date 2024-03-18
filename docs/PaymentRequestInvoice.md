

# PaymentRequestInvoice

To be filled when creating new invoice to be associated to transaction. Will be linked to Customer owning the Card used

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceNumber** | **String** | Invoice number of invoice to be created. Will be generated if blank |  [optional] |
|**tipAmount** | **Double** | Tip amount |  [optional] |
|**depositAmount** | **Double** | Deposit amount |  [optional] |
|**notes** | **String** | Comment to appear at the bottom of the invoice, visible to the customer. |  [optional] |
|**shipping** | [**Shipping**](Shipping.md) |  |  [optional] |
|**pickup** | [**Pickup**](Pickup.md) |  |  [optional] |
|**tax** | [**Tax**](Tax.md) |  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional] |



