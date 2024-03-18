package com.konfigthis.client;

import com.konfigthis.client.api.CardBatchApi;
import com.konfigthis.client.api.CardTerminalApi;
import com.konfigthis.client.api.CardTransactionApi;
import com.konfigthis.client.api.CustomerApi;
import com.konfigthis.client.api.GeneralApi;
import com.konfigthis.client.api.HelcimPayApi;
import com.konfigthis.client.api.InvoiceApi;
import com.konfigthis.client.api.PaymentApi;

public class Helcim {
    private ApiClient apiClient;
    public final CardBatchApi cardBatch;
    public final CardTerminalApi cardTerminal;
    public final CardTransactionApi cardTransaction;
    public final CustomerApi customer;
    public final GeneralApi general;
    public final HelcimPayApi helcimPay;
    public final InvoiceApi invoice;
    public final PaymentApi payment;

    public Helcim() {
        this(null);
    }

    public Helcim(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.cardBatch = new CardBatchApi(this.apiClient);
        this.cardTerminal = new CardTerminalApi(this.apiClient);
        this.cardTransaction = new CardTransactionApi(this.apiClient);
        this.customer = new CustomerApi(this.apiClient);
        this.general = new GeneralApi(this.apiClient);
        this.helcimPay = new HelcimPayApi(this.apiClient);
        this.invoice = new InvoiceApi(this.apiClient);
        this.payment = new PaymentApi(this.apiClient);
    }

}
