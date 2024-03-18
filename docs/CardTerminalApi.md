# CardTerminalApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](CardTerminalApi.md#getAll) | **GET** /card-terminals | Get card terminals |


<a name="getAll"></a>
# **getAll**
> List&lt;CardTerminal&gt; getAll().cardTerminalsRequest(cardTerminalsRequest).execute();

Get card terminals

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardTerminalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String currency = "currency_example"; // The abbreviation of card terminal's currency. Possible values are CAD | USD
    String status = "status_example"; // The card terminal's status. possible values are ACTIVE | INACTIVE
    try {
      List<CardTerminal> result = client
              .cardTerminal
              .getAll()
              .currency(currency)
              .status(status)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTerminalApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CardTerminal>> response = client
              .cardTerminal
              .getAll()
              .currency(currency)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTerminalApi#getAll");
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
| **cardTerminalsRequest** | [**CardTerminalsRequest**](CardTerminalsRequest.md)|  | [optional] |

### Return type

[**List&lt;CardTerminal&gt;**](CardTerminal.md)

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

