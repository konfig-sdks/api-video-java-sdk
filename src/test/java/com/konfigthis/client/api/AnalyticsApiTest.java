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
import com.konfigthis.client.model.AnalyticsPlaysResponse;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
@Disabled
public class AnalyticsApiTest {

    private static AnalyticsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AnalyticsApi(apiClient);
    }

    /**
     * Get play events for live stream
     *
     * Retrieve filtered analytics about the number of plays for your live streams in a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLiveStreamPlaysTest() throws ApiException {
        LocalDate from = null;
        String dimension = null;
        LocalDate to = null;
        String filter = null;
        Integer currentPage = null;
        Integer pageSize = null;
        AnalyticsPlaysResponse response = api.getLiveStreamPlays(from, dimension)
                .to(to)
                .filter(filter)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Get play events for video
     *
     * Retrieve filtered analytics about the number of plays for your videos in a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVideoPlaysTest() throws ApiException {
        LocalDate from = null;
        String dimension = null;
        LocalDate to = null;
        String filter = null;
        Integer currentPage = null;
        Integer pageSize = null;
        AnalyticsPlaysResponse response = api.getVideoPlays(from, dimension)
                .to(to)
                .filter(filter)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
