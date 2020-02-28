package com.bridgelabz.algorithms
import java.util.*
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to perform Bubble Sorting
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

    for(j in 0 until arraySize)
    {
        for(k in j+1 until arraySize)
        {
            if(array[k] > array[j]){
                     var temp = array[k]
                array[k]=array[j]
                array[j]=temp
            }
        }
    }

    println("Sorted Array is")
    for(a in 0 until arraySize){
        println("${array[a]}")
    }
}