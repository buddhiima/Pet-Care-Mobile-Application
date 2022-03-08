package com.example.pethub

import kotlinx.android.synthetic.main.activity_seller_registration.*

class Seller {

    var businessType = ""
    var businessName = ""
    //var displayImage
    var addressLine1 = ""
    var addressLine2 = ""
    var city = ""
    var contact = ""
    var description = ""
    var email = ""
    var password = ""
    // var retypePassword

    constructor(businessType: String,
                businessName: String,
                addressLine1: String,
                addressLine2: String,
                city :String,
                contact: String,
                description: String,
                email: String,
                password: String
    ) {
        this.businessType = businessType
        this.businessName = businessName
        this.addressLine1 = addressLine1
        this.addressLine2 = addressLine2
        this.city = city
        this.contact = contact
        this.description = description
        this.email = email
        this.password = password
    }
}