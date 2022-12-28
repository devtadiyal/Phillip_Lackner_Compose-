package com.example.philipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class TextFieldButtonSnackbar : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var textFieldState by remember {
                mutableStateOf("")
            }
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()
            Scaffold(
                modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 15.dp)
                ) {
                    TextField(value = textFieldState,
                        label = { Text(text = "Enter your name") },
                        onValueChange = {
                            textFieldState = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Button(onClick = {
                        scope.launch { scaffoldState.snackbarHostState.showSnackbar("Hi $textFieldState") }
                    }) {
                        Text(text = "Pls greet me")
                    }
                }
            }
        }
    }

}