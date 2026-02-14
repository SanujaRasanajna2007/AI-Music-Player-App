package com.aimusic.player.presentation.screens.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/**
 * Settings screen - App configuration and preferences
 * Battery-optimized: LazyColumn for efficient list rendering
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Settings",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            // Appearance Section
            item {
                SettingsSectionHeader(title = "Appearance")
            }
            
            item {
                var darkMode by remember { mutableStateOf(false) }
                SettingsToggleItem(
                    title = "Dark Mode",
                    description = "Use dark theme",
                    icon = Icons.Default.DarkMode,
                    checked = darkMode,
                    onCheckedChange = { darkMode = it }
                )
            }
            
            item {
                SettingsClickableItem(
                    title = "Theme Color",
                    description = "Customize app colors",
                    icon = Icons.Default.Palette,
                    onClick = { /* Open theme picker */ }
                )
            }
            
            // Audio Section
            item {
                SettingsSectionHeader(title = "Audio")
            }
            
            item {
                SettingsClickableItem(
                    title = "Equalizer",
                    description = "Adjust audio settings",
                    icon = Icons.Default.Equalizer,
                    onClick = { /* Open equalizer */ }
                )
            }
            
            item {
                var audioOffload by remember { mutableStateOf(true) }
                SettingsToggleItem(
                    title = "Audio Offload",
                    description = "Better battery life",
                    icon = Icons.Default.BatteryChargingFull,
                    checked = audioOffload,
                    onCheckedChange = { audioOffload = it }
                )
            }
            
            // AI Features Section
            item {
                SettingsSectionHeader(title = "AI Features")
            }
            
            item {
                SettingsClickableItem(
                    title = "Lyrics Generation",
                    description = "Configure AI lyrics settings",
                    icon = Icons.Default.Subtitles,
                    onClick = { /* Open AI settings */ }
                )
            }
            
            // Library Section
            item {
                SettingsSectionHeader(title = "Library")
            }
            
            item {
                SettingsClickableItem(
                    title = "Scan Music",
                    description = "Refresh music library",
                    icon = Icons.Default.Refresh,
                    onClick = { /* Start media scan */ }
                )
            }
            
            item {
                SettingsClickableItem(
                    title = "Storage Folders",
                    description = "Choose music directories",
                    icon = Icons.Default.Folder,
                    onClick = { /* Open folder picker */ }
                )
            }
            
            // About Section
            item {
                SettingsSectionHeader(title = "About")
            }
            
            item {
                SettingsClickableItem(
                    title = "Version",
                    description = "1.0.0",
                    icon = Icons.Default.Info,
                    onClick = { /* Show version info */ }
                )
            }
        }
    }
}

@Composable
fun SettingsSectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)
    )
}

@Composable
fun SettingsClickableItem(
    title: String,
    description: String,
    icon: ImageVector,
    onClick: () -> Unit
) {
    ListItem(
        headlineContent = { Text(text = title) },
        supportingContent = { Text(text = description) },
        leadingContent = {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = MaterialTheme.colorScheme.primary
            )
        },
        trailingContent = {
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Navigate"
            )
        },
        modifier = Modifier.clickable(onClick = onClick)
    )
}

@Composable
fun SettingsToggleItem(
    title: String,
    description: String,
    icon: ImageVector,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    ListItem(
        headlineContent = { Text(text = title) },
        supportingContent = { Text(text = description) },
        leadingContent = {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = MaterialTheme.colorScheme.primary
            )
        },
        trailingContent = {
            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange
            )
        }
    )
}
