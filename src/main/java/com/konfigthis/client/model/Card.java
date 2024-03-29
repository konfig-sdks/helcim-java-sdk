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
 * Card
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Card {
  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_EXPIRY = "cardExpiry";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY)
  private String cardExpiry;

  public static final String SERIALIZED_NAME_CARD_C_V_V = "cardCVV";
  @SerializedName(SERIALIZED_NAME_CARD_C_V_V)
  private String cardCVV;

  public Card() {
  }

  public Card cardNumber(String cardNumber) {
    
    
    
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * The full card number (13 to 16 digits) from merchant to process \&quot;purchase\&quot;, \&quot;pre-auth\&quot;, and \&quot;verify\&quot; transactions.
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5454545454545454", required = true, value = "The full card number (13 to 16 digits) from merchant to process \"purchase\", \"pre-auth\", and \"verify\" transactions.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    
    
    
    this.cardNumber = cardNumber;
  }


  public Card cardExpiry(String cardExpiry) {
    
    
    
    
    this.cardExpiry = cardExpiry;
    return this;
  }

   /**
   * The card expiry date, in MMYY format (total of 4 digits without spaces or slashes).
   * @return cardExpiry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1257", required = true, value = "The card expiry date, in MMYY format (total of 4 digits without spaces or slashes).")

  public String getCardExpiry() {
    return cardExpiry;
  }


  public void setCardExpiry(String cardExpiry) {
    
    
    
    this.cardExpiry = cardExpiry;
  }


  public Card cardCVV(String cardCVV) {
    
    
    
    
    this.cardCVV = cardCVV;
    return this;
  }

   /**
   * The card CVV (3-4 digits on back of credit card).
   * @return cardCVV
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "The card CVV (3-4 digits on back of credit card).")

  public String getCardCVV() {
    return cardCVV;
  }


  public void setCardCVV(String cardCVV) {
    
    
    
    this.cardCVV = cardCVV;
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
   * @return the Card instance itself
   */
  public Card putAdditionalProperty(String key, Object value) {
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
    Card card = (Card) o;
    return Objects.equals(this.cardNumber, card.cardNumber) &&
        Objects.equals(this.cardExpiry, card.cardExpiry) &&
        Objects.equals(this.cardCVV, card.cardCVV)&&
        Objects.equals(this.additionalProperties, card.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardExpiry, cardCVV, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpiry: ").append(toIndentedString(cardExpiry)).append("\n");
    sb.append("    cardCVV: ").append(toIndentedString(cardCVV)).append("\n");
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
    openapiFields.add("cardNumber");
    openapiFields.add("cardExpiry");
    openapiFields.add("cardCVV");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardNumber");
    openapiRequiredFields.add("cardExpiry");
    openapiRequiredFields.add("cardCVV");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Card
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Card.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Card is not found in the empty JSON string", Card.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Card.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      if (!jsonObj.get("cardExpiry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardExpiry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardExpiry").toString()));
      }
      if (!jsonObj.get("cardCVV").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardCVV` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardCVV").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Card.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Card' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Card> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Card.class));

       return (TypeAdapter<T>) new TypeAdapter<Card>() {
           @Override
           public void write(JsonWriter out, Card value) throws IOException {
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
           public Card read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Card instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Card given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Card
  * @throws IOException if the JSON string is invalid with respect to Card
  */
  public static Card fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Card.class);
  }

 /**
  * Convert an instance of Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

