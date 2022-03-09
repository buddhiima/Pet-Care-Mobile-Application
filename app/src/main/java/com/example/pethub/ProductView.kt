package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_cart.backbtn
import kotlinx.android.synthetic.main.activity_cart.cart
import kotlinx.android.synthetic.main.activity_cart.home
import kotlinx.android.synthetic.main.activity_cart.profile
import kotlinx.android.synthetic.main.activity_product_view.*

class ProductView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_view)
        backbtn.setOnClickListener {
            onBackPressed()

        }
        cart.setOnClickListener {

            startActivity(Intent(this,Cart::class.java))
        }

        home.setOnClickListener{
            startActivity(Intent(this,BuyerHom::class.java))
        }

        profile.setOnClickListener{
            startActivity(Intent(this,VetProfile::class.java))
        }

        Addcart.setOnClickListener{
            Toast.makeText(this, "Successfully Added", Toast.LENGTH_LONG).show()
        }



    }
}