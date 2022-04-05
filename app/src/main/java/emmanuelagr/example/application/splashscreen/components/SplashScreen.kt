package emmanuelagr.example.application.splashscreen.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import emmanuelagr.example.application.splashscreen.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var stateAnimation by remember { mutableStateOf(false) }
    val alphaAnimation =
        animateFloatAsState(
            targetValue = if (stateAnimation) 1f else 0f,
            animationSpec = tween(
                durationMillis = 3000
            )
        )

    LaunchedEffect(key1 = true) {
        stateAnimation = true
        delay(2000)
        navController.navigate("/home") {
            popUpTo("/") { inclusive = true }
        }
    }

    Splash(alphaAnimation.value)
}

@Composable
fun Splash(alpha: Float) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(MaterialTheme.colors.onBackground)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.icono_project),
            contentDescription = "Icono del proyecto",
            modifier = Modifier
                .size(400.dp)
                .alpha(alpha)
        )
    }
}