package com.rnfashion.clothingapps.viewmodels

import com.rnfashion.clothingapps.core.repositories.local.UserRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val userRepository: UserRepository,
){

}