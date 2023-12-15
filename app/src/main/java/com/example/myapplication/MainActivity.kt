package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter: TextView = findViewById(R.id.textViewCounter)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }
    }
}
