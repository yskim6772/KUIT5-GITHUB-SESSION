package com.example.kuit5_project_setting_solution.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kuit5_project_setting_solution.presentation.diary.DiaryScreen
import com.example.kuit5_project_setting_solution.presentation.home.HomeScreen
import com.example.kuit5_project_setting_solution.presentation.my.MyScreen

@Composable
fun KuitNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home.route,
    ){
        composable(route = Route.Home.route) {
            HomeScreen(modifier = modifier)
        }
        composable(route = Route.Diary.route) {
            DiaryScreen(modifier = modifier)
        }
        composable(route = Route.My.route) {
            MyScreen(modifier = modifier)
        }
    }
}