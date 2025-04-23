package com.rnfashion.clothingapps.navgraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rnfashion.clothingapps.core.navigation.NavigationRoute
import com.rnfashion.clothingapps.onboarding.OnBoardingNavigation
import com.rnfashion.clothingapps.login.LoginNavigation
import com.rnfashion.clothingapps.viewmodels.MainViewModel



@Composable
fun MainNaviHost(navController: NavHostController = rememberNavController(), route:String = NavigationRoute.OnBoarding.route){

    NavHost(navController = navController, startDestination = route){
        OnBoardingNavigation(navController)
        LoginNavigation(navController)
    }
}