package com.example.anuk_guerraizquierdo_uf1_act11

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val enviarBTN = findViewById<Button>(R.id.btnEnviar)

        enviarBTN.setOnClickListener{
            Toast.makeText(this, "Registre fet a la activity de Relative layout", Toast.LENGTH_LONG).show();
        }
    }
}