package com.example.salrioaumento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var campo1 : TextView
    lateinit var campo2 : TextView
    lateinit var radio1 : RadioButton
    lateinit var radio2 : RadioButton
    lateinit var radio3 : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = findViewById(R.id.campo1)
        campo2 = findViewById(R.id.campo2)
        radio1 = findViewById(R.id.radio1)
        radio2 = findViewById(R.id.radio2)
        radio3 = findViewById(R.id.radio3)

        var result = 0.0

        radio1.setOnClickListener {
            if (radio1.isChecked) {

                result = campo1.text.toString().toDouble() * (1 + 0.35)
                campo2.text = "$result"

                radio2.isChecked = false
                radio3.isChecked = false

            }
        }

        radio2.setOnClickListener {
            if (radio2.isChecked) {

                result = campo1.text.toString().toDouble() * (1 + 0.40)
                campo2.text = "$result"

                radio3.isChecked = false
                radio1.isChecked = false
            }
        }

        radio3.setOnClickListener {
            if (radio3.isChecked) {

                result = campo1.text.toString().toDouble() * (1 + 0.45)
                campo2.text = "$result"

                radio1.isChecked = false
                radio2.isChecked = false
            }
        }

    }
}