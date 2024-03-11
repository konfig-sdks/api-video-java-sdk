# WebhooksApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookEvent**](WebhooksApi.md#createWebhookEvent) | **POST** /webhooks | Create Webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook |
| [**getDetailsById**](WebhooksApi.md#getDetailsById) | **GET** /webhooks/{webhookId} | Retrieve Webhook details |
| [**listAll**](WebhooksApi.md#listAll) | **GET** /webhooks | List all webhooks |


<a name="createWebhookEvent"></a>
# **createWebhookEvent**
> Webhook createWebhookEvent(webhooksCreationPayload).execute();

Create Webhook

Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60; Occurs when a new video is uploaded into your account, it will be encoded into several different HLS and mp4 qualities. When each version is encoded, your webhook will get a notification.  It will look like &#x60;&#x60;&#x60;{ \&quot;type\&quot;: \&quot;video.encoding.quality.completed\&quot;, \&quot;emittedAt\&quot;: \&quot;2021-01-29T16:46:25.217+01:00\&quot;, \&quot;videoId\&quot;: \&quot;viXXXXXXXX\&quot;, \&quot;encoding\&quot;: \&quot;hls\&quot;, \&quot;quality\&quot;: \&quot;720p\&quot;} &#x60;&#x60;&#x60;. This request says that the 720p HLS encoding was completed. * &#x60;&#x60;&#x60;live-stream.broadcast.started&#x60;&#x60;&#x60;  When a live stream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * &#x60;&#x60;&#x60;live-stream.broadcast.ended&#x60;&#x60;&#x60;  This event fires when a live stream has finished broadcasting. * &#x60;&#x60;&#x60;video.source.recorded&#x60;&#x60;&#x60;  This event occurs when a live stream is recorded and submitted for encoding.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    List<String> events = Arrays.asList(); // A list of the webhooks that you are subscribing to. There are Currently four webhook options: * ```video.encoding.quality.completed```  Occurs when a new video is uploaded into your account, it will be encoded into several different HLS and mp4 qualities. When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\\\\\"type\\\\\\\": \\\\\\\"video.encoding.quality.completed\\\\\\\", \\\\\\\"emittedAt\\\\\\\": \\\\\\\"2021-01-29T16:46:25.217+01:00\\\\\\\", \\\\\\\"videoId\\\\\\\": \\\\\\\"viXXXXXXXX\\\\\\\", \\\\\\\"encoding\\\\\\\": \\\\\\\"hls\\\\\\\", \\\\\\\"quality\\\\\\\": \\\\\\\"720p\\\\\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a live stream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fires when a live stream has finished broadcasting. * ```video.source.recorded```  Occurs when a live stream is recorded and submitted for encoding.
    String url = "url_example"; // The the url to which HTTP notifications are sent. It could be any http or https URL.
    try {
      Webhook result = client
              .webhooks
              .createWebhookEvent(events, url)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhookId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getEvents());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhookEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webhook> response = client
              .webhooks
              .createWebhookEvent(events, url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhookEvent");
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
| **webhooksCreationPayload** | [**WebhooksCreationPayload**](WebhooksCreationPayload.md)|  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookId).execute();

Delete a Webhook

This endpoint will delete the indicated webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String webhookId = "webhookId_example"; // The webhook you wish to delete.
    try {
      client
              .webhooks
              .deleteWebhook(webhookId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhooks
              .deleteWebhook(webhookId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **webhookId** | **String**| The webhook you wish to delete. | |

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

<a name="getDetailsById"></a>
# **getDetailsById**
> Webhook getDetailsById(webhookId).execute();

Retrieve Webhook details

Retrieve webhook details by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String webhookId = "webhookId_example"; // The unique webhook you wish to retreive details on.
    try {
      Webhook result = client
              .webhooks
              .getDetailsById(webhookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhookId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getEvents());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getDetailsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webhook> response = client
              .webhooks
              .getDetailsById(webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getDetailsById");
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
| **webhookId** | **String**| The unique webhook you wish to retreive details on. | |

### Return type

[**Webhook**](Webhook.md)

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
> WebhooksListResponse listAll().events(events).currentPage(currentPage).pageSize(pageSize).execute();

List all webhooks

Retrieve a list of all webhooks configured for the current workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String events = "video.encoding.quality.completed"; // The webhook event that you wish to filter on.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.
    try {
      WebhooksListResponse result = client
              .webhooks
              .listAll()
              .events(events)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksListResponse> response = client
              .webhooks
              .listAll()
              .events(events)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listAll");
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
| **events** | **String**| The webhook event that you wish to filter on. | [optional] |
| **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**WebhooksListResponse**](WebhooksListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

