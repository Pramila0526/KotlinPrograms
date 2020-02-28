package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to perform binary search operation
 * Date     : 27/02/2020
 *
 **********************************************************************************************************************/
fun main(args : Array<String>) {
    var sc = Scanner(System. `in`)

    println("Enter the size of an array")
    var arraySize = sc.nextInt()

    var array = IntArray(arraySize)

    println("Enter the elements in array")
    for(i in 0 until arraySize)
        array[i] = sc.nextInt()

    println("Enter the number to search ")
    var search = Integer.valueOf(readLine())

    var start: Int = 0

    var end: Int = arraySize - 1

    var middle: Int

    while (start <= end) {
        middle = (start + end) / 2

        if(array[middle] < search )
        {
            start = middle + 1
        }
        else if(array[middle] == search)
        {
            println("$search found at index $middle")
            break

        }else{
            end = middle -1
        }
        if(start > end){
            println("$search Not Found in an array")
        }
    }
}


