

# SuccessfulPaymentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **Double** | The transaction id |  [optional] |
|**cardBatchId** | **Double** | The id of associated card batch |  [optional] |
|**dateCreated** | **String** | The date(Mountain Time) when the transaction is created. |  [optional] |
|**status** | **String** | The status of the transaction. possible values are APPROVED | DECLINED |  [optional] |
|**user** | **String** | Full name of the user who processed the transaction. Default value is Helcim System |  [optional] |
|**type** | **String** | The type of the transaction. possible values are purchase | preauth | verify |  [optional] |
|**amount** | **Double** | The amount of processed transaction |  [optional] |
|**currency** | **String** | The abbreviation of the transaction&#39;s currency |  [optional] |
|**avsResponse** | **String** | AVS Response |  [optional] |
|**cvvResponse** | **String** | CVV Response |  [optional] |
|**approvalCode** | **String** | Approval Code |  [optional] |
|**cardToken** | **String** | Card token associated to the transaction |  [optional] |
|**cardNumber** | **String** | First-6 Last-4 numbers of the card number associated to the transaction |  [optional] |
|**cardHolderName** | **String** | Cardholdername associated to the transaction |  [optional] |
|**customerCode** | **String** | Customer code associated to the transaction |  [optional] |
|**invoiceNumber** | **String** | Invoice number associated to the transaction |  [optional] |
|**warning** | **String** | Warnings |  [optional] |



