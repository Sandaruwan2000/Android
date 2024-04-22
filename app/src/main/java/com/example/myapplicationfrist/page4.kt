package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        var button6 =findViewById<Button>(R.id.Onborad_next2)
        button6.setOnClickListener(){

            val intent6 = Intent ( this, page5::class.java)
            startActivity(intent6)
        }

        var imageButton4 =findViewById<ImageView>(R.id.back3)
        imageButton4.setOnClickListener(){

            val intent5 = Intent ( this, page3::class.java)
            startActivity(intent5)
        }

        val Skip2 =findViewById<Button>(R.id.Skip2)
        Skip2.setOnClickListener(){

            val intent = Intent ( this, page6::class.java)
            startActivity(intent)
        }

    }
}