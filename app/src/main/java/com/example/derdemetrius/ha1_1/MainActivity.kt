package com.example.derdemetrius.ha1_1

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        btn_adition.setOnClickListener {

            val S1 = editText.text.toString()
            val S2 = editText2.text.toString()
            val a = S1.toBigDecimal()
            val b = S2.toBigDecimal()
            val c = a.plus(b)
            val c1 = c.toString()
            textView.text = c1
            //сложение
        }





        btn_div.setOnClickListener {


            val S1 = editText.text.toString()
            val S2 = editText2.text.toString()
            val a = S1.toBigDecimal()
            val b = S2.toBigDecimal()




            if ( b.toInt()== 0){

                Snackbar.make(visible, "На ноль делить нельзя", Snackbar.LENGTH_SHORT).show()

            } else {

                val c = a.divide(b, 2, RoundingMode.CEILING)
                val c1 = c.toString()
                textView.text = c1 }

            //деление
        }

        btn_multi.setOnClickListener {

            val S1 = editText.text.toString()
            val S2 = editText2.text.toString()
            val a = S1.toBigDecimal()
            val b = S2.toBigDecimal()
            val c = a.times(b)
            val c1 = c.toString()
            textView.text = c1

            //умножение

        }

        btn_subtac.setOnClickListener {
            val S1 = editText.text.toString()
            val S2 = editText2.text.toString()
            val a = S1.toBigDecimal()
            val b = S2.toBigDecimal()
            val c = a.minus(b)
            val c1 = c.toString()
            textView.text = c1

            //вычитание

        }
        }
    }


