package com.SMJV9

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prom = findViewById<Button>(R.id.prom)
        val rem = findViewById<Button>(R.id.rem)

        prom.setOnClickListener {
            val promedio = 99;
            Toast.makeText(this, "Promedio: "+ promedio, Toast.LENGTH_SHORT).show()


        }
        rem.setOnClickListener {

            val nombre = findViewById<TextView>(R.id.nom)
            val grupo = findViewById<TextView>(R.id.grupo)
            val promedio = 99;
            Toast.makeText(this, "Nombre: " + nombre.text + " " + "Grupo: " + grupo.text + " " + "Promedio " + promedio, Toast.LENGTH_SHORT).show()
        }
    }
}