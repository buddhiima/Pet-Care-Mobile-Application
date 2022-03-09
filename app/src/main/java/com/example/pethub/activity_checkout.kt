package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
        val profile: ImageButton =findViewById(R.id.profile)
        profile.setOnClickListener {
            startActivity(Intent(this,BuyerProf::class.java))
        }

        val caegorie: ImageButton =findViewById(R.id.catogorie)
        caegorie.setOnClickListener {
            startActivity(Intent(this,Category::class.java))
        }
        val homebtn: ImageButton =findViewById(R.id.homebtn)
        homebtn.setOnClickListener {
            startActivity(Intent(this,BuyerHome::class.java))
        }
        val cancel: ImageButton = findViewById(R.id.cancel)
        cancel.setOnClickListener {
            startActivity(Intent(this,BuyerHome::class.java))
        }
        var card: ImageButton= findViewById(R.id.card)
        card.setOnClickListener {
            startActivity(Intent(this,activity_cardpayment::class.java))
        }
        var cod: ImageButton= findViewById(R.id.cod)
        cod.setOnClickListener {
            startActivity(Intent(this,activity_ordeplaced::class.java))
        }
    }
}