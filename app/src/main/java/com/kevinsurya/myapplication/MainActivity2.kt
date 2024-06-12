package com.kevinsurya.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener{
            val explicitIntent = Intent(this, MainActivity::class.java)

            startActivity(explicitIntent)
        }


        val editA = findViewById<EditText>(R.id.editA)
        val editB = findViewById<EditText>(R.id.editB)
        val editC = findViewById<EditText>(R.id.editC)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnHitung.setOnClickListener {
            val sisiA = editA.text.toString().toDoubleOrNull() ?: 0.0
            val sisiB = editB.text.toString().toDoubleOrNull() ?: 0.0
            val sisiC = editC.text.toString().toDoubleOrNull() ?: 0.0

            val keliling = sisiA + sisiB + sisiC
            tvHasil.text = "Hasil : $keliling"
        }

    }
}