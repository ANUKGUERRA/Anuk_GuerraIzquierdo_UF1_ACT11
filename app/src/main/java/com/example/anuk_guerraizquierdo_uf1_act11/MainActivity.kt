package com.example.anuk_guerraizquierdo_uf1_act11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enviarBTN = findViewById<Button>(R.id.btnEnviar)

        enviarBTN.setOnClickListener{
            Toast.makeText(this, "Registre fet a la activity de linear layout", Toast.LENGTH_LONG).show();
        }

        val relativeLayoutBTN = findViewById<Button>(R.id.btn_RelativeLayout)

        relativeLayoutBTN.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val constraintLayoutBTN = findViewById<Button>(R.id.btn_ConstraintLayout)

        constraintLayoutBTN.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}