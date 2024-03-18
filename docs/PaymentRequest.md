

# PaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddress** | **String** | IP address of the customer making the transaction, used as part of fraud detection. |  |
|**ecommerce** | **Boolean** | Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis. |  [optional] |
|**terminalId** | **Integer** | For card transactions only. Id of the terminal you would want to use. Default terminal for of the currency will be used if you dont send this. |  [optional] |
|**currency** | **String** | The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice. |  |
|**amount** | **Double** | Amount to be processed |  |
|**customerCode** | **String** | Existing customer code associated with the transaction |  [optional] |
|**invoiceNumber** | **String** | To be filled when associating transaction to existing invoice. Invoice should be associated to the same customer linked to the card |  [optional] |
|**invoice** | [**PaymentRequestInvoice**](PaymentRequestInvoice.md) |  |  [optional] |
|**billingAddress** | [**Address**](Address.md) |  |  [optional] |



