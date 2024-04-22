package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class burger1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger1)

        val button13 =findViewById<ImageView>(R.id.bu1)
        button13.setOnClickListener(){

            val intent = Intent ( this, order::class.java)
            startActivity(intent)
        }

        val b1 =findViewById<TextView>(R.id.b1_price)
        b1.setOnClickListener(){

            val intent = Intent ( this, order::class.java)
            startActivity(intent)
        }


    }
}