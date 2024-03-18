

# VerifyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddress** | **String** | IP address of the customer making the transaction, used as part of fraud detection. |  |
|**ecommerce** | **Boolean** | Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis. |  [optional] |
|**currency** | **String** | The currency abbreviation of the transaction. |  |
|**customerCode** | **String** | Existing customer code associated with the transaction |  [optional] |
|**invoiceNumber** | **String** | To be filled when associating transaction to existing invoice. Invoice should be associated to the same customer linked to the card |  [optional] |
|**invoice** | [**VerifyRequestInvoice**](VerifyRequestInvoice.md) |  |  [optional] |
|**cardData** | [**Card**](Card.md) |  |  |
|**billingAddress** | [**Address**](Address.md) |  |  |



