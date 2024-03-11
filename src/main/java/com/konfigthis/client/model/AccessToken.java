/*
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1
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
 * AccessToken
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccessToken {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType = "bearer";

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public AccessToken() {
  }

  public AccessToken accessToken(String accessToken) {
    
    
    
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token containing security credentials allowing you to acccess the API. The token lasts for one hour.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjUyZWM4NWUyMjFkODZjOWI0NDQ5NzBhMjQwMzUyOWQ4MDQyNGQ3ZmJjYjFlYWM2MjVlM2VkMjI2YWRlNTcxMDY2NDUyZDc0NjdhN2E4NjI0In0.eyJhdWQiOiJsaWJjYXN0IiwianRpIjoiNTJlYzg1ZTIyMWQ4NmM5YjQ0NDk3MGEyNDAzNTI5ZDgwNDI0ZDdmYmNiMWVhYzYyNWUzZWQyMjZhZGU1NzEwNjY0NTJkNzQ2N2E3YTg2MjQiLCJpYXQiOjE1MjUyNzYxNDcsIm5iZiI6MTUyNTI3NjE0NywiZXhwIjoxNTI1Mjc5NzQ3LCJzdWIiOiJ1c01vbml0b3IiLCJzY29wZXMiOlsibW9uaXRvci5saWJjYXN0LmNvbSJdLCJjb250ZXh0Ijp7InVzZXIiOiJ1c01vbml0b3IiLCJwcm9qZWN0IjoicHJNb25pdG9yIiwibWVtYmVyIjoibWVNb25pdG9yIn19.rUvishDNyJLNlI4W5VmguNecm5KD2uZgPkKJQbaqw-cJbSrVxkSbiKYtk_E3cz3WT7-IS2yFTsYN3uIo5Rbit8_HftweyEp2bdBRI8yjR6oZZ1sNJJXswISN1i2kk4r-aaxu7Xxf_LtsjOMUj_YZsvcc2nqBXPKjHbJCJryx3DDJaIcymOqao7nhQaCCQyrQooAXNTYs4E9fWN1dC_x2O-zok5TuG-xhEW-umwxfSUMWNgSTkz38ACceQ0PCJSgB3jqjDH4MwC7B3ppEPZuK5E6JhKeyRlalswRyYq3UQPnVeMTam7YQHsuTgbehF6WySW8i44o7V_MCe9hjPdp-WA", value = "The access token containing security credentials allowing you to acccess the API. The token lasts for one hour.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    
    
    
    this.accessToken = accessToken;
  }


  public AccessToken tokenType(String tokenType) {
    
    
    
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of token you have.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bearer", value = "The type of token you have.")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    
    
    
    this.tokenType = tokenType;
  }


  public AccessToken refreshToken(String refreshToken) {
    
    
    
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * A token you can use to get the next access token when your current access token expires.
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "def50200a28d88fb9aaa921be78eeb5604b071101a334899a7d5fc7492cf8ea752962ddc8961fe5c126101d4ecacd980396eb2fd494995b812dffcb98256c4277f790d1f658fc2d2e34f350740544e5232d69d68d34c648271d706c5e7049adac0b1832d0fdf71809715cc7e97fa63f65966deadb501a55ff469b0fd23a637cb6acbe9d9b8594a17f09efc2efeed82984764a0065d5e29c950c7b081a61ba2aaa192be3085c400ee37eac50fa9320ce2cfe8916c8165418d23e9f91b6a5c8515e1d74ee193a5a1ca01954fbff27361c20184240be2359e0afbed0bf1c762cf872450b5e8b5d4704f4fd9583e4470adc98409dd42965709712806bd9019378a72eea0b4912ce684ffd833db5806ab84174f905db2a75380071d004615c944bb8f8c4045cce7234c2be9a2330522cf7f067b8e58f57cffb6edb4b7ef91313e12bcde47e5e76ceee7fa52990132288f345d33ed917ae4fd54b7284f8964d898e97e1ee3bc4157f75d7fee63976e4be66ac1ec32ef74afa533f0eb593523f226cbec57d196ac8962", value = "A token you can use to get the next access token when your current access token expires.")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    
    
    
    this.refreshToken = refreshToken;
  }


  public AccessToken expiresIn(Integer expiresIn) {
    
    
    
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Lists the time in seconds when your access token expires. It lasts for one hour.
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "Lists the time in seconds when your access token expires. It lasts for one hour.")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    
    
    
    this.expiresIn = expiresIn;
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
   * @return the AccessToken instance itself
   */
  public AccessToken putAdditionalProperty(String key, Object value) {
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
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.accessToken, accessToken.accessToken) &&
        Objects.equals(this.tokenType, accessToken.tokenType) &&
        Objects.equals(this.refreshToken, accessToken.refreshToken) &&
        Objects.equals(this.expiresIn, accessToken.expiresIn)&&
        Objects.equals(this.additionalProperties, accessToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, refreshToken, expiresIn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("token_type");
    openapiFields.add("refresh_token");
    openapiFields.add("expires_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccessToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessToken is not found in the empty JSON string", AccessToken.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
      if ((jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonNull()) && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessToken.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessToken>() {
           @Override
           public void write(JsonWriter out, AccessToken value) throws IOException {
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
           public AccessToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessToken instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccessToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessToken
  * @throws IOException if the JSON string is invalid with respect to AccessToken
  */
  public static AccessToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessToken.class);
  }

 /**
  * Convert an instance of AccessToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

