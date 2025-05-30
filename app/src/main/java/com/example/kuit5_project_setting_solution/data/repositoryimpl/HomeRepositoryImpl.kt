package com.example.kuit5_project_setting_solution.data.repositoryimpl

import com.example.kuit5_project_setting_solution.data.mapper.toHomeModel
import com.example.kuit5_project_setting_solution.data.service.HomeService
import com.example.kuit5_project_setting_solution.domain.entity.HomeModel
import com.example.kuit5_project_setting_solution.domain.repository.HomeRepository
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val homeService: HomeService
) : HomeRepository {
    override suspend fun getHomeData(request: Int): Result<HomeModel> =
        runCatching {
            val response = homeService.getHomeData(request)
            response.data.toHomeModel()
        }
}