package com.example.pethub

import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class VeterinaryClinic {

    var clientType = "Veterinary Clinic"
    var clientName = "Best Care Animal Hospital"
    var website = "www.bestcare.lk"
    var addressLine1 = "No. 12"
    var addressLine2 = "Pagoda Road"
    var city = "Colombo"
    var contact = "0767765459"
    var description = "Best Care Animal hospital is dedicated to offer you a quality veterinary service at a reasonable price. We are open all 7 days a week between 8.00am to 8.00pm."
    var clientEmail = "bestcare12@gmail.com"
    var password = "bestcare123"

    var database = FirebaseDatabase.getInstance().reference

    constructor(
        clientType: String,
        clientName: String,
        website: String,
        addressLine1: String,
        addressLine2: String,
        city: String,
        contact: String,
        description: String,
        clientEmail: String,
        password: String
    ) {
        this.clientType = clientType
        this.clientName = clientName
        this.website = website
        this.addressLine1 = addressLine1
        this.addressLine2 = addressLine2
        this.city = city
        this.contact = contact
        this.description = description
        this.clientEmail = clientEmail
        this.password = password
    }


    fun addVeterinaryClinic(clientType:String,
                            clientName:String,
                            website:String,
                            addressLine1:String,
                            addressLine2:String,
                            city:String,
                            contact:String,
                            description:String,
                            clientEmail:String,
                            password:String
                            ) {
        database.child(clientEmail).setValue(VeterinaryClinic(clientType, clientName, website, addressLine1, addressLine2, city, contact, description, clientEmail, password))
    }


}