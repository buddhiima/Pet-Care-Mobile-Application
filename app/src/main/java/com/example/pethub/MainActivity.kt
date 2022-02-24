package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //startActivity(Intent(this, Notification::class.java))

        setContentView(R.layout.vet_profile)

        // connect to firebase db
        //var database = FirebaseDatabase.getInstance().reference
    }
}