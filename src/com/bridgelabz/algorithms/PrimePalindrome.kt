package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to print the numbers in given limit and those numbers should be Prime and Palindrome also
 * Date     : 27/02/2020
 *
 **********************************************************************************************************************/
fun main() {

    var sc = Scanner(System.`in`)

    println("Enter the limit to print Prime and Palindrome Numbers")
    var limit = sc.nextInt()

    primePalindrome(limit)

}

fun primePalindrome(limit : Int)
{
    var remainder : Int

    var reverse : Int

    var isPrime : Boolean

    var temp : Int

    // to get count of all numbers
    var count : Int = 0

    for(num in 1 until limit)
    {
        isPrime = true

        for(i in 2 until num-1) {
            if (num % i == 0)
                isPrime = false
        }
            temp = num

            reverse = 0

            while (temp != 0)
            {
                remainder = temp % 10
                reverse = reverse * 10 + remainder
                temp = temp / 10
            }
        // condition to check that the number should be palindrome and prime
            if(reverse == num && isPrime)
            {
                println("$num")
                count++
            }
        }
     println("Count of numbers that are Prime and Palindrome from 0 to $limit :- $count ")
    }
