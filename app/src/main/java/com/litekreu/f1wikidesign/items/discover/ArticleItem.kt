package com.litekreu.f1wikidesign.items.discover

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.litekreu.f1wikidesign.fakedata.NewsData

@Composable
fun ArticleItem(item: NewsData.ArticleTemplate) {
    Column(
        modifier = Modifier.width(200.dp).clickable {  }
    ) {
        AsyncImage(
            model = item.image,
            contentDescription = null
        )
        Box(modifier = Modifier.padding(8.dp)) {
            Column {
                Text(text = "${item.type}")
                Text(text = item.title)
            }
        }
    }
}

