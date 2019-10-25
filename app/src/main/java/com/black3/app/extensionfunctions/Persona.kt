package com.black3.app.extensionfunctions

class Persona (nombre: String, apellido: String, edad: Int){
    var nombre = ""
    var apellido = ""
    var edad = 0

    init {
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }

    companion object Raza {
        //Clasificación de persona
        val edades: IntArray = intArrayOf(0,2,30,60)
        var razas = arrayOf("Europeo", "Latino", "Arabe", "Africano", "Canadiense")
        var clasificacion = "Clasificación personas"

        init {
            println("Inicializando el companion")
        }
        fun enAmerica(): Array<String>{
            return arrayOf(razas[2], razas[5], razas[6])
        }

    }
}