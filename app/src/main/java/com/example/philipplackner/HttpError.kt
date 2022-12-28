package com.example.philipplackner

sealed class HttpError(code:Int){
    object Unauthorized:HttpError(401)
    object Notfound:HttpError(404)
}

enum class HttpErrorEnum(code:Int){
    Unauthorized(401),
    Notfound(404)
}