package com.black3.app.extensionfunctions

fun obtenerTam(obj: Any){
    if (obj is String){
        println(obj.length)
    }else{
        println("El \"$obj\" no es una cadena de texto")
    }

}