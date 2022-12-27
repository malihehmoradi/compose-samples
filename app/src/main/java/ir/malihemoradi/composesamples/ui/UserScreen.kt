package ir.malihemoradi.composesamples.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun UserScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
            .padding(10.dp)
    ) {
        Text(text = "User Screen", fontSize = 20.sp)
    }
}