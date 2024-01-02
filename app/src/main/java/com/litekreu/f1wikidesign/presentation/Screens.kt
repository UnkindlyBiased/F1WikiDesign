package com.litekreu.f1wikidesign.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.litekreu.f1wikidesign.items.DiscoverLandingItem

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        DiscoverLandingItem(
            imageLink = "https://www.topgear.com/sites/default/files/2021/12/1%20Max%20Verstappen%20F1%20champion.jpg",
            landingText = "CHECK OUT THE SUMMARY OF THE UNBELIEVABLE 2021 SEASON!",
            backgroundColor = Color(0xfff02000)
        )
    }
}