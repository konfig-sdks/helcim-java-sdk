

# RefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originalTransactionId** | **Integer** | The transaction ID of the purchase/capture transaction. |  |
|**amount** | **Double** | The amount to refund. Must be less or equal to the original purchase/capture amount. |  |
|**ipAddress** | **String** | IP address of the customer making the transaction, used as part of fraud detection. |  |
|**ecommerce** | **Boolean** | Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis. |  [optional] |



