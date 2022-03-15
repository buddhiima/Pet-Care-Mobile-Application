package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BuyerHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyer_home)

        val profile:ImageButton=findViewById(R.id.profile)
        profile.setOnClickListener {
            startActivity(Intent(this,BuyerProf::class.java))
        }

        val catogorie:ImageButton=findViewById(R.id.catogorie)
        catogorie.setOnClickListener {
            startActivity(Intent(this,Category::class.java))
        }
        val homebtn:ImageButton=findViewById(R.id.homebtn)
        homebtn.setOnClickListener {
            startActivity(Intent(this,BuyerHome::class.java))
        }
    }
}