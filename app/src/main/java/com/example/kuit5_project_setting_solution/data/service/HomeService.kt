package com.example.kuit5_project_setting_solution.data.service

import com.example.kuit5_project_setting_solution.data.dto.response.BaseResponse
import com.example.kuit5_project_setting_solution.data.dto.response.ResponseHomeDto
import retrofit2.http.Body
import retrofit2.http.GET

interface HomeService {
    @GET("home")
    suspend fun getHomeData(
        @Body request: Int
    ): BaseResponse<ResponseHomeDto>
}