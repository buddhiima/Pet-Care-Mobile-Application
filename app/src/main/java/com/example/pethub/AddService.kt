package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_add_doctor.*
import kotlinx.android.synthetic.main.activity_add_doctor.backbtn
import kotlinx.android.synthetic.main.activity_add_doctor.nav_home
import kotlinx.android.synthetic.main.activity_add_doctor.navdocsavailable_icon
import kotlinx.android.synthetic.main.activity_add_doctor.navlogout_icon
import kotlinx.android.synthetic.main.activity_add_doctor.resetbtn
import kotlinx.android.synthetic.main.activity_add_doctor.submitbtn
import kotlinx.android.synthetic.main.activity_add_service.*

class AddService : AppCompatActivity() {

    val databaseref = FirebaseDatabase.getInstance().reference.child("Services")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_service)

        navdocsavailable_icon.setOnClickListener() {
            startActivity(Intent(this, DoctorsAvailableToday::class.java))
        }

        navlogout_icon.setOnClickListener() {
            // go to login page
        }

        nav_home.setOnClickListener() {
            // go to home page
        }

        submitbtn.setOnClickListener() {
            addService()
        }

        resetbtn.setOnClickListener() {
            resetData()
        }

        backbtn.setOnClickListener() {
            startActivity(Intent(this, ViewDoctors::class.java))
        }
    }


    private fun addService() {
        var service = textbox_servicename.text.toString()

        if(service!=null) {

            // sending values to the db
            databaseref.child(service.toString()).setValue(Service(service)).addOnSuccessListener {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
            } .addOnFailureListener{
                Toast.makeText(this, "Error occured. Please try again.", Toast.LENGTH_SHORT)
            }
        }
    }

    private fun resetData() {
        textbox_servicename.text.clear()
    }
}