

# InvoiceUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice. |  [optional] |
|**type** | **String** | The type of the invoice, such as ESTIMATE | INVOICE | QUOTE | ORDER | PURCHASE_ORDER | STATEMENT | REGISTRATION | CREDIT. |  [optional] |
|**status** | **String** | The status of invoice, such as DUE | SHIPPED | COMPLETED | CANCELLED |  [optional] |
|**billingAddress** | [**Address**](Address.md) |  |  [optional] |



