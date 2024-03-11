# VideosApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createObject**](VideosApi.md#createObject) | **POST** /videos | Create a video object |
| [**deleteVideoObject**](VideosApi.md#deleteVideoObject) | **DELETE** /videos/{videoId} | Delete a video object |
| [**getVideoObject**](VideosApi.md#getVideoObject) | **GET** /videos/{videoId} | Retrieve a video object |
| [**getVideoStatusAndDetails**](VideosApi.md#getVideoStatusAndDetails) | **GET** /videos/{videoId}/status | Retrieve video status and details |
| [**ingestVideoFromSource**](VideosApi.md#ingestVideoFromSource) | **POST** /videos/{videoId}/source | Upload a video |
| [**listAllObjects**](VideosApi.md#listAllObjects) | **GET** /videos | List all video objects |
| [**setThumbnailFromInterval**](VideosApi.md#setThumbnailFromInterval) | **PATCH** /videos/{videoId}/thumbnail | Set a thumbnail |
| [**updateVideoObjectParameters**](VideosApi.md#updateVideoObjectParameters) | **PATCH** /videos/{videoId} | Update a video object |
| [**upload**](VideosApi.md#upload) | **POST** /upload | Upload with an delegated upload token |
| [**uploadThumbnail**](VideosApi.md#uploadThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail |


<a name="createObject"></a>
# **createObject**
> Video createObject(videoCreationPayload).execute();

Create a video object

Creates a video object. More information on video objects can be found [here](https://docs.api.video/reference/api/Videos). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String title = "title_example"; // The title of your new video.
    List<String> tags = Arrays.asList(); // A list of tags you want to use to describe your video.
    String description = "description_example"; // A brief description of your video.
    String source = "source_example"; // You can either add a video already on the web, by entering the URL of the video, or you can also enter the `videoId` of one of the videos you already have on your api.video acccount, and this will generate a copy of your video. Creating a copy of a video can be especially useful if you want to keep your original video and trim or apply a watermark onto the copy you would create.
    Boolean _public = true; // Default: True. If set to `false` the video will become private. More information on private videos can be found [here](https://docs.api.video/delivery-analytics/video-privacy-access-management)
    Boolean panoramic = false; // Indicates if your video is a 360/immersive video.
    Boolean mp4Support = true; // Enables mp4 version in addition to streamed version.
    String playerId = "playerId_example"; // The unique identification number for your video player.
    List<Metadata> metadata = Arrays.asList(); // A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata/).
    VideoClip clip = new VideoClip();
    VideoWatermark watermark = new VideoWatermark();
    try {
      Video result = client
              .videos
              .createObject(title)
              .tags(tags)
              .description(description)
              .source(source)
              ._public(_public)
              .panoramic(panoramic)
              .mp4Support(mp4Support)
              .playerId(playerId)
              .metadata(metadata)
              .clip(clip)
              .watermark(watermark)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#createObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .createObject(title)
              .tags(tags)
              .description(description)
              .source(source)
              ._public(_public)
              .panoramic(panoramic)
              .mp4Support(mp4Support)
              .playerId(playerId)
              .metadata(metadata)
              .clip(clip)
              .watermark(watermark)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#createObject");
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
| **videoCreationPayload** | [**VideoCreationPayload**](VideoCreationPayload.md)| video to create | |

### Return type

[**Video**](Video.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **202** | Accepted |  -  |

<a name="deleteVideoObject"></a>
# **deleteVideoObject**
> deleteVideoObject(videoId).execute();

Delete a video object

Delete a video object by video ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The video ID for the video you want to delete.
    try {
      client
              .videos
              .deleteVideoObject(videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteVideoObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .deleteVideoObject(videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteVideoObject");
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
| **videoId** | **String**| The video ID for the video you want to delete. | |

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

<a name="getVideoObject"></a>
# **getVideoObject**
> Video getVideoObject(videoId).execute();

Retrieve a video object

Retrieve the video details by video id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "videoId_example"; // The unique identifier for the video you want details about.
    try {
      Video result = client
              .videos
              .getVideoObject(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getVideoObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .getVideoObject(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getVideoObject");
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
| **videoId** | **String**| The unique identifier for the video you want details about. | |

### Return type

[**Video**](Video.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVideoStatusAndDetails"></a>
# **getVideoStatusAndDetails**
> VideoStatus getVideoStatusAndDetails(videoId).execute();

Retrieve video status and details

Retrieve upload status and encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want the status for.
    try {
      VideoStatus result = client
              .videos
              .getVideoStatusAndDetails(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getIngest());
      System.out.println(result.getEncoding());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getVideoStatusAndDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoStatus> response = client
              .videos
              .getVideoStatusAndDetails(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getVideoStatusAndDetails");
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
| **videoId** | **String**| The unique identifier for the video you want the status for. | |

### Return type

[**VideoStatus**](VideoStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="ingestVideoFromSource"></a>
# **ingestVideoFromSource**
> Video ingestVideoFromSource(videoId, _file, videoUploadPayload).contentRange(contentRange).execute();

Upload a video

Ingest a video from a source or file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Enter the videoId you want to use to upload your video.
    File _file = new File("/path/to/file"); // The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.
    String contentRange = "bytes 209715200-419430399/524288000 OR part 2/3"; // `part <part>/<total_parts>` ; `bytes <from_byte>-<to_byte>/<total_bytes>`
    try {
      Video result = client
              .videos
              .ingestVideoFromSource(videoId, _file)
              .contentRange(contentRange)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#ingestVideoFromSource");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .ingestVideoFromSource(videoId, _file)
              .contentRange(contentRange)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#ingestVideoFromSource");
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
| **videoId** | **String**| Enter the videoId you want to use to upload your video. | |
| **_file** | **File**| The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. | |
| **videoUploadPayload** | [**VideoUploadPayload**](VideoUploadPayload.md)|  | |
| **contentRange** | **String**| &#x60;part &lt;part&gt;/&lt;total_parts&gt;&#x60; ; &#x60;bytes &lt;from_byte&gt;-&lt;to_byte&gt;/&lt;total_bytes&gt;&#x60; | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> VideosListResponse listAllObjects().title(title).tags(tags).metadata(metadata).description(description).liveStreamId(liveStreamId).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all video objects

List all the video objects that are associated with the current workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String title = "My Video.mp4"; // The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
    List<String> tags = Arrays.asList(); // A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
    Map<String, String> metadata = new HashMap(); // Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata/) allows you to define a key that allows any value pair.
    String description = "New Zealand"; // Retrieve video objects by `description`.
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // Retrieve video objects that were recorded from a live stream by `liveStreamId`.
    String sortBy = "title"; // Use this parameter to sort videos by the their created time, published time, updated time, or by title.
    String sortOrder = "asc"; // Use this parameter to sort results. `asc` is ascending and sorts from A to Z. `desc` is descending and sorts from Z to A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.
    try {
      VideosListResponse result = client
              .videos
              .listAllObjects()
              .title(title)
              .tags(tags)
              .metadata(metadata)
              .description(description)
              .liveStreamId(liveStreamId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideosListResponse> response = client
              .videos
              .listAllObjects()
              .title(title)
              .tags(tags)
              .metadata(metadata)
              .description(description)
              .liveStreamId(liveStreamId)
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
      System.err.println("Exception when calling VideosApi#listAllObjects");
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
| **title** | **String**| The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | [optional] |
| **metadata** | [**Map&lt;String, String&gt;**](String.md)| Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata/) allows you to define a key that allows any value pair. | [optional] |
| **description** | **String**| Retrieve video objects by &#x60;description&#x60;. | [optional] |
| **liveStreamId** | **String**| Retrieve video objects that were recorded from a live stream by &#x60;liveStreamId&#x60;. | [optional] |
| **sortBy** | **String**| Use this parameter to sort videos by the their created time, published time, updated time, or by title. | [optional] [enum: title, createdAt, publishedAt, updatedAt] |
| **sortOrder** | **String**| Use this parameter to sort results. &#x60;asc&#x60; is ascending and sorts from A to Z. &#x60;desc&#x60; is descending and sorts from Z to A. | [optional] [enum: asc, desc] |
| **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**VideosListResponse**](VideosListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="setThumbnailFromInterval"></a>
# **setThumbnailFromInterval**
> Video setThumbnailFromInterval(videoId, videoThumbnailPickPayload).execute();

Set a thumbnail

Set a thumbnail from a specific time interval within a video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String timecode = "timecode_example"; // Frame in video to be used as a placeholder before the video plays.  Example: '\\\"00:01:00.000\\\" for 1 minute into the video.' Valid Patterns:  \\\"hh:mm:ss.ms\\\" \\\"hh:mm:ss:frameNumber\\\" \\\"124\\\" (integer value is reported as seconds)  If selection is out of range, \\\"00:00:00.00\\\" will be chosen.
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
    try {
      Video result = client
              .videos
              .setThumbnailFromInterval(timecode, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#setThumbnailFromInterval");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .setThumbnailFromInterval(timecode, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#setThumbnailFromInterval");
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
| **videoId** | **String**| Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. | |
| **videoThumbnailPickPayload** | [**VideoThumbnailPickPayload**](VideoThumbnailPickPayload.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateVideoObjectParameters"></a>
# **updateVideoObjectParameters**
> Video updateVideoObjectParameters(videoId, videoUpdatePayload).execute();

Update a video object

Update the parameters associated with a video ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The video ID for the video you want to update.
    List<String> tags = Arrays.asList(); // A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.
    String title = "title_example"; // The title you want to use for your video.
    String description = "description_example"; // A brief description of the video.
    String playerId = "playerId_example"; // The unique ID for the player you want to associate with your video.
    Boolean _public = true; // Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos/).
    Boolean panoramic = true; // Whether the video is a 360 degree or immersive video.
    Boolean mp4Support = true; // Whether the player supports the mp4 format.
    List<Metadata> metadata = Arrays.asList(); // A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata/) allows you to define a key that allows any value pair.
    try {
      Video result = client
              .videos
              .updateVideoObjectParameters(videoId)
              .tags(tags)
              .title(title)
              .description(description)
              .playerId(playerId)
              ._public(_public)
              .panoramic(panoramic)
              .mp4Support(mp4Support)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#updateVideoObjectParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .updateVideoObjectParameters(videoId)
              .tags(tags)
              .title(title)
              .description(description)
              .playerId(playerId)
              ._public(_public)
              .panoramic(panoramic)
              .mp4Support(mp4Support)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#updateVideoObjectParameters");
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
| **videoId** | **String**| The video ID for the video you want to update. | |
| **videoUpdatePayload** | [**VideoUpdatePayload**](VideoUpdatePayload.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="upload"></a>
# **upload**
> Video upload(token, _file, tokenUploadPayload).contentRange(contentRange).videoId(videoId).execute();

Upload with an delegated upload token

Uploading a video with the delegated upload token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://ws.api.video";
    ApiVideo client = new ApiVideo(configuration);
    String token = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want to use to upload a video.
    File _file = new File("/path/to/file"); // The path to the video you want to upload.
    String contentRange = "Content-Range: bytes 200-100/5000"; // Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
    String videoId = "videoId_example"; // The video id returned by the first call to this endpoint in a large video upload scenario.
    try {
      Video result = client
              .videos
              .upload(token, _file)
              .contentRange(contentRange)
              .videoId(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#upload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .upload(token, _file)
              .contentRange(contentRange)
              .videoId(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#upload");
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
| **token** | **String**| The unique identifier for the token you want to use to upload a video. | |
| **_file** | **File**| The path to the video you want to upload. | |
| **tokenUploadPayload** | [**TokenUploadPayload**](TokenUploadPayload.md)|  | |
| **contentRange** | **String**| Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional] |
| **videoId** | **String**| The video id returned by the first call to this endpoint in a large video upload scenario. | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="uploadThumbnail"></a>
# **uploadThumbnail**
> Video uploadThumbnail(videoId, _file, videoThumbnailUploadPayload).execute();

Upload a thumbnail

Upload a thumbnail for a certain video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "videoId_example"; // Unique identifier of the chosen video 
    File _file = new File("/path/to/file"); // The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB.
    try {
      Video result = client
              .videos
              .uploadThumbnail(videoId, _file)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getVideoId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getSource());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getPublic());
      System.out.println(result.getPanoramic());
      System.out.println(result.getMp4Support());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#uploadThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .uploadThumbnail(videoId, _file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#uploadThumbnail");
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
| **videoId** | **String**| Unique identifier of the chosen video  | |
| **_file** | **File**| The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB. | |
| **videoThumbnailUploadPayload** | [**VideoThumbnailUploadPayload**](VideoThumbnailUploadPayload.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

