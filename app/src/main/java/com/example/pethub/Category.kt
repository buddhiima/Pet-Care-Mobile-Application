package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category)

        val backbtn: ImageButton = findViewById(R.id.backbtn)
        val petshop: ImageButton = findViewById(R.id.petshop)
        val vetclinic: ImageButton = findViewById(R.id.vetclinic)

        backbtn.setOnClickListener {
            onBackPressed()

        }
        vetclinic.setOnClickListener{
            val intent = Intent(this,VetProfile ::class.java)
            startActivity(intent)
        }

        petshop.setOnClickListener{
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}