package com.example.kuit5_project_setting_solution.data.mapper

import com.example.kuit5_project_setting_solution.data.dto.response.ResponseHomeDto
import com.example.kuit5_project_setting_solution.domain.entity.HomeModel

fun ResponseHomeDto.toHomeModel() = HomeModel(
    homeTitle = homeTitle,
    homeSubTitle = homeSubTitle
)