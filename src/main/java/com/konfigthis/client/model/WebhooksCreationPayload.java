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
 * WebhooksCreationPayload
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhooksCreationPayload {
  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public WebhooksCreationPayload() {
  }

  public WebhooksCreationPayload events(List<String> events) {
    
    
    
    
    this.events = events;
    return this;
  }

  public WebhooksCreationPayload addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * A list of the webhooks that you are subscribing to. There are Currently four webhook options: * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;  Occurs when a new video is uploaded into your account, it will be encoded into several different HLS and mp4 qualities. When each version is encoded, your webhook will get a notification.  It will look like &#x60;&#x60;&#x60;{ \\\&quot;type\\\&quot;: \\\&quot;video.encoding.quality.completed\\\&quot;, \\\&quot;emittedAt\\\&quot;: \\\&quot;2021-01-29T16:46:25.217+01:00\\\&quot;, \\\&quot;videoId\\\&quot;: \\\&quot;viXXXXXXXX\\\&quot;, \\\&quot;encoding\\\&quot;: \\\&quot;hls\\\&quot;, \\\&quot;quality\\\&quot;: \\\&quot;720p\\\&quot;} &#x60;&#x60;&#x60;. This request says that the 720p HLS encoding was completed. * &#x60;&#x60;&#x60;live-stream.broadcast.started&#x60;&#x60;&#x60;  When a live stream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * &#x60;&#x60;&#x60;live-stream.broadcast.ended&#x60;&#x60;&#x60;  This event fires when a live stream has finished broadcasting. * &#x60;&#x60;&#x60;video.source.recorded&#x60;&#x60;&#x60;  Occurs when a live stream is recorded and submitted for encoding.
   * @return events
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"video.encoding.quality.completed\"]", required = true, value = "A list of the webhooks that you are subscribing to. There are Currently four webhook options: * ```video.encoding.quality.completed```  Occurs when a new video is uploaded into your account, it will be encoded into several different HLS and mp4 qualities. When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a live stream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fires when a live stream has finished broadcasting. * ```video.source.recorded```  Occurs when a live stream is recorded and submitted for encoding.")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    
    
    
    this.events = events;
  }


  public WebhooksCreationPayload url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The the url to which HTTP notifications are sent. It could be any http or https URL.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com/webhooks", required = true, value = "The the url to which HTTP notifications are sent. It could be any http or https URL.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
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
   * @return the WebhooksCreationPayload instance itself
   */
  public WebhooksCreationPayload putAdditionalProperty(String key, Object value) {
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
    WebhooksCreationPayload webhooksCreationPayload = (WebhooksCreationPayload) o;
    return Objects.equals(this.events, webhooksCreationPayload.events) &&
        Objects.equals(this.url, webhooksCreationPayload.url)&&
        Objects.equals(this.additionalProperties, webhooksCreationPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksCreationPayload {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("events");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksCreationPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhooksCreationPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksCreationPayload is not found in the empty JSON string", WebhooksCreationPayload.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhooksCreationPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksCreationPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksCreationPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksCreationPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksCreationPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksCreationPayload>() {
           @Override
           public void write(JsonWriter out, WebhooksCreationPayload value) throws IOException {
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
           public WebhooksCreationPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhooksCreationPayload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhooksCreationPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksCreationPayload
  * @throws IOException if the JSON string is invalid with respect to WebhooksCreationPayload
  */
  public static WebhooksCreationPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksCreationPayload.class);
  }

 /**
  * Convert an instance of WebhooksCreationPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

