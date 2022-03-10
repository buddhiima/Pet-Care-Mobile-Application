package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vet_clinic_home.*

class VetClinicHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vet_clinic_home)

        doctors_bg.setOnClickListener{
            val intent = Intent(this,VetProfile ::class.java)
            startActivity(intent)
        }

        services_bg.setOnClickListener{
            val intent = Intent(this,VetProfile ::class.java)
            startActivity(intent)
        }
    }
}