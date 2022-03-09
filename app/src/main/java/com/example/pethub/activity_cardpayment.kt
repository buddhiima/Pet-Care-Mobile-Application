package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.room.Insert

class activity_cardpayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardpayment)

        val proceedbtn:ImageButton=findViewById(R.id.proceedbtn)

        proceedbtn.setOnClickListener {
            startActivity(Intent(this@activity_cardpayment, activity_paymentsuccess::class.java))
        }
    }
}