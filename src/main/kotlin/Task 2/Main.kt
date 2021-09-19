/*Description
Write a program that reads two numbers in a loop and prints the sum in the standard output. If a user enters only a single number, the program should print the same number. If a user enters an empty line, the program should ignore it.

When the command /exit is entered, the program must print Bye! , and then stop.

Input/Output example
The example below shows input and the corresponding output. Your program should work in the same way.*/

package `Task 2`

fun main() {
    while (true) {
        val input = readLine()!!

        when {
            input.isEmpty() -> continue
            input == "/exit" -> break
            else -> println(input.split(" ")
                .map { it.toInt() }
                .sum())
        }
    }

    println("Bye!")
}