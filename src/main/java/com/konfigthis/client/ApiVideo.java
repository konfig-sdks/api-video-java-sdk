package com.konfigthis.client;

import com.konfigthis.client.api.AdvancedAuthenticationApi;
import com.konfigthis.client.api.AnalyticsApi;
import com.konfigthis.client.api.CaptionsApi;
import com.konfigthis.client.api.ChaptersApi;
import com.konfigthis.client.api.LiveStreamsApi;
import com.konfigthis.client.api.PlayerThemesApi;
import com.konfigthis.client.api.UploadTokensApi;
import com.konfigthis.client.api.VideosApi;
import com.konfigthis.client.api.WatermarksApi;
import com.konfigthis.client.api.WebhooksApi;

public class ApiVideo {
    private ApiClient apiClient;
    public final AdvancedAuthenticationApi advancedAuthentication;
    public final AnalyticsApi analytics;
    public final CaptionsApi captions;
    public final ChaptersApi chapters;
    public final LiveStreamsApi liveStreams;
    public final PlayerThemesApi playerThemes;
    public final UploadTokensApi uploadTokens;
    public final VideosApi videos;
    public final WatermarksApi watermarks;
    public final WebhooksApi webhooks;

    public ApiVideo() {
        this(null);
    }

    public ApiVideo(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.advancedAuthentication = new AdvancedAuthenticationApi(this.apiClient);
        this.analytics = new AnalyticsApi(this.apiClient);
        this.captions = new CaptionsApi(this.apiClient);
        this.chapters = new ChaptersApi(this.apiClient);
        this.liveStreams = new LiveStreamsApi(this.apiClient);
        this.playerThemes = new PlayerThemesApi(this.apiClient);
        this.uploadTokens = new UploadTokensApi(this.apiClient);
        this.videos = new VideosApi(this.apiClient);
        this.watermarks = new WatermarksApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
