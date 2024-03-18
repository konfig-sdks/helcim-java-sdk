

# BankAccountResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The id of the bank account. |  [optional] |
|**customerId** | **Integer** | The id of the customer owning the bank account. |  [optional] |
|**dateCreated** | **String** | The date when the bank account is created. |  [optional] |
|**dateUpdated** | **String** | The date when the bank account last got updated. |  [optional] |
|**dateLastUsed** | **String** | The date when the bank account last got used. |  [optional] |
|**dateVerified** | **String** | The date when the bank account is verified. |  [optional] |
|**bankToken** | **String** | The token of the bank account. |  [optional] |
|**accountType** | **String** | The type of the bank account, such as CHECKING | SAVINGS. |  [optional] |
|**accountCorporate** | **String** | The corporate type of the bank account, such as PERSONAL | CORPORATE. |  [optional] |
|**verified** | **String** | Verified status of the bank account, 1|0. |  [optional] |
|**ready** | **String** | Ready status of the bank account, 1|0. |  [optional] |
|**bankIdNumber** | **String** | The institution number of Canadian Bank Account that identifies the bank. |  [optional] |
|**transitNumber** | **String** | The transit number of Canadian Bank Account. Shows which branch you opened your account at. |  [optional] |
|**routingNumber** | **String** | The routing number of US Bank Account. Identifies the financial institution on which it was drawn. |  [optional] |
|**bankAccountNumberL4** | **String** | Last 4 digits of the bank account number. |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |



