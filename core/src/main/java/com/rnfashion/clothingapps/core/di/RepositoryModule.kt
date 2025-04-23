package com.rnfashion.clothingapps.core.di

import com.rnfashion.clothingapps.core.datasource.dao.UserDAO
import com.rnfashion.clothingapps.core.repositories.local.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun ProvideUserRepository(userDAO: UserDAO) = UserRepository(userDAO)
}