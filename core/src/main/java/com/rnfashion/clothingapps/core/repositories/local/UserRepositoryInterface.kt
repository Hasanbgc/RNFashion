package com.rnfashion.clothingapps.core.repositories.local

import com.rnfashion.clothingapps.core.datasource.entity.UserEntity
import com.rnfashion.clothingapps.core.utils.DataState
import kotlinx.coroutines.flow.Flow

interface UserRepositoryInterface {
    suspend fun getUser(): Flow<DataState<UserEntity?>>
    suspend fun insertUser(userEntity: UserEntity):Flow<Boolean>
    suspend fun getUserByEmail(email: String): Flow<UserEntity?>
    suspend fun getUserIsLogin(userId: Int): Flow<Boolean>
    suspend fun updateLoginStatus(userId: Int, isLogin: Boolean): Flow<Boolean>
    suspend fun updateOnboardingStatus(userId: Int, isOnboardingComplete: Boolean): Flow<Boolean>
    suspend fun getOnboardingStatus(userId: Int): Flow<Boolean>
    suspend fun updateToken(userId: Int, token: String): Flow<Boolean>

}