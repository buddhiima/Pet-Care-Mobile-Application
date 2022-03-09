package com.example.pethub

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_add_doctor.*
import kotlinx.android.synthetic.main.activity_add_doctor.backbtn
import kotlinx.android.synthetic.main.activity_add_doctor.nav_home
import kotlinx.android.synthetic.main.activity_add_doctor.navdocsavailable_icon
import kotlinx.android.synthetic.main.activity_add_doctor.navlogout_icon
import kotlinx.android.synthetic.main.activity_add_doctor.textbox_doccharges
import kotlinx.android.synthetic.main.activity_add_doctor.textbox_docothernotes
import kotlinx.android.synthetic.main.activity_add_doctor.view.*
import kotlinx.android.synthetic.main.activity_client_registration.*
import kotlinx.android.synthetic.main.activity_update_doctor.*

class AddDoctor : AppCompatActivity() {

    val databaseref = FirebaseDatabase.getInstance().reference.child("Doctors")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_doctor)
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
            addDoctor()
        }

        resetbtn.setOnClickListener() {
            resetData()
        }

        backbtn.setOnClickListener() {
            startActivity(Intent(this, ViewDoctors::class.java))
        }

        setupSimpleSpinner()
    }

    private fun resetData() {
        textbox_docname.text.clear()
        textbox_docname.text.clear()
        textbox_docothernotes.text.clear()
        textbox_doccharges.text.clear()
    }


    private fun addDoctor() {
        var docName = textbox_docname.text.toString()
        var specialty = textbox_docname.text.toString()
        var availableDay = availableday.selectedItem.toString()
        var otherNotes = textbox_docothernotes.text.toString()
        var charges = textbox_doccharges.text.toString().toFloat()

        if(docName!=null &&
            specialty!=null &&
            availableDay!=null &&
            otherNotes!=null &&
            charges!=null) {

            // sending values to the db
            databaseref.child(docName.toString()).setValue(Doctor(docName, specialty, availableDay, otherNotes, charges)).addOnSuccessListener {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
            } .addOnFailureListener{
                Toast.makeText(this, "Error occured. Please try again.", Toast.LENGTH_SHORT)
            }
        }
    }


    // add a dropdown to business type
    private fun setupSimpleSpinner() {
        val adapter = ArrayAdapter.createFromResource(this, R.array.daysOfWeek, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        availableday.adapter = adapter
    }
}