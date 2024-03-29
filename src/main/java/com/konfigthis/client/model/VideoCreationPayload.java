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
import com.konfigthis.client.model.Metadata;
import com.konfigthis.client.model.VideoClip;
import com.konfigthis.client.model.VideoWatermark;
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
 * VideoCreationPayload
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideoCreationPayload {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public = true;

  public static final String SERIALIZED_NAME_PANORAMIC = "panoramic";
  @SerializedName(SERIALIZED_NAME_PANORAMIC)
  private Boolean panoramic = false;

  public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4Support";
  @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
  private Boolean mp4Support = true;

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private String playerId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<Metadata> metadata = null;

  public static final String SERIALIZED_NAME_CLIP = "clip";
  @SerializedName(SERIALIZED_NAME_CLIP)
  private VideoClip clip;

  public static final String SERIALIZED_NAME_WATERMARK = "watermark";
  @SerializedName(SERIALIZED_NAME_WATERMARK)
  private VideoWatermark watermark;

  public VideoCreationPayload() {
  }

  public VideoCreationPayload tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public VideoCreationPayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags you want to use to describe your video.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"maths\", \"string theory\", \"video\"]", value = "A list of tags you want to use to describe your video.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public VideoCreationPayload title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of your new video.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Maths video", required = true, value = "The title of your new video.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public VideoCreationPayload description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A brief description of your video.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A video about string theory.", value = "A brief description of your video.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public VideoCreationPayload source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * You can either add a video already on the web, by entering the URL of the video, or you can also enter the &#x60;videoId&#x60; of one of the videos you already have on your api.video acccount, and this will generate a copy of your video. Creating a copy of a video can be especially useful if you want to keep your original video and trim or apply a watermark onto the copy you would create.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.myvideo.url.com/video.mp4 OR vi4k0jvEUuaTdRAEjQ4JfOyl", value = "You can either add a video already on the web, by entering the URL of the video, or you can also enter the `videoId` of one of the videos you already have on your api.video acccount, and this will generate a copy of your video. Creating a copy of a video can be especially useful if you want to keep your original video and trim or apply a watermark onto the copy you would create.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public VideoCreationPayload _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * Default: True. If set to &#x60;false&#x60; the video will become private. More information on private videos can be found [here](https://docs.api.video/delivery-analytics/video-privacy-access-management)
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Default: True. If set to `false` the video will become private. More information on private videos can be found [here](https://docs.api.video/delivery-analytics/video-privacy-access-management)")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public VideoCreationPayload panoramic(Boolean panoramic) {
    
    
    
    
    this.panoramic = panoramic;
    return this;
  }

   /**
   * Indicates if your video is a 360/immersive video.
   * @return panoramic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if your video is a 360/immersive video.")

  public Boolean getPanoramic() {
    return panoramic;
  }


  public void setPanoramic(Boolean panoramic) {
    
    
    
    this.panoramic = panoramic;
  }


  public VideoCreationPayload mp4Support(Boolean mp4Support) {
    
    
    
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * Enables mp4 version in addition to streamed version.
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enables mp4 version in addition to streamed version.")

  public Boolean getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Boolean mp4Support) {
    
    
    
    this.mp4Support = mp4Support;
  }


  public VideoCreationPayload playerId(String playerId) {
    
    
    
    
    this.playerId = playerId;
    return this;
  }

   /**
   * The unique identification number for your video player.
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "The unique identification number for your video player.")

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    
    
    
    this.playerId = playerId;
  }


  public VideoCreationPayload metadata(List<Metadata> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public VideoCreationPayload addMetadataItem(Metadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata/).
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"key\": \"Author\", \"value\": \"John Doe\"}]", value = "A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata/).")

  public List<Metadata> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<Metadata> metadata) {
    
    
    
    this.metadata = metadata;
  }


  public VideoCreationPayload clip(VideoClip clip) {
    
    
    
    
    this.clip = clip;
    return this;
  }

   /**
   * Get clip
   * @return clip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoClip getClip() {
    return clip;
  }


  public void setClip(VideoClip clip) {
    
    
    
    this.clip = clip;
  }


  public VideoCreationPayload watermark(VideoWatermark watermark) {
    
    
    
    
    this.watermark = watermark;
    return this;
  }

   /**
   * Get watermark
   * @return watermark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoWatermark getWatermark() {
    return watermark;
  }


  public void setWatermark(VideoWatermark watermark) {
    
    
    
    this.watermark = watermark;
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
   * @return the VideoCreationPayload instance itself
   */
  public VideoCreationPayload putAdditionalProperty(String key, Object value) {
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
    VideoCreationPayload videoCreationPayload = (VideoCreationPayload) o;
    return Objects.equals(this.tags, videoCreationPayload.tags) &&
        Objects.equals(this.title, videoCreationPayload.title) &&
        Objects.equals(this.description, videoCreationPayload.description) &&
        Objects.equals(this.source, videoCreationPayload.source) &&
        Objects.equals(this._public, videoCreationPayload._public) &&
        Objects.equals(this.panoramic, videoCreationPayload.panoramic) &&
        Objects.equals(this.mp4Support, videoCreationPayload.mp4Support) &&
        Objects.equals(this.playerId, videoCreationPayload.playerId) &&
        Objects.equals(this.metadata, videoCreationPayload.metadata) &&
        Objects.equals(this.clip, videoCreationPayload.clip) &&
        Objects.equals(this.watermark, videoCreationPayload.watermark)&&
        Objects.equals(this.additionalProperties, videoCreationPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, title, description, source, _public, panoramic, mp4Support, playerId, metadata, clip, watermark, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreationPayload {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    panoramic: ").append(toIndentedString(panoramic)).append("\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    clip: ").append(toIndentedString(clip)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("source");
    openapiFields.add("public");
    openapiFields.add("panoramic");
    openapiFields.add("mp4Support");
    openapiFields.add("playerId");
    openapiFields.add("metadata");
    openapiFields.add("clip");
    openapiFields.add("watermark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoCreationPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoCreationPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoCreationPayload is not found in the empty JSON string", VideoCreationPayload.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VideoCreationPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("playerId") != null && !jsonObj.get("playerId").isJsonNull()) && !jsonObj.get("playerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playerId").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            Metadata.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `clip`
      if (jsonObj.get("clip") != null && !jsonObj.get("clip").isJsonNull()) {
        VideoClip.validateJsonObject(jsonObj.getAsJsonObject("clip"));
      }
      // validate the optional field `watermark`
      if (jsonObj.get("watermark") != null && !jsonObj.get("watermark").isJsonNull()) {
        VideoWatermark.validateJsonObject(jsonObj.getAsJsonObject("watermark"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoCreationPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoCreationPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoCreationPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoCreationPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoCreationPayload>() {
           @Override
           public void write(JsonWriter out, VideoCreationPayload value) throws IOException {
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
           public VideoCreationPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideoCreationPayload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideoCreationPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoCreationPayload
  * @throws IOException if the JSON string is invalid with respect to VideoCreationPayload
  */
  public static VideoCreationPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoCreationPayload.class);
  }

 /**
  * Convert an instance of VideoCreationPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

