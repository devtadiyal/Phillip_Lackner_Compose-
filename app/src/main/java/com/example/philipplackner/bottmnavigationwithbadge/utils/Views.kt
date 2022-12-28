package com.example.philipplackner.bottmnavigationwithbadge.utils

sealed class Views(val route: String){
    object HomeScreen : Views("home")
    object ChatScreen : Views("chat")
    object ProfileScreen : Views("profile")
}
