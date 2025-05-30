package com.example.kuit5_project_setting_solution.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kuit5_project_setting_solution.domain.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {

    fun getHomeData(
        request: Int
    ) {
        viewModelScope.launch {
            homeRepository.getHomeData(request)
                .onSuccess {

                }
                .onFailure {

                }
        }
    }
}