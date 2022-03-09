package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_cart.*

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cart: ImageButton = findViewById(R.id.cart)
        val profile: ImageButton = findViewById(R.id.profile)
        val home: ImageButton = findViewById(R.id.home)

        backbtn.setOnClickListener {
            onBackPressed()

        }
        cart.setOnClickListener {

            startActivity(Intent(this,Cart::class.java))
        }

        home.setOnClickListener{
            startActivity(Intent(this,BuyerHom::class.java))
        }

        profile.setOnClickListener{
            startActivity(Intent(this,VetProfile::class.java))
        }
    }
}