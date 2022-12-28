package com.example.philipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

class ConstraintLayouts : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val constraintSet = ConstraintSet {
                val greenBox = createRefFor("green")
                val redBox = createRefFor("red")

                //constraint guideline
                var guideline = createGuidelineFromTop(.5f)

                constrain(greenBox) {
                   // top.linkTo(parent.top)
                    top.linkTo(guideline)
                    start.linkTo(parent.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(redBox) {
                    top.linkTo(parent.top)
                    start.linkTo(greenBox.end)
                    end.linkTo(parent.end)
                    //width = Dimension.fillToConstraints
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
                //constraint layout chaining
                createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.SpreadInside)
                //createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
               // createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Spread)
            }
            ConstraintLayout(constraintSet, modifier = Modifier.fillMaxSize()) {

                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
                    .layoutId("green"))

                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .layoutId("red"))
            }
        }


    }
}