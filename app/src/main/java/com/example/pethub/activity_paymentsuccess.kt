package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_paymentsuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentsuccess)

        val closebtn:ImageButton=findViewById(R.id.closebtn)

        closebtn.setOnClickListener {
            startActivity(Intent(this@activity_paymentsuccess, BuyerHome::class.java))
        }
    }
}