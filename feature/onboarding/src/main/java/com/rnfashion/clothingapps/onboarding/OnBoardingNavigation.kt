package com.rnfashion.clothingapps.onboarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rnfashion.clothingapps.core.navigation.NavigationRoute

fun NavGraphBuilder.OnBoardingNavigation(navHostController: NavHostController) {
    composable(NavigationRoute.OnBoarding.route) {
       // OnBoardingScreen(navHostController)
    }

}