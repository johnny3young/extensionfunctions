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
    }
}
