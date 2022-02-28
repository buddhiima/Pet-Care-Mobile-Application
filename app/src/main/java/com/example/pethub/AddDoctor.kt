package com.example.pethub

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AddDoctor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_doctor)
        val backbtn: ImageButton = findViewById(R.id.backbtn)
        backbtn.setOnClickListener{
            onBackPressed()

        }
    }
}