# UploadTokensApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteToken**](UploadTokensApi.md#deleteToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token |
| [**generateToken**](UploadTokensApi.md#generateToken) | **POST** /upload-tokens | Generate an upload token |
| [**getDetails**](UploadTokensApi.md#getDetails) | **GET** /upload-tokens/{uploadToken} | Retrieve upload token |
| [**listActiveDelegatedTokens**](UploadTokensApi.md#listActiveDelegatedTokens) | **GET** /upload-tokens | List all active upload tokens |


<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(uploadToken).execute();

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadTokensApi;
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
    String uploadToken = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.
    try {
      client
              .uploadTokens
              .deleteToken(uploadToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#deleteToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .uploadTokens
              .deleteToken(uploadToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#deleteToken");
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
| **uploadToken** | **String**| The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. | |

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

<a name="generateToken"></a>
# **generateToken**
> UploadToken generateToken(tokenCreationPayload).execute();

Generate an upload token

Generates an upload token that can be used to replace the API Key. More information can be found [here](https://docs.api.video/vod/delegated-upload-tokens)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadTokensApi;
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
    Integer ttl = 0; // Time in seconds that the token will be active. A value of 0 means that the token has no exipration date. The default is to have no expiration.
    try {
      UploadToken result = client
              .uploadTokens
              .generateToken()
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getTtl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getExpiresAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#generateToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadToken> response = client
              .uploadTokens
              .generateToken()
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#generateToken");
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
| **tokenCreationPayload** | [**TokenCreationPayload**](TokenCreationPayload.md)|  | |

### Return type

[**UploadToken**](UploadToken.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDetails"></a>
# **getDetails**
> UploadToken getDetails(uploadToken).execute();

Retrieve upload token

Retrieve details about a specific upload token by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadTokensApi;
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
    String uploadToken = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want information about.
    try {
      UploadToken result = client
              .uploadTokens
              .getDetails(uploadToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getTtl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getExpiresAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadToken> response = client
              .uploadTokens
              .getDetails(uploadToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#getDetails");
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
| **uploadToken** | **String**| The unique identifier for the token you want information about. | |

### Return type

[**UploadToken**](UploadToken.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listActiveDelegatedTokens"></a>
# **listActiveDelegatedTokens**
> TokenListResponse listActiveDelegatedTokens().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all active upload tokens

Retrieve a list of all currently active delegated tokens.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ApiVideo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadTokensApi;
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
    String sortBy = "createdAt"; // Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.
    try {
      TokenListResponse result = client
              .uploadTokens
              .listActiveDelegatedTokens()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .currentPage(currentPage)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadTokensApi#listActiveDelegatedTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenListResponse> response = client
              .uploadTokens
              .listActiveDelegatedTokens()
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
      System.err.println("Exception when calling UploadTokensApi#listActiveDelegatedTokens");
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
| **sortBy** | **String**| Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | [optional] [enum: createdAt, ttl] |
| **sortOrder** | **String**| Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | [optional] [enum: asc, desc] |
| **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**TokenListResponse**](TokenListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

