package com.example.passwordgenerator

class Functions {
    fun generatePassword(): String{
        var characters = "abcdefghijklmnopqrstuvwxyz"
        var numbers = "0123456789"
        var specialCharOne = "!@#$%^&*()_+"
        var specialCharTwo = "-=|{}[]',.<>?/~`"

        var generatedNumber = ""


        for (i in 1 until 10){
            generatedNumber += characters.random()
            generatedNumber += numbers.random()
            generatedNumber += specialCharOne.random()
            generatedNumber += specialCharTwo.random()
        }

        return generatedNumber
    }
}