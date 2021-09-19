//Description
//Write a program that reads two integer numbers from the same line and prints their sum in the standard output. Numbers can be positive, negative, or zero.
//
//Input/Output example
//The example below shows input and the corresponding output. Your program should work in the same way.
//
//5 8
//13


package `Task 1`

fun main() {
    val input = readLine()!!
    val sumResult: Int = input.split(" ")
        .map { it.toInt() }
        .sum()

    println(sumResult)
}

