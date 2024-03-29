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
 * PlayerThemeCreationPayload
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PlayerThemeCreationPayload {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_LINK_HOVER = "linkHover";
  @SerializedName(SERIALIZED_NAME_LINK_HOVER)
  private String linkHover;

  public static final String SERIALIZED_NAME_LINK_ACTIVE = "linkActive";
  @SerializedName(SERIALIZED_NAME_LINK_ACTIVE)
  private String linkActive;

  public static final String SERIALIZED_NAME_TRACK_PLAYED = "trackPlayed";
  @SerializedName(SERIALIZED_NAME_TRACK_PLAYED)
  private String trackPlayed;

  public static final String SERIALIZED_NAME_TRACK_UNPLAYED = "trackUnplayed";
  @SerializedName(SERIALIZED_NAME_TRACK_UNPLAYED)
  private String trackUnplayed;

  public static final String SERIALIZED_NAME_TRACK_BACKGROUND = "trackBackground";
  @SerializedName(SERIALIZED_NAME_TRACK_BACKGROUND)
  private String trackBackground;

  public static final String SERIALIZED_NAME_BACKGROUND_TOP = "backgroundTop";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_TOP)
  private String backgroundTop;

  public static final String SERIALIZED_NAME_BACKGROUND_BOTTOM = "backgroundBottom";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_BOTTOM)
  private String backgroundBottom;

  public static final String SERIALIZED_NAME_BACKGROUND_TEXT = "backgroundText";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_TEXT)
  private String backgroundText;

  public static final String SERIALIZED_NAME_ENABLE_API = "enableApi";
  @SerializedName(SERIALIZED_NAME_ENABLE_API)
  private Boolean enableApi = true;

  public static final String SERIALIZED_NAME_ENABLE_CONTROLS = "enableControls";
  @SerializedName(SERIALIZED_NAME_ENABLE_CONTROLS)
  private Boolean enableControls = true;

  public static final String SERIALIZED_NAME_FORCE_AUTOPLAY = "forceAutoplay";
  @SerializedName(SERIALIZED_NAME_FORCE_AUTOPLAY)
  private Boolean forceAutoplay = false;

  public static final String SERIALIZED_NAME_HIDE_TITLE = "hideTitle";
  @SerializedName(SERIALIZED_NAME_HIDE_TITLE)
  private Boolean hideTitle = false;

  public static final String SERIALIZED_NAME_FORCE_LOOP = "forceLoop";
  @SerializedName(SERIALIZED_NAME_FORCE_LOOP)
  private Boolean forceLoop = false;

  public PlayerThemeCreationPayload() {
  }

  public PlayerThemeCreationPayload name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Add a name for your player theme here.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My nice theme", value = "Add a name for your player theme here.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PlayerThemeCreationPayload text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * RGBA color for timer text. Default: rgba(255, 255, 255, 1)
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 255, 255, .95)", value = "RGBA color for timer text. Default: rgba(255, 255, 255, 1)")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public PlayerThemeCreationPayload link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * RGBA color for all controls. Default: rgba(255, 255, 255, 1)
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 0, 0, .95)", value = "RGBA color for all controls. Default: rgba(255, 255, 255, 1)")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public PlayerThemeCreationPayload linkHover(String linkHover) {
    
    
    
    
    this.linkHover = linkHover;
    return this;
  }

   /**
   * RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
   * @return linkHover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 255, 255, .75)", value = "RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)")

  public String getLinkHover() {
    return linkHover;
  }


  public void setLinkHover(String linkHover) {
    
    
    
    this.linkHover = linkHover;
  }


  public PlayerThemeCreationPayload linkActive(String linkActive) {
    
    
    
    
    this.linkActive = linkActive;
    return this;
  }

   /**
   * RGBA color for the play button when hovered.
   * @return linkActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 0, 0, .75)", value = "RGBA color for the play button when hovered.")

  public String getLinkActive() {
    return linkActive;
  }


  public void setLinkActive(String linkActive) {
    
    
    
    this.linkActive = linkActive;
  }


  public PlayerThemeCreationPayload trackPlayed(String trackPlayed) {
    
    
    
    
    this.trackPlayed = trackPlayed;
    return this;
  }

   /**
   * RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
   * @return trackPlayed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 255, 255, .95)", value = "RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)")

  public String getTrackPlayed() {
    return trackPlayed;
  }


  public void setTrackPlayed(String trackPlayed) {
    
    
    
    this.trackPlayed = trackPlayed;
  }


  public PlayerThemeCreationPayload trackUnplayed(String trackUnplayed) {
    
    
    
    
    this.trackUnplayed = trackUnplayed;
    return this;
  }

   /**
   * RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
   * @return trackUnplayed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 255, 255, .1)", value = "RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)")

  public String getTrackUnplayed() {
    return trackUnplayed;
  }


  public void setTrackUnplayed(String trackUnplayed) {
    
    
    
    this.trackUnplayed = trackUnplayed;
  }


  public PlayerThemeCreationPayload trackBackground(String trackBackground) {
    
    
    
    
    this.trackBackground = trackBackground;
    return this;
  }

   /**
   * RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
   * @return trackBackground
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(0, 0, 0, 0)", value = "RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)")

  public String getTrackBackground() {
    return trackBackground;
  }


  public void setTrackBackground(String trackBackground) {
    
    
    
    this.trackBackground = trackBackground;
  }


  public PlayerThemeCreationPayload backgroundTop(String backgroundTop) {
    
    
    
    
    this.backgroundTop = backgroundTop;
    return this;
  }

   /**
   * RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
   * @return backgroundTop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(72, 4, 45, 1)", value = "RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)")

  public String getBackgroundTop() {
    return backgroundTop;
  }


  public void setBackgroundTop(String backgroundTop) {
    
    
    
    this.backgroundTop = backgroundTop;
  }


  public PlayerThemeCreationPayload backgroundBottom(String backgroundBottom) {
    
    
    
    
    this.backgroundBottom = backgroundBottom;
    return this;
  }

   /**
   * RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
   * @return backgroundBottom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(94, 95, 89, 1)", value = "RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)")

  public String getBackgroundBottom() {
    return backgroundBottom;
  }


  public void setBackgroundBottom(String backgroundBottom) {
    
    
    
    this.backgroundBottom = backgroundBottom;
  }


  public PlayerThemeCreationPayload backgroundText(String backgroundText) {
    
    
    
    
    this.backgroundText = backgroundText;
    return this;
  }

   /**
   * RGBA color for title text. Default: rgba(255, 255, 255, 1)
   * @return backgroundText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rgba(255, 255, 255, .95)", value = "RGBA color for title text. Default: rgba(255, 255, 255, 1)")

  public String getBackgroundText() {
    return backgroundText;
  }


  public void setBackgroundText(String backgroundText) {
    
    
    
    this.backgroundText = backgroundText;
  }


  public PlayerThemeCreationPayload enableApi(Boolean enableApi) {
    
    
    
    
    this.enableApi = enableApi;
    return this;
  }

   /**
   * enable/disable player SDK access. Default: true
   * @return enableApi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "enable/disable player SDK access. Default: true")

  public Boolean getEnableApi() {
    return enableApi;
  }


  public void setEnableApi(Boolean enableApi) {
    
    
    
    this.enableApi = enableApi;
  }


  public PlayerThemeCreationPayload enableControls(Boolean enableControls) {
    
    
    
    
    this.enableControls = enableControls;
    return this;
  }

   /**
   * enable/disable player controls. Default: true
   * @return enableControls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "enable/disable player controls. Default: true")

  public Boolean getEnableControls() {
    return enableControls;
  }


  public void setEnableControls(Boolean enableControls) {
    
    
    
    this.enableControls = enableControls;
  }


  public PlayerThemeCreationPayload forceAutoplay(Boolean forceAutoplay) {
    
    
    
    
    this.forceAutoplay = forceAutoplay;
    return this;
  }

   /**
   * enable/disable player autoplay. Default: false
   * @return forceAutoplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "enable/disable player autoplay. Default: false")

  public Boolean getForceAutoplay() {
    return forceAutoplay;
  }


  public void setForceAutoplay(Boolean forceAutoplay) {
    
    
    
    this.forceAutoplay = forceAutoplay;
  }


  public PlayerThemeCreationPayload hideTitle(Boolean hideTitle) {
    
    
    
    
    this.hideTitle = hideTitle;
    return this;
  }

   /**
   * enable/disable title. Default: false
   * @return hideTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "enable/disable title. Default: false")

  public Boolean getHideTitle() {
    return hideTitle;
  }


  public void setHideTitle(Boolean hideTitle) {
    
    
    
    this.hideTitle = hideTitle;
  }


  public PlayerThemeCreationPayload forceLoop(Boolean forceLoop) {
    
    
    
    
    this.forceLoop = forceLoop;
    return this;
  }

   /**
   * enable/disable looping. Default: false
   * @return forceLoop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "enable/disable looping. Default: false")

  public Boolean getForceLoop() {
    return forceLoop;
  }


  public void setForceLoop(Boolean forceLoop) {
    
    
    
    this.forceLoop = forceLoop;
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
   * @return the PlayerThemeCreationPayload instance itself
   */
  public PlayerThemeCreationPayload putAdditionalProperty(String key, Object value) {
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
    PlayerThemeCreationPayload playerThemeCreationPayload = (PlayerThemeCreationPayload) o;
    return Objects.equals(this.name, playerThemeCreationPayload.name) &&
        Objects.equals(this.text, playerThemeCreationPayload.text) &&
        Objects.equals(this.link, playerThemeCreationPayload.link) &&
        Objects.equals(this.linkHover, playerThemeCreationPayload.linkHover) &&
        Objects.equals(this.linkActive, playerThemeCreationPayload.linkActive) &&
        Objects.equals(this.trackPlayed, playerThemeCreationPayload.trackPlayed) &&
        Objects.equals(this.trackUnplayed, playerThemeCreationPayload.trackUnplayed) &&
        Objects.equals(this.trackBackground, playerThemeCreationPayload.trackBackground) &&
        Objects.equals(this.backgroundTop, playerThemeCreationPayload.backgroundTop) &&
        Objects.equals(this.backgroundBottom, playerThemeCreationPayload.backgroundBottom) &&
        Objects.equals(this.backgroundText, playerThemeCreationPayload.backgroundText) &&
        Objects.equals(this.enableApi, playerThemeCreationPayload.enableApi) &&
        Objects.equals(this.enableControls, playerThemeCreationPayload.enableControls) &&
        Objects.equals(this.forceAutoplay, playerThemeCreationPayload.forceAutoplay) &&
        Objects.equals(this.hideTitle, playerThemeCreationPayload.hideTitle) &&
        Objects.equals(this.forceLoop, playerThemeCreationPayload.forceLoop)&&
        Objects.equals(this.additionalProperties, playerThemeCreationPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, text, link, linkHover, linkActive, trackPlayed, trackUnplayed, trackBackground, backgroundTop, backgroundBottom, backgroundText, enableApi, enableControls, forceAutoplay, hideTitle, forceLoop, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerThemeCreationPayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkHover: ").append(toIndentedString(linkHover)).append("\n");
    sb.append("    linkActive: ").append(toIndentedString(linkActive)).append("\n");
    sb.append("    trackPlayed: ").append(toIndentedString(trackPlayed)).append("\n");
    sb.append("    trackUnplayed: ").append(toIndentedString(trackUnplayed)).append("\n");
    sb.append("    trackBackground: ").append(toIndentedString(trackBackground)).append("\n");
    sb.append("    backgroundTop: ").append(toIndentedString(backgroundTop)).append("\n");
    sb.append("    backgroundBottom: ").append(toIndentedString(backgroundBottom)).append("\n");
    sb.append("    backgroundText: ").append(toIndentedString(backgroundText)).append("\n");
    sb.append("    enableApi: ").append(toIndentedString(enableApi)).append("\n");
    sb.append("    enableControls: ").append(toIndentedString(enableControls)).append("\n");
    sb.append("    forceAutoplay: ").append(toIndentedString(forceAutoplay)).append("\n");
    sb.append("    hideTitle: ").append(toIndentedString(hideTitle)).append("\n");
    sb.append("    forceLoop: ").append(toIndentedString(forceLoop)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("link");
    openapiFields.add("linkHover");
    openapiFields.add("linkActive");
    openapiFields.add("trackPlayed");
    openapiFields.add("trackUnplayed");
    openapiFields.add("trackBackground");
    openapiFields.add("backgroundTop");
    openapiFields.add("backgroundBottom");
    openapiFields.add("backgroundText");
    openapiFields.add("enableApi");
    openapiFields.add("enableControls");
    openapiFields.add("forceAutoplay");
    openapiFields.add("hideTitle");
    openapiFields.add("forceLoop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlayerThemeCreationPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlayerThemeCreationPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerThemeCreationPayload is not found in the empty JSON string", PlayerThemeCreationPayload.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("linkHover") != null && !jsonObj.get("linkHover").isJsonNull()) && !jsonObj.get("linkHover").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkHover` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkHover").toString()));
      }
      if ((jsonObj.get("linkActive") != null && !jsonObj.get("linkActive").isJsonNull()) && !jsonObj.get("linkActive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkActive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkActive").toString()));
      }
      if ((jsonObj.get("trackPlayed") != null && !jsonObj.get("trackPlayed").isJsonNull()) && !jsonObj.get("trackPlayed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackPlayed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackPlayed").toString()));
      }
      if ((jsonObj.get("trackUnplayed") != null && !jsonObj.get("trackUnplayed").isJsonNull()) && !jsonObj.get("trackUnplayed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackUnplayed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackUnplayed").toString()));
      }
      if ((jsonObj.get("trackBackground") != null && !jsonObj.get("trackBackground").isJsonNull()) && !jsonObj.get("trackBackground").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackBackground` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackBackground").toString()));
      }
      if ((jsonObj.get("backgroundTop") != null && !jsonObj.get("backgroundTop").isJsonNull()) && !jsonObj.get("backgroundTop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundTop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundTop").toString()));
      }
      if ((jsonObj.get("backgroundBottom") != null && !jsonObj.get("backgroundBottom").isJsonNull()) && !jsonObj.get("backgroundBottom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundBottom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundBottom").toString()));
      }
      if ((jsonObj.get("backgroundText") != null && !jsonObj.get("backgroundText").isJsonNull()) && !jsonObj.get("backgroundText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerThemeCreationPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerThemeCreationPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerThemeCreationPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerThemeCreationPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerThemeCreationPayload>() {
           @Override
           public void write(JsonWriter out, PlayerThemeCreationPayload value) throws IOException {
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
           public PlayerThemeCreationPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PlayerThemeCreationPayload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlayerThemeCreationPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerThemeCreationPayload
  * @throws IOException if the JSON string is invalid with respect to PlayerThemeCreationPayload
  */
  public static PlayerThemeCreationPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerThemeCreationPayload.class);
  }

 /**
  * Convert an instance of PlayerThemeCreationPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

