package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to check whether Entered Strings are Anagram or not
 * Date     : 27/02/2020
 *
 **********************************************************************************************************************/
fun main(args: Array<String>)
{
    var sc = Scanner(System. `in`)

    println("Enter the 1st String")
    var firstString = sc.next()

    println("Enter the 2nd String")
    var secondString = sc.next()

    anagram(firstString,secondString)
}

fun anagram(firstString: String , secondString: String )
{
    var found : Int = 0;
    var notFound : Int = 0;

    if(firstString.length == secondString.length)
    {
               for(i in 0 until firstString.length)
               {
                   for(j in 0 until secondString.length)
                   {
                       if(firstString.get(i) == secondString.get(j))
                       {
                            found = 1
                           break
                       }
                   }
                   if(found == 0)
                   {
                       notFound=1
                       break
                   }
               }
        if(notFound==1)
        {
            println("Strings are not Anagram")
        }
        else
        {
            println("Strings are Anagram")
        }
    }
    else{
        println("Both String's Length Should be equal")
    }
}