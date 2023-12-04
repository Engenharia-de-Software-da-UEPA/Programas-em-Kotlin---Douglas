package com.example.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var checkBox3: CheckBox
    lateinit var checkBox4: CheckBox
    lateinit var checkBox5: CheckBox
    lateinit var campo1: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        checkBox4 = findViewById(R.id.checkBox4)
        checkBox5 = findViewById(R.id.checkBox5)

        campo1 = findViewById(R.id.campo1)

        var result = 0.0

        checkBox1.setOnClickListener {

            var box1 = 36.30

            if (checkBox1.isChecked) {

                result = result + box1
                campo1.text = "$result"

            }else{
                result = result - box1
                campo1.text = "$result"
            }
        }

        checkBox2.setOnClickListener {

            var box2 = 8.75

            if (checkBox2.isChecked) {

                result = result + box2
                campo1.text = "$result"

            }else{
                result = result - box2
                campo1.text = "$result"
            }
        }

        checkBox3.setOnClickListener {

            var box3 = 76.78

            if (checkBox3.isChecked) {

                result = result + box3
                campo1.text = "$result"

            }else{
                result = result - box3
                campo1.text = "$result"
            }
        }

        checkBox4.setOnClickListener {

            var box4 = 9.38

            if (checkBox4.isChecked) {

                result = result + box4
                campo1.text = "$result"

            }else{
                result = result - box4
                campo1.text = "$result"
            }
        }

        checkBox5.setOnClickListener {

            var box5 = 12.00

            if (checkBox5.isChecked) {

                result = result + box5
                campo1.text = "$result"

            }else{
                result = result - box5
                campo1.text = "$result"
            }
        }
    }
}