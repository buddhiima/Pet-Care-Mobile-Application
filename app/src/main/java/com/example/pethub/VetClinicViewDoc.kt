package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vet_clinic_home.*
import kotlinx.android.synthetic.main.activity_vet_clinic_view_doc.*

class VetClinicViewDoc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vet_clinic_view_doc)

        Doc1.setOnClickListener{
            val intent = Intent(this,VetClinicDocProf ::class.java)
            startActivity(intent)
        }
        backbtn.setOnClickListener {
            onBackPressed()

        }
    }
}