package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.signup
import kotlinx.android.synthetic.main.registration1.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signup.setOnClickListener {

            startActivity(Intent(this,Registration1::class.java))
        }

        loginbutton.setOnClickListener {

            if(email_txtbox.text.toString().equals("Admin") && psw_txtbox.text.toString().equals("123")){
                Toast.makeText(this, "Lohgin Successfully", Toast.LENGTH_LONG).show()
                startActivity(Intent(this,BuyerHome::class.java))
            }

        }

        becomeseller.setOnClickListener {

            startActivity(Intent(this,ClientRegistration::class.java))
        }

    }
}

