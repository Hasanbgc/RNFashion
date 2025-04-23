package com.rnfashion.clothingapps.core.di

import android.content.Context
import androidx.room.Room
import com.rnfashion.clothingapps.core.datasource.RoomDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun ProvideDataBase(@ApplicationContext context: Context) : RoomDB {
        return Room.databaseBuilder(context, RoomDB::class.java,"room_database")
            .fallbackToDestructiveMigration()
            .addMigrations()
            .build()
    }

    @Provides
    @Singleton
    fun ProvideUserDao(roomDB: RoomDB) = roomDB.getUserDAO()

}