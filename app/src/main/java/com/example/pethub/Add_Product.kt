package com.example.pethub

//import com.google.firebase.database.ktx.database
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Add_Product : AppCompatActivity() {
    private var database = FirebaseDatabase.getInstance("https://pethub-18493-default-rtdb.firebaseio.com/")
    private var databaseref = database.reference.child("Products")
    // val databaseref = FirebaseDatabase.getInstance("https://pethub-18493-default-rtdb.firebaseio.com/").reference.child("Products")

    companion object{
        var getproduct : String= String()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val backbtn: ImageButton = findViewById(R.id.backbtn)
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
        backbtn.setOnClickListener{
            onBackPressed()

        }
        var productname = findViewById<EditText>(R.id.productname)
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
                //getproduct=productname


                val insertdata=Products(productname,productprice,productqty,productdescription)
                databaseref.setValue(insertdata).addOnSuccessListener {
                    Toast.makeText(this@Add_Product,"Details Added",Toast.LENGTH_SHORT).show()
                }.addOnFailureListener{
                    Toast.makeText(this@Add_Product,"Details Failed",Toast.LENGTH_SHORT).show()
                    it.printStackTrace();

                }





            }


        })

    }
}