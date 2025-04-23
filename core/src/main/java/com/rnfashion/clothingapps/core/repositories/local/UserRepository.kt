package com.rnfashion.clothingapps.core.repositories.local

import com.rnfashion.clothingapps.core.datasource.dao.UserDAO
import com.rnfashion.clothingapps.core.datasource.entity.UserEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDAO: UserDAO
): UserRepositoryInterface {

    override suspend fun insertUser(userEntity: UserEntity) : Flow<Boolean> {
        return flow {
            try {
                userDAO.insertUser(userEntity)
                emit(true)
            }catch (e: Exception){
                emit(false)
            }
        }
    }

    override suspend fun getUserByEmail(email: String): Flow<UserEntity?> {
        return flow {
            try {
                val user = userDAO.getUserByEmail(email)
                emit(user)
            }catch (e: Exception) {
                emit(null)
            }
        }
    }

    override suspend fun getUserIsLogin(userId: Int): Flow<Boolean> {
        return flow {
            try {
                val isLogin = userDAO.getUserIsLogin(userId)
                emit(isLogin)
            }catch (e: Exception) {
                emit(false)
            }
        }
    }

    override suspend fun updateLoginStatus(
        userId: Int,
        isLogin: Boolean
    ): Flow<Boolean> {
        return flow {
            try {
                userDAO.updateLoginStatus(userId, isLogin)
                emit(true)
            } catch (e: Exception) {
                emit(false)
            }
        }
    }

    override suspend fun updateOnboardingStatus(
        userId: Int,
        isOnboardingComplete: Boolean
    ): Flow<Boolean> {
        return flow {
            try {
                userDAO.updateOnboardingStatus(userId, isOnboardingComplete)
                emit(true)
            } catch (e: Exception) {
                emit(false)
            }
        }
    }

    override suspend fun getOnboardingStatus(userId: Int): Flow<Boolean> {
        return flow {
            try {
                val isOnboardingComplete = userDAO.getOnboardingStatus(userId)
                emit(isOnboardingComplete)
            } catch (e: Exception) {
                emit(false)
            }
        }
    }

    override suspend fun updateToken(
        userId: Int,
        token: String
    ): Flow<Boolean> {
        return flow {
            try {
                userDAO.updateToken(userId, token)
                emit(true)
            } catch (e: Exception) {
                emit(false)
            }
        }
    }
}