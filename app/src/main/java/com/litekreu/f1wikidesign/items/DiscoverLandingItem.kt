package com.litekreu.f1wikidesign.items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.litekreu.f1wikidesign.ui.theme.black

@Composable
fun DiscoverLandingItem(
    imageLink: String,
    landingText: String,
    backgroundColor: Color
) {
    Card(modifier = Modifier
        .fillMaxWidth(0.9f)
        .height(160.dp).clickable {  }) {
        Box(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = imageLink,
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.background(backgroundColor.copy(alpha = 0.5f)).fillMaxSize()
            ) {
                Text(
                    text = landingText,
                    fontFamily = black,
                    fontSize = 22.sp,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
@Preview
private fun ItemPreview() {
    DiscoverLandingItem(
        imageLink = "https://www.topgear.com/sites/default/files/2021/12/1%20Max%20Verstappen%20F1%20champion.jpg",
        landingText = "CHECK OUT THE SUMMARY OF THE UNBELIEVABLE 2021 SEASON!",
        backgroundColor = Color(0xfff02000)
    )
}