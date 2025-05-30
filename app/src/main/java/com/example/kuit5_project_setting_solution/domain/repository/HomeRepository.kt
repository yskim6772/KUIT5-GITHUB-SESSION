package com.example.kuit5_project_setting_solution.domain.repository

import com.example.kuit5_project_setting_solution.domain.entity.HomeModel

interface HomeRepository  {
    suspend fun getHomeData(request: Int): Result<HomeModel>
}