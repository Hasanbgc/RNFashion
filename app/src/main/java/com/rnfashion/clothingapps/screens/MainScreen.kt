package com.rnfashion.clothingapps.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.rnfashion.clothingapps.core.navigation.NavigationRoute
import com.rnfashion.clothingapps.navgraph.MainNaviHost
import com.rnfashion.clothingapps.viewmodels.MainViewModel

@Composable
fun MainScreen() {
    val mainViewModel = hiltViewModel<MainViewModel>()
    val navController = rememberNavController()
    val uiState = mainViewModel.uiState.collectAsStateWithLifecycle()

    val route = if (uiState.value.user?.isOnboardingComplete == true) {
        NavigationRoute.Login.route
    } else {
        NavigationRoute.OnBoarding.route
    }

    LaunchedEffect(Unit){
        mainViewModel.getUser()
    }



    Scaffold(){padding ->
        Box(Modifier.padding(padding)) {
            MainNaviHost(navController,route)
        }
    }
}