package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to check whether the string is palindrome or not
 * Date     : 27/02/2020
 *
 **********************************************************************************************************************/
fun main() {
    var sc = Scanner(System. `in`)

    println("Enter the String to check whether it is palindrome or not")
    var str = sc.next()

    palindromeString(str)
}

// Function to reverse the string
fun reverseString(str: String): String {

   if(str.isEmpty())
       return str

    return reverseString(str.substring(1)) +str[0]
    // Example of above syntax for understanding purpose
    //    reverse("Start")
    //    reverse("tart")
    //    reverse("art")
    //    reverse("rt")
    //    reverse("t") // when string is 1 char length then the reverse string is returned
}

// Function to check whether the string is palindrome or not
fun palindromeString(str: String)
{
    if (reverseString(str) == str)
        println("$str is a Palindrome String")
    else
        println("$str is not a Palindrome String")
}