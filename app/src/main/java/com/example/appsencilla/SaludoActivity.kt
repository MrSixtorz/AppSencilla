package com.example.appsencilla

// Importamos TextView para manejar el mensaje de saludo
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)

        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")

        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo"

    }
}