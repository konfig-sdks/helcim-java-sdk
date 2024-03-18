# GeneralApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**testConnectivityToHelcimApi**](GeneralApi.md#testConnectivityToHelcimApi) | **GET** /connection-test | Tests connectivity to the Helcim API |


<a name="testConnectivityToHelcimApi"></a>
# **testConnectivityToHelcimApi**
> Object testConnectivityToHelcimApi().execute();

Tests connectivity to the Helcim API

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneralApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    try {
      Object result = client
              .general
              .testConnectivityToHelcimApi()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#testConnectivityToHelcimApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .general
              .testConnectivityToHelcimApi()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#testConnectivityToHelcimApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[ApiAccessAuth](../README.md#ApiAccessAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

