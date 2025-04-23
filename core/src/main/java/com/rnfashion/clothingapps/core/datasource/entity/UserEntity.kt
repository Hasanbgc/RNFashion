package com.rnfashion.clothingapps.core.datasource.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.rnfashion.clothingapps.core.utils.Constant

@Entity(tableName = Constant.Companion.USER_TABLE)
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("user_id")
    val Id: Int,
    @SerializedName("user_name")
    val name: String,
    @SerializedName("user_email")
    val email: String,
    @SerializedName("user_password")
    val password: String,
    @SerializedName("user_phone")
    val phone: String,
    @SerializedName("user_address")
    val address: String,
    @SerializedName("is_login")
    val isLogin: Boolean,
    @SerializedName("user_image")
    val image: String,
    @SerializedName("user_token")
    val token: String,
    @SerializedName("is_onboarding_complete")
    val isOnboardingComplete: Boolean
)