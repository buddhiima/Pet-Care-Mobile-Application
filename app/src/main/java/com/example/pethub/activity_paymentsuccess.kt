package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_paymentsuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentsuccess)

        val closebtn: ImageButton = findViewById(R.id.closebtn)

        closebtn.setOnClickListener {
            startActivity(Intent(this@activity_paymentsuccess, BuyerHome::class.java))
        }

        val profile: ImageButton = findViewById(R.id.profile)
        profile.setOnClickListener {
            startActivity(Intent(this, BuyerProf::class.java))
        }

        val caegorie: ImageButton = findViewById(R.id.catogorie)
        caegorie.setOnClickListener {
            startActivity(Intent(this, Category::class.java))
        }
        val homebtn: ImageButton = findViewById(R.id.homebtn)
        homebtn.setOnClickListener {
            startActivity(Intent(this, BuyerHome::class.java))
        }
    }
}