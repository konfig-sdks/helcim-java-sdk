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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CheckoutInit200Response;
import com.konfigthis.client.model.CheckoutInitDefaultResponse;
import com.konfigthis.client.model.HelcimPayInitializeRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HelcimPayApi
 */
@Disabled
public class HelcimPayApiTest {

    private static HelcimPayApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new HelcimPayApi(apiClient);
    }

    /**
     * Creates a HelcimPay.js Checkout Session
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCheckoutSessionTest() throws ApiException {
        String paymentType = null;
        Double amount = null;
        String currency = null;
        String customerCode = null;
        String invoiceNumber = null;
        String paymentMethod = null;
        Double allowPartial = null;
        Double hasConvenienceFee = null;
        Double taxAmount = null;
        CheckoutInit200Response response = api.createCheckoutSession(paymentType, amount, currency)
                .customerCode(customerCode)
                .invoiceNumber(invoiceNumber)
                .paymentMethod(paymentMethod)
                .allowPartial(allowPartial)
                .hasConvenienceFee(hasConvenienceFee)
                .taxAmount(taxAmount)
                .execute();
        // TODO: test validations
    }

}
