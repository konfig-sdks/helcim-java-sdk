# PaymentApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**processCaptureTransaction**](PaymentApi.md#processCaptureTransaction) | **POST** /payment/capture | Process Capture Transaction |
| [**processPreauthTransaction**](PaymentApi.md#processPreauthTransaction) | **POST** /payment/preauth | Process Preauth Transaction |
| [**processPurchaseTransaction**](PaymentApi.md#processPurchaseTransaction) | **POST** /payment/purchase | Process Purchase Transaction |
| [**processRefundTransaction**](PaymentApi.md#processRefundTransaction) | **POST** /payment/refund | Process Refund Transaction |
| [**processWithdrawalTransaction**](PaymentApi.md#processWithdrawalTransaction) | **POST** /payment/withdraw | Process Withdraw Transaction |
| [**reverseTransaction**](PaymentApi.md#reverseTransaction) | **POST** /payment/reverse | Process Reverse Transaction |
| [**verifyTransaction**](PaymentApi.md#verifyTransaction) | **POST** /payment/verify | Process Verify Transaction |


<a name="processCaptureTransaction"></a>
# **processCaptureTransaction**
> SuccessfulPaymentResponse processCaptureTransaction(idempotencyKey).captureRequest(captureRequest).execute();

Process Capture Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer preAuthTransactionId = 56; // The transaction ID of the original pre-authorization transaction.
    Double amount = 3.4D; // The amount to capture. Must be less or equal to the original pre-authorization amount.
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    try {
      SuccessfulPaymentResponse result = client
              .payment
              .processCaptureTransaction(preAuthTransactionId, amount, ipAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionId());
      System.out.println(result.getCardBatchId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getStatus());
      System.out.println(result.getUser());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getAvsResponse());
      System.out.println(result.getCvvResponse());
      System.out.println(result.getApprovalCode());
      System.out.println(result.getCardToken());
      System.out.println(result.getCardNumber());
      System.out.println(result.getCardHolderName());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getWarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processCaptureTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulPaymentResponse> response = client
              .payment
              .processCaptureTransaction(preAuthTransactionId, amount, ipAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processCaptureTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **captureRequest** | [**CaptureRequest**](CaptureRequest.md)|  | [optional] |

### Return type

[**SuccessfulPaymentResponse**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="processPreauthTransaction"></a>
# **processPreauthTransaction**
> SuccessfulPaymentResponse processPreauthTransaction(idempotencyKey).purchaseRequest(purchaseRequest).execute();

Process Preauth Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    Integer terminalId = 56; // For card transactions only. Id of the terminal you would want to use. Default terminal for of the currency will be used if you dont send this.
    String currency = "currency_example"; // The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.
    Double amount = 3.4D; // Amount to be processed
    String customerCode = "customerCode_example"; // Existing customer code associated with the transaction
    String invoiceNumber = "invoiceNumber_example"; // To be filled when associating transaction to existing invoice. Invoice should be associated to the same customer linked to the card
    PaymentRequestInvoice invoice = new PaymentRequestInvoice();
    Address billingAddress = new Address();
    Object cardData = null;
    try {
      SuccessfulPaymentResponse result = client
              .payment
              .processPreauthTransaction(idempotencyKey)
              .ipAddress(ipAddress)
              .ecommerce(ecommerce)
              .terminalId(terminalId)
              .currency(currency)
              .amount(amount)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .billingAddress(billingAddress)
              .cardData(cardData)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionId());
      System.out.println(result.getCardBatchId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getStatus());
      System.out.println(result.getUser());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getAvsResponse());
      System.out.println(result.getCvvResponse());
      System.out.println(result.getApprovalCode());
      System.out.println(result.getCardToken());
      System.out.println(result.getCardNumber());
      System.out.println(result.getCardHolderName());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getWarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processPreauthTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulPaymentResponse> response = client
              .payment
              .processPreauthTransaction(idempotencyKey)
              .ipAddress(ipAddress)
              .ecommerce(ecommerce)
              .terminalId(terminalId)
              .currency(currency)
              .amount(amount)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .billingAddress(billingAddress)
              .cardData(cardData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processPreauthTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **purchaseRequest** | [**PurchaseRequest**](PurchaseRequest.md)|  | [optional] |

### Return type

[**SuccessfulPaymentResponse**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="processPurchaseTransaction"></a>
# **processPurchaseTransaction**
> SuccessfulPaymentResponse processPurchaseTransaction(idempotencyKey).purchaseRequest(purchaseRequest).execute();

Process Purchase Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    Integer terminalId = 56; // For card transactions only. Id of the terminal you would want to use. Default terminal for of the currency will be used if you dont send this.
    String currency = "currency_example"; // The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.
    Double amount = 3.4D; // Amount to be processed
    String customerCode = "customerCode_example"; // Existing customer code associated with the transaction
    String invoiceNumber = "invoiceNumber_example"; // To be filled when associating transaction to existing invoice. Invoice should be associated to the same customer linked to the card
    PaymentRequestInvoice invoice = new PaymentRequestInvoice();
    Address billingAddress = new Address();
    Object cardData = null;
    try {
      SuccessfulPaymentResponse result = client
              .payment
              .processPurchaseTransaction(idempotencyKey)
              .ipAddress(ipAddress)
              .ecommerce(ecommerce)
              .terminalId(terminalId)
              .currency(currency)
              .amount(amount)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .billingAddress(billingAddress)
              .cardData(cardData)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionId());
      System.out.println(result.getCardBatchId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getStatus());
      System.out.println(result.getUser());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getAvsResponse());
      System.out.println(result.getCvvResponse());
      System.out.println(result.getApprovalCode());
      System.out.println(result.getCardToken());
      System.out.println(result.getCardNumber());
      System.out.println(result.getCardHolderName());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getWarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processPurchaseTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulPaymentResponse> response = client
              .payment
              .processPurchaseTransaction(idempotencyKey)
              .ipAddress(ipAddress)
              .ecommerce(ecommerce)
              .terminalId(terminalId)
              .currency(currency)
              .amount(amount)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .billingAddress(billingAddress)
              .cardData(cardData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processPurchaseTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **purchaseRequest** | [**PurchaseRequest**](PurchaseRequest.md)|  | [optional] |

### Return type

[**SuccessfulPaymentResponse**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="processRefundTransaction"></a>
# **processRefundTransaction**
> SuccessfulPaymentResponse processRefundTransaction(idempotencyKey).refundRequest(refundRequest).execute();

Process Refund Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer originalTransactionId = 56; // The transaction ID of the purchase/capture transaction.
    Double amount = 3.4D; // The amount to refund. Must be less or equal to the original purchase/capture amount.
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    try {
      SuccessfulPaymentResponse result = client
              .payment
              .processRefundTransaction(originalTransactionId, amount, ipAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionId());
      System.out.println(result.getCardBatchId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getStatus());
      System.out.println(result.getUser());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getAvsResponse());
      System.out.println(result.getCvvResponse());
      System.out.println(result.getApprovalCode());
      System.out.println(result.getCardToken());
      System.out.println(result.getCardNumber());
      System.out.println(result.getCardHolderName());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getWarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processRefundTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulPaymentResponse> response = client
              .payment
              .processRefundTransaction(originalTransactionId, amount, ipAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processRefundTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | [optional] |

### Return type

[**SuccessfulPaymentResponse**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="processWithdrawalTransaction"></a>
# **processWithdrawalTransaction**
> SuccessfulAchTransactionResponse processWithdrawalTransaction(idempotencyKey).withdrawRequest(withdrawRequest).execute();

Process Withdraw Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    Integer terminalId = 56; // For card transactions only. Id of the terminal you would want to use. Default terminal for of the currency will be used if you dont send this.
    String currency = "currency_example"; // The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.
    Double amount = 3.4D; // Amount to be processed
    String customerCode = "customerCode_example"; // Existing customer code associated with the transaction
    String invoiceNumber = "invoiceNumber_example"; // To be filled when associating transaction to existing invoice. Invoice should be associated to the same customer linked to the card
    PaymentRequestInvoice invoice = new PaymentRequestInvoice();
    Address billingAddress = new Address();
    Object bankData = null;
    try {
      SuccessfulAchTransactionResponse result = client
              .payment
              .processWithdrawalTransaction(idempotencyKey)
              .ipAddress(ipAddress)
              .ecommerce(ecommerce)
              .terminalId(terminalId)
              .currency(currency)
              .amount(amount)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .billingAddress(billingAddress)
              .bankData(bankData)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionId());
      System.out.println(result.getBatchId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getStatusAuth());
      System.out.println(result.getStatusClearing());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getApprovalCode());
      System.out.println(result.getBankAccountNumber());
      System.out.println(result.getBankToken());
      System.out.println(result.getInvoiceNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processWithdrawalTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulAchTransactionResponse> response = client
              .payment
              .processWithdrawalTransaction(idempotencyKey)
              .ipAddress(ipAddress)
              .ecommerce(ecommerce)
              .terminalId(terminalId)
              .currency(currency)
              .amount(amount)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .billingAddress(billingAddress)
              .bankData(bankData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processWithdrawalTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **withdrawRequest** | [**WithdrawRequest**](WithdrawRequest.md)|  | [optional] |

### Return type

[**SuccessfulAchTransactionResponse**](SuccessfulAchTransactionResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="reverseTransaction"></a>
# **reverseTransaction**
> Object reverseTransaction(idempotencyKey).refundRequest1(refundRequest1).execute();

Process Reverse Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer cardTransactionId = 56; // The transaction ID of the original transaction.
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    try {
      Object result = client
              .payment
              .reverseTransaction(cardTransactionId, ipAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#reverseTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .payment
              .reverseTransaction(cardTransactionId, ipAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#reverseTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **refundRequest1** | [**RefundRequest1**](RefundRequest1.md)|  | [optional] |

### Return type

**Object**

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="verifyTransaction"></a>
# **verifyTransaction**
> SuccessfulPaymentResponse verifyTransaction(idempotencyKey).verifyRequest(verifyRequest).execute();

Process Verify Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String ipAddress = "ipAddress_example"; // IP address of the customer making the transaction, used as part of fraud detection.
    String currency = "currency_example"; // The currency abbreviation of the transaction.
    Card cardData = new Card();
    Address billingAddress = new Address();
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency Key. Alphanumeric 25-characters
    Boolean ecommerce = true; // Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
    String customerCode = "customerCode_example"; // Existing customer code associated with the transaction
    String invoiceNumber = "invoiceNumber_example"; // To be filled when associating transaction to existing invoice. Invoice should be associated to the same customer linked to the card
    VerifyRequestInvoice invoice = new VerifyRequestInvoice();
    try {
      SuccessfulPaymentResponse result = client
              .payment
              .verifyTransaction(ipAddress, currency, cardData, billingAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionId());
      System.out.println(result.getCardBatchId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getStatus());
      System.out.println(result.getUser());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getAvsResponse());
      System.out.println(result.getCvvResponse());
      System.out.println(result.getApprovalCode());
      System.out.println(result.getCardToken());
      System.out.println(result.getCardNumber());
      System.out.println(result.getCardHolderName());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getWarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#verifyTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulPaymentResponse> response = client
              .payment
              .verifyTransaction(ipAddress, currency, cardData, billingAddress, idempotencyKey)
              .ecommerce(ecommerce)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .invoice(invoice)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#verifyTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **UUID**| Idempotency Key. Alphanumeric 25-characters | |
| **verifyRequest** | [**VerifyRequest**](VerifyRequest.md)|  | [optional] |

### Return type

[**SuccessfulPaymentResponse**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

