package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vet_clinic_doc_prof.*

class VetClinicDocProf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vet_clinic_doc_prof)
        backbtn.setOnClickListener {
            onBackPressed()

        }
        List.setOnClickListener {

            startActivity(Intent(this,VetClinicViewDoc::class.java))
        }

        home.setOnClickListener{
            startActivity(Intent(this,BuyerHome::class.java))
        }

        profile.setOnClickListener{
            startActivity(Intent(this,VetProfile::class.java))
        }
    }
}