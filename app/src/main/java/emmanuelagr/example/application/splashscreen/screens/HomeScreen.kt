package emmanuelagr.example.application.splashscreen.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import emmanuelagr.example.application.splashscreen.components.ActivitiesList
import emmanuelagr.example.application.splashscreen.components.AppBar

@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { AppBar("Calculation Assistant") },
        content = {
            ActivitiesList(navController)
        }
    )
}