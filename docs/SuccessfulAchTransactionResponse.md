

# SuccessfulAchTransactionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **Double** | The transaction id |  [optional] |
|**batchId** | **Double** | The id of associated card batch |  [optional] |
|**dateCreated** | **String** | The date(Mountain Time) when the transaction is created. |  [optional] |
|**statusAuth** | **String** | The status of the transaction. possible values are APPROVED | DECLINED | IN_PROGRESS | CANCELLED | PENDING |  [optional] |
|**statusClearing** | **String** | The status of the transaction. possible values are OPENED | CLEARED | REJECTED | CONTESTED | RETURNED |  [optional] |
|**type** | **String** | The type of the transaction. possible values are WITHDRAWAL | DEPOSIT | SETTLE | REVERSE | REFUND |  [optional] |
|**amount** | **Double** | The amount of processed transaction |  [optional] |
|**currency** | **String** | The abbreviation of the transaction&#39;s currency |  [optional] |
|**approvalCode** | **String** | Approval Code |  [optional] |
|**bankAccountNumber** | **String** | Bank account number |  [optional] |
|**bankToken** | **String** | Bank Token associated with bankAccount |  [optional] |
|**invoiceNumber** | **String** | Invoice number associated to the transaction |  [optional] |



