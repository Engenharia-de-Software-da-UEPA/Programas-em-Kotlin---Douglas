package com.example.calcularimposto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var botao: Button
    lateinit var campo1: TextView
    lateinit var campo2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.botao)
        campo1 = findViewById(R.id.campo1)
        campo2 = findViewById(R.id.campo2)

        botao.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = campo1.text.toString().toDouble()

        var result = a * (1 + 0.92)

        campo2.text = "$result"
    }
}