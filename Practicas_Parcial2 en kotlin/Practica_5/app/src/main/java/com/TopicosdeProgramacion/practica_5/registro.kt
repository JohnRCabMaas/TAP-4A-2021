package com.TopicosdeProgramacion.practica_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val boton3=findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener {
            val intento3 = Intent(this, Panel_de_acceso::class.java)
            startActivity(intento3)
    }
}
}