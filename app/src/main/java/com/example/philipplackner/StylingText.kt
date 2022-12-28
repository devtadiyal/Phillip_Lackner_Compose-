package com.example.philipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class StylingText : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.ibmplexsans_thin, FontWeight.Thin),
          //  Font(R.font.ibmplexsans_thinitalic, FontWeight.Thin),
            Font(R.font.ibmplexsans_extralight, FontWeight.ExtraLight),
         //   Font(R.font.ibmplexsans_extralightitalic, FontWeight.ExtraLight),
            Font(R.font.ibmplexsans_light, FontWeight.Light),
         //   Font(R.font.ibmplexsans_lightitalic, FontWeight.Light),
            Font(R.font.ibmplexsans_regular, FontWeight.Normal),
         //   Font(R.font.ibmplexsans_medium, FontWeight.Medium),
            Font(R.font.ibmplexsans_mediumitalic, FontWeight.Medium),
        //    Font(R.font.ibmplexsans_semibold, FontWeight.SemiBold),
            Font(R.font.ibmplexsans_semibolditalic, FontWeight.SemiBold),
         //   Font(R.font.ibmplexsans_bold, FontWeight.Bold),
            Font(R.font.ibmplexsans_bolditalic, FontWeight.Bold)
        )
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("J")
                        }
                        append("e")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 22.sp
                            )
                        ) {
                            append("t")
                        }
                        append("pack ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("C")
                        }
                        append("ompose")
                    },
                    fontSize = 22.sp,
                    color = Color.White,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }

        }
    }
}