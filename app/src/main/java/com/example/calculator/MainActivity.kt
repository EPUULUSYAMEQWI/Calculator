package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv1: EditText
    lateinit var tv2: EditText
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var tvanswer: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)
        tvanswer = findViewById(R.id.tvanswer)

        btn1.setOnClickListener {
            var num = tv1.text.toString().toDouble()
            var num2 = tv2.text.toString().toDouble()
            add(num, num2)
        }
        btn2.setOnClickListener {
            var num1 = tv1.text.toString().toDouble()
            var num3 = tv2.text.toString().toDouble()
            subtract(num1, num3)

        }
        btn3.setOnClickListener {
            var num5=tv1.text.toString().toDouble()
            var num6=tv2.text.toString().toDouble()
            multiply(num5,num6)
        }
        btn4.setOnClickListener {
            var num8=tv1.text.toString().toDouble()
            var num9=tv2.text.toString().toDouble()
            modulus(num8,num9)
        }

    }

    fun modulus(num8: Double, num9: Double) {
        var modulus = num8 + num9
        tvanswer.text = modulus.toString()

    }

    fun multiply(num5: Double, num6: Double) {
         var multiply = num5 + num6
         tvanswer.text = multiply.toString()


     }

    fun add(num: Double, num2: Double) {
            var add = num + num2
            tvanswer.text = add.toString()

        }


    fun subtract(num1: Double, num3: Double) {
        var subtract = num1 + num3
        tvanswer.text = subtract.toString()
    }
}