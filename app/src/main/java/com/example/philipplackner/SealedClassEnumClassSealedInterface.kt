package com.example.philipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class SealedClassEnumClassSealedInterface : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //for sealed class
            var error : HttpError = HttpError.Unauthorized
            when(error){
                HttpError.Notfound -> Unit
                HttpError.Unauthorized -> Unit
            }

            //for enum class
            var errorEnum : HttpErrorEnum = HttpErrorEnum.Unauthorized
            when(errorEnum){
                HttpErrorEnum.Notfound -> Unit
                HttpErrorEnum.Unauthorized -> Unit
            }
        }
    }
}