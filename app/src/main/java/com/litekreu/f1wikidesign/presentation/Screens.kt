package com.litekreu.f1wikidesign.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.litekreu.f1wikidesign.fakedata.LandingItemsData
import com.litekreu.f1wikidesign.fakedata.NewsData
import com.litekreu.f1wikidesign.items.discover.ArticleItem
import com.litekreu.f1wikidesign.items.discover.DiscoverLandingItem

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {

        val spacerHeight = Modifier.height(8.dp)
        Spacer(modifier = spacerHeight)

        LazyRow {
            item {
                LandingItemsData.Value.forEach { item ->
                    DiscoverLandingItem(item)
                }
            }
        }

//        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
//            items(3) {
//                NewsData.Value.forEach { article ->
//                    ArticleItem(item = article)
//                }
//            }
//        }
        Column {
            repeat(5) {
                NewsData.Value.forEach { article ->
                    ArticleItem(item = article)
                }
            }
        }

        Spacer(modifier = spacerHeight)
    }
}

@Composable
fun LoadingScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        LinearProgressIndicator()
    }
}

/*
@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {

        val spacerHeight = Modifier.height(8.dp)
        Spacer(modifier = spacerHeight)

        LazyRow {
            item {
                LandingItemsData.Value.forEach { item ->
                    DiscoverLandingItem(item)
                }
            }
        }

        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(3) {
                NewsData.Value.forEach { article ->
                    ArticleItem(item = article)
                }
            }
        }

        Spacer(modifier = spacerHeight)
    }
}
*/