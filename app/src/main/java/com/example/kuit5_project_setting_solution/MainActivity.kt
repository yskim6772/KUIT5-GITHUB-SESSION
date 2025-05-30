package com.example.kuit5_project_setting_solution

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.kuit5_project_setting_solution.presentation.navigation.BottomNavItem
import com.example.kuit5_project_setting_solution.presentation.navigation.KuitNavGraph
import com.example.kuit5_project_setting_solution.presentation.navigation.Route
import com.example.kuit5_project_setting_solution.ui.theme.KUIT5_Project_Setting_SolutionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KUIT5_Project_Setting_SolutionTheme {
                val navController = rememberNavController()
                var selectedRoute by remember { mutableStateOf(Route.Home.route) }

                val bottomNavItems = listOf(
                    BottomNavItem("홈", Route.Home.route, R.drawable.ic_home),
                    BottomNavItem("일기", Route.Diary.route, R.drawable.ic_diary),
                    BottomNavItem("마이페이지", Route.My.route, R.drawable.ic_my)
                )

                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            bottomNavItems.forEach { item ->
                                NavigationBarItem(
                                    selected = selectedRoute == item.route,
                                    onClick = {
                                        selectedRoute = item.route
                                        navController.navigate(item.route) {
                                            launchSingleTop = true
                                            restoreState = true
                                            popUpTo(navController.graph.startDestinationId) {
                                                saveState = true
                                            }
                                        }
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = item.icon),
                                            contentDescription = item.label
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = item.label
                                        )
                                    }
                                )
                            }
                        }
                    }
                ) { innerPadding ->
                    KuitNavGraph(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}