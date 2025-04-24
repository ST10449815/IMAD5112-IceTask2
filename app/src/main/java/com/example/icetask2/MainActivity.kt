package com.example.icetask2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

val num1 = findViewById<EditText>(R.id.etNum1)
            val num2 = findViewById<EditText>(R.id.etNum2)
            val add = findViewById<Button>(R.id.btnAdd)
            val subtract = findViewById<Button>(R.id.btnSubtract)
            val multiply = findViewById<Button>(R.id.btnMultiply)
            val divide = findViewById<Button>(R.id.btnDivide)
            val result = findViewById<TextView>(R.id.tvAnswer)

            add!!.setOnClickListener {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val sum = number1 + number2
                result.text = "$sum"
            }

            subtract!!.setOnClickListener {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val sum = number1 - number2
                result.text = "$sum"
            }

            multiply!!.setOnClickListener {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val sum = number1 * number2
                result.text = "$sum"
            }

            divide!!.setOnClickListener {
                val number1 = num1.text.toString().toInt()
                val number2 = num2.text.toString().toInt()
                val sum = number1 / number2
                result.text = "$sum"
            }

        }
    }
}