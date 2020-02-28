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

    primeInRange(limit)

}

fun primeInRange(limit : Int){

    var primeCount : Int = 0

    for(num in 0..limit)
    {
        var count : Int = 0
        for(i in num downTo 1)
        {
            if (num % i == 0)
            {
                count++
            }
         }
            if(count <= 2)
            {
                println("$num ")
                primeCount++
            }
    }
    println("Prime Count $primeCount")
}