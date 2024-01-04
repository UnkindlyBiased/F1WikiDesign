package com.litekreu.f1wikidesign

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.litekreu.f1wikidesign.presentation.F1NavBar
import com.litekreu.f1wikidesign.presentation.HomeScreen
import com.litekreu.f1wikidesign.presentation.LogoTopBar
import com.litekreu.f1wikidesign.presentation.NavRoutes

@Composable
fun NavigationPoint(navController: NavHostController = rememberNavController()) {
    Scaffold(
        topBar = {
            LogoTopBar()
        },
        bottomBar = {
            F1NavBar(navController)
        },
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = NavRoutes.Discover.route,
            modifier = Modifier.padding(padding)
        ) {
            composable(NavRoutes.Discover.route) {
                HomeScreen()
            }
            composable(NavRoutes.GrandsPrix.route) {
                Text(text = "Screen 2")
            }
            composable(NavRoutes.Drivers.route) {
                Text(text = "Screen 3")
            }
            composable(NavRoutes.Teams.route) {
                Text(text = "Screen 4")
            }
        }
    }
}