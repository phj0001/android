package com.example.basic3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var first:Int = 0
    var second:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            val firstStr = input1.text.toString()
            val secondStr = input2.text.toString()

            first = firstStr.toInt()
            second = secondStr.toInt()

            val result = first + second
            output.text = "결과 : $result"
        }
    }
}