package com.example.pethub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_seller_registration.*

class SellerRegistration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_registration)

        setupSimpleSpinner()

        }

    private fun setupSimpleSpinner() {
        val adapter = ArrayAdapter.createFromResource(this, R.array.businesstype, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner_businesstype.adapter = adapter
    }


}

