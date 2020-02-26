package com.bridgelabz.basiccore

fun main(args : Array<String>) {

    println("Enter the Number")
    var num = Integer.valueOf(readLine())

    for (i in 2..num / 2) {
        if (num % i == 0) {
            print("$i ")
            num /= i
        }
    }
}



//    primeFactor(num)

//fun primeFactor(num : Int) {
//    for (i in 2..num / 2) {
//        while (num % i == 0) {
//            println(i)
//            var num = num / i;
//        }
//    }
//}