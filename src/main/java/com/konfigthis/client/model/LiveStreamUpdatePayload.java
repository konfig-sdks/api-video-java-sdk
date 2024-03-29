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
import com.konfigthis.client.model.RestreamsRequestObject;
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
 * LiveStreamUpdatePayload
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LiveStreamUpdatePayload {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private String playerId;

  public static final String SERIALIZED_NAME_RESTREAMS = "restreams";
  @SerializedName(SERIALIZED_NAME_RESTREAMS)
  private List<RestreamsRequestObject> restreams = null;

  public LiveStreamUpdatePayload() {
  }

  public LiveStreamUpdatePayload name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name you want to use for your live stream.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Live Stream Video", value = "The name you want to use for your live stream.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LiveStreamUpdatePayload _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public LiveStreamUpdatePayload playerId(String playerId) {
    
    
    
    
    this.playerId = playerId;
    return this;
  }

   /**
   * The unique ID for the player associated with a live stream that you want to update.
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "The unique ID for the player associated with a live stream that you want to update.")

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    
    
    
    this.playerId = playerId;
  }


  public LiveStreamUpdatePayload restreams(List<RestreamsRequestObject> restreams) {
    
    
    
    
    this.restreams = restreams;
    return this;
  }

  public LiveStreamUpdatePayload addRestreamsItem(RestreamsRequestObject restreamsItem) {
    if (this.restreams == null) {
      this.restreams = new ArrayList<>();
    }
    this.restreams.add(restreamsItem);
    return this;
  }

   /**
   * Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations. This operation updates all restream destinations in the same request. If you do not want to modify an existing restream destination, you need to include it in your request, otherwise it is removed.
   * @return restreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations. This operation updates all restream destinations in the same request. If you do not want to modify an existing restream destination, you need to include it in your request, otherwise it is removed.")

  public List<RestreamsRequestObject> getRestreams() {
    return restreams;
  }


  public void setRestreams(List<RestreamsRequestObject> restreams) {
    
    
    
    this.restreams = restreams;
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
   * @return the LiveStreamUpdatePayload instance itself
   */
  public LiveStreamUpdatePayload putAdditionalProperty(String key, Object value) {
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
    LiveStreamUpdatePayload liveStreamUpdatePayload = (LiveStreamUpdatePayload) o;
    return Objects.equals(this.name, liveStreamUpdatePayload.name) &&
        Objects.equals(this._public, liveStreamUpdatePayload._public) &&
        Objects.equals(this.playerId, liveStreamUpdatePayload.playerId) &&
        Objects.equals(this.restreams, liveStreamUpdatePayload.restreams)&&
        Objects.equals(this.additionalProperties, liveStreamUpdatePayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, _public, playerId, restreams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamUpdatePayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    restreams: ").append(toIndentedString(restreams)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("public");
    openapiFields.add("playerId");
    openapiFields.add("restreams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveStreamUpdatePayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveStreamUpdatePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveStreamUpdatePayload is not found in the empty JSON string", LiveStreamUpdatePayload.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("playerId") != null && !jsonObj.get("playerId").isJsonNull()) && !jsonObj.get("playerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playerId").toString()));
      }
      if (jsonObj.get("restreams") != null && !jsonObj.get("restreams").isJsonNull()) {
        JsonArray jsonArrayrestreams = jsonObj.getAsJsonArray("restreams");
        if (jsonArrayrestreams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restreams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restreams` to be an array in the JSON string but got `%s`", jsonObj.get("restreams").toString()));
          }

          // validate the optional field `restreams` (array)
          for (int i = 0; i < jsonArrayrestreams.size(); i++) {
            RestreamsRequestObject.validateJsonObject(jsonArrayrestreams.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveStreamUpdatePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveStreamUpdatePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveStreamUpdatePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveStreamUpdatePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveStreamUpdatePayload>() {
           @Override
           public void write(JsonWriter out, LiveStreamUpdatePayload value) throws IOException {
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
           public LiveStreamUpdatePayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LiveStreamUpdatePayload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LiveStreamUpdatePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveStreamUpdatePayload
  * @throws IOException if the JSON string is invalid with respect to LiveStreamUpdatePayload
  */
  public static LiveStreamUpdatePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveStreamUpdatePayload.class);
  }

 /**
  * Convert an instance of LiveStreamUpdatePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

