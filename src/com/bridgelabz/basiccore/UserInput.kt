package com.bridgelabz.basiccore

/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : User Input and Replace String Template “Hello <<UserName>>, How are you?”
 * Date     : 26/02/2020
 *
 **********************************************************************************************************************/

    fun main(args : Array<String>) {

        println("Please Enter the Username")
        var userName = readLine()  // Taking Input from User

    if (userName != null) {
        userInput(userName)
    }

    }

    fun userInput(userName:String){
        if (userName.length > 3)
        println("Hello $userName, How are You?")
        else
            println("Username Should have minimum 3 characters")
    }

