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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import com.konfigthis.client.model.Watermark;
import com.konfigthis.client.model.WatermarkUploadPayload;
import com.konfigthis.client.model.WatermarksListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WatermarksApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WatermarksApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public WatermarksApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call listAllCall(String sortBy, String sortOrder, Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/watermarks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (currentPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currentPage", currentPage));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllValidateBeforeCall(String sortBy, String sortOrder, Integer currentPage, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return listAllCall(sortBy, sortOrder, currentPage, pageSize, _callback);

    }


    private ApiResponse<WatermarksListResponse> listAllWithHttpInfo(String sortBy, String sortOrder, Integer currentPage, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(sortBy, sortOrder, currentPage, pageSize, null);
        Type localVarReturnType = new TypeToken<WatermarksListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(String sortBy, String sortOrder, Integer currentPage, Integer pageSize, final ApiCallback<WatermarksListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(sortBy, sortOrder, currentPage, pageSize, _callback);
        Type localVarReturnType = new TypeToken<WatermarksListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRequestBuilder {
        private String sortBy;
        private String sortOrder;
        private Integer currentPage;
        private Integer pageSize;

        private ListAllRequestBuilder() {
        }

        /**
         * Set sortBy
         * @param sortBy Allowed: createdAt. You can search by the time watermark were created at. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        
        /**
         * Set sortOrder
         * @param sortOrder Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        
        /**
         * Set currentPage
         * @param currentPage Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for listAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllCall(sortBy, sortOrder, currentPage, pageSize, _callback);
        }


        /**
         * Execute listAll request
         * @return WatermarksListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public WatermarksListResponse execute() throws ApiException {
            ApiResponse<WatermarksListResponse> localVarResp = listAllWithHttpInfo(sortBy, sortOrder, currentPage, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;WatermarksListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WatermarksListResponse> executeWithHttpInfo() throws ApiException {
            return listAllWithHttpInfo(sortBy, sortOrder, currentPage, pageSize);
        }

        /**
         * Execute listAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WatermarksListResponse> _callback) throws ApiException {
            return listAllAsync(sortBy, sortOrder, currentPage, pageSize, _callback);
        }
    }

    /**
     * List all watermarks
     * List all watermarks associated with your workspace.
     * @return ListAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ListAllRequestBuilder listAll() throws IllegalArgumentException {
        return new ListAllRequestBuilder();
    }
    private okhttp3.Call watermarkCall(File _file, WatermarkUploadPayload watermarkUploadPayload, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = watermarkUploadPayload;

        // create path and map variables
        String localVarPath = "/watermarks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call watermarkValidateBeforeCall(File _file, WatermarkUploadPayload watermarkUploadPayload, final ApiCallback _callback) throws ApiException {
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling watermark(Async)");
        }

        // verify the required parameter 'watermarkUploadPayload' is set
        if (watermarkUploadPayload == null) {
            throw new ApiException("Missing the required parameter 'watermarkUploadPayload' when calling watermark(Async)");
        }

        return watermarkCall(_file, watermarkUploadPayload, _callback);

    }


    private ApiResponse<Watermark> watermarkWithHttpInfo(File _file, WatermarkUploadPayload watermarkUploadPayload) throws ApiException {
        okhttp3.Call localVarCall = watermarkValidateBeforeCall(_file, watermarkUploadPayload, null);
        Type localVarReturnType = new TypeToken<Watermark>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call watermarkAsync(File _file, WatermarkUploadPayload watermarkUploadPayload, final ApiCallback<Watermark> _callback) throws ApiException {

        okhttp3.Call localVarCall = watermarkValidateBeforeCall(_file, watermarkUploadPayload, _callback);
        Type localVarReturnType = new TypeToken<Watermark>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class WatermarkRequestBuilder {
        private final File _file;

        private WatermarkRequestBuilder(File _file) {
            this._file = _file;
        }

        /**
         * Build call for watermark
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            WatermarkUploadPayload watermarkUploadPayload = buildBodyParams();
            return watermarkCall(_file, watermarkUploadPayload, _callback);
        }

        private WatermarkUploadPayload buildBodyParams() {
            WatermarkUploadPayload watermarkUploadPayload = new WatermarkUploadPayload();
            watermarkUploadPayload._file(this._file);
            return watermarkUploadPayload;
        }

        /**
         * Execute watermark request
         * @return Watermark
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public Watermark execute() throws ApiException {
            WatermarkUploadPayload watermarkUploadPayload = buildBodyParams();
            ApiResponse<Watermark> localVarResp = watermarkWithHttpInfo(_file, watermarkUploadPayload);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute watermark request with HTTP info returned
         * @return ApiResponse&lt;Watermark&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Watermark> executeWithHttpInfo() throws ApiException {
            WatermarkUploadPayload watermarkUploadPayload = buildBodyParams();
            return watermarkWithHttpInfo(_file, watermarkUploadPayload);
        }

        /**
         * Execute watermark request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Watermark> _callback) throws ApiException {
            WatermarkUploadPayload watermarkUploadPayload = buildBodyParams();
            return watermarkAsync(_file, watermarkUploadPayload, _callback);
        }
    }

    /**
     * Upload a watermark
     * Create a new watermark by uploading a &#x60;JPG&#x60; or a &#x60;PNG&#x60; image.
     * @param _file The &#x60;.jpg&#x60; or &#x60;.png&#x60; image to be added as a watermark. (required)
     * @param watermarkUploadPayload  (required)
     * @return WatermarkRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public WatermarkRequestBuilder watermark(File _file) throws IllegalArgumentException {
        if (_file == null) throw new IllegalArgumentException("\"_file\" is required but got null");
        return new WatermarkRequestBuilder(_file);
    }
    private okhttp3.Call watermark_0Call(String watermarkId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/watermarks/{watermarkId}"
            .replace("{" + "watermarkId" + "}", localVarApiClient.escapeString(watermarkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call watermark_0ValidateBeforeCall(String watermarkId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'watermarkId' is set
        if (watermarkId == null) {
            throw new ApiException("Missing the required parameter 'watermarkId' when calling watermark_0(Async)");
        }

        return watermark_0Call(watermarkId, _callback);

    }


    private ApiResponse<Void> watermark_0WithHttpInfo(String watermarkId) throws ApiException {
        okhttp3.Call localVarCall = watermark_0ValidateBeforeCall(watermarkId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call watermark_0Async(String watermarkId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = watermark_0ValidateBeforeCall(watermarkId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class Watermark0RequestBuilder {
        private final String watermarkId;

        private Watermark0RequestBuilder(String watermarkId) {
            this.watermarkId = watermarkId;
        }

        /**
         * Build call for watermark_0
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return watermark_0Call(watermarkId, _callback);
        }


        /**
         * Execute watermark_0 request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            watermark_0WithHttpInfo(watermarkId);
        }

        /**
         * Execute watermark_0 request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return watermark_0WithHttpInfo(watermarkId);
        }

        /**
         * Execute watermark_0 request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return watermark_0Async(watermarkId, _callback);
        }
    }

    /**
     * Delete a watermark
     * Delete a watermark.
     * @param watermarkId The watermark ID for the watermark you want to delete. (required)
     * @return Watermark0RequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public Watermark0RequestBuilder watermark_0(String watermarkId) throws IllegalArgumentException {
        if (watermarkId == null) throw new IllegalArgumentException("\"watermarkId\" is required but got null");
            

        return new Watermark0RequestBuilder(watermarkId);
    }
}