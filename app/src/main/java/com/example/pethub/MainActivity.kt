package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_view_doctors)
        val list: ImageButton = findViewById(R.id.listbtn)
        val profile: ImageButton = findViewById(R.id.userbtn)
        val home: ImageButton = findViewById(R.id.hometbn)
        val addproductbtn: ImageButton = findViewById(R.id.imageButton)
        setContentView(R.layout.activity_view_doctors)

        startActivity(Intent(this, ViewDoctors::class.java))

        list.setOnClickListener {

            startActivity(Intent(this@MainActivity, Active_Listing::class.java))
        }
        profile.setOnClickListener{
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }
        home.setOnClickListener{
            startActivity(Intent(this@MainActivity, Add_Product::class.java))
        }


    }
}