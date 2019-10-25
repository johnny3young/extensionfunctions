package com.black3.app.extensionfunctions

fun Int.isEven(): Boolean = (this % 2 == 0)

fun Persona.esTerceraEdad(): Boolean = edad > 60

fun Any?.toString(): String {
    if (this == null) return "No hay nada, es nulo"
    return  toString()
}