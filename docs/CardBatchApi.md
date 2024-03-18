# CardBatchApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](CardBatchApi.md#getAll) | **GET** /card-batches | Get Card Batches |
| [**getDetails**](CardBatchApi.md#getDetails) | **GET** /card-batches/{cardBatchId} | Get Card Batch |
| [**settleBatch**](CardBatchApi.md#settleBatch) | **POST** /card-batches/{cardBatchId}/settle | Settles an Open Card Batch |


<a name="getAll"></a>
# **getAll**
> List&lt;CardBatch&gt; getAll().batchNumber(batchNumber).terminalId(terminalId).collectStats(collectStats).execute();

Get Card Batches

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchNumber** | **Double**| The number of the batch to retrieve. Note that this is the batch number, not batch ID. | [optional] |
| **terminalId** | **Double**| The terminalId of the requested batch | [optional] |
| **collectStats** | **String**| Includes transaction statistics for the batch | [optional] [enum: true, false] |

### Return type

[**List&lt;CardBatch&gt;**](CardBatch.md)

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

<a name="getDetails"></a>
# **getDetails**
> CardBatch getDetails(cardBatchId).collectStats(collectStats).execute();

Get Card Batch

### Example
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
    Integer cardBatchId = 56; // The Card Batch Id of the Card Batch you want to get
    String collectStats = "true"; // Includes transaction statistics for the batch
    try {
      CardBatch result = client
              .cardBatch
              .getDetails(cardBatchId)
              .collectStats(collectStats)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDateClosed());
      System.out.println(result.getClosed());
      System.out.println(result.getTerminalId());
      System.out.println(result.getBatchNumber());
      System.out.println(result.getNetSales());
      System.out.println(result.getTotalSales());
      System.out.println(result.getTotalRefunds());
      System.out.println(result.getTotalReversed());
      System.out.println(result.getTotalRefundsReversed());
      System.out.println(result.getCountTotal());
      System.out.println(result.getCountApproved());
      System.out.println(result.getCountDeclined());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardBatchApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardBatch> response = client
              .cardBatch
              .getDetails(cardBatchId)
              .collectStats(collectStats)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardBatchApi#getDetails");
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
| **cardBatchId** | **Integer**| The Card Batch Id of the Card Batch you want to get | |
| **collectStats** | **String**| Includes transaction statistics for the batch | [optional] [enum: true, false] |

### Return type

[**CardBatch**](CardBatch.md)

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

<a name="settleBatch"></a>
# **settleBatch**
> CardBatch settleBatch(cardBatchId).execute();

Settles an Open Card Batch

### Example
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
    Integer cardBatchId = 56; // The Card Batch Id of the Card Batch you want to settle
    try {
      CardBatch result = client
              .cardBatch
              .settleBatch(cardBatchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDateClosed());
      System.out.println(result.getClosed());
      System.out.println(result.getTerminalId());
      System.out.println(result.getBatchNumber());
      System.out.println(result.getNetSales());
      System.out.println(result.getTotalSales());
      System.out.println(result.getTotalRefunds());
      System.out.println(result.getTotalReversed());
      System.out.println(result.getTotalRefundsReversed());
      System.out.println(result.getCountTotal());
      System.out.println(result.getCountApproved());
      System.out.println(result.getCountDeclined());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardBatchApi#settleBatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardBatch> response = client
              .cardBatch
              .settleBatch(cardBatchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardBatchApi#settleBatch");
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
| **cardBatchId** | **Integer**| The Card Batch Id of the Card Batch you want to settle | |

### Return type

[**CardBatch**](CardBatch.md)

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

