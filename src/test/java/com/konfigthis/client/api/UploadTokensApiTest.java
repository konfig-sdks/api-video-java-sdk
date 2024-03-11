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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.TokenCreationPayload;
import com.konfigthis.client.model.TokenListResponse;
import com.konfigthis.client.model.UploadToken;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadTokensApi
 */
@Disabled
public class UploadTokensApiTest {

    private static UploadTokensApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UploadTokensApi(apiClient);
    }

    /**
     * Delete an upload token
     *
     * Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTokenTest() throws ApiException {
        String uploadToken = null;
        api.deleteToken(uploadToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate an upload token
     *
     * Generates an upload token that can be used to replace the API Key. More information can be found [here](https://docs.api.video/vod/delegated-upload-tokens)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTokenTest() throws ApiException {
        Integer ttl = null;
        UploadToken response = api.generateToken()
                .ttl(ttl)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve upload token
     *
     * Retrieve details about a specific upload token by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String uploadToken = null;
        UploadToken response = api.getDetails(uploadToken)
                .execute();
        // TODO: test validations
    }

    /**
     * List all active upload tokens
     *
     * Retrieve a list of all currently active delegated tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listActiveDelegatedTokensTest() throws ApiException {
        String sortBy = null;
        String sortOrder = null;
        Integer currentPage = null;
        Integer pageSize = null;
        TokenListResponse response = api.listActiveDelegatedTokens()
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
