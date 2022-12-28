package com.example.philipplackner.flow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.philipplackner.ui.theme.PhilippLacknerTheme

class FlowActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PhilippLacknerTheme {
                val viewModel = viewModel<FlowViewModel>()
                val timerValue = viewModel.countDownFlow.collectAsState(initial = 10)

                val stateFlowSharedFlowViewModel = viewModel<StateFlowSharedFlowViewModel>()
                val stateFlowValue = stateFlowSharedFlowViewModel.stateFlow.collectAsState(initial = 0)

                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = timerValue.value.toString(),
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                    StateFlowObserverUI(stateFlowSharedFlowViewModel,stateFlowValue)
                }

            }
        }
    }

}

@Composable
fun StateFlowObserverUI(
    stateFlowSharedFlowViewModel: StateFlowSharedFlowViewModel,
    stateFlowValue: State<Int>
) {
    Button(
        onClick = { stateFlowSharedFlowViewModel.incrementCounterStateFlow() },
        modifier = Modifier.fillMaxWidth(),
    ) {
        Text(
            text = "Increment No ${stateFlowValue.value}",
            color = Color.Black,
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )
    }
}