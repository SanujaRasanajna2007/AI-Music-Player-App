package com.aimusic.player

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Application class for AI Music Player
 * Initializes Hilt for dependency injection
 */
@HiltAndroidApp
class MusicPlayerApp : Application() {
    
    override fun onCreate() {
        super.onCreate()
        // Future: Initialize app-level components
        // - Timber for logging
        // - Crash reporting
        // - Performance monitoring
    }
}
