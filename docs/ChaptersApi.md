# ChaptersApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteChapterInLanguage**](ChaptersApi.md#deleteChapterInLanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter |
| [**getChapterByLanguage**](ChaptersApi.md#getChapterByLanguage) | **GET** /videos/{videoId}/chapters/{language} | Retrieve a chapter |
| [**listByVideo**](ChaptersApi.md#listByVideo) | **GET** /videos/{videoId}/chapters | List video chapters |
| [**uploadVttFile**](ChaptersApi.md#uploadVttFile) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter |


<a name="deleteChapterInLanguage"></a>
# **deleteChapterInLanguage**
> deleteChapterInLanguage(videoId, language).execute();

Delete a chapter

Delete a chapter in a specific language by providing the video ID for the video you want to delete the chapter from and the language the chapter is in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChaptersApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to delete a chapter from.
    String language = "en"; // A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    try {
      client
              .chapters
              .deleteChapterInLanguage(videoId, language)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#deleteChapterInLanguage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .chapters
              .deleteChapterInLanguage(videoId, language)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#deleteChapterInLanguage");
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
| **videoId** | **String**| The unique identifier for the video you want to delete a chapter from. | |
| **language** | **String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |

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

<a name="getChapterByLanguage"></a>
# **getChapterByLanguage**
> Chapter getChapterByLanguage(videoId, language).execute();

Retrieve a chapter

Retrieve a chapter for by video id in a specific language. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChaptersApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to show a chapter for.
    String language = "en"; // A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    try {
      Chapter result = client
              .chapters
              .getChapterByLanguage(videoId, language)
              .execute();
      System.out.println(result);
      System.out.println(result.getUri());
      System.out.println(result.getSrc());
      System.out.println(result.getLanguage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#getChapterByLanguage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Chapter> response = client
              .chapters
              .getChapterByLanguage(videoId, language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#getChapterByLanguage");
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
| **videoId** | **String**| The unique identifier for the video you want to show a chapter for. | |
| **language** | **String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listByVideo"></a>
# **listByVideo**
> ChaptersListResponse listByVideo(videoId).currentPage(currentPage).pageSize(pageSize).execute();

List video chapters

Retrieve a list of all chapters for by video id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChaptersApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to retrieve a list of chapters for.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.
    try {
      ChaptersListResponse result = client
              .chapters
              .listByVideo(videoId)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#listByVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChaptersListResponse> response = client
              .chapters
              .listByVideo(videoId)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#listByVideo");
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
| **videoId** | **String**| The unique identifier for the video you want to retrieve a list of chapters for. | |
| **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**ChaptersListResponse**](ChaptersListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="uploadVttFile"></a>
# **uploadVttFile**
> Chapter uploadVttFile(videoId, language, _file, chaptersUpdatePayload).execute();

Upload a chapter

Upload a VTT file to add chapters to your video. Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos/) for more details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChaptersApi;
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
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want to upload a chapter for.
    String language = "en"; // A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    File _file = new File("/path/to/file"); // The VTT file describing the chapters you want to upload.
    try {
      Chapter result = client
              .chapters
              .uploadVttFile(videoId, language, _file)
              .execute();
      System.out.println(result);
      System.out.println(result.getUri());
      System.out.println(result.getSrc());
      System.out.println(result.getLanguage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#uploadVttFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Chapter> response = client
              .chapters
              .uploadVttFile(videoId, language, _file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#uploadVttFile");
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
| **videoId** | **String**| The unique identifier for the video you want to upload a chapter for. | |
| **language** | **String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |
| **_file** | **File**| The VTT file describing the chapters you want to upload. | |
| **chaptersUpdatePayload** | [**ChaptersUpdatePayload**](ChaptersUpdatePayload.md)|  | |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

