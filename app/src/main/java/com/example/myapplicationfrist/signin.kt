package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val button12 =findViewById<Button>(R.id.Signin2)
        button12.setOnClickListener(){

            val intent = Intent ( this, Home::class.java)
            startActivity(intent)
        }
    }
}