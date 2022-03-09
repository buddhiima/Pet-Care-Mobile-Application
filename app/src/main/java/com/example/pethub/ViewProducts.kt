package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton



class ViewProducts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_products)

        val backbtn: ImageButton = findViewById(R.id.backbtn)
        val product1: ImageButton = findViewById(R.id.product1)
        val product2: ImageButton = findViewById(R.id.product2)
        val product3: ImageButton = findViewById(R.id.product3)
        val product4: ImageButton = findViewById(R.id.product4)

        backbtn.setOnClickListener {
            onBackPressed()

        }
    //Navigation Bar
        val cart: ImageButton = findViewById(R.id.cart)
        val profile: ImageButton = findViewById(R.id.profile)
        val home: ImageButton = findViewById(R.id.home)



        cart.setOnClickListener {

            startActivity(Intent(this,cart::class.java))
        }

        home.setOnClickListener{
            startActivity(Intent(this,BuyerHome::class.java))
        }

        profile.setOnClickListener{
            startActivity(Intent(this,VetProfile::class.java))
        }

        product1.setOnClickListener{
            val intent = Intent(this,VetProfile ::class.java)
            startActivity(intent)
        }

        product2.setOnClickListener{
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        product3.setOnClickListener{
            val intent = Intent(this,VetProfile ::class.java)
            startActivity(intent)
        }

        product4.setOnClickListener{
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}