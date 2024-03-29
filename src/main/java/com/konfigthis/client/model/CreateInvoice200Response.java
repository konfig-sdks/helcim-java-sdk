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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Address;
import com.konfigthis.client.model.Discount;
import com.konfigthis.client.model.LineItem;
import com.konfigthis.client.model.Pickup;
import com.konfigthis.client.model.Shipping;
import com.konfigthis.client.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CreateInvoice200Response
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateInvoice200Response {
  public static final String SERIALIZED_NAME_INVOICE_ID = "invoiceId";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private Double invoiceId;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_TIP_AMOUNT = "tipAmount";
  @SerializedName(SERIALIZED_NAME_TIP_AMOUNT)
  private Double tipAmount;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "depositAmount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Double depositAmount;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Integer customerId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private Shipping shipping;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Pickup pickup;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Tax tax;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<LineItem> lineItems = null;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private String dateUpdated;

  public static final String SERIALIZED_NAME_DATE_PAID = "datePaid";
  @SerializedName(SERIALIZED_NAME_DATE_PAID)
  private String datePaid;

  public static final String SERIALIZED_NAME_DATE_ISSUED = "dateIssued";
  @SerializedName(SERIALIZED_NAME_DATE_ISSUED)
  private String dateIssued;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_CONVENIENCE_FEE = "convenienceFee";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_FEE)
  private Double convenienceFee;

  public CreateInvoice200Response() {
  }

  public CreateInvoice200Response invoiceId(Double invoiceId) {
    
    
    
    
    this.invoiceId = invoiceId;
    return this;
  }

  public CreateInvoice200Response invoiceId(Integer invoiceId) {
    
    
    
    
    this.invoiceId = invoiceId.doubleValue();
    return this;
  }

   /**
   * Unique Invoice Id
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12321", value = "Unique Invoice Id")

  public Double getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(Double invoiceId) {
    
    
    
    this.invoiceId = invoiceId;
  }


  public CreateInvoice200Response invoiceNumber(String invoiceNumber) {
    
    
    
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number of invoice to be created. Will be generated if blank
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INV1000", value = "Invoice number of invoice to be created. Will be generated if blank")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    
    
    
    this.invoiceNumber = invoiceNumber;
  }


  public CreateInvoice200Response tipAmount(Double tipAmount) {
    
    
    
    
    this.tipAmount = tipAmount;
    return this;
  }

  public CreateInvoice200Response tipAmount(Integer tipAmount) {
    
    
    
    
    this.tipAmount = tipAmount.doubleValue();
    return this;
  }

   /**
   * Tip amount
   * @return tipAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "Tip amount")

  public Double getTipAmount() {
    return tipAmount;
  }


  public void setTipAmount(Double tipAmount) {
    
    
    
    this.tipAmount = tipAmount;
  }


  public CreateInvoice200Response depositAmount(Double depositAmount) {
    
    
    
    
    this.depositAmount = depositAmount;
    return this;
  }

  public CreateInvoice200Response depositAmount(Integer depositAmount) {
    
    
    
    
    this.depositAmount = depositAmount.doubleValue();
    return this;
  }

   /**
   * Deposit amount
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Deposit amount")

  public Double getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Double depositAmount) {
    
    
    
    this.depositAmount = depositAmount;
  }


  public CreateInvoice200Response notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Comment to appear at the bottom of the invoice, visible to the customer.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "No vegetables please", value = "Comment to appear at the bottom of the invoice, visible to the customer.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public CreateInvoice200Response customerId(Integer customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The id of customer associated to the invoice.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234", value = "The id of customer associated to the invoice.")

  public Integer getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Integer customerId) {
    
    
    
    this.customerId = customerId;
  }


  public CreateInvoice200Response currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAD", value = "The currency abbreviation of the invoice, such as CAD or USD. This should match currency of existing invoice.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public CreateInvoice200Response type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of the invoice, such as ESTIMATE | INVOICE | QUOTE | ORDER | PURCHASE_ORDER | STATEMENT | REGISTRATION | CREDIT.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVOICE", value = "The type of the invoice, such as ESTIMATE | INVOICE | QUOTE | ORDER | PURCHASE_ORDER | STATEMENT | REGISTRATION | CREDIT.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public CreateInvoice200Response status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice, such as due | paid | completed | refunded.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "due", value = "The status of the invoice, such as due | paid | completed | refunded.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public CreateInvoice200Response billingAddress(Address billingAddress) {
    
    
    
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    
    
    
    this.billingAddress = billingAddress;
  }


  public CreateInvoice200Response shipping(Shipping shipping) {
    
    
    
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Shipping getShipping() {
    return shipping;
  }


  public void setShipping(Shipping shipping) {
    
    
    
    this.shipping = shipping;
  }


  public CreateInvoice200Response pickup(Pickup pickup) {
    
    
    
    
    this.pickup = pickup;
    return this;
  }

   /**
   * Get pickup
   * @return pickup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pickup getPickup() {
    return pickup;
  }


  public void setPickup(Pickup pickup) {
    
    
    
    this.pickup = pickup;
  }


  public CreateInvoice200Response tax(Tax tax) {
    
    
    
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Tax getTax() {
    return tax;
  }


  public void setTax(Tax tax) {
    
    
    
    this.tax = tax;
  }


  public CreateInvoice200Response discount(Discount discount) {
    
    
    
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    
    
    
    this.discount = discount;
  }


  public CreateInvoice200Response lineItems(List<LineItem> lineItems) {
    
    
    
    
    this.lineItems = lineItems;
    return this;
  }

  public CreateInvoice200Response addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<LineItem> lineItems) {
    
    
    
    this.lineItems = lineItems;
  }


  public CreateInvoice200Response dateCreated(String dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date the invoice is created.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:30:50", value = "Date the invoice is created.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public CreateInvoice200Response dateUpdated(String dateUpdated) {
    
    
    
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Date the invoice is updated.
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 20:30:50", value = "Date the invoice is updated.")

  public String getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(String dateUpdated) {
    
    
    
    this.dateUpdated = dateUpdated;
  }


  public CreateInvoice200Response datePaid(String datePaid) {
    
    
    
    
    this.datePaid = datePaid;
    return this;
  }

   /**
   * Date the invoice is paid.
   * @return datePaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:30:50", value = "Date the invoice is paid.")

  public String getDatePaid() {
    return datePaid;
  }


  public void setDatePaid(String datePaid) {
    
    
    
    this.datePaid = datePaid;
  }


  public CreateInvoice200Response dateIssued(String dateIssued) {
    
    
    
    
    this.dateIssued = dateIssued;
    return this;
  }

   /**
   * Date the invoice is paid.
   * @return dateIssued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:30:50", value = "Date the invoice is paid.")

  public String getDateIssued() {
    return dateIssued;
  }


  public void setDateIssued(String dateIssued) {
    
    
    
    this.dateIssued = dateIssued;
  }


  public CreateInvoice200Response amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public CreateInvoice200Response amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * The total amount of the invoice.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.99", value = "The total amount of the invoice.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public CreateInvoice200Response convenienceFee(Double convenienceFee) {
    
    
    
    
    this.convenienceFee = convenienceFee;
    return this;
  }

  public CreateInvoice200Response convenienceFee(Integer convenienceFee) {
    
    
    
    
    this.convenienceFee = convenienceFee.doubleValue();
    return this;
  }

   /**
   * The total convenience fee paid for the invoice.
   * @return convenienceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The total convenience fee paid for the invoice.")

  public Double getConvenienceFee() {
    return convenienceFee;
  }


  public void setConvenienceFee(Double convenienceFee) {
    
    
    
    this.convenienceFee = convenienceFee;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateInvoice200Response instance itself
   */
  public CreateInvoice200Response putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInvoice200Response createInvoice200Response = (CreateInvoice200Response) o;
    return Objects.equals(this.invoiceId, createInvoice200Response.invoiceId) &&
        Objects.equals(this.invoiceNumber, createInvoice200Response.invoiceNumber) &&
        Objects.equals(this.tipAmount, createInvoice200Response.tipAmount) &&
        Objects.equals(this.depositAmount, createInvoice200Response.depositAmount) &&
        Objects.equals(this.notes, createInvoice200Response.notes) &&
        Objects.equals(this.customerId, createInvoice200Response.customerId) &&
        Objects.equals(this.currency, createInvoice200Response.currency) &&
        Objects.equals(this.type, createInvoice200Response.type) &&
        Objects.equals(this.status, createInvoice200Response.status) &&
        Objects.equals(this.billingAddress, createInvoice200Response.billingAddress) &&
        Objects.equals(this.shipping, createInvoice200Response.shipping) &&
        Objects.equals(this.pickup, createInvoice200Response.pickup) &&
        Objects.equals(this.tax, createInvoice200Response.tax) &&
        Objects.equals(this.discount, createInvoice200Response.discount) &&
        Objects.equals(this.lineItems, createInvoice200Response.lineItems) &&
        Objects.equals(this.dateCreated, createInvoice200Response.dateCreated) &&
        Objects.equals(this.dateUpdated, createInvoice200Response.dateUpdated) &&
        Objects.equals(this.datePaid, createInvoice200Response.datePaid) &&
        Objects.equals(this.dateIssued, createInvoice200Response.dateIssued) &&
        Objects.equals(this.amount, createInvoice200Response.amount) &&
        Objects.equals(this.convenienceFee, createInvoice200Response.convenienceFee)&&
        Objects.equals(this.additionalProperties, createInvoice200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, invoiceNumber, tipAmount, depositAmount, notes, customerId, currency, type, status, billingAddress, shipping, pickup, tax, discount, lineItems, dateCreated, dateUpdated, datePaid, dateIssued, amount, convenienceFee, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvoice200Response {\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    tipAmount: ").append(toIndentedString(tipAmount)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    datePaid: ").append(toIndentedString(datePaid)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    convenienceFee: ").append(toIndentedString(convenienceFee)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("invoiceId");
    openapiFields.add("invoiceNumber");
    openapiFields.add("tipAmount");
    openapiFields.add("depositAmount");
    openapiFields.add("notes");
    openapiFields.add("customerId");
    openapiFields.add("currency");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("billingAddress");
    openapiFields.add("shipping");
    openapiFields.add("pickup");
    openapiFields.add("tax");
    openapiFields.add("discount");
    openapiFields.add("lineItems");
    openapiFields.add("dateCreated");
    openapiFields.add("dateUpdated");
    openapiFields.add("datePaid");
    openapiFields.add("dateIssued");
    openapiFields.add("amount");
    openapiFields.add("convenienceFee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateInvoice200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateInvoice200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateInvoice200Response is not found in the empty JSON string", CreateInvoice200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonNull()) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `shipping`
      if (jsonObj.get("shipping") != null && !jsonObj.get("shipping").isJsonNull()) {
        Shipping.validateJsonObject(jsonObj.getAsJsonObject("shipping"));
      }
      // validate the optional field `pickup`
      if (jsonObj.get("pickup") != null && !jsonObj.get("pickup").isJsonNull()) {
        Pickup.validateJsonObject(jsonObj.getAsJsonObject("pickup"));
      }
      // validate the optional field `tax`
      if (jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) {
        Tax.validateJsonObject(jsonObj.getAsJsonObject("tax"));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        Discount.validateJsonObject(jsonObj.getAsJsonObject("discount"));
      }
      if (jsonObj.get("lineItems") != null && !jsonObj.get("lineItems").isJsonNull()) {
        JsonArray jsonArraylineItems = jsonObj.getAsJsonArray("lineItems");
        if (jsonArraylineItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lineItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lineItems` to be an array in the JSON string but got `%s`", jsonObj.get("lineItems").toString()));
          }

          // validate the optional field `lineItems` (array)
          for (int i = 0; i < jsonArraylineItems.size(); i++) {
            LineItem.validateJsonObject(jsonArraylineItems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("dateCreated") != null && !jsonObj.get("dateCreated").isJsonNull()) && !jsonObj.get("dateCreated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateCreated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateCreated").toString()));
      }
      if ((jsonObj.get("dateUpdated") != null && !jsonObj.get("dateUpdated").isJsonNull()) && !jsonObj.get("dateUpdated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateUpdated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateUpdated").toString()));
      }
      if ((jsonObj.get("datePaid") != null && !jsonObj.get("datePaid").isJsonNull()) && !jsonObj.get("datePaid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datePaid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datePaid").toString()));
      }
      if ((jsonObj.get("dateIssued") != null && !jsonObj.get("dateIssued").isJsonNull()) && !jsonObj.get("dateIssued").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateIssued` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateIssued").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateInvoice200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateInvoice200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateInvoice200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateInvoice200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateInvoice200Response>() {
           @Override
           public void write(JsonWriter out, CreateInvoice200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateInvoice200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateInvoice200Response instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateInvoice200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateInvoice200Response
  * @throws IOException if the JSON string is invalid with respect to CreateInvoice200Response
  */
  public static CreateInvoice200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateInvoice200Response.class);
  }

 /**
  * Convert an instance of CreateInvoice200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

