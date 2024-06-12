package com.kevinsurya.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToGo = findViewById<Button>(R.id.btnToGo)
        btnToGo.setOnClickListener{
            val explicitIntent = Intent(this, MainActivity2::class.java)

            startActivity(explicitIntent)
        }

        val editAlas = findViewById<EditText>(R.id.editAlas)
        val editTinggi = findViewById<EditText>(R.id.editTinggi)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)


        btnHitung.setOnClickListener {
            val alas = editAlas.text.toString().toDoubleOrNull() ?: 0.0
            val tinggi = editTinggi.text.toString().toDoubleOrNull() ?: 0.0

            val luas = 0.5 * alas * tinggi
            tvHasil.text = "Hasil : $luas"
        }


    }
}