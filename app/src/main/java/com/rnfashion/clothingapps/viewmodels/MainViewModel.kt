package com.rnfashion.clothingapps.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rnfashion.clothingapps.core.User
import com.rnfashion.clothingapps.core.repositories.local.UserRepository
import com.rnfashion.clothingapps.core.utils.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UserRepository,
):ViewModel(){

    private val _uiState = MutableStateFlow(MainUiState())
    val uiState:StateFlow<MainUiState> get() = _uiState.asStateFlow()

    fun getUser(){
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            userRepository.getUser().collect { dataState ->
                when (dataState) {
                    is DataState.Loading -> {
                        _uiState.value = _uiState.value.copy(isLoading = true)
                    }
                    is DataState.Success -> {
                        val user = dataState.data?.mapToUser()
                        _uiState.value = _uiState.value.copy(user = user, isLoading = false)
                    }
                    is DataState.Error -> {
                        _uiState.value = _uiState.value.copy(isLoading = false, error = true)
                    }

                }
            }
        }

    }

    fun getUser(email:String){
        _uiState.value = _uiState.value.copy(isLoading = true)
        viewModelScope.launch {
            userRepository.getUserByEmail(email).collect{ user ->
                if (user != null) {
                    val user = user.mapToUser()
                    _uiState.value = _uiState.value.copy(user = user, isLoading = false)
                }else{
                    _uiState.value = _uiState.value.copy(isLoading = false,error = true)
                }
            }
        }
    }

}

data class MainUiState(
    val user: User? = null,
    val isLoading: Boolean = false,
    val error: Boolean = false
)