package com.example.philipplackner.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.philipplackner.navigation.nav.StartNavigation
import com.example.philipplackner.ui.theme.PhilippLacknerTheme

class NavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhilippLacknerTheme {
                //called NavHostMapper class method
                StartNavigation(this)
            }
        }
    }

}