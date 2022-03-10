package com.example.pethub

class Client {

    var businessType : String ?= null
    var businessName : String ?= null
    var addressLine1 : String ?= null
    var addressLine2 : String ?= null
    var city : String ?= null
    var contact : String ?= null
    var description : String ?= null
    var usernName : String ?= null
    var password : String ?= null
    var displayImgPath : String ?= null

    constructor(businessType: String,
                businessName: String,
                addressLine1: String,
                addressLine2: String,
                city :String,
                contact: String,
                description: String,
                email: String,
                password: String,
                displayImgPath: String
    ) {
        this.businessType = businessType
        this.businessName = businessName
        this.addressLine1 = addressLine1
        this.addressLine2 = addressLine2
        this.city = city
        this.contact = contact
        this.description = description
        this.usernName = email
        this.password = password
        this.displayImgPath = displayImgPath
    }
}