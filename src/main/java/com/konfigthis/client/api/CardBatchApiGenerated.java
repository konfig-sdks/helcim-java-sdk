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


import com.konfigthis.client.model.CardBatch;
import com.konfigthis.client.model.FailedPaymentResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CardBatchApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CardBatchApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CardBatchApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllCall(Double batchNumber, Double terminalId, String collectStats, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/card-batches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (batchNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("batchNumber", batchNumber));
        }

        if (terminalId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("terminalId", terminalId));
        }

        if (collectStats != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collect-stats", collectStats));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAccessAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllValidateBeforeCall(Double batchNumber, Double terminalId, String collectStats, final ApiCallback _callback) throws ApiException {
        return getAllCall(batchNumber, terminalId, collectStats, _callback);

    }


    private ApiResponse<List<CardBatch>> getAllWithHttpInfo(Double batchNumber, Double terminalId, String collectStats) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(batchNumber, terminalId, collectStats, null);
        Type localVarReturnType = new TypeToken<List<CardBatch>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(Double batchNumber, Double terminalId, String collectStats, final ApiCallback<List<CardBatch>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(batchNumber, terminalId, collectStats, _callback);
        Type localVarReturnType = new TypeToken<List<CardBatch>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {
        private Double batchNumber;
        private Double terminalId;
        private String collectStats;

        private GetAllRequestBuilder() {
        }

        /**
         * Set batchNumber
         * @param batchNumber The number of the batch to retrieve. Note that this is the batch number, not batch ID. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder batchNumber(Double batchNumber) {
            this.batchNumber = batchNumber;
            return this;
        }
        
        /**
         * Set terminalId
         * @param terminalId The terminalId of the requested batch (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder terminalId(Double terminalId) {
            this.terminalId = terminalId;
            return this;
        }
        
        /**
         * Set collectStats
         * @param collectStats Includes transaction statistics for the batch (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder collectStats(String collectStats) {
            this.collectStats = collectStats;
            return this;
        }
        
        /**
         * Build call for getAll
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
            return getAllCall(batchNumber, terminalId, collectStats, _callback);
        }


        /**
         * Execute getAll request
         * @return List&lt;CardBatch&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public List<CardBatch> execute() throws ApiException {
            ApiResponse<List<CardBatch>> localVarResp = getAllWithHttpInfo(batchNumber, terminalId, collectStats);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CardBatch&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CardBatch>> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo(batchNumber, terminalId, collectStats);
        }

        /**
         * Execute getAll request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<List<CardBatch>> _callback) throws ApiException {
            return getAllAsync(batchNumber, terminalId, collectStats, _callback);
        }
    }

    /**
     * Get Card Batches
     * 
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
    private okhttp3.Call getDetailsCall(Integer cardBatchId, String collectStats, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/card-batches/{cardBatchId}"
            .replace("{" + "cardBatchId" + "}", localVarApiClient.escapeString(cardBatchId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (collectStats != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collect-stats", collectStats));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAccessAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(Integer cardBatchId, String collectStats, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cardBatchId' is set
        if (cardBatchId == null) {
            throw new ApiException("Missing the required parameter 'cardBatchId' when calling getDetails(Async)");
        }

        return getDetailsCall(cardBatchId, collectStats, _callback);

    }


    private ApiResponse<CardBatch> getDetailsWithHttpInfo(Integer cardBatchId, String collectStats) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(cardBatchId, collectStats, null);
        Type localVarReturnType = new TypeToken<CardBatch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(Integer cardBatchId, String collectStats, final ApiCallback<CardBatch> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(cardBatchId, collectStats, _callback);
        Type localVarReturnType = new TypeToken<CardBatch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final Integer cardBatchId;
        private String collectStats;

        private GetDetailsRequestBuilder(Integer cardBatchId) {
            this.cardBatchId = cardBatchId;
        }

        /**
         * Set collectStats
         * @param collectStats Includes transaction statistics for the batch (optional)
         * @return GetDetailsRequestBuilder
         */
        public GetDetailsRequestBuilder collectStats(String collectStats) {
            this.collectStats = collectStats;
            return this;
        }
        
        /**
         * Build call for getDetails
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
            return getDetailsCall(cardBatchId, collectStats, _callback);
        }


        /**
         * Execute getDetails request
         * @return CardBatch
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public CardBatch execute() throws ApiException {
            ApiResponse<CardBatch> localVarResp = getDetailsWithHttpInfo(cardBatchId, collectStats);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;CardBatch&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CardBatch> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(cardBatchId, collectStats);
        }

        /**
         * Execute getDetails request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<CardBatch> _callback) throws ApiException {
            return getDetailsAsync(cardBatchId, collectStats, _callback);
        }
    }

    /**
     * Get Card Batch
     * 
     * @param cardBatchId The Card Batch Id of the Card Batch you want to get (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(Integer cardBatchId) throws IllegalArgumentException {
        if (cardBatchId == null) throw new IllegalArgumentException("\"cardBatchId\" is required but got null");
        return new GetDetailsRequestBuilder(cardBatchId);
    }
    private okhttp3.Call settleBatchCall(Integer cardBatchId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/card-batches/{cardBatchId}/settle"
            .replace("{" + "cardBatchId" + "}", localVarApiClient.escapeString(cardBatchId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAccessAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call settleBatchValidateBeforeCall(Integer cardBatchId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cardBatchId' is set
        if (cardBatchId == null) {
            throw new ApiException("Missing the required parameter 'cardBatchId' when calling settleBatch(Async)");
        }

        return settleBatchCall(cardBatchId, _callback);

    }


    private ApiResponse<CardBatch> settleBatchWithHttpInfo(Integer cardBatchId) throws ApiException {
        okhttp3.Call localVarCall = settleBatchValidateBeforeCall(cardBatchId, null);
        Type localVarReturnType = new TypeToken<CardBatch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call settleBatchAsync(Integer cardBatchId, final ApiCallback<CardBatch> _callback) throws ApiException {

        okhttp3.Call localVarCall = settleBatchValidateBeforeCall(cardBatchId, _callback);
        Type localVarReturnType = new TypeToken<CardBatch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SettleBatchRequestBuilder {
        private final Integer cardBatchId;

        private SettleBatchRequestBuilder(Integer cardBatchId) {
            this.cardBatchId = cardBatchId;
        }

        /**
         * Build call for settleBatch
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
            return settleBatchCall(cardBatchId, _callback);
        }


        /**
         * Execute settleBatch request
         * @return CardBatch
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public CardBatch execute() throws ApiException {
            ApiResponse<CardBatch> localVarResp = settleBatchWithHttpInfo(cardBatchId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute settleBatch request with HTTP info returned
         * @return ApiResponse&lt;CardBatch&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CardBatch> executeWithHttpInfo() throws ApiException {
            return settleBatchWithHttpInfo(cardBatchId);
        }

        /**
         * Execute settleBatch request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<CardBatch> _callback) throws ApiException {
            return settleBatchAsync(cardBatchId, _callback);
        }
    }

    /**
     * Settles an Open Card Batch
     * 
     * @param cardBatchId The Card Batch Id of the Card Batch you want to settle (required)
     * @return SettleBatchRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public SettleBatchRequestBuilder settleBatch(Integer cardBatchId) throws IllegalArgumentException {
        if (cardBatchId == null) throw new IllegalArgumentException("\"cardBatchId\" is required but got null");
        return new SettleBatchRequestBuilder(cardBatchId);
    }
}
