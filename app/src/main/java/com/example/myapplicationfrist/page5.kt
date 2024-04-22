package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        val button8 =findViewById<Button>(R.id.Onborad_next3)
        button8.setOnClickListener(){

            val intent7 = Intent ( this, page6::class.java)
            startActivity(intent7)
        }

        var imageButton5 =findViewById<ImageButton>(R.id.back5)
        imageButton5.setOnClickListener(){

            val intent8 = Intent ( this, page4::class.java)
            startActivity(intent8)
        }

        val Skip3 =findViewById<Button>(R.id.Skip3)
        Skip3.setOnClickListener(){

            val intent = Intent ( this, page6::class.java)
            startActivity(intent)
        }
    }
}