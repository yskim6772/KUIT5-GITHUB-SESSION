package com.example.kuit5_project_setting_solution.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseHomeDto(
    val homeTitle: String,
    val homeSubTitle: String,
    val homeImage: String
)
