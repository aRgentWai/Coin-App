package com.matt.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController



@Composable
fun ComposeApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        bottomBar = {

        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Route.HOME,
            modifier = Modifier.padding(innerPadding)
        ) {

        }
    }
}

object Route {
    const val HOME = "home"
    const val DOCUMENT_STORM = "document_storm"
    const val STORM_HISTORY = "storm_history"
    const val CAMERA = "camera"
    const val GALLERY = "gallery"
    const val EDIT_PHOTO = "edit_photo"
    const val STORM_MAP = "storm_map"
    const val SETTINGS = "settings"

    // Legacy route for backward compatibility
    const val WEATHER = HOME
}