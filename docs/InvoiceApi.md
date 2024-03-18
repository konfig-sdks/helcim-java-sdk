# InvoiceApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](InvoiceApi.md#createNew) | **POST** /invoices | Create invoice |
| [**getById**](InvoiceApi.md#getById) | **GET** /invoices/{invoiceId} | Get invoice |
| [**list**](InvoiceApi.md#list) | **GET** /invoices | Get invoices |
| [**updateDetails**](InvoiceApi.md#updateDetails) | **PUT** /invoices/{invoiceId} | Update invoice |


<a name="createNew"></a>
# **createNew**
> CreateInvoice200Response createNew().createInvoiceRequest(createInvoiceRequest).execute();

Create invoice

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String invoiceNumber = "invoiceNumber_example"; // Invoice number of invoice to be created. Will be generated if blank
    Double tipAmount = 3.4D; // Tip amount
    Double depositAmount = 3.4D; // Deposit amount
    String notes = "notes_example"; // Comment to appear at the bottom of the invoice, visible to the customer.
    Integer customerId = 56; // Unique customer Id.
    String currency = "currency_example"; // The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.
    String type = "type_example"; // The type of the invoice, such as ESTIMATE | INVOICE | QUOTE | ORDER | PURCHASE_ORDER | STATEMENT | REGISTRATION | CREDIT.
    String status = "status_example"; // The status of invoice, such as DUE | SHIPPED | COMPLETED | CANCELLED
    Address billingAddress = new Address();
    Shipping shipping = new Shipping();
    Pickup pickup = new Pickup();
    Tax tax = new Tax();
    Discount discount = new Discount();
    List<LineItem> lineItems = Arrays.asList();
    try {
      CreateInvoice200Response result = client
              .invoice
              .createNew()
              .invoiceNumber(invoiceNumber)
              .tipAmount(tipAmount)
              .depositAmount(depositAmount)
              .notes(notes)
              .customerId(customerId)
              .currency(currency)
              .type(type)
              .status(status)
              .billingAddress(billingAddress)
              .shipping(shipping)
              .pickup(pickup)
              .tax(tax)
              .discount(discount)
              .lineItems(lineItems)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceId());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getTipAmount());
      System.out.println(result.getDepositAmount());
      System.out.println(result.getNotes());
      System.out.println(result.getCustomerId());
      System.out.println(result.getCurrency());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShipping());
      System.out.println(result.getPickup());
      System.out.println(result.getTax());
      System.out.println(result.getDiscount());
      System.out.println(result.getLineItems());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDatePaid());
      System.out.println(result.getDateIssued());
      System.out.println(result.getAmount());
      System.out.println(result.getConvenienceFee());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateInvoice200Response> response = client
              .invoice
              .createNew()
              .invoiceNumber(invoiceNumber)
              .tipAmount(tipAmount)
              .depositAmount(depositAmount)
              .notes(notes)
              .customerId(customerId)
              .currency(currency)
              .type(type)
              .status(status)
              .billingAddress(billingAddress)
              .shipping(shipping)
              .pickup(pickup)
              .tax(tax)
              .discount(discount)
              .lineItems(lineItems)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#createNew");
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
| **createInvoiceRequest** | [**CreateInvoiceRequest**](CreateInvoiceRequest.md)|  | [optional] |

### Return type

[**CreateInvoice200Response**](CreateInvoice200Response.md)

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

<a name="getById"></a>
# **getById**
> GetInvoice200Response getById(invoiceId).execute();

