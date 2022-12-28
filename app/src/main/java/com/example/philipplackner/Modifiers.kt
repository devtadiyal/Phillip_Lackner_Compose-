package com.example.philipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Modifiers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxHeight(.5f)
                    .width(300.dp)
                    .border(5.dp, color = Color.Black)
                    .padding(20.dp)
            ) {
                Text(
                    text = "Dev",
                    modifier = Modifier
                        .border(5.dp, color = Color.Gray)
                        .padding(5.dp)
                        .border(5.dp, color = Color.Blue),
                )
                //giving space bw them
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "Tadiyal", modifier = Modifier.clickable { })
            }
        }
    }
}