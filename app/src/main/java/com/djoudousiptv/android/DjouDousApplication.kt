package com.djoudousiptv.android

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Application class for DjouDousIPTV.
 * 
 * This class initializes:
 * - Dagger Hilt for Dependency Injection
 * - Timber for logging (in debug builds)
 * 
 * Architecture Note:
 * The Application class is the entry point of the app.
 * Hilt generates the Dagger components at compile time,
 * making DI type-safe and compile-time verified.
 */
@HiltAndroidApp
class DjouDousApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        
        // Initialize Timber for structured logging
        // In release builds, this would be configured to use Firebase Crashlytics
        // or other crash reporting tools
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        
        Timber.d("DjouDousApplication initialized")
    }
}
