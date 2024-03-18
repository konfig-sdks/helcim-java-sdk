# CustomerApi

All URIs are relative to *https://api.helcim.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCustomer**](CustomerApi.md#createNewCustomer) | **POST** /customers | Create customer |
| [**getBankAccount**](CustomerApi.md#getBankAccount) | **GET** /customers/{customerId}/bank-accounts/{bankAccountId} | Get customer bank account |
| [**getBankAccounts**](CustomerApi.md#getBankAccounts) | **GET** /customers/{customerId}/bank-accounts | Get customer bank accounts |
| [**getCardDetails**](CustomerApi.md#getCardDetails) | **GET** /customers/{customerId}/cards/{cardId} | Get customer card |
| [**getCards**](CustomerApi.md#getCards) | **GET** /customers/{customerId}/cards | Get customer cards |
| [**getCustomer**](CustomerApi.md#getCustomer) | **GET** /customers/{customerId} | Get customer |
| [**list**](CustomerApi.md#list) | **GET** /customers | Get customers |
| [**setBankAccountDefault**](CustomerApi.md#setBankAccountDefault) | **PATCH** /customers/{customerId}/bank-accounts/{bankAccountId}/default | Set customer bank account as default |
| [**updateDetails**](CustomerApi.md#updateDetails) | **PUT** /customers/{customerId} | Update customer |


<a name="createNewCustomer"></a>
# **createNewCustomer**
> Customer createNewCustomer().customerRequest(customerRequest).execute();

Create customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String customerCode = "customerCode_example"; // The unique customer code. If blank, it will be automatically generated.
    String contactName = "contactName_example"; // The primary contact name (full name) of the customer.
    String businessName = "businessName_example"; // The business name of the customer. There must be either a contact name or business name present.
    String cellPhone = "cellPhone_example"; // The cell phone number of the customer.
    Address billingAddress = new Address();
    Address shippingAddress = new Address();
    try {
      Customer result = client
              .customer
              .createNewCustomer()
              .customerCode(customerCode)
              .contactName(contactName)
              .businessName(businessName)
              .cellPhone(cellPhone)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getBusinessName());
      System.out.println(result.getContactName());
      System.out.println(result.getCellPhone());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getCards());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createNewCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customer> response = client
              .customer
              .createNewCustomer()
              .customerCode(customerCode)
              .contactName(contactName)
              .businessName(businessName)
              .cellPhone(cellPhone)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createNewCustomer");
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
| **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  | [optional] |

### Return type

[**Customer**](Customer.md)

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

<a name="getBankAccount"></a>
# **getBankAccount**
> List&lt;BankAccountResponse&gt; getBankAccount(customerId, bankAccountId).execute();

Get customer bank account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer customerId = 56; // The Id of the customer
    Integer bankAccountId = 56; // The Id of the bank account
    try {
      List<BankAccountResponse> result = client
              .customer
              .getBankAccount(customerId, bankAccountId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<BankAccountResponse>> response = client
              .customer
              .getBankAccount(customerId, bankAccountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getBankAccount");
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
| **customerId** | **Integer**| The Id of the customer | |
| **bankAccountId** | **Integer**| The Id of the bank account | |

### Return type

[**List&lt;BankAccountResponse&gt;**](BankAccountResponse.md)

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

<a name="getBankAccounts"></a>
# **getBankAccounts**
> List&lt;BankAccountResponse&gt; getBankAccounts(customerId).bankToken(bankToken).verified(verified).ready(ready).execute();

Get customer bank accounts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer customerId = 56; // The Id of the customer
    String bankToken = "bankToken_example"; // The bank account token.
    Double verified = 3.4D; // Check if bank account is verified or not. use 1 or 0.
    Double ready = 3.4D; // Check if bank account is ready or not. use 1 or 0.
    try {
      List<BankAccountResponse> result = client
              .customer
              .getBankAccounts(customerId)
              .bankToken(bankToken)
              .verified(verified)
              .ready(ready)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<BankAccountResponse>> response = client
              .customer
              .getBankAccounts(customerId)
              .bankToken(bankToken)
              .verified(verified)
              .ready(ready)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getBankAccounts");
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
| **customerId** | **Integer**| The Id of the customer | |
| **bankToken** | **String**| The bank account token. | [optional] |
| **verified** | **Double**| Check if bank account is verified or not. use 1 or 0. | [optional] |
| **ready** | **Double**| Check if bank account is ready or not. use 1 or 0. | [optional] |

### Return type

[**List&lt;BankAccountResponse&gt;**](BankAccountResponse.md)

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

<a name="getCardDetails"></a>
# **getCardDetails**
> List&lt;CardResponse&gt; getCardDetails(customerId, cardId).execute();

Get customer card

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer customerId = 56; // The Id of the customer
    Integer cardId = 56; // The Id of the card
    try {
      List<CardResponse> result = client
              .customer
              .getCardDetails(customerId, cardId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCardDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CardResponse>> response = client
              .customer
              .getCardDetails(customerId, cardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCardDetails");
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
| **customerId** | **Integer**| The Id of the customer | |
| **cardId** | **Integer**| The Id of the card | |

### Return type

[**List&lt;CardResponse&gt;**](CardResponse.md)

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

<a name="getCards"></a>
# **getCards**
> List&lt;CardResponse&gt; getCards(customerId).cardToken(cardToken).execute();

Get customer cards

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer customerId = 56; // The Id of the customer
    String cardToken = "907af81acc0224e0134949"; // The card token.
    try {
      List<CardResponse> result = client
              .customer
              .getCards(customerId)
              .cardToken(cardToken)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CardResponse>> response = client
              .customer
              .getCards(customerId)
              .cardToken(cardToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCards");
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
| **customerId** | **Integer**| The Id of the customer | |
| **cardToken** | **String**| The card token. | [optional] |

### Return type

[**List&lt;CardResponse&gt;**](CardResponse.md)

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

<a name="getCustomer"></a>
# **getCustomer**
> Customer getCustomer(customerId).execute();

Get customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer customerId = 56; // The Id of the customer
    try {
      Customer result = client
              .customer
              .getCustomer(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getBusinessName());
      System.out.println(result.getContactName());
      System.out.println(result.getCellPhone());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getCards());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customer> response = client
              .customer
              .getCustomer(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCustomer");
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
| **customerId** | **Integer**| The Id of the customer | |

### Return type

[**Customer**](Customer.md)

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
> List&lt;Customer&gt; list().search(search).customerCode(customerCode).execute();

Get customers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String search = "john"; // The search term to be used for partial matching on contactName, businessName, customerCode, city, phone and email (Only use one query field per request).
    String customerCode = "CST1000"; // Existing customer code (Only use one query field per request).
    try {
      List<Customer> result = client
              .customer
              .list()
              .search(search)
              .customerCode(customerCode)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Customer>> response = client
              .customer
              .list()
              .search(search)
              .customerCode(customerCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#list");
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
| **search** | **String**| The search term to be used for partial matching on contactName, businessName, customerCode, city, phone and email (Only use one query field per request). | [optional] |
| **customerCode** | **String**| Existing customer code (Only use one query field per request). | [optional] |

### Return type

[**List&lt;Customer&gt;**](Customer.md)

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

<a name="setBankAccountDefault"></a>
# **setBankAccountDefault**
> List&lt;BankAccountResponse&gt; setBankAccountDefault(customerId, bankAccountId).execute();

Set customer bank account as default

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    Integer customerId = 56; // The Id of the customer
    Integer bankAccountId = 56; // The Id of the bank account
    try {
      List<BankAccountResponse> result = client
              .customer
              .setBankAccountDefault(customerId, bankAccountId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#setBankAccountDefault");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<BankAccountResponse>> response = client
              .customer
              .setBankAccountDefault(customerId, bankAccountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#setBankAccountDefault");
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
| **customerId** | **Integer**| The Id of the customer | |
| **bankAccountId** | **Integer**| The Id of the bank account | |

### Return type

[**List&lt;BankAccountResponse&gt;**](BankAccountResponse.md)

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
> Customer updateDetails(customerId).customerUpdateRequest(customerUpdateRequest).execute();

Update customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Helcim;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.helcim.com/v2";
    
    configuration.apiAccessAuth  = "YOUR API KEY";
    Helcim client = new Helcim(configuration);
    String customerId = "customerId_example"; // The Id of the customer
    String customerCode = "customerCode_example"; // The unique customer code.
    String contactName = "contactName_example"; // The primary contact name (full name) of the customer.
    String businessName = "businessName_example"; // The business name of the customer. There must be either a contact name or business name present.
    String cellPhone = "cellPhone_example"; // The cell phone number of the customer.
    Address billingAddress = new Address();
    Address shippingAddress = new Address();
    try {
      Customer result = client
              .customer
              .updateDetails(customerId)
              .customerCode(customerCode)
              .contactName(contactName)
              .businessName(businessName)
              .cellPhone(cellPhone)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomerCode());
      System.out.println(result.getBusinessName());
      System.out.println(result.getContactName());
      System.out.println(result.getCellPhone());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getCards());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customer> response = client
              .customer
              .updateDetails(customerId)
              .customerCode(customerCode)
              .contactName(contactName)
              .businessName(businessName)
              .cellPhone(cellPhone)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateDetails");
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
| **customerId** | **String**| The Id of the customer | |
| **customerUpdateRequest** | [**CustomerUpdateRequest**](CustomerUpdateRequest.md)|  | [optional] |

### Return type

[**Customer**](Customer.md)

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

