package com.litekreu.f1wikidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.litekreu.f1wikidesign.presentation.LoadingScreen
import com.litekreu.f1wikidesign.ui.theme.F1WikiDesignTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F1WikiDesignTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var isLoaded by remember { mutableStateOf(false) }
    LaunchedEffect(isLoaded) {
        delay(1500)
        isLoaded = true
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        if (!isLoaded) LoadingScreen()
        else NavigationPoint()
    }
}
