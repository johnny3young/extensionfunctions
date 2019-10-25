package com.black3.app.extensionfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(13.isEven())

        var persona = Persona("Johnny", "Ospino", 38)
        println(persona.esTerceraEdad())

        var nulo = null
        println(nulo.toString())
        var nombre = "El Cruzado"
        println(nombre.toString())


        val numeros = intArrayOf(1,2,3,4,5,6,7,8,9)
        numeros.swap(0,2)
        for (numIterator in numeros)
            println(numIterator)

        println("El resultado con Infix fun es ${5 menos 4}")

        obtenerTam(2)

    }
}
