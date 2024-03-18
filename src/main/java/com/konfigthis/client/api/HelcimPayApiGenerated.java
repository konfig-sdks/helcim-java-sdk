/*
 * The Helcim API
 * This API covers publicly accessible merchant actions
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CheckoutInit200Response;
import com.konfigthis.client.model.CheckoutInitDefaultResponse;
import com.konfigthis.client.model.HelcimPayInitializeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class HelcimPayApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HelcimPayApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public HelcimPayApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiAccessAuth() == null) {
            throw new IllegalArgumentException("\"api-token\" is required but no API key was provided. Please set \"api-token\" with ApiClient#setApiAccessAuth(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createCheckoutSessionCall(HelcimPayInitializeRequest helcimPayInitializeRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = helcimPayInitializeRequest;

        // create path and map variables
        String localVarPath = "/helcim-pay/initialize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAccessAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCheckoutSessionValidateBeforeCall(HelcimPayInitializeRequest helcimPayInitializeRequest, final ApiCallback _callback) throws ApiException {
        return createCheckoutSessionCall(helcimPayInitializeRequest, _callback);

    }


    private ApiResponse<CheckoutInit200Response> createCheckoutSessionWithHttpInfo(HelcimPayInitializeRequest helcimPayInitializeRequest) throws ApiException {
        okhttp3.Call localVarCall = createCheckoutSessionValidateBeforeCall(helcimPayInitializeRequest, null);
        Type localVarReturnType = new TypeToken<CheckoutInit200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createCheckoutSessionAsync(HelcimPayInitializeRequest helcimPayInitializeRequest, final ApiCallback<CheckoutInit200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCheckoutSessionValidateBeforeCall(helcimPayInitializeRequest, _callback);
        Type localVarReturnType = new TypeToken<CheckoutInit200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateCheckoutSessionRequestBuilder {
        private final String paymentType;
        private final Double amount;
        private final String currency;
        private String customerCode;
        private String invoiceNumber;
        private String paymentMethod;
        private Double allowPartial;
        private Double hasConvenienceFee;
        private Double taxAmount;

        private CreateCheckoutSessionRequestBuilder(String paymentType, double amount, String currency) {
            this.paymentType = paymentType;
            this.amount = amount;
            this.currency = currency;
        }

        /**
         * Set customerCode
         * @param customerCode This is the code of an existing customer in Helcim associated with this checkout (optional)
         * @return CreateCheckoutSessionRequestBuilder
         */
        public CreateCheckoutSessionRequestBuilder customerCode(String customerCode) {
            this.customerCode = customerCode;
            return this;
        }
        
        /**
         * Set invoiceNumber
         * @param invoiceNumber This is the number of an existing invoice in Helcim associated with this checkout (optional)
         * @return CreateCheckoutSessionRequestBuilder
         */
        public CreateCheckoutSessionRequestBuilder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }
        
        /**
         * Set paymentMethod
         * @param paymentMethod This is the payment method (credit card, ACH) that customer can use to pay the amount. cc | ach | cc-ach (optional)
         * @return CreateCheckoutSessionRequestBuilder
         */
        public CreateCheckoutSessionRequestBuilder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        
        /**
         * Set allowPartial
         * @param allowPartial This is used to determine whether the partial payment UI will be displayed to the customer (optional)
         * @return CreateCheckoutSessionRequestBuilder
         */
        public CreateCheckoutSessionRequestBuilder allowPartial(Double allowPartial) {
            this.allowPartial = allowPartial;
            return this;
        }
        
        /**
         * Set hasConvenienceFee
         * @param hasConvenienceFee This is used to apply the convenience fee rate to credit card transaction should customer chooses this payment method (optional)
         * @return CreateCheckoutSessionRequestBuilder
         */
        public CreateCheckoutSessionRequestBuilder hasConvenienceFee(Double hasConvenienceFee) {
            this.hasConvenienceFee = hasConvenienceFee;
            return this;
        }
        
        /**
         * Set taxAmount
         * @param taxAmount This is used to enable level 2 processing lower rates. The value should be the dollar amount of the tax to 2 decimal places. (optional)
         * @return CreateCheckoutSessionRequestBuilder
         */
        public CreateCheckoutSessionRequestBuilder taxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        
        /**
         * Build call for createCheckoutSession
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            HelcimPayInitializeRequest helcimPayInitializeRequest = buildBodyParams();
            return createCheckoutSessionCall(helcimPayInitializeRequest, _callback);
        }

        private HelcimPayInitializeRequest buildBodyParams() {
            HelcimPayInitializeRequest helcimPayInitializeRequest = new HelcimPayInitializeRequest();
            helcimPayInitializeRequest.paymentType(this.paymentType);
            helcimPayInitializeRequest.amount(this.amount);
            helcimPayInitializeRequest.currency(this.currency);
            helcimPayInitializeRequest.customerCode(this.customerCode);
            helcimPayInitializeRequest.invoiceNumber(this.invoiceNumber);
            helcimPayInitializeRequest.paymentMethod(this.paymentMethod);
            helcimPayInitializeRequest.allowPartial(this.allowPartial);
            helcimPayInitializeRequest.hasConvenienceFee(this.hasConvenienceFee);
            helcimPayInitializeRequest.taxAmount(this.taxAmount);
            return helcimPayInitializeRequest;
        }

        /**
         * Execute createCheckoutSession request
         * @return CheckoutInit200Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public CheckoutInit200Response execute() throws ApiException {
            HelcimPayInitializeRequest helcimPayInitializeRequest = buildBodyParams();
            ApiResponse<CheckoutInit200Response> localVarResp = createCheckoutSessionWithHttpInfo(helcimPayInitializeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createCheckoutSession request with HTTP info returned
         * @return ApiResponse&lt;CheckoutInit200Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CheckoutInit200Response> executeWithHttpInfo() throws ApiException {
            HelcimPayInitializeRequest helcimPayInitializeRequest = buildBodyParams();
            return createCheckoutSessionWithHttpInfo(helcimPayInitializeRequest);
        }

        /**
         * Execute createCheckoutSession request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CheckoutInit200Response> _callback) throws ApiException {
            HelcimPayInitializeRequest helcimPayInitializeRequest = buildBodyParams();
            return createCheckoutSessionAsync(helcimPayInitializeRequest, _callback);
        }
    }

    /**
     * Creates a HelcimPay.js Checkout Session
     * 
     * @return CreateCheckoutSessionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public CreateCheckoutSessionRequestBuilder createCheckoutSession(String paymentType, double amount, String currency) throws IllegalArgumentException {
        if (paymentType == null) throw new IllegalArgumentException("\"paymentType\" is required but got null");
            

        
        if (currency == null) throw new IllegalArgumentException("\"currency\" is required but got null");
            

        return new CreateCheckoutSessionRequestBuilder(paymentType, amount, currency);
    }
}