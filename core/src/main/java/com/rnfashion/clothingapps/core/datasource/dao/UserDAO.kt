package com.rnfashion.clothingapps.core.datasource.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rnfashion.clothingapps.core.datasource.entity.UserEntity
import com.rnfashion.clothingapps.core.utils.Constant

@Dao
interface UserDAO{
    @Insert(onConflict = OnConflictStrategy.Companion.REPLACE)
    suspend fun insertUser(userEntity: UserEntity)

    @Query("SELECT * FROM ${Constant.Companion.USER_TABLE}")
    suspend fun getUser(): UserEntity?

    @Query("SELECT * FROM ${Constant.Companion.USER_TABLE} WHERE email = :email")
    suspend fun getUserByEmail(email: String): UserEntity

    @Query("SELECT isLogin FROM ${Constant.Companion.USER_TABLE} WHERE id = :userId")
    suspend fun getUserIsLogin(userId: Int): Boolean

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET isLogin = :isLogin WHERE id = :userId")
    suspend fun updateLoginStatus(userId: Int, isLogin: Boolean)

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET isOnboardingComplete = :isOnboardingComplete WHERE id = :userId")
    suspend fun updateOnboardingStatus(userId: Int, isOnboardingComplete: Boolean)

    @Query("SELECT isOnboardingComplete FROM ${Constant.Companion.USER_TABLE} WHERE id = :userId")
    suspend fun getOnboardingStatus(userId: Int): Boolean

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET token = :token WHERE id = :userId")
    suspend fun updateToken(userId: Int, token: String)

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET image = :image WHERE id = :userId")
    suspend fun updateImage(userId: Int, image: String)

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET name = :name WHERE id = :userId")
    suspend fun updateName(userId: Int, name: String)

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET phone = :phone WHERE id = :userId")
    suspend fun updatePhone(userId: Int, phone: String)

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET address = :address WHERE id = :userId")
    suspend fun updateAddress(userId: Int, address: String)

    @Query("UPDATE ${Constant.Companion.USER_TABLE} SET password = :password WHERE id = :userId")
    suspend fun updatePassword(userId: Int, password: String)

    @Query("DELETE FROM ${Constant.Companion.USER_TABLE} WHERE id = :userId")
    suspend fun deleteUser(userId: Int)


}