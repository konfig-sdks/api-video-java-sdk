# LiveStreamsApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLivestreamObject**](LiveStreamsApi.md#createLivestreamObject) | **POST** /live-streams | Create live stream |
| [**deleteLivestream**](LiveStreamsApi.md#deleteLivestream) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream |
| [**deleteThumbnail**](LiveStreamsApi.md#deleteThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail |
| [**getLivestreamById**](LiveStreamsApi.md#getLivestreamById) | **GET** /live-streams/{liveStreamId} | Retrieve live stream |
| [**listAll**](LiveStreamsApi.md#listAll) | **GET** /live-streams | List all live streams |
| [**updateLivestreamObject**](LiveStreamsApi.md#updateLivestreamObject) | **PATCH** /live-streams/{liveStreamId} | Update a live stream |
| [**uploadThumbnail**](LiveStreamsApi.md#uploadThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail |


<a name="createLivestreamObject"></a>
# **createLivestreamObject**
> LiveStream createLivestreamObject(liveStreamCreationPayload).execute();

Create live stream

Creates a livestream object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String name = "name_example"; // Add a name for your live stream here.
    Boolean _public = true; // Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).
    String playerId = "playerId_example"; // The unique identifier for the player.
    List<RestreamsRequestObject> restreams = Arrays.asList(); // Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations.
    try {
      LiveStream result = client
              .liveStreams
              .createLivestreamObject(name)
              ._public(_public)
              .playerId(playerId)
              .restreams(restreams)
              .execute();
      System.out.println(result);
      System.out.println(result.getLiveStreamId());
      System.out.println(result.getName());
      System.out.println(result.getStreamKey());
      System.out.println(result.getPublic());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getBroadcasting());
      System.out.println(result.getRestreams());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#createLivestreamObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveStream> response = client
              .liveStreams
              .createLivestreamObject(name)
              ._public(_public)
              .playerId(playerId)
              .restreams(restreams)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#createLivestreamObject");
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
| **liveStreamCreationPayload** | [**LiveStreamCreationPayload**](LiveStreamCreationPayload.md)|  | |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteLivestream"></a>
# **deleteLivestream**
> deleteLivestream(liveStreamId).execute();

Delete a live stream

If you do not need a live stream any longer, you can send a request to delete it. All you need is the liveStreamId.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream that you want to remove.
    try {
      client
              .liveStreams
              .deleteLivestream(liveStreamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteLivestream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveStreams
              .deleteLivestream(liveStreamId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteLivestream");
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
| **liveStreamId** | **String**| The unique ID for the live stream that you want to remove. | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="deleteThumbnail"></a>
# **deleteThumbnail**
> LiveStream deleteThumbnail(liveStreamId).execute();

Delete a thumbnail

Send the unique identifier for a live stream to delete its thumbnail.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique identifier of the live stream whose thumbnail you want to delete.
    try {
      LiveStream result = client
              .liveStreams
              .deleteThumbnail(liveStreamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLiveStreamId());
      System.out.println(result.getName());
      System.out.println(result.getStreamKey());
      System.out.println(result.getPublic());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getBroadcasting());
      System.out.println(result.getRestreams());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveStream> response = client
              .liveStreams
              .deleteThumbnail(liveStreamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteThumbnail");
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
| **liveStreamId** | **String**| The unique identifier of the live stream whose thumbnail you want to delete. | |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLivestreamById"></a>
# **getLivestreamById**
> LiveStream getLivestreamById(liveStreamId).execute();

Retrieve live stream

Get a livestream by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream you want to watch.
    try {
      LiveStream result = client
              .liveStreams
              .getLivestreamById(liveStreamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLiveStreamId());
      System.out.println(result.getName());
      System.out.println(result.getStreamKey());
      System.out.println(result.getPublic());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getBroadcasting());
      System.out.println(result.getRestreams());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#getLivestreamById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveStream> response = client
              .liveStreams
              .getLivestreamById(liveStreamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#getLivestreamById");
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
| **liveStreamId** | **String**| The unique ID for the live stream you want to watch. | |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAll"></a>
# **listAll**
> LiveStreamListResponse listAll().streamKey(streamKey).name(name).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all live streams

Get the list of livestreams on the workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String streamKey = "dw-dew8-q6w9-k67w-1ws8"; // The unique stream key that allows you to stream videos.
    String name = "My Video"; // You can filter live streams by their name or a part of their name.
    String sortBy = "name"; // Enables you to sort live stream results. Allowed attributes: `name`, `createdAt`, `updatedAt`. `name` - the name of the live stream. `createdAt` - the time a live stream was created. `updatedAt` - the time a live stream was last updated.  When using `createdAt` or `updatedAt`, the API sorts the results based on the ISO-8601 time format. 
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.
    try {
      LiveStreamListResponse result = client
              .liveStreams
              .listAll()
              .streamKey(streamKey)
              .name(name)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveStreamListResponse> response = client
              .liveStreams
              .listAll()
              .streamKey(streamKey)
              .name(name)
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
      System.err.println("Exception when calling LiveStreamsApi#listAll");
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
| **streamKey** | **String**| The unique stream key that allows you to stream videos. | [optional] |
| **name** | **String**| You can filter live streams by their name or a part of their name. | [optional] |
| **sortBy** | **String**| Enables you to sort live stream results. Allowed attributes: &#x60;name&#x60;, &#x60;createdAt&#x60;, &#x60;updatedAt&#x60;. &#x60;name&#x60; - the name of the live stream. &#x60;createdAt&#x60; - the time a live stream was created. &#x60;updatedAt&#x60; - the time a live stream was last updated.  When using &#x60;createdAt&#x60; or &#x60;updatedAt&#x60;, the API sorts the results based on the ISO-8601 time format.  | [optional] [enum: name, createdAt, updatedAt] |
| **sortOrder** | **String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | [optional] [enum: asc, desc] |
| **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**LiveStreamListResponse**](LiveStreamListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateLivestreamObject"></a>
# **updateLivestreamObject**
> LiveStream updateLivestreamObject(liveStreamId, liveStreamUpdatePayload).execute();

Update a live stream

Updates the livestream object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // The unique ID for the live stream that you want to update information for such as player details.
    String name = "name_example"; // The name you want to use for your live stream.
    Boolean _public = true; // Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).
    String playerId = "playerId_example"; // The unique ID for the player associated with a live stream that you want to update.
    List<RestreamsRequestObject> restreams = Arrays.asList(); // Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations. This operation updates all restream destinations in the same request. If you do not want to modify an existing restream destination, you need to include it in your request, otherwise it is removed.
    try {
      LiveStream result = client
              .liveStreams
              .updateLivestreamObject(liveStreamId)
              .name(name)
              ._public(_public)
              .playerId(playerId)
              .restreams(restreams)
              .execute();
      System.out.println(result);
      System.out.println(result.getLiveStreamId());
      System.out.println(result.getName());
      System.out.println(result.getStreamKey());
      System.out.println(result.getPublic());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getBroadcasting());
      System.out.println(result.getRestreams());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#updateLivestreamObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveStream> response = client
              .liveStreams
              .updateLivestreamObject(liveStreamId)
              .name(name)
              ._public(_public)
              .playerId(playerId)
              .restreams(restreams)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#updateLivestreamObject");
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
| **liveStreamId** | **String**| The unique ID for the live stream that you want to update information for such as player details. | |
| **liveStreamUpdatePayload** | [**LiveStreamUpdatePayload**](LiveStreamUpdatePayload.md)|  | |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="uploadThumbnail"></a>
# **uploadThumbnail**
> LiveStream uploadThumbnail(liveStreamId, _file, liveStreamThumbnailUploadPayload).execute();

Upload a thumbnail

Upload the thumbnail for the livestream.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveStreamsApi;
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
    String liveStreamId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique ID for the live stream you want to upload.
    File _file = new File("/path/to/file"); // The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB.
    try {
      LiveStream result = client
              .liveStreams
              .uploadThumbnail(liveStreamId, _file)
              .execute();
      System.out.println(result);
      System.out.println(result.getLiveStreamId());
      System.out.println(result.getName());
      System.out.println(result.getStreamKey());
      System.out.println(result.getPublic());
      System.out.println(result.getAssets());
      System.out.println(result.getPlayerId());
      System.out.println(result.getBroadcasting());
      System.out.println(result.getRestreams());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#uploadThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveStream> response = client
              .liveStreams
              .uploadThumbnail(liveStreamId, _file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#uploadThumbnail");
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
| **liveStreamId** | **String**| The unique ID for the live stream you want to upload. | |
| **_file** | **File**| The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB. | |
| **liveStreamThumbnailUploadPayload** | [**LiveStreamThumbnailUploadPayload**](LiveStreamThumbnailUploadPayload.md)|  | |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

