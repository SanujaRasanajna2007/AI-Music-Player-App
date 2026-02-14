package com.aimusic.player.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.aimusic.player.presentation.components.BottomNavigationBar
import com.aimusic.player.presentation.navigation.NavigationGraph
import com.aimusic.player.presentation.navigation.Screen
import com.aimusic.player.presentation.theme.AIMusicPlayerTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main Activity - Entry point for the app
 * Uses Compose Navigation for screen management
 * Battery-optimized: Efficient navigation with state preservation
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            AIMusicPlayerTheme {
                MusicPlayerApp()
            }
        }
    }
}

@Composable
fun MusicPlayerApp() {
    val navController = rememberNavController()
    
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        containerColor = MaterialTheme.colorScheme.background
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            NavigationGraph(
                navController = navController,
                startDestination = Screen.Home.route
            )
        }
    }
}
