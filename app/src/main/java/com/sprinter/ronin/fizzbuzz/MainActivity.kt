package com.sprinter.ronin.fizzbuzz

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.view.View.OnClickListener

class MainActivity : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_submit = findViewById(R.id.btn_submit) as Button
        btn_submit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val text_input = findViewById(R.id.text_input) as EditText
        val text_result = findViewById(R.id.text_result) as TextView

        val fizzbuzz = FizzBuzz()

        try {
            val data_text_input = text_input.text.toString()
            val reg = "-?\\d+(.\\d+)?".toRegex()
            val answer: String

            if (data_text_input.matches(reg)) {
                val input_number = java.lang.Long.parseLong(data_text_input)
                answer = fizzbuzz.show(input_number)
            } else {
                answer = "กรุณากรอกตัวเลขด้วยเด้อ!"
            }
            text_result.text = answer
        } catch (errors: NumberFormatException) {
            text_result.text = "กรอกแต่พองามนะ!"
        }

    }
}