package com.black3.app.extensionfunctions

fun Int.isEven(): Boolean = (this % 2 == 0)

fun Persona.esTerceraEdad(): Boolean = edad > 60

fun Any?.toString(): String {
    if (this == null) return "No hay nada, es nulo"
    return toString()

}

fun IntArray.swap(indice1: Int, indice2: Int){
    val temp = this[indice1]
    this[indice1] = this[indice2]
    this[indice2] = temp
}

infix fun Int.menos(num: Int) = this - num