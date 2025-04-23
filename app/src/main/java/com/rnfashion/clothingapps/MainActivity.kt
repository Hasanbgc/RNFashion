package com.rnfashion.clothingapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rnfashion.clothingapps.screens.MainScreen
import com.rnfashion.clothingapps.ui.theme.RNFashionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RNFashionTheme {
                MainScreen()
            }
        }
    }
}

