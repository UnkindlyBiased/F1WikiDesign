package com.litekreu.f1wikidesign

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationPoint(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "discover") {
        composable("discover") {

        }
        composable("races") {

        }
        composable("drivers") {

        }
        composable("teams") {

        }
    }
}