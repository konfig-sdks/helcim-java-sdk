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
 * RefundRequest1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RefundRequest1 {
  public static final String SERIALIZED_NAME_CARD_TRANSACTION_ID = "cardTransactionId";
  @SerializedName(SERIALIZED_NAME_CARD_TRANSACTION_ID)
  private Integer cardTransactionId;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_ECOMMERCE = "ecommerce";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE)
  private Boolean ecommerce;

  public RefundRequest1() {
  }

  public RefundRequest1 cardTransactionId(Integer cardTransactionId) {
    
    
    
    
    this.cardTransactionId = cardTransactionId;
    return this;
  }

   /**
   * The transaction ID of the original transaction.
   * @return cardTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "198763", required = true, value = "The transaction ID of the original transaction.")

  public Integer getCardTransactionId() {
    return cardTransactionId;
  }


  public void setCardTransactionId(Integer cardTransactionId) {
    
    
    
    this.cardTransactionId = cardTransactionId;
  }


  public RefundRequest1 ipAddress(String ipAddress) {
    
    
    
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer making the transaction, used as part of fraud detection.
   * @return ipAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.168.1.1", required = true, value = "IP address of the customer making the transaction, used as part of fraud detection.")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    
    
    
    this.ipAddress = ipAddress;
  }


  public RefundRequest1 ecommerce(Boolean ecommerce) {
    
    
    
    
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.
   * @return ecommerce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Set to indicate that the transaction is e-commerce. When set, the Helcim Fraud Defender will provide further analysis.")

  public Boolean getEcommerce() {
    return ecommerce;
  }


  public void setEcommerce(Boolean ecommerce) {
    
    
    
    this.ecommerce = ecommerce;
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
   * @return the RefundRequest1 instance itself
   */
  public RefundRequest1 putAdditionalProperty(String key, Object value) {
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
    RefundRequest1 refundRequest1 = (RefundRequest1) o;
    return Objects.equals(this.cardTransactionId, refundRequest1.cardTransactionId) &&
        Objects.equals(this.ipAddress, refundRequest1.ipAddress) &&
        Objects.equals(this.ecommerce, refundRequest1.ecommerce)&&
        Objects.equals(this.additionalProperties, refundRequest1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardTransactionId, ipAddress, ecommerce, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest1 {\n");
    sb.append("    cardTransactionId: ").append(toIndentedString(cardTransactionId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
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
    openapiFields.add("cardTransactionId");
    openapiFields.add("ipAddress");
    openapiFields.add("ecommerce");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardTransactionId");
    openapiRequiredFields.add("ipAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RefundRequest1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RefundRequest1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundRequest1 is not found in the empty JSON string", RefundRequest1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RefundRequest1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundRequest1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundRequest1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundRequest1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundRequest1.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundRequest1>() {
           @Override
           public void write(JsonWriter out, RefundRequest1 value) throws IOException {
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
           public RefundRequest1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RefundRequest1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RefundRequest1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefundRequest1
  * @throws IOException if the JSON string is invalid with respect to RefundRequest1
  */
  public static RefundRequest1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundRequest1.class);
  }

 /**
  * Convert an instance of RefundRequest1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

