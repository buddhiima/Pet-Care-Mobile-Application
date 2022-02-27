package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_view_doctors.*

class ViewDoctors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_doctors)

        newdoc_btn.setOnClickListener {
            val intent = Intent(this, AddDoctor::class.java)
            startActivity(intent)
        }

    }
}