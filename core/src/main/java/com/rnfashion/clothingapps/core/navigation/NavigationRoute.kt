package com.rnfashion.clothingapps.core.navigation

sealed class NavigationRoute(val route: String) {
    object Login : NavigationRoute("login")
    object Welcome : NavigationRoute("welcome")
    object OnBoarding : NavigationRoute("onBoarding")

}