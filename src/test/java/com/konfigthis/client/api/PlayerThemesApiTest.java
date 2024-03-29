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
import java.io.File;
import com.konfigthis.client.model.PlayerTheme;
import com.konfigthis.client.model.PlayerThemeCreationPayload;
import com.konfigthis.client.model.PlayerThemeUpdatePayload;
import com.konfigthis.client.model.PlayerThemeUploadLogoPayload;
import com.konfigthis.client.model.PlayerThemesListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayerThemesApi
 */
@Disabled
public class PlayerThemesApiTest {

    private static PlayerThemesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PlayerThemesApi(apiClient);
    }

    /**
     * Delete a player
     *
     * Delete a player if you no longer need it. You can delete any player that you have the player ID for.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePlayerTest() throws ApiException {
        String playerId = null;
        api.deletePlayer(playerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a player
     *
     * Retreive a player theme by player id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getThemeByPlayerIdTest() throws ApiException {
        String playerId = null;
        PlayerTheme response = api.getThemeByPlayerId(playerId)
                .execute();
        // TODO: test validations
    }

    /**
     * List all player themes
     *
     * Retrieve a list of all the player themes you created, as well as details about each one.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void playersTest() throws ApiException {
        String sortBy = null;
        String sortOrder = null;
        Integer currentPage = null;
        Integer pageSize = null;
        PlayerThemesListResponse response = api.players()
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a player
     *
     * Create a player for your video, and customise it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void players_0Test() throws ApiException {
        String name = null;
        String text = null;
        String link = null;
        String linkHover = null;
        String linkActive = null;
        String trackPlayed = null;
        String trackUnplayed = null;
        String trackBackground = null;
        String backgroundTop = null;
        String backgroundBottom = null;
        String backgroundText = null;
        Boolean enableApi = null;
        Boolean enableControls = null;
        Boolean forceAutoplay = null;
        Boolean hideTitle = null;
        Boolean forceLoop = null;
        PlayerTheme response = api.players_0()
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
        // TODO: test validations
    }

    /**
     * Delete logo
     *
     * Delete the logo associated to a player.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLogoTest() throws ApiException {
        String playerId = null;
        api.removeLogo(playerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a player
     *
     * Use a player ID to update specific details for a player.  NOTE: It may take up to 10 min before the new player configuration is available from our CDN.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePlayerDetailsTest() throws ApiException {
        String playerId = null;
        String name = null;
        String text = null;
        String link = null;
        String linkHover = null;
        String linkActive = null;
        String trackPlayed = null;
        String trackUnplayed = null;
        String trackBackground = null;
        String backgroundTop = null;
        String backgroundBottom = null;
        String backgroundText = null;
        Boolean enableApi = null;
        Boolean enableControls = null;
        Boolean forceAutoplay = null;
        Boolean hideTitle = null;
        Boolean forceLoop = null;
        PlayerTheme response = api.updatePlayerDetails(playerId)
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
        // TODO: test validations
    }

    /**
     * Upload a logo
     *
     * Upload an image file as a logo for your player. The image should fit within these constraints: - The image mime type must be &#x60;image/jpeg&#x60; or &#x60;image/png&#x60;. api.video recommends using &#x60;png&#x60; images with transparent background. - The image size should be a maximum of 200px width x 100px. - The file size should be a maximum of 100 KiB. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadLogoTest() throws ApiException {
        String playerId = null;
        File _file = null;
        String link = null;
        PlayerTheme response = api.uploadLogo(playerId, _file)
                .link(link)
                .execute();
        // TODO: test validations
    }

}
