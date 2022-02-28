package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Add_Product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)


        val list: ImageButton = findViewById(R.id.listbtn)
        val profile: ImageButton = findViewById(R.id.userbtn)
        val home: ImageButton = findViewById(R.id.hometbn)
        list.setOnClickListener {

            startActivity(Intent(this@Add_Product, Active_Listing::class.java))
        }
        profile.setOnClickListener{
            startActivity(Intent(this@Add_Product, MainActivity::class.java))
        }
        home.setOnClickListener{
            startActivity(Intent(this@Add_Product, MainActivity::class.java))
        }
    }
}