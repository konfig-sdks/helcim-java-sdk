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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Invoice
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Invoice {
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

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Integer customerId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_CONVENIENCE_FEE = "convenienceFee";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_FEE)
  private Double convenienceFee;

  public Invoice() {
  }

  public Invoice dateCreated(String dateCreated) {
    
    
    
    
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


  public Invoice dateUpdated(String dateUpdated) {
    
    
    
    
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


  public Invoice datePaid(String datePaid) {
    
    
    
    
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


  public Invoice dateIssued(String dateIssued) {
    
    
    
    
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


  public Invoice status(String status) {
    
    
    
    
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


  public Invoice customerId(Integer customerId) {
    
    
    
    
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


  public Invoice amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public Invoice amount(Integer amount) {
    
    
    
    
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


  public Invoice convenienceFee(Double convenienceFee) {
    
    
    
    
    this.convenienceFee = convenienceFee;
    return this;
  }

  public Invoice convenienceFee(Integer convenienceFee) {
    
    
    
    
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
   * @return the Invoice instance itself
   */
  public Invoice putAdditionalProperty(String key, Object value) {
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.dateCreated, invoice.dateCreated) &&
        Objects.equals(this.dateUpdated, invoice.dateUpdated) &&
        Objects.equals(this.datePaid, invoice.datePaid) &&
        Objects.equals(this.dateIssued, invoice.dateIssued) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.customerId, invoice.customerId) &&
        Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.convenienceFee, invoice.convenienceFee)&&
        Objects.equals(this.additionalProperties, invoice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateUpdated, datePaid, dateIssued, status, customerId, amount, convenienceFee, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    datePaid: ").append(toIndentedString(datePaid)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
    openapiFields.add("dateCreated");
    openapiFields.add("dateUpdated");
    openapiFields.add("datePaid");
    openapiFields.add("dateIssued");
    openapiFields.add("status");
    openapiFields.add("customerId");
    openapiFields.add("amount");
    openapiFields.add("convenienceFee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Invoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Invoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invoice is not found in the empty JSON string", Invoice.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invoice.class));

       return (TypeAdapter<T>) new TypeAdapter<Invoice>() {
           @Override
           public void write(JsonWriter out, Invoice value) throws IOException {
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
           public Invoice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Invoice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Invoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Invoice
  * @throws IOException if the JSON string is invalid with respect to Invoice
  */
  public static Invoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invoice.class);
  }

 /**
  * Convert an instance of Invoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

