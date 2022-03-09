package com.example.pethub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.pethub.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
//import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.registration1.*

class Registration1 : AppCompatActivity() {
    private var database = FirebaseDatabase.getInstance("https://my-pethub-default-rtdb.firebaseio.com/")
    private var databaseref = database.reference.child("Customers")

    companion object{
        var registration : String= String()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration1)

        var Nametextbox = findViewById<EditText>(R.id.Nametextbox)
        var addline1textbox = findViewById<EditText>(R.id.addline1textbox)
        var addline2textbox = findViewById<EditText>(R.id.addline2textbox)
        var CityTextbox = findViewById<EditText>(R.id.CityTextbox)
        var EmailTextbox = findViewById<EditText>(R.id.EmailTextbox)
        var contactTextbox = findViewById<EditText>(R.id.contactTextbox)
        var PasswordTextbox = findViewById<EditText>(R.id.PasswordTextbox)
        var RePasswordTextbox = findViewById<EditText>(R.id.RePasswordTextbox)
        var next = findViewById<Button>(R.id.next)
        var back = findViewById<Button>(R.id.back)

        next.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: android.view.View?) {
                var Nametextbox = Nametextbox.getText().toString()
                var addline1textbox  = addline1textbox.getText().toString()
                var addline2textbox = addline2textbox.getText().toString()
                var EmailTextbox = EmailTextbox.getText().toString()
                var CityTextbox = CityTextbox.getText().toString()
                var PasswordTextbox = PasswordTextbox.getText().toString()
                var RePasswordTextbox = RePasswordTextbox.getText().toString()
                registration=Nametextbox


                if(!!Nametextbox.isEmpty() && addline1textbox.isEmpty() && addline2textbox.isEmpty() && CityTextbox.isEmpty() && EmailTextbox.isEmpty() && PasswordTextbox.isEmpty() && RePasswordTextbox.isEmpty()){}
                else{
                    val run = databaseref.orderByChild("Nametextbox").equalTo(Nametextbox)
                    val valuelistener = object : ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {
                            Toast.makeText(this@Registration1,"succssfully",Toast.LENGTH_SHORT).show()
                        }

                        override fun onCancelled(error: DatabaseError) {
                            Toast.makeText(this@Registration1,"faild", Toast.LENGTH_SHORT).show()
                        }

                    }
                }

            }


        })

    }
}