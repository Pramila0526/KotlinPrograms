package com.bridgelabz.algorithms

fun reverseSentance(str: String):String {
    /* The split() method of String class splits
	 * a string in several strings based on the
	 * delimiter passed as an argument to it
	 */
    val words = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    var reversedString = ""
    for (i in words.indices) {
        val word = words[i]
        var reverseWord = ""
        for (j in word.length - 1 downTo 0) {
            /* The charAt() function returns the character
             * at the given position in a string
             */
            reverseWord = reverseWord + word[j]
        }
        reversedString = "$reversedString$reverseWord "
    }
    return reversedString
}

fun main(args: Array<String>) {
    var str = "string"
    println("Original string : " +str)
    println("Reversed String : "+reverseSentance(str))
}
