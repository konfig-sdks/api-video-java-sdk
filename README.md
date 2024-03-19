<div align="left">

[![Visit Api.video](./header.png)](https://api.video)

# [Api.video](https://api.video)

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=api.video&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>api-video-java-sdk</artifactId>
  <version>1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:api-video-java-sdk:1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-video-java-sdk-1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdvancedAuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    ApiVideo client = new ApiVideo(configuration);
    String apiKey = "apiKey_example"; // Your account API key. You can use your sandbox API key, or you can use your production API key.
    try {
      AccessToken result = client
              .advancedAuthentication
              .getBearerToken(apiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getExpiresIn());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedAuthenticationApi#getBearerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessToken> response = client
              .advancedAuthentication
              .getBearerToken(apiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedAuthenticationApi#getBearerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ws.api.video*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvancedAuthenticationApi* | [**getBearerToken**](docs/AdvancedAuthenticationApi.md#getBearerToken) | **POST** /auth/api-key | Get Bearer Token
*AdvancedAuthenticationApi* | [**refreshBearerToken**](docs/AdvancedAuthenticationApi.md#refreshBearerToken) | **POST** /auth/refresh | Refresh Bearer Token
*AnalyticsApi* | [**getLiveStreamPlays**](docs/AnalyticsApi.md#getLiveStreamPlays) | **GET** /analytics/live-streams/plays | Get play events for live stream
*AnalyticsApi* | [**getVideoPlays**](docs/AnalyticsApi.md#getVideoPlays) | **GET** /analytics/videos/plays | Get play events for video
*CaptionsApi* | [**deleteByLanguage**](docs/CaptionsApi.md#deleteByLanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
*CaptionsApi* | [**getByLanguage**](docs/CaptionsApi.md#getByLanguage) | **GET** /videos/{videoId}/captions/{language} | Retrieve a caption
*CaptionsApi* | [**listByVideoId**](docs/CaptionsApi.md#listByVideoId) | **GET** /videos/{videoId}/captions | List video captions
*CaptionsApi* | [**updateSettings**](docs/CaptionsApi.md#updateSettings) | **PATCH** /videos/{videoId}/captions/{language} | Update a caption
*CaptionsApi* | [**uploadVttFile**](docs/CaptionsApi.md#uploadVttFile) | **POST** /videos/{videoId}/captions/{language} | Upload a caption
*ChaptersApi* | [**deleteChapterInLanguage**](docs/ChaptersApi.md#deleteChapterInLanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
*ChaptersApi* | [**getChapterByLanguage**](docs/ChaptersApi.md#getChapterByLanguage) | **GET** /videos/{videoId}/chapters/{language} | Retrieve a chapter
*ChaptersApi* | [**listByVideo**](docs/ChaptersApi.md#listByVideo) | **GET** /videos/{videoId}/chapters | List video chapters
*ChaptersApi* | [**uploadVttFile**](docs/ChaptersApi.md#uploadVttFile) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter
*LiveStreamsApi* | [**createLivestreamObject**](docs/LiveStreamsApi.md#createLivestreamObject) | **POST** /live-streams | Create live stream
*LiveStreamsApi* | [**deleteLivestream**](docs/LiveStreamsApi.md#deleteLivestream) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
*LiveStreamsApi* | [**deleteThumbnail**](docs/LiveStreamsApi.md#deleteThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
*LiveStreamsApi* | [**getLivestreamById**](docs/LiveStreamsApi.md#getLivestreamById) | **GET** /live-streams/{liveStreamId} | Retrieve live stream
*LiveStreamsApi* | [**listAll**](docs/LiveStreamsApi.md#listAll) | **GET** /live-streams | List all live streams
*LiveStreamsApi* | [**updateLivestreamObject**](docs/LiveStreamsApi.md#updateLivestreamObject) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
*LiveStreamsApi* | [**uploadThumbnail**](docs/LiveStreamsApi.md#uploadThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail
*PlayerThemesApi* | [**deletePlayer**](docs/PlayerThemesApi.md#deletePlayer) | **DELETE** /players/{playerId} | Delete a player
*PlayerThemesApi* | [**getThemeByPlayerId**](docs/PlayerThemesApi.md#getThemeByPlayerId) | **GET** /players/{playerId} | Retrieve a player
*PlayerThemesApi* | [**players**](docs/PlayerThemesApi.md#players) | **GET** /players | List all player themes
*PlayerThemesApi* | [**players_0**](docs/PlayerThemesApi.md#players_0) | **POST** /players | Create a player
*PlayerThemesApi* | [**removeLogo**](docs/PlayerThemesApi.md#removeLogo) | **DELETE** /players/{playerId}/logo | Delete logo
*PlayerThemesApi* | [**updatePlayerDetails**](docs/PlayerThemesApi.md#updatePlayerDetails) | **PATCH** /players/{playerId} | Update a player
*PlayerThemesApi* | [**uploadLogo**](docs/PlayerThemesApi.md#uploadLogo) | **POST** /players/{playerId}/logo | Upload a logo
*UploadTokensApi* | [**deleteToken**](docs/UploadTokensApi.md#deleteToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
*UploadTokensApi* | [**generateToken**](docs/UploadTokensApi.md#generateToken) | **POST** /upload-tokens | Generate an upload token
*UploadTokensApi* | [**getDetails**](docs/UploadTokensApi.md#getDetails) | **GET** /upload-tokens/{uploadToken} | Retrieve upload token
*UploadTokensApi* | [**listActiveDelegatedTokens**](docs/UploadTokensApi.md#listActiveDelegatedTokens) | **GET** /upload-tokens | List all active upload tokens
*VideosApi* | [**createObject**](docs/VideosApi.md#createObject) | **POST** /videos | Create a video object
*VideosApi* | [**deleteVideoObject**](docs/VideosApi.md#deleteVideoObject) | **DELETE** /videos/{videoId} | Delete a video object
*VideosApi* | [**getVideoObject**](docs/VideosApi.md#getVideoObject) | **GET** /videos/{videoId} | Retrieve a video object
*VideosApi* | [**getVideoStatusAndDetails**](docs/VideosApi.md#getVideoStatusAndDetails) | **GET** /videos/{videoId}/status | Retrieve video status and details
*VideosApi* | [**ingestVideoFromSource**](docs/VideosApi.md#ingestVideoFromSource) | **POST** /videos/{videoId}/source | Upload a video
*VideosApi* | [**listAllObjects**](docs/VideosApi.md#listAllObjects) | **GET** /videos | List all video objects
*VideosApi* | [**setThumbnailFromInterval**](docs/VideosApi.md#setThumbnailFromInterval) | **PATCH** /videos/{videoId}/thumbnail | Set a thumbnail
*VideosApi* | [**updateVideoObjectParameters**](docs/VideosApi.md#updateVideoObjectParameters) | **PATCH** /videos/{videoId} | Update a video object
*VideosApi* | [**upload**](docs/VideosApi.md#upload) | **POST** /upload | Upload with an delegated upload token
*VideosApi* | [**uploadThumbnail**](docs/VideosApi.md#uploadThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail
*WatermarksApi* | [**listAll**](docs/WatermarksApi.md#listAll) | **GET** /watermarks | List all watermarks
*WatermarksApi* | [**watermark**](docs/WatermarksApi.md#watermark) | **POST** /watermarks | Upload a watermark
*WatermarksApi* | [**watermark_0**](docs/WatermarksApi.md#watermark_0) | **DELETE** /watermarks/{watermarkId} | Delete a watermark
*WebhooksApi* | [**createWebhookEvent**](docs/WebhooksApi.md#createWebhookEvent) | **POST** /webhooks | Create Webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
*WebhooksApi* | [**getDetailsById**](docs/WebhooksApi.md#getDetailsById) | **GET** /webhooks/{webhookId} | Retrieve Webhook details
*WebhooksApi* | [**listAll**](docs/WebhooksApi.md#listAll) | **GET** /webhooks | List all webhooks


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [AdditionalBadRequestErrors](docs/AdditionalBadRequestErrors.md)
 - [AnalyticsData](docs/AnalyticsData.md)
 - [AnalyticsPlaysResponse](docs/AnalyticsPlaysResponse.md)
 - [AuthenticatePayload](docs/AuthenticatePayload.md)
 - [BytesRange](docs/BytesRange.md)
 - [Caption](docs/Caption.md)
 - [CaptionsListResponse](docs/CaptionsListResponse.md)
 - [CaptionsUpdatePayload](docs/CaptionsUpdatePayload.md)
 - [CaptionsUploadPayload](docs/CaptionsUploadPayload.md)
 - [Chapter](docs/Chapter.md)
 - [ChaptersListResponse](docs/ChaptersListResponse.md)
 - [ChaptersUpdatePayload](docs/ChaptersUpdatePayload.md)
 - [Link](docs/Link.md)
 - [LiveStream](docs/LiveStream.md)
 - [LiveStreamAssets](docs/LiveStreamAssets.md)
 - [LiveStreamCreationPayload](docs/LiveStreamCreationPayload.md)
 - [LiveStreamListResponse](docs/LiveStreamListResponse.md)
 - [LiveStreamSession](docs/LiveStreamSession.md)
 - [LiveStreamSessionClient](docs/LiveStreamSessionClient.md)
 - [LiveStreamSessionDevice](docs/LiveStreamSessionDevice.md)
 - [LiveStreamSessionLocation](docs/LiveStreamSessionLocation.md)
 - [LiveStreamSessionReferrer](docs/LiveStreamSessionReferrer.md)
 - [LiveStreamSessionSession](docs/LiveStreamSessionSession.md)
 - [LiveStreamThumbnailUploadPayload](docs/LiveStreamThumbnailUploadPayload.md)
 - [LiveStreamUpdatePayload](docs/LiveStreamUpdatePayload.md)
 - [Metadata](docs/Metadata.md)
 - [Pagination](docs/Pagination.md)
 - [PaginationLink](docs/PaginationLink.md)
 - [PlayerSessionEvent](docs/PlayerSessionEvent.md)
 - [PlayerTheme](docs/PlayerTheme.md)
 - [PlayerThemeAssets](docs/PlayerThemeAssets.md)
 - [PlayerThemeCreationPayload](docs/PlayerThemeCreationPayload.md)
 - [PlayerThemeUpdatePayload](docs/PlayerThemeUpdatePayload.md)
 - [PlayerThemeUploadLogoPayload](docs/PlayerThemeUploadLogoPayload.md)
 - [PlayerThemesListResponse](docs/PlayerThemesListResponse.md)
 - [Quality](docs/Quality.md)
 - [RefreshTokenPayload](docs/RefreshTokenPayload.md)
 - [RestreamsRequestObject](docs/RestreamsRequestObject.md)
 - [RestreamsResponseObject](docs/RestreamsResponseObject.md)
 - [TokenCreationPayload](docs/TokenCreationPayload.md)
 - [TokenListResponse](docs/TokenListResponse.md)
 - [TokenUploadPayload](docs/TokenUploadPayload.md)
 - [UploadToken](docs/UploadToken.md)
 - [Video](docs/Video.md)
 - [VideoAssets](docs/VideoAssets.md)
 - [VideoClip](docs/VideoClip.md)
 - [VideoCreationPayload](docs/VideoCreationPayload.md)
 - [VideoSession](docs/VideoSession.md)
 - [VideoSessionClient](docs/VideoSessionClient.md)
 - [VideoSessionDevice](docs/VideoSessionDevice.md)
 - [VideoSessionLocation](docs/VideoSessionLocation.md)
 - [VideoSessionOs](docs/VideoSessionOs.md)
 - [VideoSessionReferrer](docs/VideoSessionReferrer.md)
 - [VideoSessionSession](docs/VideoSessionSession.md)
 - [VideoSource](docs/VideoSource.md)
 - [VideoSourceLiveStream](docs/VideoSourceLiveStream.md)
 - [VideoSourceLiveStreamLink](docs/VideoSourceLiveStreamLink.md)
 - [VideoStatus](docs/VideoStatus.md)
 - [VideoStatusEncoding](docs/VideoStatusEncoding.md)
 - [VideoStatusEncodingMetadata](docs/VideoStatusEncodingMetadata.md)
 - [VideoStatusIngest](docs/VideoStatusIngest.md)
 - [VideoStatusIngestReceivedParts](docs/VideoStatusIngestReceivedParts.md)
 - [VideoThumbnailPickPayload](docs/VideoThumbnailPickPayload.md)
 - [VideoThumbnailUploadPayload](docs/VideoThumbnailUploadPayload.md)
 - [VideoUpdatePayload](docs/VideoUpdatePayload.md)
 - [VideoUploadPayload](docs/VideoUploadPayload.md)
 - [VideoWatermark](docs/VideoWatermark.md)
 - [VideosListResponse](docs/VideosListResponse.md)
 - [Watermark](docs/Watermark.md)
 - [WatermarkUploadPayload](docs/WatermarkUploadPayload.md)
 - [WatermarksListResponse](docs/WatermarksListResponse.md)
 - [Webhook](docs/Webhook.md)
 - [WebhooksCreationPayload](docs/WebhooksCreationPayload.md)
 - [WebhooksListResponse](docs/WebhooksListResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
