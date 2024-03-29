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
import com.konfigthis.client.model.VideoAssets;
import com.konfigthis.client.model.VideoSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Video
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Video {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VIDEO_ID = "videoId";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PUBLISHED_AT = "publishedAt";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
  private OffsetDateTime publishedAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<Metadata> metadata = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private VideoSource source;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private VideoAssets assets;

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private String playerId;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_PANORAMIC = "panoramic";
  @SerializedName(SERIALIZED_NAME_PANORAMIC)
  private Boolean panoramic;

  public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4Support";
  @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
  private Boolean mp4Support;

  public Video() {
  }

  public Video tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public Video addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.  
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"tags\": [\"maths\", \"string theory\", \"video\"]", value = "One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.  ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public Video title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the video content. 
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Maths video", value = "The title of the video content. ")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public Video description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for the video content. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "An amazing video explaining string theory.", value = "A description for the video content. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Video videoId(String videoId) {
    
    
    
    
    this.videoId = videoId;
    return this;
  }

   /**
   * The unique identifier of the video object.
   * @return videoId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "vi4k0jvEUuaTdRAEjQ4Prklg", required = true, value = "The unique identifier of the video object.")

  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    
    
    
    this.videoId = videoId;
  }


  public Video createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When a video was created, presented in ISO-8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-06-24T11:45:01.109Z", value = "When a video was created, presented in ISO-8601 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Video publishedAt(OffsetDateTime publishedAt) {
    
    
    
    
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The date and time the API created the video. Date and time are provided using ISO-8601 UTC format.
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-16T08:25:51Z", value = "The date and time the API created the video. Date and time are provided using ISO-8601 UTC format.")

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }


  public void setPublishedAt(OffsetDateTime publishedAt) {
    
    
    
    this.publishedAt = publishedAt;
  }


  public Video updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time the video was updated. Date and time are provided using ISO-8601 UTC format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-16T08:15:51Z", value = "The date and time the video was updated. Date and time are provided using ISO-8601 UTC format.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public Video metadata(List<Metadata> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public Video addMetadataItem(Metadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata/) allows you to define a key that allows any value pair. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"key\":\"Author\", \"value\":\"John Doe\"}, {\"key\":\"Format\", \"value\":\"Tutorial\"}]", value = "Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata/) allows you to define a key that allows any value pair. ")

  public List<Metadata> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<Metadata> metadata) {
    
    
    
    this.metadata = metadata;
  }


  public Video source(VideoSource source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoSource getSource() {
    return source;
  }


  public void setSource(VideoSource source) {
    
    
    
    this.source = source;
  }


  public Video assets(VideoAssets assets) {
    
    
    
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoAssets getAssets() {
    return assets;
  }


  public void setAssets(VideoAssets assets) {
    
    
    
    this.assets = assets;
  }


  public Video playerId(String playerId) {
    
    
    
    
    this.playerId = playerId;
    return this;
  }

   /**
   * The id of the player that will be applied on the video. 
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "The id of the player that will be applied on the video. ")

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    
    
    
    this.playerId = playerId;
  }


  public Video _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos/). 
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos/). ")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public Video panoramic(Boolean panoramic) {
    
    
    
    
    this.panoramic = panoramic;
    return this;
  }

   /**
   * Defines if video is panoramic. 
   * @return panoramic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Defines if video is panoramic. ")

  public Boolean getPanoramic() {
    return panoramic;
  }


  public void setPanoramic(Boolean panoramic) {
    
    
    
    this.panoramic = panoramic;
  }


  public Video mp4Support(Boolean mp4Support) {
    
    
    
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video. 
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video. ")

  public Boolean getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Boolean mp4Support) {
    
    
    
    this.mp4Support = mp4Support;
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
   * @return the Video instance itself
   */
  public Video putAdditionalProperty(String key, Object value) {
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
    Video video = (Video) o;
    return Objects.equals(this.tags, video.tags) &&
        Objects.equals(this.title, video.title) &&
        Objects.equals(this.description, video.description) &&
        Objects.equals(this.videoId, video.videoId) &&
        Objects.equals(this.createdAt, video.createdAt) &&
        Objects.equals(this.publishedAt, video.publishedAt) &&
        Objects.equals(this.updatedAt, video.updatedAt) &&
        Objects.equals(this.metadata, video.metadata) &&
        Objects.equals(this.source, video.source) &&
        Objects.equals(this.assets, video.assets) &&
        Objects.equals(this.playerId, video.playerId) &&
        Objects.equals(this._public, video._public) &&
        Objects.equals(this.panoramic, video.panoramic) &&
        Objects.equals(this.mp4Support, video.mp4Support)&&
        Objects.equals(this.additionalProperties, video.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, title, description, videoId, createdAt, publishedAt, updatedAt, metadata, source, assets, playerId, _public, panoramic, mp4Support, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    panoramic: ").append(toIndentedString(panoramic)).append("\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
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
    openapiFields.add("videoId");
    openapiFields.add("createdAt");
    openapiFields.add("publishedAt");
    openapiFields.add("updatedAt");
    openapiFields.add("metadata");
    openapiFields.add("source");
    openapiFields.add("assets");
    openapiFields.add("playerId");
    openapiFields.add("public");
    openapiFields.add("panoramic");
    openapiFields.add("mp4Support");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("videoId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Video
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Video.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Video is not found in the empty JSON string", Video.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Video.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("videoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("videoId").toString()));
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
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        VideoSource.validateJsonObject(jsonObj.getAsJsonObject("source"));
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        VideoAssets.validateJsonObject(jsonObj.getAsJsonObject("assets"));
      }
      if ((jsonObj.get("playerId") != null && !jsonObj.get("playerId").isJsonNull()) && !jsonObj.get("playerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Video.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Video' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Video> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Video.class));

       return (TypeAdapter<T>) new TypeAdapter<Video>() {
           @Override
           public void write(JsonWriter out, Video value) throws IOException {
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
           public Video read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Video instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Video given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Video
  * @throws IOException if the JSON string is invalid with respect to Video
  */
  public static Video fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Video.class);
  }

 /**
  * Convert an instance of Video to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

