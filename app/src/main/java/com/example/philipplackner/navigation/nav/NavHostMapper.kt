package com.example.philipplackner.navigation.nav

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.philipplackner.navigation.screen.FirstScreen
import com.example.philipplackner.navigation.screen.SecondScreen
import com.example.philipplackner.navigation.screen.ThirdScreen
import com.example.philipplackner.navigation.util.Screens

@Composable
fun StartNavigation(context: Context) {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = Screens.FirstScreen.route) {
            composable(Screens.FirstScreen.route){
                FirstScreen(navController)
            }

        composable(Screens.SecondScreen.route){
            val data = it.arguments?.getString("data")
            if (data != null) {
                SecondScreen(context,navController,data)
            }
        }

        composable(Screens.ThirdScreen.route){
            ThirdScreen(context,navController)
        }
    }


}