package com.bridgelabz.basiccore

fun main(args : Array<String>) {

    println("Enter the number of Flips")
    var flips= Integer.valueOf(readLine())
    flipCoin(flips)
}

fun flipCoin(flips : Int){
    var heads : Float = .0f
    var tails : Float = .0f
    var counter : Int = 1
    var randomNum : Double

    while(counter <= flips){
        randomNum=Math.random()

        println("$counter count of  $randomNum")

        if(randomNum < 0.5) {
            heads++
            println(heads)
        }
        else {
            tails++
            println(tails)
        }
    counter++
    }

    println("Number of Heads:- $heads")
    println("Percentage of Heads ${(heads/counter)*100} " )

    println("Number of Tails:- $tails")
}