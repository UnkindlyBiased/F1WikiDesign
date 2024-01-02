package com.litekreu.f1wikidesign

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.litekreu.f1wikidesign.items.F1NavBar
import com.litekreu.f1wikidesign.items.NavRoutes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavigationPoint(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            F1NavBar(navController)
        },
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = NavRoutes.Discover.route) {
            composable(NavRoutes.Discover.route) {
                Text(text = "Screen 1")
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