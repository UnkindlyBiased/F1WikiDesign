package com.litekreu.f1wikidesign.fakedata

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import com.litekreu.f1wikidesign.ui.theme.black
import com.litekreu.f1wikidesign.ui.theme.regular

object LandingItemsData {
    data class LandingTemplate(
        val title: String,
        val bgColor: Color,
        val imageLink: String,
        val font: FontFamily
    )

    val Value = listOf(
        LandingTemplate(
            title = "CHECK OUT THE SUMMARY OF THE UNBELIEVABLE 2021 SEASON!",
            bgColor = Color(0xfff02000),
            imageLink = "https://www.topgear.com/sites/default/files/2021/12/1%20Max%20Verstappen%20F1%20champion.jpg",
            font = black
        ),
        LandingTemplate(
            title = "Aston Martin become latest team to reveal 2024 car launch date",
            bgColor = Color(0xFF004225),
            imageLink = "https://s1.eestatic.com/2023/02/23/deportes/motor/743686461_231174233_1706x960.jpg",
            font = regular
        ),
        LandingTemplate(
            title = "‘I’ve cut back on a lot of things’ – Ricciardo reveals how he’s changed his approach after F1 return",
            bgColor = Color(0xFF234D88),
            imageLink = "https://media.formula1.com/image/upload/f_auto/q_auto/v1704205975/fom-website/2023/Miscellaneous/ricciardo-portrait-2023-1.png",
            font = regular
        )
    )
}

object NewsData {
    data class ArticleTemplate(
        val title: String,
        val type: ArticleType,
        val isFeature: Boolean = false
    )

    enum class ArticleType {
        NEWS,
        FEATURE,
        VIDEO
    }

    val Value = listOf(
        ArticleTemplate(
            title = "F2 front-runner Bearman has ‘no doubt’ he’d be ready for F1 chance in 2025",
            type = ArticleType.NEWS
        )
    )
}
