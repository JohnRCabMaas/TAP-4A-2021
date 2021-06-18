package com.TopicosdeProgramacion.practica_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import android.content.DialogInterface
import android.view.View
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            val intento3 = Intent(this, Panel_de_acceso::class.java)
            startActivity(intento3)
        }
        val boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            val intento3 = Intent(this, registro::class.java)
            startActivity(intento3)
        }
    }

    // Muestra una advertencia y pasa a la guiente panel
    fun formLoginOk() {
        Toast.makeText(applicationContext, "acceso concedido", Toast.LENGTH_SHORT).show()
    }

    // Muestra un cuadro de dialogo de error
    fun formLoginError() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle(" ")
        builder.setMessage("Error de Usuario o Contraseña")
        builder.setIcon(R.drawable.icon_error)

        builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss()
        })
        builder.show()
    }


    // Nos permite validar si lo ingresado por el usuario concuerda con lo declarado para acceder
    fun validarUsuario(view: View) {
        lateinit var usuario: EditText
        lateinit var password: EditText

        // Inicializacion de los componentes
        fun init() {
            usuario = findViewById(R.id.textNombre)
            password = findViewById(R.id.TextPassword)
            init()
            if (usuario.length() == 0 || password.length() == 0) {
                Toast.makeText(
                    applicationContext,
                    "algun campo debe esta vacio intente de nuevo",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                if (usuario.text.toString().equals("Johan") && password.text.toString()
                        .equals("7009")
                ) {
                    formLoginOk()
                } else {
                    formLoginError()
                }


            }

        }
    }
}