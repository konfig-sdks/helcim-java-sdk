

# CaptureRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preAuthTransactionId** | **Integer** | The transaction ID of the original pre-authorization transaction. |  |
|**amount** | **Double** | The amount to capture. Must be less or equal to the original pre-authorization amount. |  |
|**ipAddress** | **String** | IP address of the customer making the transaction, used as part of fraud detection. |  |
|**ecommerce** | **Boolean** | Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis. |  [optional] |



