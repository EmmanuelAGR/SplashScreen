package emmanuelagr.example.application.splashscreen.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import emmanuelagr.example.application.splashscreen.components.SplashScreen
import emmanuelagr.example.application.splashscreen.screens.HomeScreen
import emmanuelagr.example.application.splashscreen.screens.activities.*

@Composable
fun Routes() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "/", builder = {
        composable(route = "/", content = { SplashScreen(navController) })
        composable(route = "/home", content = { HomeScreen(navController) })
        composable(route = "/activity_1", content = { Activity_1(navController) })
        composable(route = "/activity_2", content = { Activity_2(navController) })
        composable(route = "/activity_3", content = { Activity_3(navController) })
        composable(route = "/activity_4", content = { Activity_4(navController) })
        composable(route = "/activity_5", content = { Activity_5(navController) })
        composable(route = "/activity_6", content = { Activity_6(navController) })
        composable(route = "/activity_7", content = { Activity_7(navController) })
        composable(route = "/activity_8", content = { Activity_8(navController) })
    })
}