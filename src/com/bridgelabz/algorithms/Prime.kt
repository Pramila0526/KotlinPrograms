package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Print Prime numbers in given rane and count them
 * Date     : 27/02/2020
 *
 **********************************************************************************************************************/
fun main(args : Array<String>) {

     var sc = Scanner(System. `in`)

    println("Enter the Limit to Print Prime Numbers")
    var limit = sc.nextInt()

    prime(limit)
}

fun prime(limit : Int){

    var isPrime : Boolean
    var count : Int = 0

    for(num in 1 until limit)
    {
        isPrime = true
        for(i in 2 until num-1)
        {
            if (num % i == 0)
            {
                isPrime = false
            }
        }
            if(isPrime)
            {
                println(num)
                count++
            }
        }

    println("Prime Count $count")
}