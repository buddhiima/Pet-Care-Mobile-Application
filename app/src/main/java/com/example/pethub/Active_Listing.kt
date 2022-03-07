package com.example.pethub

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.pethub.adapter.ItemAdapter
import com.example.pethub.data.Datasource

class Active_Listing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active_listing)

        val myDataset = Datasource().loadVersions()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)

        val backbtn : ImageButton = findViewById(R.id.backbtn)
        val list: ImageButton = findViewById(R.id.listbtn)
        val profile: ImageButton = findViewById(R.id.userbtn)
        val home: ImageButton = findViewById(R.id.hometbn)
        list.setOnClickListener {

            startActivity(Intent(this@Active_Listing, Active_Listing::class.java))
        }
        profile.setOnClickListener{
            startActivity(Intent(this@Active_Listing, MainActivity::class.java))
        }
        home.setOnClickListener{
            startActivity(Intent(this@Active_Listing, MainActivity::class.java))
        }
        backbtn.setOnClickListener{
            onBackPressed()

        }
    }
}