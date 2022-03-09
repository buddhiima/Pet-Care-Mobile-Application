package com.example.pethub

class Doctor {

    var docName : String ?= null
    var specialty : String ?= null
    var availableday : String ?= null
    var otherNotes : String ?= null
    var charges : Float ?= null

    constructor(docName : String,
                specialty : String,
                availableday : String,
                otherNotes : String,
                charges : Float) {

        this.docName = docName
        this.specialty = specialty
        this.availableday = availableday
        this.otherNotes = otherNotes
        this.charges = charges
    }
}