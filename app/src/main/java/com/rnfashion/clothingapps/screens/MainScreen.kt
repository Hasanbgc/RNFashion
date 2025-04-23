package com.rnfashion.clothingapps.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.rnfashion.clothingapps.navgraph.MainNaviHost

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(){padding ->
        Box(Modifier.padding(padding)) {
            MainNaviHost(navController)
        }
    }
}