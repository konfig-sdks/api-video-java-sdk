# PlayerThemesApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePlayer**](PlayerThemesApi.md#deletePlayer) | **DELETE** /players/{playerId} | Delete a player |
| [**getThemeByPlayerId**](PlayerThemesApi.md#getThemeByPlayerId) | **GET** /players/{playerId} | Retrieve a player |
| [**players**](PlayerThemesApi.md#players) | **GET** /players | List all player themes |
| [**players_0**](PlayerThemesApi.md#players_0) | **POST** /players | Create a player |
| [**removeLogo**](PlayerThemesApi.md#removeLogo) | **DELETE** /players/{playerId}/logo | Delete logo |
| [**updatePlayerDetails**](PlayerThemesApi.md#updatePlayerDetails) | **PATCH** /players/{playerId} | Update a player |
| [**uploadLogo**](PlayerThemesApi.md#uploadLogo) | **POST** /players/{playerId}/logo | Upload a logo |


<a name="deletePlayer"></a>
# **deletePlayer**
> deletePlayer(playerId).execute();

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player you want to delete.
    try {
      client
              .playerThemes
              .deletePlayer(playerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#deletePlayer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playerThemes
              .deletePlayer(playerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#deletePlayer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerId** | **String**| The unique identifier for the player you want to delete. | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="getThemeByPlayerId"></a>
# **getThemeByPlayerId**
> PlayerTheme getThemeByPlayerId(playerId).execute();

Retrieve a player

Retreive a player theme by player id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player you want to retrieve. 
    try {
      PlayerTheme result = client
              .playerThemes
              .getThemeByPlayerId(playerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getText());
      System.out.println(result.getLink());
      System.out.println(result.getLinkHover());
      System.out.println(result.getLinkActive());
      System.out.println(result.getTrackPlayed());
      System.out.println(result.getTrackUnplayed());
      System.out.println(result.getTrackBackground());
      System.out.println(result.getBackgroundTop());
      System.out.println(result.getBackgroundBottom());
      System.out.println(result.getBackgroundText());
      System.out.println(result.getEnableApi());
      System.out.println(result.getEnableControls());
      System.out.println(result.getForceAutoplay());
      System.out.println(result.getHideTitle());
      System.out.println(result.getForceLoop());
      System.out.println(result.getPlayerId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getAssets());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#getThemeByPlayerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerTheme> response = client
              .playerThemes
              .getThemeByPlayerId(playerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#getThemeByPlayerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerId** | **String**| The unique identifier for the player you want to retrieve.  | |

### Return type

[**PlayerTheme**](PlayerTheme.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="players"></a>
# **players**
> PlayerThemesListResponse players().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all player themes

Retrieve a list of all the player themes you created, as well as details about each one.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String sortBy = "name"; // createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.
    try {
      PlayerThemesListResponse result = client
              .playerThemes
              .players()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#players");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerThemesListResponse> response = client
              .playerThemes
              .players()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#players");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sortBy** | **String**| createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | [optional] [enum: name, createdAt, updatedAt] |
| **sortOrder** | **String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | [optional] [enum: asc, desc] |
| **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**PlayerThemesListResponse**](PlayerThemesListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="players_0"></a>
# **players_0**
> PlayerTheme players_0(playerThemeCreationPayload).execute();

Create a player

Create a player for your video, and customise it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String name = "name_example"; // Add a name for your player theme here.
    String text = "text_example"; // RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    String link = "link_example"; // RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    String linkHover = "linkHover_example"; // RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    String linkActive = "linkActive_example"; // RGBA color for the play button when hovered.
    String trackPlayed = "trackPlayed_example"; // RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    String trackUnplayed = "trackUnplayed_example"; // RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    String trackBackground = "trackBackground_example"; // RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    String backgroundTop = "backgroundTop_example"; // RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    String backgroundBottom = "backgroundBottom_example"; // RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    String backgroundText = "backgroundText_example"; // RGBA color for title text. Default: rgba(255, 255, 255, 1)
    Boolean enableApi = true; // enable/disable player SDK access. Default: true
    Boolean enableControls = true; // enable/disable player controls. Default: true
    Boolean forceAutoplay = false; // enable/disable player autoplay. Default: false
    Boolean hideTitle = false; // enable/disable title. Default: false
    Boolean forceLoop = false; // enable/disable looping. Default: false
    try {
      PlayerTheme result = client
              .playerThemes
              .players_0()
              .name(name)
              .text(text)
              .link(link)
              .linkHover(linkHover)
              .linkActive(linkActive)
              .trackPlayed(trackPlayed)
              .trackUnplayed(trackUnplayed)
              .trackBackground(trackBackground)
              .backgroundTop(backgroundTop)
              .backgroundBottom(backgroundBottom)
              .backgroundText(backgroundText)
              .enableApi(enableApi)
              .enableControls(enableControls)
              .forceAutoplay(forceAutoplay)
              .hideTitle(hideTitle)
              .forceLoop(forceLoop)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getText());
      System.out.println(result.getLink());
      System.out.println(result.getLinkHover());
      System.out.println(result.getLinkActive());
      System.out.println(result.getTrackPlayed());
      System.out.println(result.getTrackUnplayed());
      System.out.println(result.getTrackBackground());
      System.out.println(result.getBackgroundTop());
      System.out.println(result.getBackgroundBottom());
      System.out.println(result.getBackgroundText());
      System.out.println(result.getEnableApi());
      System.out.println(result.getEnableControls());
      System.out.println(result.getForceAutoplay());
      System.out.println(result.getHideTitle());
      System.out.println(result.getForceLoop());
      System.out.println(result.getPlayerId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getAssets());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#players_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerTheme> response = client
              .playerThemes
              .players_0()
              .name(name)
              .text(text)
              .link(link)
              .linkHover(linkHover)
              .linkActive(linkActive)
              .trackPlayed(trackPlayed)
              .trackUnplayed(trackUnplayed)
              .trackBackground(trackBackground)
              .backgroundTop(backgroundTop)
              .backgroundBottom(backgroundBottom)
              .backgroundText(backgroundText)
              .enableApi(enableApi)
              .enableControls(enableControls)
              .forceAutoplay(forceAutoplay)
              .hideTitle(hideTitle)
              .forceLoop(forceLoop)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#players_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerThemeCreationPayload** | [**PlayerThemeCreationPayload**](PlayerThemeCreationPayload.md)|  | |

### Return type

[**PlayerTheme**](PlayerTheme.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="removeLogo"></a>
# **removeLogo**
> removeLogo(playerId).execute();

Delete logo

Delete the logo associated to a player.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String playerId = "pl14Db6oMJRH6SRVoOwORacK"; // The unique identifier for the player.
    try {
      client
              .playerThemes
              .removeLogo(playerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#removeLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playerThemes
              .removeLogo(playerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#removeLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerId** | **String**| The unique identifier for the player. | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="updatePlayerDetails"></a>
# **updatePlayerDetails**
> PlayerTheme updatePlayerDetails(playerId, playerThemeUpdatePayload).execute();

Update a player

Use a player ID to update specific details for a player.  NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player.
    String name = "name_example"; // Add a name for your player theme here.
    String text = "text_example"; // RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    String link = "link_example"; // RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    String linkHover = "linkHover_example"; // RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    String linkActive = "linkActive_example"; // RGBA color for the play button when hovered.
    String trackPlayed = "trackPlayed_example"; // RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    String trackUnplayed = "trackUnplayed_example"; // RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    String trackBackground = "trackBackground_example"; // RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    String backgroundTop = "backgroundTop_example"; // RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    String backgroundBottom = "backgroundBottom_example"; // RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    String backgroundText = "backgroundText_example"; // RGBA color for title text. Default: rgba(255, 255, 255, 1)
    Boolean enableApi = true; // enable/disable player SDK access. Default: true
    Boolean enableControls = true; // enable/disable player controls. Default: true
    Boolean forceAutoplay = true; // enable/disable player autoplay. Default: false
    Boolean hideTitle = true; // enable/disable title. Default: false
    Boolean forceLoop = true; // enable/disable looping. Default: false
    try {
      PlayerTheme result = client
              .playerThemes
              .updatePlayerDetails(playerId)
              .name(name)
              .text(text)
              .link(link)
              .linkHover(linkHover)
              .linkActive(linkActive)
              .trackPlayed(trackPlayed)
              .trackUnplayed(trackUnplayed)
              .trackBackground(trackBackground)
              .backgroundTop(backgroundTop)
              .backgroundBottom(backgroundBottom)
              .backgroundText(backgroundText)
              .enableApi(enableApi)
              .enableControls(enableControls)
              .forceAutoplay(forceAutoplay)
              .hideTitle(hideTitle)
              .forceLoop(forceLoop)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getText());
      System.out.println(result.getLink());
      System.out.println(result.getLinkHover());
      System.out.println(result.getLinkActive());
      System.out.println(result.getTrackPlayed());
      System.out.println(result.getTrackUnplayed());
      System.out.println(result.getTrackBackground());
      System.out.println(result.getBackgroundTop());
      System.out.println(result.getBackgroundBottom());
      System.out.println(result.getBackgroundText());
      System.out.println(result.getEnableApi());
      System.out.println(result.getEnableControls());
      System.out.println(result.getForceAutoplay());
      System.out.println(result.getHideTitle());
      System.out.println(result.getForceLoop());
      System.out.println(result.getPlayerId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getAssets());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#updatePlayerDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerTheme> response = client
              .playerThemes
              .updatePlayerDetails(playerId)
              .name(name)
              .text(text)
              .link(link)
              .linkHover(linkHover)
              .linkActive(linkActive)
              .trackPlayed(trackPlayed)
              .trackUnplayed(trackUnplayed)
              .trackBackground(trackBackground)
              .backgroundTop(backgroundTop)
              .backgroundBottom(backgroundBottom)
              .backgroundText(backgroundText)
              .enableApi(enableApi)
              .enableControls(enableControls)
              .forceAutoplay(forceAutoplay)
              .hideTitle(hideTitle)
              .forceLoop(forceLoop)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#updatePlayerDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerId** | **String**| The unique identifier for the player. | |
| **playerThemeUpdatePayload** | [**PlayerThemeUpdatePayload**](PlayerThemeUpdatePayload.md)|  | |

### Return type

[**PlayerTheme**](PlayerTheme.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="uploadLogo"></a>
# **uploadLogo**
> PlayerTheme uploadLogo(playerId, _file, playerThemeUploadLogoPayload).link(link).execute();

Upload a logo

Upload an image file as a logo for your player. The image should fit within these constraints: - The image mime type must be &#x60;image/jpeg&#x60; or &#x60;image/png&#x60;. api.video recommends using &#x60;png&#x60; images with transparent background. - The image size should be a maximum of 200px width x 100px. - The file size should be a maximum of 100 KiB. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerThemesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    
    // Configure HTTP basic authorization: apiKey
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ApiVideo client = new ApiVideo(configuration);
    String playerId = "pl14Db6oMJRH6SRVoOwORacK"; // The unique identifier for the player.
    File _file = new File("/path/to/file"); // The name of the file you want to use for your logo.
    String link = "link_example"; // A public link that you want to advertise in your player. For example, you could add a link to your company. When a viewer clicks on your logo, they will be taken to this address.
    try {
      PlayerTheme result = client
              .playerThemes
              .uploadLogo(playerId, _file)
              .link(link)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getText());
      System.out.println(result.getLink());
      System.out.println(result.getLinkHover());
      System.out.println(result.getLinkActive());
      System.out.println(result.getTrackPlayed());
      System.out.println(result.getTrackUnplayed());
      System.out.println(result.getTrackBackground());
      System.out.println(result.getBackgroundTop());
      System.out.println(result.getBackgroundBottom());
      System.out.println(result.getBackgroundText());
      System.out.println(result.getEnableApi());
      System.out.println(result.getEnableControls());
      System.out.println(result.getForceAutoplay());
      System.out.println(result.getHideTitle());
      System.out.println(result.getForceLoop());
      System.out.println(result.getPlayerId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getAssets());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#uploadLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerTheme> response = client
              .playerThemes
              .uploadLogo(playerId, _file)
              .link(link)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#uploadLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerId** | **String**| The unique identifier for the player. | |
| **_file** | **File**| The name of the file you want to use for your logo. | |
| **playerThemeUploadLogoPayload** | [**PlayerThemeUploadLogoPayload**](PlayerThemeUploadLogoPayload.md)|  | |
| **link** | **String**| A public link that you want to advertise in your player. For example, you could add a link to your company. When a viewer clicks on your logo, they will be taken to this address. | [optional] |

### Return type

[**PlayerTheme**](PlayerTheme.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

