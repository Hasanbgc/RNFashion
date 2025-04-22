package com.rnfashion.clothingapps

import androidx.compose.material3.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rnfashion.clothingapps.core.navigation.NavigationRoute
import com.rnfashion.clothingapps.onboarding.OnBoardingNavigation
import com.rnfashion.clothingapps.login.LoginNavigation

@Composable
fun MainNaviHost(navController: NavHostController = rememberNavController()){
    NavHost(navController = navController, startDestination = NavigationRoute.OnBoarding.route){
        OnBoardingNavigation(navController)
        LoginNavigation(navController)
    }
}