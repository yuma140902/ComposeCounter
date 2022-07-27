package yuma140902.android.composecounter.screen.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainView(viewModel: MainViewModel) {
    val state by viewModel.stateFlow.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = state.counter.toString())
        Button(onClick = { viewModel.onEvent(OnClickCountUpEvent) }) {
            Text(text = "Count Up")
        }
        Button(onClick = { viewModel.onEvent(OnClickResetEvent) }) {
            Text(text = "Reset")
        }
    }
}