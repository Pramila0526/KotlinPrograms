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

    println("Enter the Number to check whether it is palindrome or not")
    var number = sc.nextInt()

    palindrome(number)
}

fun palindrome(number : Int)
{
    var remainder : Int

    var reverse : Int = 0

    var temp : Int = number

    var useNumber : Int = number

    while (useNumber != 0){
        remainder = useNumber % 10
        reverse = reverse * 10 + remainder
        useNumber = useNumber / 10
    }

    if(temp == reverse){
        println("$number is a Palindrome Number")
    }
    else{
        println("$number is not a Palindrome Number")
    }
}