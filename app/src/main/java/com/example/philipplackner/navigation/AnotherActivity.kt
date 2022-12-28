package com.example.philipplackner.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.philipplackner.navigation.nav.StartNavigation
import com.example.philipplackner.ui.theme.PhilippLacknerTheme

//example of -> this activity open by composale funtion by Intent funtion

class AnotherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhilippLacknerTheme {


            }
        }
    }
}