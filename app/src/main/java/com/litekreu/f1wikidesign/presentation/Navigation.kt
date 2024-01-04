package com.litekreu.f1wikidesign.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.litekreu.f1wikidesign.fakedata.LandingItemsData
import com.litekreu.f1wikidesign.ui.theme.regular

@Composable
fun F1NavBar(navController: NavController) {

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val route = currentBackStackEntry?.destination?.route

    NavigationBar {
        NavRoutes.routesList.forEach { navItem ->
            val isSelected = route == navItem.route
            NavigationBarItem(
                selected = isSelected,
                onClick = { navController.navigate(navItem.route) },
                icon = { Icon(imageVector = if (isSelected) navItem.selectedIcon
                        else navItem.unselectedIcon,
                    contentDescription = navItem.route) },
                label = { Text(
                    text = navItem.route,
                    fontFamily = regular
                ) }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogoTopBar() {
    TopAppBar(title = {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ))
}

object NavRoutes {
    val Discover = NavItem(
        route = "Discover",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    )
    val GrandsPrix = NavItem(
        route = "Grands Prix",
        selectedIcon = Icons.Filled.DateRange,
        unselectedIcon = Icons.Outlined.DateRange
    )
    val Drivers = NavItem(
        route = "Drivers",
        selectedIcon = Icons.Filled.Face,
        unselectedIcon = Icons.Outlined.Face
    )
    val Teams = NavItem(
        route = "Teams",
        selectedIcon = Icons.Filled.List,
        unselectedIcon = Icons.Outlined.List
    )
    val routesList = listOf(Discover, GrandsPrix, Drivers, Teams)
}

data class NavItem(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

