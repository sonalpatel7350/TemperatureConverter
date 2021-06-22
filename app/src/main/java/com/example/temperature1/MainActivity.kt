package com.example.temperature1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ettemp : EditText = findViewById(R.id.ettemp)
        val btnconvert : Button = findViewById(R.id.btnconvert)
        val tvshow : TextView = findViewById(R.id.tvshow)

        btnconvert.setOnClickListener{
            val c = ettemp.text.toString().toInt()
            val f = (c * 9/5) + 32
            tvshow.text = f.toString()

        }
    }
}