package ir.malihemoradi.composesamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.malihemoradi.composesamples.ui.theme.ComposeSamplesTheme
import kotlinx.coroutines.launch

class TestViewsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {
    var scaffoldState = rememberScaffoldState()
    var textValueSate by remember {
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        ) {
            OutlinedTextField(
                value = textValueSate,
                label = {
                    Text(text = "Enter the name")
                },
                onValueChange = {
                    textValueSate = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                scope.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Hello $textValueSate")
                }

            }) {
                Text(text = "Plz greet me")
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeSamplesTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Greeting2()
        }
    }
}