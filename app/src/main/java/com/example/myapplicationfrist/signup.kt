package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val button13 =findViewById<Button>(R.id.Signup2)
        button13.setOnClickListener(){

            val intent = Intent ( this, signin::class.java)
            startActivity(intent)
        }
    }
}