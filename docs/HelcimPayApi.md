# HelcimPayApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCheckoutSession**](HelcimPayApi.md#createCheckoutSession) | **POST** /helcim-pay/initialize | Creates a HelcimPay.js Checkout Session |


<a name="createCheckoutSession"></a>
# **createCheckoutSession**
> CheckoutInit200Response createCheckoutSession().helcimPayInitializeRequest(helcimPayInitializeRequest).execute();

Creates a HelcimPay.js Checkout Session

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HelcimPayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String paymentType = "paymentType_example"; // Payment Type. Valid payment types are purchase | preauth | verify
    Double amount = 3.4D; // The amount of the transaction to be processed
    String currency = "currency_example"; // Currency abbreviation. CAD | USD
    String customerCode = "customerCode_example"; // This is the code of an existing customer in Helcim associated with this checkout
    String invoiceNumber = "invoiceNumber_example"; // This is the number of an existing invoice in Helcim associated with this checkout
    String paymentMethod = "paymentMethod_example"; // This is the payment method (credit card, ACH) that customer can use to pay the amount. cc | ach | cc-ach
    Double allowPartial = 3.4D; // This is used to determine whether the partial payment UI will be displayed to the customer
    Double hasConvenienceFee = 3.4D; // This is used to apply the convenience fee rate to credit card transaction should customer chooses this payment method
    Double taxAmount = 3.4D; // This is used to enable level 2 processing lower rates. The value should be the dollar amount of the tax to 2 decimal places.
    try {
      CheckoutInit200Response result = client
              .helcimPay
              .createCheckoutSession(paymentType, amount, currency)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .paymentMethod(paymentMethod)
              .allowPartial(allowPartial)
              .hasConvenienceFee(hasConvenienceFee)
              .taxAmount(taxAmount)
              .execute();
      System.out.println(result);
      System.out.println(result.getCheckoutToken());
      System.out.println(result.getSecretToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling HelcimPayApi#createCheckoutSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutInit200Response> response = client
              .helcimPay
              .createCheckoutSession(paymentType, amount, currency)
              .customerCode(customerCode)
              .invoiceNumber(invoiceNumber)
              .paymentMethod(paymentMethod)
              .allowPartial(allowPartial)
              .hasConvenienceFee(hasConvenienceFee)
              .taxAmount(taxAmount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HelcimPayApi#createCheckoutSession");
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
| **helcimPayInitializeRequest** | [**HelcimPayInitializeRequest**](HelcimPayInitializeRequest.md)|  | [optional] |

### Return type

[**CheckoutInit200Response**](CheckoutInit200Response.md)

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

