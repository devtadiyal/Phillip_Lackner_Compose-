package com.example.philipplackner.bottmnavigationwithbadge.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.philipplackner.bottmnavigationwithbadge.utils.Views
import com.example.philipplackner.bottmnavigationwithbadge.view.ChatScreen
import com.example.philipplackner.bottmnavigationwithbadge.view.HomeScreen
import com.example.philipplackner.bottmnavigationwithbadge.view.ProfileScreen

@Composable
fun BottomNavigationViewLoad(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Views.HomeScreen.route) {
        composable(Views.HomeScreen.route) {
            HomeScreen()
        }
        composable(Views.ChatScreen.route) {
            ChatScreen()
        }
        composable(Views.ProfileScreen.route) {
            ProfileScreen()
        }
    }

}