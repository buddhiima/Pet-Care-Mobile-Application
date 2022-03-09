package com.example.pethub

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_client_registration.*

class ClientRegistration : AppCompatActivity() {

    val databaseref = FirebaseDatabase.getInstance().reference.child("Clients")
    var selectedImgUri: Uri = Uri.parse("")
    var displayImgPath = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_registration)

        registerbtn.setOnClickListener() {
            addClient()
        }

        chooseimgbtn.setOnClickListener() {
            openImageSelector()
        }

        setupSimpleSpinner()
    }


    private fun openImageSelector() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.setType("image/*")
        startActivityForResult(intent, 0)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==0 && resultCode==Activity.RESULT_OK && data!=null) {
            // proceed and check what the selected image is
            selectedImgUri = data.data!!
        }
    }


    private fun addClient() {
        var businessType = spinner_businesstype.selectedItem.toString()
        var businessName = businessname_txtbox.text.toString()
        var addressLine1 = address1_txtbox.text.toString()
        var addressLine2 = address2_txtbox.text.toString()
        var city = city_txtbox.text.toString()
        var contact = contact_txtbox.text.toString()
        var description = descbusiness_txtbox.text.toString()
        var email = email_txtbox.text.toString()
        var password = password_txtbox.text.toString()
        var retypePassword = retypepassword_txtbox.text.toString()

        if(businessType!=null &&
                businessName!=null &&
                addressLine1!=null &&
                addressLine2!=null &&
                city!=null &&
                contact!=null &&
                description!=null &&
                email!=null &&
                password!=null &&
                retypePassword!=null &&
                password==retypePassword) {

            // adding pro pic
            val storageref = FirebaseStorage.getInstance().reference.child("/clientDisplayImages/$email")
            storageref.putFile(selectedImgUri)
            displayImgPath = storageref.downloadUrl.toString()
            chooseimgbtn.text = "Image Selected"

            // sending values to the db
            databaseref.child(email.toString()).setValue(Client(businessType, businessName, addressLine1, addressLine2, city, contact, description, email, password, displayImgPath)).addOnSuccessListener {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
            } .addOnFailureListener{
                Toast.makeText(this, "Error occured. Please try again.", Toast.LENGTH_SHORT).show()
            }
        }

        else {
            Toast.makeText(this, "Fill all fields. Passwords must be same.", Toast.LENGTH_LONG).show()
        }
    }


    // add a dropdown to business type
    private fun setupSimpleSpinner() {
        val adapter = ArrayAdapter.createFromResource(this, R.array.businesstype, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner_businesstype.adapter = adapter
    }

}

