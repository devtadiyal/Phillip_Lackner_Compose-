package com.example.philipplackner.navigation.screen

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.philipplackner.navigation.AnotherActivity
import com.example.philipplackner.navigation.util.Screens

@Composable
fun SecondScreen(context: Context,navHostController: NavHostController,data:String) {
    Text(text = "Second Screen")
    Spacer(modifier = Modifier.height(20.dp))
    Button(
        onClick = {
            //to open activity from composable funtion using intent
            /*val intent = Intent(context, AnotherActivity::class.java)
            context.startActivity(intent)*/

            //to open composable/fragment from composable
                  navHostController.navigate(Screens.ThirdScreen.route){
                      //second screen won't seen when press back button
                      //from third screen. it goes to third to direct first screen
                      popUpTo(Screens.FirstScreen.route){
                        //inclusive = true remove all backstack
                          inclusive = true
                          //inclusive = false remove all backstack upTo A screen
                         // inclusive = false
                      }
                  }
        },
    ) {
        Text(text = "Open Third Screen $data")
    }
}