Get invoice

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String invoiceId = "invoiceId_example"; // The unique invoice Id
    try {
      GetInvoice200Response result = client
              .invoice
              .getById(invoiceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceId());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getTipAmount());
      System.out.println(result.getDepositAmount());
      System.out.println(result.getNotes());
      System.out.println(result.getCustomerId());
      System.out.println(result.getCurrency());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShipping());
      System.out.println(result.getPickup());
      System.out.println(result.getTax());
      System.out.println(result.getDiscount());
      System.out.println(result.getLineItems());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDatePaid());
      System.out.println(result.getDateIssued());
      System.out.println(result.getAmount());
      System.out.println(result.getConvenienceFee());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetInvoice200Response> response = client
              .invoice
              .getById(invoiceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getById");
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
| **invoiceId** | **String**| The unique invoice Id | |

### Return type

[**GetInvoice200Response**](GetInvoice200Response.md)

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

<a name="list"></a>
# **list**
> List&lt;GetInvoices200ResponseInner&gt; list().invoiceNumber(invoiceNumber).dateStart(dateStart).dateEnd(dateEnd).withConvenienceFee(withConvenienceFee).execute();

Get invoices

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String invoiceNumber = "INV1000"; // The number of the invoice associated with the transaction
    String dateStart = "2020-01-01"; // Filters transactions created from 2020-01-01 (Mountain Time)
    String dateEnd = "2021-01-01"; // Filters transactions created until 2021-01-01 (Mountain Time)
    Integer withConvenienceFee = 1; // Include convenience fee of each invoice 0 | 1
    try {
      List<GetInvoices200ResponseInner> result = client
              .invoice
              .list()
              .invoiceNumber(invoiceNumber)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .withConvenienceFee(withConvenienceFee)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<GetInvoices200ResponseInner>> response = client
              .invoice
              .list()
              .invoiceNumber(invoiceNumber)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .withConvenienceFee(withConvenienceFee)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#list");
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
| **invoiceNumber** | **String**| The number of the invoice associated with the transaction | [optional] |
| **dateStart** | **String**| Filters transactions created from 2020-01-01 (Mountain Time) | [optional] |
| **dateEnd** | **String**| Filters transactions created until 2021-01-01 (Mountain Time) | [optional] |
| **withConvenienceFee** | **Integer**| Include convenience fee of each invoice 0 | 1 | [optional] |

### Return type

[**List&lt;GetInvoices200ResponseInner&gt;**](GetInvoices200ResponseInner.md)

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

<a name="updateDetails"></a>
# **updateDetails**
> GetInvoice200Response updateDetails(invoiceId).updateInvoiceRequest(updateInvoiceRequest).execute();

Update invoice

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String invoiceId = "invoiceId_example"; // The unique invoice Id
    String invoiceNumber = "invoiceNumber_example"; // Invoice number of invoice to be created. Will be generated if blank
    Double tipAmount = 3.4D; // Tip amount
    Double depositAmount = 3.4D; // Deposit amount
    String notes = "notes_example"; // Comment to appear at the bottom of the invoice, visible to the customer.
    String currency = "currency_example"; // The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.
    String type = "type_example"; // The type of the invoice, such as ESTIMATE | INVOICE | QUOTE | ORDER | PURCHASE_ORDER | STATEMENT | REGISTRATION | CREDIT.
    String status = "status_example"; // The status of invoice, such as DUE | SHIPPED | COMPLETED | CANCELLED
    Address billingAddress = new Address();
    try {
      GetInvoice200Response result = client
              .invoice
              .updateDetails(invoiceId)
              .invoiceNumber(invoiceNumber)
              .tipAmount(tipAmount)
              .depositAmount(depositAmount)
              .notes(notes)
              .currency(currency)
              .type(type)
              .status(status)
              .billingAddress(billingAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceId());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getTipAmount());
      System.out.println(result.getDepositAmount());
      System.out.println(result.getNotes());
      System.out.println(result.getCustomerId());
      System.out.println(result.getCurrency());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShipping());
      System.out.println(result.getPickup());
      System.out.println(result.getTax());
      System.out.println(result.getDiscount());
      System.out.println(result.getLineItems());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDatePaid());
      System.out.println(result.getDateIssued());
      System.out.println(result.getAmount());
      System.out.println(result.getConvenienceFee());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetInvoice200Response> response = client
              .invoice
              .updateDetails(invoiceId)
              .invoiceNumber(invoiceNumber)
              .tipAmount(tipAmount)
              .depositAmount(depositAmount)
              .notes(notes)
              .currency(currency)
              .type(type)
              .status(status)
              .billingAddress(billingAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#updateDetails");
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
| **invoiceId** | **String**| The unique invoice Id | |
| **updateInvoiceRequest** | [**UpdateInvoiceRequest**](UpdateInvoiceRequest.md)|  | [optional] |

### Return type

[**GetInvoice200Response**](GetInvoice200Response.md)

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

