package com.aimusic.player.presentation.navigation

/**
 * Sealed class representing all navigation destinations in the app
 * Using sealed class ensures type-safety and exhaustive when checks
 */
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Library : Screen("library")
    object NowPlaying : Screen("now_playing")
    object Settings : Screen("settings")
    
    // Future screens
    object Playlists : Screen("playlists")
    object Artist : Screen("artist/{artistId}") {
        fun createRoute(artistId: String) = "artist/$artistId"
    }
    object Album : Screen("album/{albumId}") {
        fun createRoute(albumId: String) = "album/$albumId"
    }
}

/**
 * Bottom navigation items that appear in the main navigation bar
 */
val bottomNavigationItems = listOf(
    Screen.Home,
    Screen.Library,
    Screen.NowPlaying,
    Screen.Settings
)
