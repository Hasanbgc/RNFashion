package com.rnfashion.clothingapps.login

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rnfashion.clothingapps.core.navigation.NavigationRoute

fun NavGraphBuilder.LoginNavigation(navHostController: NavHostController) {
    composable(NavigationRoute.Login.route) {
        // LoginScreen(navHostController)
    }

}