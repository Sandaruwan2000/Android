package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)


        val button13 =findViewById<Button>(R.id.Back1)
        button13.setOnClickListener(){

            val intent = Intent ( this, burger1::class.java)
            startActivity(intent)
        }

        val Profile =findViewById<ImageView>(R.id.Profile)
        Profile.setOnClickListener(){

            val intent = Intent ( this, profile::class.java)
            startActivity(intent)
        }
    }
}