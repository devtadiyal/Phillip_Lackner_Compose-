package com.example.philipplackner.navigation.util

sealed class Screens(val route: String) {
    object FirstScreen : Screens("firstscreen")

    //using this method first screen pass data to second screen
    fun createRoute(data: String) = "$data/secondscreen"

    //we have added a route here to accept send data from any funtion
    object SecondScreen : Screens("{data}/secondscreen")

    object ThirdScreen : Screens("thirdscreen")


}
