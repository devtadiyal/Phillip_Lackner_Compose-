package com.example.philipplackner.navigation.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.philipplackner.navigation.util.Screens

@Composable
fun FirstScreen(navHostController: NavHostController) {
    Text(text = "First Screen")
    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = {
        navHostController.navigate(
            Screens.SecondScreen.createRoute("Hi my name is dev")
        )
    }) {
        Text(text = "Open Second Screen")
    }
}