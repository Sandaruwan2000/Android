package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        var button3 =findViewById<Button>(R.id.Onborad_next1)
        button3.setOnClickListener(){

            val intent3 = Intent ( this, page4::class.java)
            startActivity(intent3)
        }

        var imageButton3 =findViewById<ImageButton>(R.id.back1)
        imageButton3.setOnClickListener(){

            val intent4 = Intent ( this, page2::class.java)
            startActivity(intent4)
        }

        val Skip1 =findViewById<Button>(R.id.Skip1)
        Skip1.setOnClickListener(){

            val intent = Intent ( this, page6::class.java)
            startActivity(intent)
        }

    }
}