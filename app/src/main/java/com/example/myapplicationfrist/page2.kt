package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var button1 =findViewById<Button>(R.id.Start)
        button1.setOnClickListener(){

            val intent2 = Intent ( this, page3::class.java)
            startActivity(intent2)
        }
    }
}