# CardTransactionApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**collectTransactions**](CardTransactionApi.md#collectTransactions) | **GET** /card-transactions | Collects up to 1000 Card Transactions |
| [**getById**](CardTransactionApi.md#getById) | **GET** /card-transactions/{cardTransactionId} | Get Card Transaction by id |


<a name="collectTransactions"></a>
# **collectTransactions**
> List&lt;SuccessfulPaymentResponse&gt; collectTransactions().dateFrom(dateFrom).dateTo(dateTo).search(search).customerCode(customerCode).invoiceNumber(invoiceNumber).cardToken(cardToken).cardBatchId(cardBatchId).execute();

Collects up to 1000 Card Transactions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardTransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String dateFrom = "2020-01-01"; // Filters transactions created from 2020-01-01 (Mountain Time)
    String dateTo = "2021-01-01"; // Filters transactions created until 2021-01-01 (Mountain Time)
    String search = "500"; // Searches amount, card number(F4L4 only), cardholder name, & approval codes
    String customerCode = "CST1000"; // The code of the customer associated with the transaction
    String invoiceNumber = "INV1000"; // The number of the invoice associated with the transaction
    String cardToken = "5454JK97UU1F5454"; // The token of the card associated with the transaction
    Integer cardBatchId = 3; // The id of the batch associated with the transaction
    try {
      List<SuccessfulPaymentResponse> result = client
              .cardTransaction
              .collectTransactions()
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .search(search)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .cardToken(cardToken)
              .cardBatchId(cardBatchId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionApi#collectTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SuccessfulPaymentResponse>> response = client
              .cardTransaction
              .collectTransactions()
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .search(search)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .cardToken(cardToken)
              .cardBatchId(cardBatchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionApi#collectTransactions");
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
| **dateFrom** | **String**| Filters transactions created from 2020-01-01 (Mountain Time) | [optional] |
| **dateTo** | **String**| Filters transactions created until 2021-01-01 (Mountain Time) | [optional] |
| **search** | **String**| Searches amount, card number(F4L4 only), cardholder name, &amp; approval codes | [optional] |
| **customerCode** | **String**| The code of the customer associated with the transaction | [optional] |
| **invoiceNumber** | **String**| The number of the invoice associated with the transaction | [optional] |
| **cardToken** | **String**| The token of the card associated with the transaction | [optional] |
| **cardBatchId** | **Integer**| The id of the batch associated with the transaction | [optional] |

### Return type

[**List&lt;SuccessfulPaymentResponse&gt;**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

<a name="getById"></a>
# **getById**
> SuccessfulPaymentResponse getById(cardTransactionId).execute();

Get Card Transaction by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardTransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer cardTransactionId = 56; // The Card Transaction Id of the Card Transaction you want to get
    try {
      SuccessfulPaymentResponse result = client
              .cardTransaction
              .getById(cardTransactionId)
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
      System.err.println("Exception when calling CardTransactionApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessfulPaymentResponse> response = client
              .cardTransaction
              .getById(cardTransactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionApi#getById");
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
| **cardTransactionId** | **Integer**| The Card Transaction Id of the Card Transaction you want to get | |

### Return type

[**SuccessfulPaymentResponse**](SuccessfulPaymentResponse.md)

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Failed |  -  |

