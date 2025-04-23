package com.rnfashion.clothingapps.core

data class User(
    val id:Int,
    val name:String,
    val email: String,
    val password: String,
    val phone: String,
    val address: String,
    val isLogin: Boolean,
    val image: String,
    val token: String,
    val isOnboardingComplete: Boolean
)
