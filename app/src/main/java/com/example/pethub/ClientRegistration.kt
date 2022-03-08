package com.example.pethub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_client_registration.*

class ClientRegistration : AppCompatActivity() {

    var database = FirebaseDatabase.getInstance().reference.child("Clients")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_registration)

        registerbtn.setOnClickListener() {
            addSeller()
        }

        setupSimpleSpinner()

        }

    private fun addSeller() {
        var businessType = spinner_businesstype.selectedItem.toString()
        var businessName = businessname_txtbox.text.toString()
        //var displayImage
        var addressLine1 = address1_txtbox.text.toString()
        var addressLine2 = address2_txtbox.text.toString()
        var city = city_txtbox.text.toString()
        var contact = contact_txtbox.text.toString()
        var description = descbusiness_txtbox.text.toString()
        var email = email_txtbox.text.toString()
        var password = password_txtbox.text.toString()
        var retypePassword = retypepassword_txtbox.text.toString()

        database.child(email.toString()).setValue(Seller(businessType,businessName, addressLine1, addressLine2, city, contact, description, email, password))
    }

    // add a dropdown to business type
    private fun setupSimpleSpinner() {
        val adapter = ArrayAdapter.createFromResource(this, R.array.businesstype, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner_businesstype.adapter = adapter
    }


}

