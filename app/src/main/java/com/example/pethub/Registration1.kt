package com.example.pethub

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
//import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_client_registration.*
import kotlinx.android.synthetic.main.registration1.*
import kotlinx.android.synthetic.main.activity_client_registration.chooseimgbtn as chooseimgbtn1

class Registration1 : AppCompatActivity() {

    val databaseref = FirebaseDatabase.getInstance().reference.child("Buyer")
    lateinit var selectedImgUri: Uri
    var displayImgPath = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration1)


        signup.setOnClickListener() {
            addBuyer()
        }

        chooseimgbtn.setOnClickListener() {
            openImageSelector()
        }
    }

    private fun openImageSelector() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.setType("image/*")
        startActivityForResult(intent, 0)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==0 && resultCode== Activity.RESULT_OK && data!=null) {
            // proceed and check what the selected image is
            selectedImgUri = data.data!!
        }
    }

    private fun addBuyer() {
        var Name = Nametextbox.text.toString()
        var addressLine1 = addline1textbox.text.toString()
        var addressLine2 = addline2textbox.text.toString()
        var city = CityTextbox.text.toString()
        var contact = contactTextbox.text.toString()
        var email = EmailTextbox.text.toString()
        var password = PasswordTextbox.text.toString()
        var retypePassword = RePasswordTextbox.text.toString()

        if (Name != null &&
            addressLine1 != null &&
            addressLine2 != null &&
            city != null &&
            contact != null &&
            email != null &&
            password != null &&
            retypePassword != null &&
            password == retypePassword
        ) {
            // adding pro pic
            val storageref = FirebaseStorage.getInstance().reference.child("BuyerDisplayImages/$email")
            storageref.putFile(selectedImgUri)
            displayImgPath = storageref.downloadUrl.toString()
            chooseimgbtn.text = "Image Selected"

            // sending values to the db
            databaseref.child(email.toString()).setValue(Buyer(Name, addressLine1, addressLine2, city, contact,  email, password, displayImgPath)).addOnSuccessListener {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,BuyerHome::class.java))

            } .addOnFailureListener{
                Toast.makeText(this, "Error occured. Please try again.", Toast.LENGTH_SHORT).show()
            }

        }else {
            Toast.makeText(this, "Fill all fields. Passwords must be same.", Toast.LENGTH_LONG).show()
        }


    }
}
