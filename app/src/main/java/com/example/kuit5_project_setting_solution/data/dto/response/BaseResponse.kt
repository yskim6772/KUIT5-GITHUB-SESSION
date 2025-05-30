package com.example.kuit5_project_setting_solution.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    val code: Int,
    val data: T,
    val message: String
)
