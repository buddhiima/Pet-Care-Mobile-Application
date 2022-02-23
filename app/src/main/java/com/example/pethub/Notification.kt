package com.example.pethub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.pethub.adapter2.ItemAdapter2
import com.example.pethub.data2.Datasource2

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val myDataset2 = Datasource2().loadVersions1()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view1)
        recyclerView.adapter = ItemAdapter2(this,myDataset2)
        recyclerView.setHasFixedSize(true)
    }
}