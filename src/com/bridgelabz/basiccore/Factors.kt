package com.bridgelabz.basiccore
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to print prime factors of a given number
 * Date     : 25/02/2020
 *
 **********************************************************************************************************************/
fun main(args : Array<String>)
{
    println("Enter the Number")
    var num = Integer.valueOf(readLine())
    primeFactor(num)
}

fun primeFactor(num : Int)
{
    var number = num
    for (i in 2..number / 2)
    {
        while (number % i == 0)
        {
            println(i)
            number = number / i;
        }
    }
}