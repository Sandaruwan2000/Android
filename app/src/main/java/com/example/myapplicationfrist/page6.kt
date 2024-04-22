package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val button9 =findViewById<Button>(R.id.Signin1)
        button9.setOnClickListener(){

            val intent = Intent ( this, signin::class.java)
            startActivity(intent)
        }

        val button10 =findViewById<Button>(R.id.Signup1)
        button10.setOnClickListener(){

            val intent = Intent ( this, signup::class.java)
            startActivity(intent)
        }
    }
}