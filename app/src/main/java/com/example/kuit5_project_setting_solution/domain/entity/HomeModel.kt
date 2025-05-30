package com.example.kuit5_project_setting_solution.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class HomeModel(
    val homeTitle: String,
    val homeSubTitle: String
)
