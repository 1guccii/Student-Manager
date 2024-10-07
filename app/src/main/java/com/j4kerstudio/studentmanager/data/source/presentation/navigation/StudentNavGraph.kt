package com.j4kerstudio.studentmanager.data.source.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.studentmanager.data.source.presentation.screen.HomeScreen

enum class StudentNavGraph {
    HOME,
    SEARCH,
    INFORMATION,
    Write
}


@Composable
fun StudentNavHost(
    navController: NavHostController
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = StudentNavGraph.HOME.name) {
        composable(StudentNavGraph.HOME.name) {
            HomeScreen(navController = navController)
        }

    }


}