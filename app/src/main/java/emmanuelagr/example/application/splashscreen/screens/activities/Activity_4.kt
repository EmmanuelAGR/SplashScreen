package emmanuelagr.example.application.splashscreen.screens.activities

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import emmanuelagr.example.application.splashscreen.components.AppBar
import emmanuelagr.example.application.splashscreen.components.CardTemplate

@Composable
fun Activity_4(
    navController: NavController
) {
    var decades by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0L) }
    val visibility = remember { mutableStateOf(false) }

    @Composable
    fun CardBody() {
        OutlinedTextField(
            placeholder = { Text(text = "0") },
            label = { Text(text = "Décadas:") },
            value = decades,
            onValueChange = {
                if (it.contains(regex = Regex("^[0-9]+([0-9]+)?$")) && it.length <= 10
                    || it == ""
                ) {
                    decades = it
                    visibility.value = false
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                textColor = MaterialTheme.colors.secondary,
                placeholderColor = MaterialTheme.colors.secondary
            )
        )
    }

    Scaffold(
        topBar = { AppBar(title = "Actividad No. 4", navController = navController) }
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            CardTemplate(
                title = "Décadas a Días",
                cardWidth = 300.dp,
                cardHeight = 300.dp,
                body = { CardBody() },
                visibility = visibility,
                onClick = { result = 3650 * if (decades != "") decades.toLong() else 0 },
                result = "Días = $result"
            )
        }
    }
}

