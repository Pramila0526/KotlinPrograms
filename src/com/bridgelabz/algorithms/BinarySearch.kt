package com.bridgelabz.algorithms
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to perform binary search operation
 * Date     : 27/02/2020
 *
 **********************************************************************************************************************/
fun main(args : Array<String>) {

    println("Enter the number to search ")
    var search = Integer.valueOf(readLine())

    var array = intArrayOf(1,28,38,48,58)

    var arrayLength =array.size

    var start: Int = 0

    var end: Int = arrayLength - 1

    var middle: Int = (start + end) / 2

    while (start <= end) {
        middle = (start + end) / 2

        if(array[middle] < search )
        {
            start = middle + 1
        }
        else if(array[middle] == search)
        {
            println("$search found at $middle")
            break

        }else{
            end = middle -1
        }
        if(start > end){
            println("$search Not Found")
        }
    }
}

//fun binarySearch(array : IntArray, num : Int, searchNum : Int){
//    var start : Int = 0
//    var end : Int = num - 1
//    var middle : Int = (start + end) /2
//
//    while(start <= end){
//        middle=(start + end)/2
//
////        if(array[middle] )
//    }
//


