package com.example.myapplicationfrist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val Burger =findViewById<ImageView>(R.id.Burger)
        Burger.setOnClickListener(){

            val intent = Intent ( this, burger1::class.java)
            startActivity(intent)
        }

        val  pop = findViewById<ImageView>(R.id.popcon)
        pop.setOnClickListener(){

            val intent = Intent ( this, package1::class.java)
            startActivity(intent)
        }

        val  Offer = findViewById<Button>(R.id.Offer)
        Offer.setOnClickListener(){

            val intent = Intent ( this, offer::class.java)
            startActivity(intent)
        }

        val  Package = findViewById<Button>(R.id.Package)
        Package.setOnClickListener(){

            val intent = Intent ( this, package1::class.java)
            startActivity(intent)
        }

        val  Service = findViewById<Button>(R.id.Service)
        Service.setOnClickListener(){

            val intent = Intent ( this, service::class.java)
            startActivity(intent)
        }


    }
}