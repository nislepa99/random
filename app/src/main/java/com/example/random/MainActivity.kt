package com.example.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.new_activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity_main)

        butt.setOnClickListener {
            editText3.text =
                "${(editText1.text.toString().toInt()..editText2.text.toString().toInt()).random()}"
        }

// Это тостом, так прикольнее, мне так больше нравится)))
//        butt.setOnClickListener {
//            Toast.makeText(this, "${(editText1.text.toString().toInt()..editText2.text.toString().toInt()).random()}", Toast.LENGTH_LONG).show()
//        }
    }
}
