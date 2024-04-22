package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val Logout =findViewById<Button>(R.id.Logout)
        Logout.setOnClickListener(){

            val intent = Intent ( this, page6::class.java)
            startActivity(intent)
        }
    }
}