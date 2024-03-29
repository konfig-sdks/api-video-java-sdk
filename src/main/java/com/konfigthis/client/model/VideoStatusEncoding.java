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
import com.konfigthis.client.model.Quality;
import com.konfigthis.client.model.VideoStatusEncodingMetadata;
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
 * VideoStatusEncoding
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideoStatusEncoding {
  public static final String SERIALIZED_NAME_PLAYABLE = "playable";
  @SerializedName(SERIALIZED_NAME_PLAYABLE)
  private Boolean playable;

  public static final String SERIALIZED_NAME_QUALITIES = "qualities";
  @SerializedName(SERIALIZED_NAME_QUALITIES)
  private List<Quality> qualities = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private VideoStatusEncodingMetadata metadata;

  public VideoStatusEncoding() {
  }

  public VideoStatusEncoding playable(Boolean playable) {
    
    
    
    
    this.playable = playable;
    return this;
  }

   /**
   * Whether the video is playable or not.
   * @return playable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the video is playable or not.")

  public Boolean getPlayable() {
    return playable;
  }


  public void setPlayable(Boolean playable) {
    
    
    
    this.playable = playable;
  }


  public VideoStatusEncoding qualities(List<Quality> qualities) {
    
    
    
    
    this.qualities = qualities;
    return this;
  }

  public VideoStatusEncoding addQualitiesItem(Quality qualitiesItem) {
    if (this.qualities == null) {
      this.qualities = new ArrayList<>();
    }
    this.qualities.add(qualitiesItem);
    return this;
  }

   /**
   * Available qualities the video can be viewed in.
   * @return qualities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available qualities the video can be viewed in.")

  public List<Quality> getQualities() {
    return qualities;
  }


  public void setQualities(List<Quality> qualities) {
    
    
    
    this.qualities = qualities;
  }


  public VideoStatusEncoding metadata(VideoStatusEncodingMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoStatusEncodingMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(VideoStatusEncodingMetadata metadata) {
    
    
    
    this.metadata = metadata;
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
   * @return the VideoStatusEncoding instance itself
   */
  public VideoStatusEncoding putAdditionalProperty(String key, Object value) {
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
    VideoStatusEncoding videoStatusEncoding = (VideoStatusEncoding) o;
    return Objects.equals(this.playable, videoStatusEncoding.playable) &&
        Objects.equals(this.qualities, videoStatusEncoding.qualities) &&
        Objects.equals(this.metadata, videoStatusEncoding.metadata)&&
        Objects.equals(this.additionalProperties, videoStatusEncoding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playable, qualities, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoStatusEncoding {\n");
    sb.append("    playable: ").append(toIndentedString(playable)).append("\n");
    sb.append("    qualities: ").append(toIndentedString(qualities)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("playable");
    openapiFields.add("qualities");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoStatusEncoding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoStatusEncoding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoStatusEncoding is not found in the empty JSON string", VideoStatusEncoding.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("qualities") != null && !jsonObj.get("qualities").isJsonNull()) {
        JsonArray jsonArrayqualities = jsonObj.getAsJsonArray("qualities");
        if (jsonArrayqualities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("qualities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `qualities` to be an array in the JSON string but got `%s`", jsonObj.get("qualities").toString()));
          }

          // validate the optional field `qualities` (array)
          for (int i = 0; i < jsonArrayqualities.size(); i++) {
            Quality.validateJsonObject(jsonArrayqualities.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        VideoStatusEncodingMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoStatusEncoding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoStatusEncoding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoStatusEncoding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoStatusEncoding.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoStatusEncoding>() {
           @Override
           public void write(JsonWriter out, VideoStatusEncoding value) throws IOException {
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
           public VideoStatusEncoding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideoStatusEncoding instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideoStatusEncoding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoStatusEncoding
  * @throws IOException if the JSON string is invalid with respect to VideoStatusEncoding
  */
  public static VideoStatusEncoding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoStatusEncoding.class);
  }

 /**
  * Convert an instance of VideoStatusEncoding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

