package com.aimusic.player.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aimusic.player.presentation.screens.home.HomeScreen
import com.aimusic.player.presentation.screens.library.LibraryScreen
import com.aimusic.player.presentation.screens.player.NowPlayingScreen
import com.aimusic.player.presentation.screens.settings.SettingsScreen

/**
 * Main navigation graph for the app
 * Battery-optimized: Uses Compose Navigation for efficient screen transitions
 */
@Composable
fun NavigationGraph(
    navController: NavHostController,
    startDestination: String = Screen.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        
        composable(route = Screen.Library.route) {
            LibraryScreen(navController = navController)
        }
        
        composable(route = Screen.NowPlaying.route) {
            NowPlayingScreen(navController = navController)
        }
        
        composable(route = Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }
}
