package com.example.pethub

class Buyer {
    var Name : String ?= null
    var addressLine1 : String ?= null
    var addressLine2 : String ?= null
    var city : String ?= null
    var contact : String ?= null
    var email : String ?= null
    var password : String ?= null
    var displayImgPath : String ?= null

    constructor(
         Name : String,
         addressLine1 : String,
         addressLine2 : String,
         city : String,
         contact : String,
         email : String,
         password : String,
         displayImgPath : String,
    )
    {
        this.Name = Name
        this.addressLine1 =addressLine1
        this.addressLine2 = addressLine2
        this.city = city
        this.contact = contact
        this.email = email
        this.password = password
        this.displayImgPath = displayImgPath
    }
}