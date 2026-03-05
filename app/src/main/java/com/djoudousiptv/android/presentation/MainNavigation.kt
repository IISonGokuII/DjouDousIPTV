package com.djoudousiptv.android.presentation

import androidx.compose.runtime.Composable
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text

/**
 * Main Navigation Host for the application.
 * 
 * This composable will host the Navigation component
 * and manage routing between screens:
 * - Onboarding flow (Phase 4)
 * - Main TV UI with channels (Phase 5)
 * - Player screen (Phase 5)
 * - Settings screen (Phase 6)
 * 
 * Currently a placeholder - full implementation in Phase 4.
 */
@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun MainNavigation() {
    // TODO: Implement Navigation in Phase 4
    // Will use androidx.navigation.compose.NavHost
    
    Text(
        text = "DjouDousIPTV - Phase 1 Setup Complete\n\nRepository: github.com/IISonGokuII/DjouDousIPTV",
    )
}
