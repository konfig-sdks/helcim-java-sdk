

# CreateInvoice200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceId** | **Double** | Unique Invoice Id |  [optional] |
|**invoiceNumber** | **String** | Invoice number of invoice to be created. Will be generated if blank |  [optional] |
|**tipAmount** | **Double** | Tip amount |  [optional] |
|**depositAmount** | **Double** | Deposit amount |  [optional] |
|**notes** | **String** | Comment to appear at the bottom of the invoice, visible to the customer. |  [optional] |
|**customerId** | **Integer** | The id of customer associated to the invoice. |  [optional] |
|**currency** | **String** | The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice. |  [optional] |
|**type** | **String** | The type of the invoice, such as ESTIMATE | INVOICE | QUOTE | ORDER | PURCHASE_ORDER | STATEMENT | REGISTRATION | CREDIT. |  [optional] |
|**status** | **String** | The status of the invoice, such as due | paid | completed | refunded. |  [optional] |
|**billingAddress** | [**Address**](Address.md) |  |  [optional] |
|**shipping** | [**Shipping**](Shipping.md) |  |  [optional] |
|**pickup** | [**Pickup**](Pickup.md) |  |  [optional] |
|**tax** | [**Tax**](Tax.md) |  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional] |
|**dateCreated** | **String** | Date the invoice is created. |  [optional] |
|**dateUpdated** | **String** | Date the invoice is updated. |  [optional] |
|**datePaid** | **String** | Date the invoice is paid. |  [optional] |
|**dateIssued** | **String** | Date the invoice is paid. |  [optional] |
|**amount** | **Double** | The total amount of the invoice. |  [optional] |
|**convenienceFee** | **Double** | The total convenience fee paid for the invoice. |  [optional] |



