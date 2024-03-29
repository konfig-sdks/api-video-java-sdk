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
 * Caption
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Caption {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;

  public static final String SERIALIZED_NAME_SRCLANG = "srclang";
  @SerializedName(SERIALIZED_NAME_SRCLANG)
  private String srclang;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "languageName";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default = false;

  public Caption() {
  }

  public Caption uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The unique resource identifier of the uploaded caption.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/videos/vi1111DinStg3oBbN79GklWS/captions/sr-Cyrl", value = "The unique resource identifier of the uploaded caption.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public Caption src(String src) {
    
    
    
    
    this.src = src;
    return this;
  }

   /**
   * A direct URL to the uploaded caption file.
   * @return src
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://cdn.api.video/vod/vi1111DinStg3oBbN79GklWS/captions/sr-Cyrl.vtt", value = "A direct URL to the uploaded caption file.")

  public String getSrc() {
    return src;
  }


  public void setSrc(String src) {
    
    
    
    this.src = src;
  }


  public Caption srclang(String srclang) {
    
    
    
    
    this.srclang = srclang;
    return this;
  }

   /**
   * Indicates the language of the uploaded caption file using IETF language tags.
   * @return srclang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sr-Cyrl", value = "Indicates the language of the uploaded caption file using IETF language tags.")

  public String getSrclang() {
    return srclang;
  }


  public void setSrclang(String srclang) {
    
    
    
    this.srclang = srclang;
  }


  public Caption languageName(String languageName) {
    
    
    
    
    this.languageName = languageName;
    return this;
  }

   /**
   * Returns the native name of the caption language in UTF-8 encoding.
   * @return languageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "српски (ћирилица)", value = "Returns the native name of the caption language in UTF-8 encoding.")

  public String getLanguageName() {
    return languageName;
  }


  public void setLanguageName(String languageName) {
    
    
    
    this.languageName = languageName;
  }


  public Caption _default(Boolean _default) {
    
    
    
    
    this._default = _default;
    return this;
  }

   /**
   * Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles.")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    
    
    
    this._default = _default;
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
   * @return the Caption instance itself
   */
  public Caption putAdditionalProperty(String key, Object value) {
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
    Caption caption = (Caption) o;
    return Objects.equals(this.uri, caption.uri) &&
        Objects.equals(this.src, caption.src) &&
        Objects.equals(this.srclang, caption.srclang) &&
        Objects.equals(this.languageName, caption.languageName) &&
        Objects.equals(this._default, caption._default)&&
        Objects.equals(this.additionalProperties, caption.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, src, srclang, languageName, _default, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Caption {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    srclang: ").append(toIndentedString(srclang)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("src");
    openapiFields.add("srclang");
    openapiFields.add("languageName");
    openapiFields.add("default");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Caption
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Caption.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Caption is not found in the empty JSON string", Caption.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("src") != null && !jsonObj.get("src").isJsonNull()) && !jsonObj.get("src").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `src` to be a primitive type in the JSON string but got `%s`", jsonObj.get("src").toString()));
      }
      if ((jsonObj.get("srclang") != null && !jsonObj.get("srclang").isJsonNull()) && !jsonObj.get("srclang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `srclang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("srclang").toString()));
      }
      if ((jsonObj.get("languageName") != null && !jsonObj.get("languageName").isJsonNull()) && !jsonObj.get("languageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `languageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("languageName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Caption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Caption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Caption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Caption.class));

       return (TypeAdapter<T>) new TypeAdapter<Caption>() {
           @Override
           public void write(JsonWriter out, Caption value) throws IOException {
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
           public Caption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Caption instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Caption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Caption
  * @throws IOException if the JSON string is invalid with respect to Caption
  */
  public static Caption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Caption.class);
  }

 /**
  * Convert an instance of Caption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

