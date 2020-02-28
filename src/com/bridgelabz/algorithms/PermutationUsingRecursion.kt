package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Print all possible permutation of given string
 * Date     : 28/02/2020
 *
 **********************************************************************************************************************/

fun main(args : Array<String>) {
    var sc = Scanner(System. `in`)

    println("Enter the String")

    var str = sc.next()

    println("All permutations of a String")
    var output = permutationUsingRecursion(str, 0 , str.length)

    println("Count of Permutation String is:- ${factorial(str.length)}")
}

// Method to get all permutations
fun permutationUsingRecursion(str : String, left : Int , n : Int): String
{
    var i : Int

    var string = str

    if(left == n)
    {
        println(str)
    }
    else
    {
        for(i in left until n){
            string = swap(string , left, i )

            permutationUsingRecursion(string, left+1, n)

            string = swap(string, left, i)
        }

    }

 return str
}

// Method to swap the characters of string
fun swap(str : String, left : Int , right : Int) : String {

    var temp : Char

    val chars = str.toCharArray()

    temp = chars[right]
    chars[right] = chars[left]
    chars[left] = temp

    return chars.joinToString(separator = "")
    return str
}

fun factorial(num : Int):Int{
    var i : Int

    var fact = 1

    for(i in 1..num){
        fact *= i
    }
    return fact
}