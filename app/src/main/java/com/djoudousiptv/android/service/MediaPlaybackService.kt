package com.djoudousiptv.android.service

import androidx.media3.session.MediaSession
import androidx.media3.session.MediaSessionService
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

/**
 * Media Playback Service for background playback.
 * 
 * This service extends MediaSessionService from Media3 to provide:
 * - Background playback capability
 * - Media session for lock screen controls
 * - Integration with Android media framework
 * 
 * Architecture Note:
 * The service is annotated with @AndroidEntryPoint for Hilt DI.
 * MediaSession handles all the media controls automatically.
 */
@AndroidEntryPoint
class MediaPlaybackService : MediaSessionService() {

    private var mediaSession: MediaSession? = null

    override fun onCreate() {
        super.onCreate()
        Timber.d("MediaPlaybackService onCreate")
        // MediaSession will be initialized in Phase 5 with Player setup
    }

    override fun onGetSession(controllerInfo: MediaSession.ControllerInfo): MediaSession? {
        return mediaSession
    }

    override fun onDestroy() {
        mediaSession?.run {
            player.release()
            release()
        }
        mediaSession = null
        super.onDestroy()
        Timber.d("MediaPlaybackService onDestroy")
    }
}
