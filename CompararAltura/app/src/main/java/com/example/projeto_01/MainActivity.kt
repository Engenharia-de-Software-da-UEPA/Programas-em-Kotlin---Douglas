package com.example.projeto_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var botao : Button
    lateinit var campo1 : TextView
    lateinit var campo2 : TextView
    lateinit var campo3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botao = findViewById(R.id.botao)
        campo1 = findViewById(R.id.campo1)
        campo2 = findViewById(R.id.campo2)
        campo3 = findViewById(R.id.campo3)
32
        botao.setOnClickListener(this)
    }

    override fun onClick (v: View?){
        var a = campo1.text.toString().toDouble()
        var b = campo2.text.toString().toDouble()

        var result = 0.0

        result = if (a > b) a else b

        campo3.text = "$result"
    }
}