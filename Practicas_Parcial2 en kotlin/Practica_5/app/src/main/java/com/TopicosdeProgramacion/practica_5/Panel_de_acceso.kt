package com.TopicosdeProgramacion.practica_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View


class Panel_de_acceso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel_de_acceso)
        val boton3 = findViewById<Button>(R.id.botonsalir)
        boton3.setOnClickListener {
            val intento3 = Intent(this, MainActivity::class.java)
            startActivity(intento3)

        }
    }
}