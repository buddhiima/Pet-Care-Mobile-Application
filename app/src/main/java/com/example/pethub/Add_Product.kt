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

class Add_Product : AppCompatActivity() {
    private var database = FirebaseDatabase.getInstance("https://my-pethub-default-rtdb.firebaseio.com/")
    private var databaseref = database.reference.child("Prodcuts")

    companion object{
        var getproduct : String= String()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)


        val list: ImageButton = findViewById(R.id.listbtn)
        val profile: ImageButton = findViewById(R.id.userbtn)
        val home: ImageButton = findViewById(R.id.hometbn)
        list.setOnClickListener {

            startActivity(Intent(this@Add_Product, Active_Listing::class.java))
        }
        profile.setOnClickListener{
            startActivity(Intent(this@Add_Product, MainActivity::class.java))
        }
        home.setOnClickListener{
            startActivity(Intent(this@Add_Product, MainActivity::class.java))
        }

   /*     var productname = findViewById<EditText>(R.id.productname)
        var productprice = findViewById<EditText>(R.id.productprice)
        var productqty = findViewById<EditText>(R.id.productqty)
        var productdescription = findViewById<EditText>(R.id.productdes)
        var submitbtn = findViewById<Button>(R.id.submitbtn)
        var resetbtn = findViewById<Button>(R.id.resettbtn)

        submitbtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: android.view.View?) {
                var productname = productname.getText().toString()
                var productprice  = productprice.getText().toString()
                var productqty = productqty.getText().toString()
                var productdescription = productdescription.getText().toString()
                getproduct=productname


                if(!!productname.isEmpty() && productprice.isEmpty() && productqty.isEmpty() && productdescription.isEmpty()){}
                else{
                    val run = databaseref.orderByChild("productname").equalTo(productname)
                    val valuelistener = object : ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {
                            Toast.makeText(this@Add_Product,"succssfully",Toast.LENGTH_SHORT).show()
                        }

                        override fun onCancelled(error: DatabaseError) {
                            Toast.makeText(this@Add_Product,"faild", Toast.LENGTH_SHORT).show()
                        }

                    }
                }

            }


        })
*/
    }
}