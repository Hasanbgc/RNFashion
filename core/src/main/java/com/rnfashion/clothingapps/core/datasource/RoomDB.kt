package com.rnfashion.clothingapps.core.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rnfashion.clothingapps.core.datasource.dao.UserDAO
import com.rnfashion.clothingapps.core.datasource.entity.UserEntity


@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class RoomDB : RoomDatabase() {
    abstract fun getUserDAO(): UserDAO

}