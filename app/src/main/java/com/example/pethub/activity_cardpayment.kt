package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_cardpayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardpayment)

        val proceedbtn:ImageButton=findViewById(R.id.proceedbtn)

        proceedbtn.setOnClickListener {
            startActivity(Intent(this,activity_paymentsuccess::class.java))
        }

        val cancelbtn:ImageButton=findViewById(R.id.cancelbtn)
        cancelbtn.setOnClickListener {
            startActivity(Intent(this, BuyerHome::class.java))
        }
    }
}