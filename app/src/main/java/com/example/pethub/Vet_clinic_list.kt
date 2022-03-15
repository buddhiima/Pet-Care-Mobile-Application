package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vet_clinic_list.*

class Vet_clinic_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vet_clinic_list)
        backbtn.setOnClickListener {
            onBackPressed()

        }
        List1.setOnClickListener{
            val intent = Intent(this,VetClinicHome ::class.java)
            startActivity(intent)
        }
    }
}