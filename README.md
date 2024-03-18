<div align="center">

[![Visit Helcim](./header.png)](https://www.helcim.com&#x2F;)

# [Helcim](https://www.helcim.com&#x2F;)

This API covers publicly accessible merchant actions

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Helcim&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>helcim-java-sdk</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:helcim-java-sdk:2.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/helcim-java-sdk-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardBatchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Double batchNumber = 18900D; // The number of the batch to retrieve. Note that this is the batch number, not batch ID.
    Double terminalId = 180000D; // The terminalId of the requested batch
    String collectStats = "true"; // Includes transaction statistics for the batch
    try {
      List<CardBatch> result = client
              .cardBatch
              .getAll()
              .batchNumber(batchNumber)
              .terminalId(terminalId)
              .collectStats(collectStats)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardBatchApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CardBatch>> response = client
              .cardBatch
              .getAll()
              .batchNumber(batchNumber)
              .terminalId(terminalId)
              .collectStats(collectStats)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardBatchApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.helcim.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CardBatchApi* | [**getAll**](docs/CardBatchApi.md#getAll) | **GET** /card-batches | Get Card Batches
*CardBatchApi* | [**getDetails**](docs/CardBatchApi.md#getDetails) | **GET** /card-batches/{cardBatchId} | Get Card Batch
*CardBatchApi* | [**settleBatch**](docs/CardBatchApi.md#settleBatch) | **POST** /card-batches/{cardBatchId}/settle | Settles an Open Card Batch
*CardTerminalApi* | [**getAll**](docs/CardTerminalApi.md#getAll) | **GET** /card-terminals | Get card terminals
*CardTransactionApi* | [**collectTransactions**](docs/CardTransactionApi.md#collectTransactions) | **GET** /card-transactions | Collects up to 1000 Card Transactions
*CardTransactionApi* | [**getById**](docs/CardTransactionApi.md#getById) | **GET** /card-transactions/{cardTransactionId} | Get Card Transaction by id
*CustomerApi* | [**createNewCustomer**](docs/CustomerApi.md#createNewCustomer) | **POST** /customers | Create customer
*CustomerApi* | [**getBankAccount**](docs/CustomerApi.md#getBankAccount) | **GET** /customers/{customerId}/bank-accounts/{bankAccountId} | Get customer bank account
*CustomerApi* | [**getBankAccounts**](docs/CustomerApi.md#getBankAccounts) | **GET** /customers/{customerId}/bank-accounts | Get customer bank accounts
*CustomerApi* | [**getCardDetails**](docs/CustomerApi.md#getCardDetails) | **GET** /customers/{customerId}/cards/{cardId} | Get customer card
*CustomerApi* | [**getCards**](docs/CustomerApi.md#getCards) | **GET** /customers/{customerId}/cards | Get customer cards
*CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getCustomer) | **GET** /customers/{customerId} | Get customer
*CustomerApi* | [**list**](docs/CustomerApi.md#list) | **GET** /customers | Get customers
*CustomerApi* | [**setBankAccountDefault**](docs/CustomerApi.md#setBankAccountDefault) | **PATCH** /customers/{customerId}/bank-accounts/{bankAccountId}/default | Set customer bank account as default
*CustomerApi* | [**updateDetails**](docs/CustomerApi.md#updateDetails) | **PUT** /customers/{customerId} | Update customer
*GeneralApi* | [**testConnectivityToHelcimApi**](docs/GeneralApi.md#testConnectivityToHelcimApi) | **GET** /connection-test | Tests connectivity to the Helcim API
*HelcimPayApi* | [**createCheckoutSession**](docs/HelcimPayApi.md#createCheckoutSession) | **POST** /helcim-pay/initialize | Creates a HelcimPay.js Checkout Session
*InvoiceApi* | [**createNew**](docs/InvoiceApi.md#createNew) | **POST** /invoices | Create invoice
*InvoiceApi* | [**getById**](docs/InvoiceApi.md#getById) | **GET** /invoices/{invoiceId} | Get invoice
*InvoiceApi* | [**list**](docs/InvoiceApi.md#list) | **GET** /invoices | Get invoices
*InvoiceApi* | [**updateDetails**](docs/InvoiceApi.md#updateDetails) | **PUT** /invoices/{invoiceId} | Update invoice
*PaymentApi* | [**processCaptureTransaction**](docs/PaymentApi.md#processCaptureTransaction) | **POST** /payment/capture | Process Capture Transaction
*PaymentApi* | [**processPreauthTransaction**](docs/PaymentApi.md#processPreauthTransaction) | **POST** /payment/preauth | Process Preauth Transaction
*PaymentApi* | [**processPurchaseTransaction**](docs/PaymentApi.md#processPurchaseTransaction) | **POST** /payment/purchase | Process Purchase Transaction
*PaymentApi* | [**processRefundTransaction**](docs/PaymentApi.md#processRefundTransaction) | **POST** /payment/refund | Process Refund Transaction
*PaymentApi* | [**processWithdrawalTransaction**](docs/PaymentApi.md#processWithdrawalTransaction) | **POST** /payment/withdraw | Process Withdraw Transaction
*PaymentApi* | [**reverseTransaction**](docs/PaymentApi.md#reverseTransaction) | **POST** /payment/reverse | Process Reverse Transaction
*PaymentApi* | [**verifyTransaction**](docs/PaymentApi.md#verifyTransaction) | **POST** /payment/verify | Process Verify Transaction


## Documentation for Models

 - [Address](docs/Address.md)
 - [BankAccount](docs/BankAccount.md)
 - [BankAccountResponse](docs/BankAccountResponse.md)
 - [BankData](docs/BankData.md)
 - [BankToken](docs/BankToken.md)
 - [CaptureRequest](docs/CaptureRequest.md)
 - [Card](docs/Card.md)
 - [Card1](docs/Card1.md)
 - [CardBatch](docs/CardBatch.md)
 - [CardData](docs/CardData.md)
 - [CardResponse](docs/CardResponse.md)
 - [CardTerminal](docs/CardTerminal.md)
 - [CardTerminalAddress](docs/CardTerminalAddress.md)
 - [CardTerminalsRequest](docs/CardTerminalsRequest.md)
 - [CardToken](docs/CardToken.md)
 - [CheckoutInit200Response](docs/CheckoutInit200Response.md)
 - [CheckoutInitDefaultResponse](docs/CheckoutInitDefaultResponse.md)
 - [CreateInvoice200Response](docs/CreateInvoice200Response.md)
 - [CreateInvoiceRequest](docs/CreateInvoiceRequest.md)
 - [Customer](docs/Customer.md)
 - [CustomerRequest](docs/CustomerRequest.md)
 - [CustomerUpdateRequest](docs/CustomerUpdateRequest.md)
 - [Discount](docs/Discount.md)
 - [FailedPaymentResponse](docs/FailedPaymentResponse.md)
 - [GetInvoice200Response](docs/GetInvoice200Response.md)
 - [GetInvoices200ResponseInner](docs/GetInvoices200ResponseInner.md)
 - [HelcimPayInitializeRequest](docs/HelcimPayInitializeRequest.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceBase](docs/InvoiceBase.md)
 - [InvoiceCreate](docs/InvoiceCreate.md)
 - [InvoiceCreateAfterProcessing](docs/InvoiceCreateAfterProcessing.md)
 - [InvoiceResponseBase](docs/InvoiceResponseBase.md)
 - [InvoiceUpdate](docs/InvoiceUpdate.md)
 - [LineItem](docs/LineItem.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentRequestInvoice](docs/PaymentRequestInvoice.md)
 - [Pickup](docs/Pickup.md)
 - [PurchaseRequest](docs/PurchaseRequest.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RefundRequest1](docs/RefundRequest1.md)
 - [Shipping](docs/Shipping.md)
 - [SuccessfulAchTransactionResponse](docs/SuccessfulAchTransactionResponse.md)
 - [SuccessfulPaymentResponse](docs/SuccessfulPaymentResponse.md)
 - [Tax](docs/Tax.md)
 - [UpdateInvoiceRequest](docs/UpdateInvoiceRequest.md)
 - [VerifyRequest](docs/VerifyRequest.md)
 - [VerifyRequestInvoice](docs/VerifyRequestInvoice.md)
 - [WithdrawRequest](docs/WithdrawRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
