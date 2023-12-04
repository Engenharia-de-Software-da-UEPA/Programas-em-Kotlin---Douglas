package com.example.caixaalta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity()  {

    lateinit var checkBox : CheckBox
    lateinit var campo1 : TextView
    lateinit var campo2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox = findViewById(R.id.checkBox)
        campo1 = findViewById(R.id.campo1)
        campo2 = findViewById(R.id.campo2)

        checkBox.setOnClickListener {

            if (checkBox.isChecked) {

                val textoCampo1 = campo1.text.toString()
                campo2.setText(textoCampo1.uppercase())

            } else {
                campo2.setText("")
            }
        }
    }
}