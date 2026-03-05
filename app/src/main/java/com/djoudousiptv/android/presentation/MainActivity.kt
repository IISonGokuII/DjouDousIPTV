package com.djoudousiptv.android.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.djoudousiptv.android.presentation.theme.DjouDousTheme
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

/**
 * Main Activity - Entry point for the TV and Mobile UI.
 * 
 * This Activity:
 * - Initializes the Compose UI
 * - Applies the app theme
 * - Serves as the navigation host
 * 
 * Architecture:
 * - Annotated with @AndroidEntryPoint for Hilt DI
 * - Uses Jetpack Compose for UI rendering
 * - Supports both Android TV (Leanback) and Mobile layouts
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        
        Timber.d("MainActivity onCreate")
        
        setContent {
            DjouDousTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    // Navigation will be added in Phase 4
                    // For now, just show a placeholder
                    MainNavigation()
                }
            }
        }
    }
}
