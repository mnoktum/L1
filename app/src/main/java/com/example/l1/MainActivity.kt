package com.example.l1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun execute(view: View) {
        val text = findViewById<TextView>(R.id.textView)
        val input = findViewById<EditText>(R.id.textInput)

        text.text = input.text.toString()
    }
}