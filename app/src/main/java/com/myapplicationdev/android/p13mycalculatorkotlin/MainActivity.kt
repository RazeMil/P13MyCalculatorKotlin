package com.myapplicationdev.android.p13mycalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1 = ""
    var num2 = ""
    var switch = false
    var op = ""
    var sum = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun btnOnClick(view: View) {


        val btnSelected = view as Button
        if (switch == false) {
            num1=""
            when (btnSelected.id) {

                No1.id -> num1 += "1"
                No2.id -> num1 += "2"
                No3.id -> num1 += "3"

                No4.id -> num1 += "4"
                No5.id -> num1 += "5"
                No6.id -> num1 += "6"

                No7.id -> num1 += "7"
                No8.id -> num1 += "8"
                No9.id -> num1 += "9"

                No0.id -> num1 += "0"
                Decimal.id -> num1 += "."

            }
            tvDisplay.text = num1
        } else {
            num2 = ""
            when (btnSelected.id) {
                No1.id -> num2 += "1"
                No2.id -> num2 += "2"
                No3.id -> num2 += "3"

                No4.id -> num2 += "4"
                No5.id -> num2 += "5"
                No6.id -> num2 += "6"

                No7.id -> num2 += "7"
                No8.id -> num2 += "8"
                No9.id -> num2 += "9"

                No0.id -> num2 += "0"
                Decimal.id -> num2 += "."

            }

            tvDisplay.text = num2
        }
    }

    fun btnOPOnClick(view: View) {
        val btnSelected = view as Button


        when (btnSelected.id) {


            Divide.id -> op = "/"
            Times.id -> op = "*"
            Minus.id -> op = "-"
            Plus.id -> op = "+"
            Decimal.id -> op = "."
            AC.id -> sum = 0.0
        }
        switch = true
        tvDisplay.text = ""
    }

    fun Equal(view: View) {

        if (op == "+") {
            sum = num1.toDouble() + num2.toDouble()
        } else if (op == "*") {
            sum = num1.toDouble() * num2.toDouble()
        } else if (op == "/") {
            sum = num1.toDouble() / num2.toDouble()
        } else if (op == "-") {
            sum = num1.toDouble() - num2.toDouble()
        }

        tvDisplay.text = sum.toString()
        switch = false

    }
}