package com.litekreu.f1wikidesign.items.discover

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.litekreu.f1wikidesign.fakedata.LandingItemsData

@Composable
fun DiscoverLandingItem(
    data: LandingItemsData.LandingTemplate
) {
    Row {
        Card(modifier = Modifier
            .width(356.dp)
            .height(160.dp)
            .clickable {

            }) {
            Box(modifier = Modifier.fillMaxSize()) {
                AsyncImage(
                    model = data.imageLink,
                    contentScale = ContentScale.Crop,
                    contentDescription = null
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(data.bgColor.copy(alpha = 0.5f))
                        .fillMaxSize()
                ) {
                    Text(
                        text = data.title,
                        fontFamily = data.font,
                        fontSize = 22.sp,
                        color = Color.White,
                        textAlign = TextAlign.End,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}