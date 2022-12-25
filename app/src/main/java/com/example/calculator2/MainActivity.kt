package com.example.calculator2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button1)
        val edittxt1 = findViewById<EditText>(R.id.input1)
        val edittxt2 = findViewById<EditText>(R.id.input2)
        //val rdbgrp = findViewById<RadioGroup>(R.id.radgrp)
        val addrd = findViewById<RadioButton>(R.id.radAdd)
        val subrd = findViewById<RadioButton>(R.id.radsub)
        val prdtrd = findViewById<RadioButton>(R.id.radprdt)
        val qttrd = findViewById<RadioButton>(R.id.radqtt)
        val remrd = findViewById<RadioButton>(R.id.radrem)


        btn!!.setOnClickListener{

                val num1: Int = edittxt1.text.toString().toInt()
                val num2: Int = edittxt2.text.toString().toInt()
                val Text = findViewById<TextView>(R.id.textView2)
                var op: Int? = null
                //Text.setText("input1:"+num1+"\ninput2:"+num2+op)
                if (addrd.isChecked){
                    op = num1+num2
                    Text.text = "Sum is:"+op
                }
                else if(subrd.isChecked){
                    op = num1-num2
                    Text.text = "Difference is:"+op
                }
                else if(prdtrd.isChecked){
                    op = num1*num2
                    Text.text = "Product is:"+op
                }
                else if(qttrd.isChecked){
                    op = num1/num2
                    Text.text = "Quotient is:"+op
                }
                else if(remrd.isChecked){
                    op = num1%num2
                    Text.text = "Remainder is:"+op
                }

        }
    }

}

